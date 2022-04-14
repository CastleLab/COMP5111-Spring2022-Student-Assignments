package comp5111.assignment.instrument.coverage;

import comp5111.assignment.instrument.InstrumentEntry;
import comp5111.assignment.instrument.InstrumentGuider;
import comp5111.assignment.instrument.InstrumentTransformer;
import comp5111.assignment.instrument.TestRequirementConstructor;
import soot.Body;
import soot.Scene;
import soot.SootClass;
import soot.Unit;
import soot.jimple.Stmt;
import soot.jimple.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Instrumenter to implement BranchCoverage instrumentation
 */
public class BranchInstrumenter extends InstrumentTransformer {
    public static final String testRequirementClassName = "comp5111.assignment.instrument.coverage" +
        ".BranchTestRequirement";
    public static SootClass branchClass;

    static {
        BranchInstrumenter.branchClass = Scene.v().loadClassAndSupport(testRequirementClassName);
    }

    private int methodBranchCount = 0;

    @Override
    protected InstrumentGuider doTransform(Unit unit, Body body) {
        List<InstrumentEntry> entryList = new ArrayList<>();
        if (unit instanceof IfStmt) {
            IfStmt stmt = (IfStmt) unit;
            String forkStmt = stmt.toString();

            // instrument condition=true branch
            // insert a basic block into CFG to catch true branch
            Stmt anchorStmt = Jimple.v().newInvokeStmt(
                    Jimple.v().newVirtualInvokeExpr(
                            InstrumentTransformer.getLocalProfiler(body),
                            InstrumentTransformer.profilerClass.getMethod("void noop()").makeRef()
                    )
            );
            entryList.add(new InstrumentEntry(
                    body.getUnits().getLast(),
                    new TestRequirementConstructor(
                        new BranchTestRequirement(forkStmt, stmt.getCondition().toString(), 1, String.valueOf(methodBranchCount++))
                    ), true,
                    Collections.singletonList(anchorStmt),
                    Collections.singletonList(
                            Jimple.v().newGotoStmt(stmt.getTarget())
                    )
            ));
            stmt.setTarget(anchorStmt);

            // instrument condition=false branch
            entryList.add(new InstrumentEntry(
                    stmt,
                    new TestRequirementConstructor(
                        new BranchTestRequirement(forkStmt, stmt.getCondition().toString(), 0, String.valueOf(methodBranchCount++))
                    ),
                    true
            ));
        }
        return new InstrumentGuider(entryList);
    }
}
