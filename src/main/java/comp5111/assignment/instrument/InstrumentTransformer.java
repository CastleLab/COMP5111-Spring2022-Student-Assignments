package comp5111.assignment.instrument;

import comp5111.assignment.instrument.runtime.Profiler;
import comp5111.assignment.instrument.runtime.TestRequirement;
import comp5111.assignment.tools.Pair;
import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.tagkit.LineNumberTag;
import soot.tagkit.Tag;
import soot.util.Chain;

import java.util.*;

/**
 * This class is the main Transformer which inherit the soot BodyTransformer to instrument java Jimple code in phase jtp
 */
public abstract class InstrumentTransformer extends BodyTransformer {
    protected static final String profilerFieldName = "profiler";
    protected static final String localProfilerName = "local_profiler";
    /**
     * the field stores a mapping: for each class, storing the index of the last registering test requirement
     * statement in the <clinit> method
     */
    private static final Map<String, Integer> clinitRegisterStartPosition = new HashMap<>();
    protected static SootClass profilerClass;
    protected static SootMethod visitTestRequirement;
    protected static SootMethod registerTestRequirementsMethod;
    protected static SootMethod profilerV;
    protected static SootClass testRequirementClass;

    static {
        // initialize the coverage profiler and its methods
        InstrumentTransformer.profilerClass = Scene.v().loadClassAndSupport("comp5111.assignment.instrument.runtime.Profiler");
        InstrumentTransformer.visitTestRequirement = InstrumentTransformer.profilerClass.getMethod("void visitTestRequirement(java" +
            ".lang.String,java.lang.String,java.lang.String)");
        InstrumentTransformer.registerTestRequirementsMethod = InstrumentTransformer.profilerClass.getMethod("void " +
            "registerTestRequirements(java.lang.String,java.lang.String,comp5111.assignment.instrument.runtime.TestRequirement[])");
        InstrumentTransformer.profilerV = InstrumentTransformer.profilerClass.getMethod("comp5111.assignment.instrument.runtime.Profiler v()");
        InstrumentTransformer.testRequirementClass = Scene.v().loadClassAndSupport("comp5111.assignment.instrument.runtime.TestRequirement");
    }

    private static void registerTestRequirements(Body body, List<TestRequirementConstructor> testRequirementConstructors) {
        // split the test requirement constructors into two parts, one register directly in Profiler, the other
        // register in <clinit> method
        List<TestRequirementConstructor> profilerPayloads = new ArrayList<>();
        List<TestRequirementConstructor> clinitPayloads = new ArrayList<>();
        for (TestRequirementConstructor c :
            testRequirementConstructors) {
            if (c.testRequirement == null) {
                clinitPayloads.add(c);
            } else {
                profilerPayloads.add(c);
            }
        }
        if (clinitPayloads.size() != 0) {
            InstrumentTransformer.registerTestRequirementsInClinit(body, clinitPayloads);
        }
        if (profilerPayloads.size() != 0) {
            InstrumentTransformer.setRegisterTestRequirementsInProfiler(body, profilerPayloads);
        }
    }

    /**
     * Register a list of test requirements to profiler in the <clinit> method
     *
     * @param body                        the body of the method, the test requirements in which will be registered
     * @param testRequirementConstructors a list of testRequirementConstructors
     */
    @Deprecated
    private static void registerTestRequirementsInClinit(Body body, List<TestRequirementConstructor> testRequirementConstructors) {
        SootClass sootClass = body.getMethod().getDeclaringClass();
        SootMethod clinit = Utils.getClassInitMethod(sootClass);
        Local localProfiler = InstrumentTransformer.getLocalProfiler(clinit.getActiveBody());

        List<Unit> jimpleStatements = new ArrayList<>();
        List<Value> testRequirementsPayloads = new ArrayList<>();

        // create an array of statement information to feed to registerTestRequirements method
        for (TestRequirementConstructor constructor : testRequirementConstructors) {
            // overview method takes a list of TestRequirement objects
            // for each stmt, construct TestRequirement object
            Pair<Local, List<Unit>> pair = Utils.newLocal(
                clinit.getActiveBody(),
                constructor.testRequirementClass,
                constructor.argListSignature,
                constructor.argList
            );
            jimpleStatements.addAll(pair.getValue());
            testRequirementsPayloads.add(pair.getKey());
        }
        // make invocation to registerTestRequirement method in profiler
        Pair<Local, List<AssignStmt>> pair = Utils.newArray(
            clinit.getActiveBody(),
            InstrumentTransformer.testRequirementClass.getType(),
            testRequirementsPayloads
        );
        jimpleStatements.addAll(pair.getValue());
        Local arg = pair.getKey();
        InvokeStmt invokeStmt = Jimple.v().newInvokeStmt(
            Jimple.v().newVirtualInvokeExpr(
                localProfiler, InstrumentTransformer.registerTestRequirementsMethod.makeRef(), Arrays.asList(
                    StringConstant.v(sootClass.getName()),
                    StringConstant.v(body.getMethod().getSubSignature()),
                    arg
                )
            )
        );
        jimpleStatements.add(invokeStmt);

        Chain<Unit> units = clinit.getActiveBody().getUnits();
        Unit positionUnit = InstrumentTransformer.getUnitAtPosition(units,
            InstrumentTransformer.clinitRegisterStartPosition.get(sootClass.getName()));
        units.insertBefore(jimpleStatements, positionUnit);

        Integer currentStartPosition = InstrumentTransformer.clinitRegisterStartPosition.get(sootClass.getName());
        if (currentStartPosition == null) {
            currentStartPosition = 0;
        }
        InstrumentTransformer.clinitRegisterStartPosition.put(sootClass.getName(), currentStartPosition + jimpleStatements.size());
    }

    private static <T extends TestRequirement> void setRegisterTestRequirementsInProfiler(Body body,
                                                                                          List<TestRequirementConstructor> testRequirementConstructors) {
        SootClass sootClass = body.getMethod().getDeclaringClass();
        SootMethod sootMethod = body.getMethod();
        Profiler<T> profiler = Profiler.v();
        Collection<T> trs = new HashSet<>();
        for (TestRequirementConstructor c :
            testRequirementConstructors) {
            trs.add((T) c.testRequirement);
        }
        profiler.registerTestRequirements(sootClass.getName(), sootMethod.getSubSignature(), trs);
    }

    /**
     * this method do the following things,
     * add a field to the class which will store the Profiler instance
     * initialize <clinit> method which will be used to register test requirements
     *
     * @param sootClass the sootClass object of current class
     */
    @Deprecated
    private static void prepareProfilerField(SootClass sootClass) {
        SootField profiler = sootClass.getFieldUnsafe(InstrumentTransformer.profilerFieldName, InstrumentTransformer.profilerClass.getType());
        if (profiler == null) {
            // if profiler doesn't exist
            // add a static field `profiler` to the class
            profiler = new SootField(InstrumentTransformer.profilerFieldName, InstrumentTransformer.profilerClass.getType(),
                Modifier.STATIC | Modifier.PRIVATE);
            sootClass.addField(profiler);
            // initialize the profiler field in <clinit> method
            SootMethod clinit = Utils.getClassInitMethod(sootClass);
            // getBasicBlockByIndex the Profiler instance and assign to the profiler field
            InvokeExpr getProfilerExpr = Jimple.v().newStaticInvokeExpr(InstrumentTransformer.profilerV.makeRef());
            Pair<Local, List<AssignStmt>> pair = Utils.newLocal(clinit.getActiveBody(),
                InstrumentTransformer.localProfilerName, profiler.getType(),
                getProfilerExpr);
            List<AssignStmt> payloads = new ArrayList<>(pair.getValue());
            AssignStmt assignStmt = Jimple.v().newAssignStmt(Jimple.v().newStaticFieldRef(profiler.makeRef()), pair.getKey());
            payloads.add(assignStmt);
            Chain<Unit> units = clinit.getActiveBody().getUnits();
            units.insertBefore(payloads, units.getFirst());

            Integer currentStartPosition = InstrumentTransformer.clinitRegisterStartPosition.get(sootClass.getName());
            if (currentStartPosition == null) {
                currentStartPosition = 0;
            }
            InstrumentTransformer.clinitRegisterStartPosition.put(sootClass.getName(), currentStartPosition + payloads.size());
        }
    }

    /**
     * getBasicBlockByIndex the reference of the static profiler field in the class
     *
     * @param sootClass the sootClass to getBasicBlockByIndex profiler field
     * @return the StaticFieldRef
     */
    @Deprecated
    private static StaticFieldRef getProfilerFieldRef(SootClass sootClass) {
        SootField profiler = sootClass.getFieldUnsafe(InstrumentTransformer.profilerFieldName, InstrumentTransformer.profilerClass.getType());
        return Jimple.v().newStaticFieldRef(profiler.makeRef());
    }

    /**
     * getBasicBlockByIndex the local variable of on method which store the profiler instance
     *
     * @param body the body of the method
     * @return the soot Local variable
     */
    protected static Local getLocalProfiler(Body body) {
        SootClass sootClass = body.getMethod().getDeclaringClass();
        // prepare the profiler field
//        InstrumentTransformer.prepareProfilerField(sootClass);
        // try to getBasicBlockByIndex local profiler variable
        Local localProfiler = Utils.getLocal(body.getLocals(), InstrumentTransformer.localProfilerName);
        if (localProfiler == null) {
            // if it doesn't exist, add one and assign
            // getBasicBlockByIndex the Profiler instance and assign to the profiler field
            InvokeExpr getProfilerExpr = Jimple.v().newStaticInvokeExpr(InstrumentTransformer.profilerV.makeRef());
            Pair<Local, List<AssignStmt>> pair = Utils.newLocal(body,
                InstrumentTransformer.localProfilerName, InstrumentTransformer.profilerClass.getType(),
                getProfilerExpr);
            localProfiler = pair.getKey();
            Chain<Unit> units = body.getUnits();
            units.insertBefore(pair.getValue(), units.getFirst());
        }
        return localProfiler;
    }

    /**
     * check if the given unit is an assignment to the local profiler variable
     *
     * @param unit the unit to check
     * @return boolean
     */
    private static boolean isLocalProfilerAssignStmt(Unit unit) {
        if (!(unit instanceof AssignStmt)) {
            return false;
        }
        AssignStmt assignStmt = (AssignStmt) unit;
        if (!(assignStmt.getRightOp() instanceof StaticFieldRef)) {
            return false;
        }
        StaticFieldRef rightSide = (StaticFieldRef) assignStmt.getRightOp();
        return rightSide.getField().getName().equals(InstrumentTransformer.profilerFieldName);
    }

    /**
     * generate a statement that calls the visitClassMethodUnit() of Profiler
     *
     * @param profiler: the local profiler variable
     * @param body:     the body of current Transformer
     * @param index:    the index of the stmt
     * @return Stmt
     */
    private static Stmt genVisitStatement(Local profiler, Body body, String index) {
        InvokeExpr visitExpr = Jimple.v().newVirtualInvokeExpr(
            profiler,
            InstrumentTransformer.visitTestRequirement.makeRef(),
            StringConstant.v(body.getMethod().getDeclaringClass().getName()),
            StringConstant.v(body.getMethod().getSubSignature()),
            StringConstant.v(index)
        );
        return Jimple.v().newInvokeStmt(visitExpr);
    }

    /**
     * getBasicBlockByIndex the unit at a certain position in the unit chain
     *
     * @param chain    unit chain
     * @param position int
     * @return unit
     */
    private static Unit getUnitAtPosition(Chain<Unit> chain, int position) {
        Unit unit = chain.getFirst();
        for (int i = 0; i < position; i++) {
            unit = chain.getSuccOf(unit);
        }
        return unit;
    }

    /**
     * getBasicBlockByIndex the line number from the LineNumberTag attached to unit (if there is any)
     *
     * @param unit the unit to getBasicBlockByIndex line number from
     * @return the line number, if the unit doesn't have lineNumberTag, return -1
     */
    protected static int getLineNumber(Unit unit) {
        List<Tag> tags = unit.getTags();
        for (Tag tag :
            tags) {
            if (tag instanceof LineNumberTag) {
                return ((LineNumberTag) tag).getLineNumber();
            }
        }
        return -1;
    }

    protected static int getLineNumber(SootMethod method) {
        List<Tag> methodTags = method.getTags();
        if (methodTags.size() >= 1) {
            // check if method has a LineNumber tag
            for (Tag tag :
                methodTags) {
                if (tag instanceof LineNumberTag) {
                    return ((LineNumberTag) tag).getLineNumber();
                }
            }
        }
        return -1;
    }

    @Override
    protected synchronized void internalTransform(Body body, String s, Map<String, String> map) {
        SootClass sootClass = body.getMethod().getDeclaringClass();
        InstrumentTransformer.clinitRegisterStartPosition.putIfAbsent(sootClass.getName(), 0);
        // add a static field profiler in the class
//        InstrumentTransformer.prepareProfilerField(sootClass);

        // prepare traversing statement chain
        SootMethod method = body.getMethod();
        this.onStartInstrumentingMethod(body);
        Chain<Unit> units = body.getUnits();

        // iterate unites
        Iterator<Unit> unitIterator = units.snapshotIterator();
        // the list of all statement list which will be fed to profiler.overview()
        List<TestRequirementConstructor> testRequirementConstructors = new ArrayList<>();
        int iteratorIndex = -1;
        // iterate all statements (Units)
        while (unitIterator.hasNext()) {
            Unit unit = unitIterator.next();

            iteratorIndex += 1;
            if (Utils.isClassInitMethod(method)) {
                // <clinit> method should instrument from Transformer.clinitRegisterStartPosition.
                if (iteratorIndex < InstrumentTransformer.clinitRegisterStartPosition.get(sootClass.getName())) {
                    continue;
                }
            }
            if (InstrumentTransformer.isLocalProfilerAssignStmt(unit)) {
                continue;
            }

            // skip instrumentation of JIdentityStmt in favor of FAQ-Q3
            if (unit instanceof JIdentityStmt) {
                continue;
            }

            InstrumentGuider instrumentGuider = this.doTransform(unit, body);
            if (instrumentGuider == null) {
                continue;
            }

            for (InstrumentEntry entry :
                instrumentGuider.instrumentEntryList) {
                // instrument a local variable which is assigned the profiler instance
                Local localProfiler = InstrumentTransformer.getLocalProfiler(body);
                // find a testRequirementConstructor which has same id as previous ones
                TestRequirementConstructor constructor = null;
                if (entry.testRequirementConstructor != null) {
                    for (TestRequirementConstructor c : testRequirementConstructors) {
                        if (c.id.equals(entry.testRequirementConstructor.id)) {
                            constructor = c;
                        }
                    }
                    if (constructor == null) {
                        // if there is no previous constructor with same id
                        constructor = entry.testRequirementConstructor;
                        testRequirementConstructors.add(constructor);
                    }
                }

                // perform instrumentation
                List<Unit> instrumentPayloads = new ArrayList<>(entry.preAdditions);
                if (constructor != null) {
                    instrumentPayloads.add(InstrumentTransformer.genVisitStatement(localProfiler, body, constructor.id));
                }
                instrumentPayloads.addAll(entry.postAdditions);
                if (entry.instrumentAfter) {
                    units.insertAfter(instrumentPayloads, entry.unit);
                } else {
                    units.insertBefore(instrumentPayloads, entry.unit);
                }
            }
        }

        // instrument an invocation of overview()
        InstrumentTransformer.registerTestRequirements(body, testRequirementConstructors);
        this.onFinishInstrumentingMethod(body);
    }

    /**
     * The method which should be implemented
     * <p>
     * doTransform will be called for each unit in the unit chain of each method body
     * the calling sequence is consistent with the unit chain
     * <p>
     * the method should return a InstrumentGuider, which tells Transformer how in do instrumentation in Jimple code
     *
     * @param unit the current unit
     * @param body the body of the method which the unit belongs to
     * @return InstrumentGuilder
     */
    protected abstract InstrumentGuider doTransform(Unit unit, Body body);

    protected void onStartInstrumentingMethod(Body body) {
    }

    protected void onFinishInstrumentingMethod(Body body) {
    }
}
