package comp5111.assignment.instrument.coverage;

import comp5111.assignment.instrument.InstrumentGuider;
import comp5111.assignment.instrument.InstrumentTransformer;
import comp5111.assignment.instrument.TestRequirementConstructor;
import soot.Body;
import soot.Scene;
import soot.SootClass;
import soot.Unit;
import soot.jimple.Stmt;

/**
 * This Instrumenter implements the StatementCoverage instrumentation
 */
public class StatementInstrumenter extends InstrumentTransformer {
    public static SootClass statementClass;
    /**
     * Track which line we are now at.
     * This field is essential because some units do not have LineNumberTag when they are at the same line as the
     * previous unit
     */
    private static int currentLine;

    static {
        StatementInstrumenter.statementClass = Scene.v().loadClassAndSupport("comp5111.assignment.instrument.coverage" +
            ".StatementTestRequirement");
    }

    private int methodStatementCount = 0;

    @Override
    protected InstrumentGuider doTransform(Unit unit, Body body) {
        if (!(unit instanceof Stmt)) {
            return null;
        }
        Stmt stmt = (Stmt) unit;

//        int methodLineNumber = StatementInstrumenter.getLineNumber(body.getMethod());
//        if (methodLineNumber == -1) {
//            System.err.println("Warning: cannot retrieve line number from method " + body.getMethod().toString());
//            return null;
//        }
//
//        if (currentMethod == null || !currentMethod.equals(body.getMethod().getSignature())) {
//            // this happens when we go into a new method
//            currentMethod = body.getMethod().getSignature();
//            methodStatementCount = 0;
//            currentLine = methodLineNumber;
//        }

        int line = StatementInstrumenter.getLineNumber(stmt);
        if (line == -1) {
            // the current unit doesn't have LineNumberTag
            line = currentLine;
        }
        StatementTestRequirement statement = new StatementTestRequirement(stmt.getClass().getSimpleName(), stmt.toString(), line,
            String.valueOf(methodStatementCount++));
        return new InstrumentGuider(
            stmt,
            new TestRequirementConstructor(
                statement
            )
        );
    }

    @Override
    protected void onStartInstrumentingMethod(Body body) {
        int methodLineNumber = StatementInstrumenter.getLineNumber(body.getMethod());
        if (methodLineNumber == -1) {
            System.err.println("Warning: cannot retrieve line number from method " + body.getMethod().toString());
            return;
        }
        // this happens when we go into a new method
        methodStatementCount = 0;
        currentLine = methodLineNumber;
    }
}
