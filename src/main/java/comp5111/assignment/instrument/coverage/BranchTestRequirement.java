package comp5111.assignment.instrument.coverage;

import comp5111.assignment.instrument.runtime.InstrumentField;
import comp5111.assignment.instrument.runtime.TestRequirement;

/**
 * The Branch Test Requirement
 */
public class BranchTestRequirement extends TestRequirement {

    @InstrumentField(sootValueType = InstrumentField.SootValueType.STRING)
    public String forkStmt;

    @InstrumentField(sootValueType = InstrumentField.SootValueType.STRING)
    public String condition;

    @InstrumentField(sootValueType = InstrumentField.SootValueType.INT)
    public int isTrueBranch;

    public BranchTestRequirement(String forkStmt, String condition, int isTrueBranch, String id) {
        super(id);
        this.forkStmt = forkStmt;
        this.condition = condition;
        this.isTrueBranch = isTrueBranch;
    }

    @Override
    public String toOverviewString() {
        if (this.isVisited()) {
            return String.format("%s branch: %s == %s", TestRequirement.checkMark, this.condition,
                this.isTrueBranch);
        } else {
            return String.format("%s branch: %s == %s", TestRequirement.crossMark, this.condition,
                this.isTrueBranch);
        }
    }

    @Override
    public String toDetailString() {
        if (this.isVisited()) {
            return String.format("%s count: %-6d  branch: %s == %s",
                TestRequirement.checkMark,
                this.getCount(),
                this.condition,
                this.isTrueBranch);
        } else {
            return String.format("%s count: %-6d  branch: %s == %s",
                TestRequirement.crossMark,
                this.getCount(),
                this.condition,
                this.isTrueBranch);
        }
    }
}
