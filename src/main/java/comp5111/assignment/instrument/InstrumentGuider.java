package comp5111.assignment.instrument;

import soot.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is tells Transformer how to instrument soot Jimple code. It is used as the return value type of
 * doTransform method in Transformer
 * <p>
 * InstrumentGuider consists of a list of instrumentEntries, each of which represent a entry which is about to
 * be instrumented into Jimple code (and where it should be inserted)
 */
public class InstrumentGuider {

    public List<InstrumentEntry> instrumentEntryList = new ArrayList<>();

    /**
     * The constructor to conveniently initiate a InstrumentGuider with a list containing only one entry
     *
     * @param unit:                      the unit (i.e. the position in the Soot Unit Chain) around which we should instrument to
     * @param testRequirementConstructor the constructor to generate a payload to insert to Jimple code
     * @param instrumentAfter            true to insert after the unit, otherwise insert before the unit
     */
    public InstrumentGuider(Unit unit, TestRequirementConstructor testRequirementConstructor, boolean instrumentAfter) {
        instrumentEntryList.add(new InstrumentEntry(unit, testRequirementConstructor, instrumentAfter));
    }

    /**
     * The constructor to conveniently initiate a InstrumentGuider with a list containing only one entry
     *
     * @param unit                       the unit (i.e. the position in the Soot Unit Chain) around which we should
     *                                   instrument before
     * @param testRequirementConstructor the constructor to generate a payload to insert to Jimple code
     */
    public InstrumentGuider(Unit unit, TestRequirementConstructor testRequirementConstructor) {
        this(unit, testRequirementConstructor, false);
    }

    /**
     * The constructor to initiate a InstrumentGuider with a list of InstrumentEntries
     *
     * @param list the list of InstrumentEntries
     */
    public InstrumentGuider(List<InstrumentEntry> list) {
        this.instrumentEntryList = list;
    }
}