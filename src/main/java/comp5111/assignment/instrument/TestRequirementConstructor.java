package comp5111.assignment.instrument;

import comp5111.assignment.instrument.runtime.InstrumentField;
import comp5111.assignment.instrument.runtime.TestRequirement;
import soot.Scene;
import soot.SootClass;
import soot.Value;
import soot.jimple.IntConstant;
import soot.jimple.StringConstant;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * The Constructor class which tells Transformer how to generate the payload (i.e. test requirement) to instrument into
 * Jimple
 * <p>
 * Details see coverage.runtime.TestRequirement class
 */
public class TestRequirementConstructor {
    /**
     * The SootClass of the testRequirement
     */
    public final SootClass testRequirementClass;

    /**
     * The argumentList signature (similar to method signature) of the constructor of the TestRequirement class
     */
    public final String argListSignature;

    /**
     * a list of soot.Value values which should be consistent to the argListSignature and is about to be used to
     * constructor the testRequirement instance in the instrumentation process
     */
    public final List<Value> argList;

    /**
     * An UUID to identify the test requirement
     * <p>
     * two testRequirementConstructor with same id will be considered as the same and Transformer will only used the
     * one which comes first
     */
    public final String id;

    public final TestRequirement testRequirement;

    /**
     * Constructor without specifying UUID (will be automatically generated)
     *
     * @param testRequirementClass The SootClass of the testRequirement
     * @param argListSignature     The argumentList signature (similar to method signature) of the constructor of the TestRequirement class
     * @param argList              a list of soot.Value values which should be consistent to the argListSignature and is
     *                             about to be used to constructor the testRequirement instance in the instrumentation
     *                             process
     */
    @Deprecated
    public TestRequirementConstructor(SootClass testRequirementClass, String argListSignature, List<Value> argList) {
        this(testRequirementClass, argListSignature, argList, UUID.randomUUID().toString());
    }

    /**
     * Constructor with UUID
     *
     * @param testRequirementClass The SootClass of the testRequirement
     * @param argListSignature     The argumentList signature (similar to method signature) of the constructor of the TestRequirement class
     * @param argList              a list of soot.Value values which should be consistent to the argListSignature and is
     *                             about to be used to constructor the testRequirement instance in the instrumentation
     *                             process
     * @param id                   An UUID to identify the test requirement
     */
    public TestRequirementConstructor(SootClass testRequirementClass, String argListSignature, List<Value> argList,
                                      String id) {
        this.testRequirementClass = testRequirementClass;
        this.argListSignature = argListSignature;
        this.argList = argList;
        this.id = id;
        // for backward compatibility, in this case, the test requirement will register in the <clinit> method
        this.testRequirement = null;
    }

    /**
     * Constructor with test requirement instance (using annotation to indicate which field to instrument)
     *
     * @param testRequirement TestRequirement
     */
    public TestRequirementConstructor(TestRequirement testRequirement) {
        StringJoiner argListSignature = new StringJoiner(",");
        List<Value> argList = new ArrayList<>();
        // find all instrument fields
        Class<?> trClass = testRequirement.getClass();
        try {
            for (Field field :
                trClass.getFields()) {
                InstrumentField annotation = field.getAnnotation(InstrumentField.class);
                if (annotation != null) {
                    argListSignature.add(field.getType().getName());
                    switch (annotation.sootValueType()) {
                        case STRING:
                            argList.add(StringConstant.v((String) field.get(testRequirement)));
                            break;
                        case INT:
                            argList.add(IntConstant.v((Integer) field.get(testRequirement)));
                            break;
                        case CUSTOMIZE:
                            argList.add((Value) ((InstrumentField.SootValue) field.get(testRequirement)).toSootValue());
                            break;
                    }
                }
            }
        } catch (IllegalStateException | IllegalAccessException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        this.testRequirementClass = Scene.v().loadClassAndSupport(trClass.getName());
        this.argListSignature = argListSignature.toString();
        this.argList = argList;
        this.id = testRequirement.id;
        this.testRequirement = testRequirement;
    }


}
