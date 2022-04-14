package comp5111.assignment.instrument.coverage;


import comp5111.assignment.instrument.runtime.InstrumentField;
import comp5111.assignment.instrument.runtime.TestRequirement;

/**
 * The Line Test Requirement
 */
public class LineTestRequirement extends TestRequirement {
    @InstrumentField(sootValueType = InstrumentField.SootValueType.INT)
    private final int lineNumber;

    @InstrumentField(sootValueType = InstrumentField.SootValueType.STRING)
    private final String unit;

    public LineTestRequirement(int lineNumber, String unit, String id) {
        super(id);
        this.lineNumber = lineNumber;
        this.unit = unit;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toOverviewString() {
        if (this.isVisited()) {
            return String.format("%s line: %-4d",
                    TestRequirement.checkMark,
                    this.getLineNumber()
            );
        } else {
            return String.format("%s line: %-4d",
                    TestRequirement.crossMark,
                    this.getLineNumber()
            );
        }
    }

    @Override
    public String toDetailString() {
        if (this.isVisited()) {
            return String.format("%s count: %-6d  line: %-4d  unit: %s",
                    TestRequirement.checkMark,
                    this.getCount(),
                    this.getLineNumber(),
                    this.unit
            );
        } else {
            return String.format("%s count: %-6d  line: %-4d  unit: %s",
                    TestRequirement.crossMark,
                    this.getCount(),
                    this.getLineNumber(),
                    this.unit
            );
        }
    }
}
