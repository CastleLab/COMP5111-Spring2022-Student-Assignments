package comp5111.assignment.instrument.runtime;

/**
 * The counter of visit times
 */
public abstract class CoverageCounter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    /**
     * add a certain amount of count into counter
     *
     * @param amount the amount to add
     */
    public void addCount(int amount) {
        this.count += amount;
    }

    /**
     * add one count
     */
    public void visit() {
        this.addCount(1);
    }

    /**
     * whether the current object has been visited or not
     *
     * @return bool
     */
    public boolean isVisited() {
        return count > 0;
    }

    /**
     * reset the counter
     */
    public void reset() {
        this.count = 0;
    }
}
