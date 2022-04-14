package comp5111.assignment.instrument.coverage;

import comp5111.assignment.instrument.InstrumentGuider;
import comp5111.assignment.instrument.InstrumentTransformer;
import comp5111.assignment.instrument.TestRequirementConstructor;
import soot.*;
import soot.tagkit.LineNumberTag;
import soot.tagkit.Tag;

import java.util.List;

/**
 * The Instrumenter to implement LineCoverage instrumentation
 */
public class LineInstrumenter extends InstrumentTransformer {
    private static SootClass lineClass;

    /**
     * Track which line we are now at.
     * This field is essential because some units do not have LineNumberTag when they are at the same line as the
     * previous unit
     */
    private static int currentLine;

    static {
        LineInstrumenter.lineClass = Scene.v().loadClassAndSupport("comp5111.assignment.instrument.coverage" +
            ".LineTestRequirement");
    }

    @Override
    protected InstrumentGuider doTransform(Unit unit, Body body) {
        int methodLineNumber = LineInstrumenter.getLineNumber(body.getMethod());
        if (methodLineNumber == -1) {
            System.err.println("Warning: cannot retrieve line number from method " + body.getMethod().toString());
            return null;
        }

        int line = getLineNumber(unit);
        if (line == -1) {
            // the current unit doesn't have LineNumberTag
            line = currentLine;
            /*
             * Here, although we find out which line the unit without LineNumberTag is at, we still don't instrument
             * it because the test requirement of the line must have been instrumented before.
             */
            return null;
        }
        return new InstrumentGuider(
            unit,
            new TestRequirementConstructor(
                new LineTestRequirement(line, unit.toString(), String.valueOf(line))
            )
        );
    }

    @Override
    protected void onStartInstrumentingMethod(Body body) {
        int methodLineNumber = LineInstrumenter.getLineNumber(body.getMethod());
        if (methodLineNumber == -1) {
            System.err.println("Warning: cannot retrieve line number from method " + body.getMethod().toString());
            return;
        }
        // this happens when we go into a new method
        currentLine = methodLineNumber;
    }

    /**
     * get the line number from the LineNumberTag attached to unit (if there is any)
     *
     * @param unit the unit to get line number from
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
}
