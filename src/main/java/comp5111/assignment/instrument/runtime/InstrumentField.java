package comp5111.assignment.instrument.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to indicate the field used to instantiate test requirement during instrumentation
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InstrumentField {
    SootValueType sootValueType();

    public enum SootValueType {STRING, INT, CUSTOMIZE,}

    public interface SootValue {
        public Object toSootValue();
    }
}
