package comp5111.assignment.instrument.coverage;

import comp5111.assignment.instrument.runtime.InstrumentConstructor;
import comp5111.assignment.instrument.runtime.InstrumentField;
import comp5111.assignment.instrument.runtime.TestRequirement;

import java.util.UUID;

/**
 * The Statement Test Requirement
 */
public class StatementTestRequirement extends TestRequirement {
    // the Jimple statement corresponding to this Coverage Unit
    @InstrumentField(sootValueType = InstrumentField.SootValueType.STRING)
    public final String jimpleStmtType;
    @InstrumentField(sootValueType = InstrumentField.SootValueType.STRING)
    public final String stmt;
    @InstrumentField(sootValueType = InstrumentField.SootValueType.INT)
    public final int lineNumber;


    public StatementTestRequirement(String jimpleStmtType, String stmt, int lineNumber, String id) {
        super(id);
        this.stmt = stmt;
        this.jimpleStmtType = jimpleStmtType;
        this.lineNumber = lineNumber;
    }

    public StatementTestRequirement(StatementTestRequirement statement) {
        this(statement.jimpleStmtType, statement.stmt, statement.lineNumber, statement.id);
    }

    public String getJimpleStmtType() {
        return jimpleStmtType;
    }

    public String getStmt() {
        return stmt;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toOverviewString() {
        if (this.isVisited()) {
            return String.format("%s statement: %s",
                TestRequirement.checkMark,
                this.stmt
            );
        } else {
            return String.format("%s statement: %s",
                TestRequirement.crossMark,
                this.stmt
            );
        }
    }

    @Override
    public String toDetailString() {
        if (this.isVisited()) {
            return String.format("%s count: %-6d  StmtType: %s  Statement: %s",
                TestRequirement.checkMark,
                this.getCount(),
                this.jimpleStmtType,
                this.stmt
            );
        } else {
            return String.format("%s count: %-6d  StmtType: %s  Statement: %s",
                TestRequirement.crossMark,
                this.getCount(),
                this.jimpleStmtType,
                this.stmt
            );
        }
    }
}
