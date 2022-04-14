package comp5111.assignment.instrument;

import soot.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * The InstrumentEntry represents an entry of instrumentation, that is to say, the position the instrumentation
 * should be placed, the payload that should be inserted.
 */
public class InstrumentEntry {
    /**
     * The unit around which the payload should be inserted
     */
    public final Unit unit;

    /**
     * The Constructor to generate the payload to instrument
     */
    public final TestRequirementConstructor testRequirementConstructor;

    public final List<Unit> preAdditions;
    public final List<Unit> postAdditions;

    /**
     * true to insert after the unit, otherwise insert before
     */
    public final boolean instrumentAfter;

    /**
     * Constructor
     *
     * @param unit                       The unit around which the payload should be inserted
     * @param testRequirementConstructor The Constructor to generate the payload to instrument
     * @param instrumentAfter            true to insert after the unit, otherwise insert before
     */
    public InstrumentEntry(Unit unit, TestRequirementConstructor testRequirementConstructor, boolean instrumentAfter) {
        this(unit, testRequirementConstructor, instrumentAfter, new ArrayList<>(), new ArrayList<>());
    }

    public InstrumentEntry(Unit unit, TestRequirementConstructor testRequirementConstructor, boolean instrumentAfter,
                           List<Unit> preAdditions, List<Unit> postAdditions) {
        this.unit = unit;
        this.testRequirementConstructor = testRequirementConstructor;
        this.instrumentAfter = instrumentAfter;
        this.preAdditions = preAdditions;
        this.postAdditions = postAdditions;
    }
}