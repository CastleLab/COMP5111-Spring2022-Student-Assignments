package comp5111.assignment.tools;

/**
 * This class is a utility class which is used as 2-Tuple to facilitate multiple return values in methods.
 *
 * @param <KeyType>
 * @param <ValueType>
 */
public class Pair<KeyType, ValueType> {
    private final KeyType key;
    private final ValueType value;

    public Pair(KeyType key, ValueType value) {
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return this.key;
    }

    public ValueType getValue() {
        return this.value;
    }
}
