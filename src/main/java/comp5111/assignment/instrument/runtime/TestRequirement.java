package comp5111.assignment.instrument.runtime;

/**
 * This abstract class represents one test requirement.
 * <p>
 * This class extends CoverageCounter which provides the common method to count the times that the test requirement
 * is covered.
 */
public abstract class TestRequirement extends CoverageCounter implements HumanReadable {
    protected static final String checkMark = "\u2713";
    protected static final String crossMark = "\u2717";

    @InstrumentField(sootValueType = InstrumentField.SootValueType.STRING)
    public final String id;

    protected TestRequirement(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TestRequirement)) {
            return false;
        }
        return this.id.equals(((TestRequirement) obj).id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
