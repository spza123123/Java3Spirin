import java.lang.reflect.Array;
import java.util.Arrays;

public class Calc {
    public Number sum(Number a, Number b) {
        if (a instanceof Double || b instanceof Double || a instanceof Float || b instanceof Float) {
            return a.doubleValue() + b.doubleValue();
        } else if (a instanceof Integer) {
            return a.intValue() + b.intValue();
        } else throw new IllegalArgumentException();
    }

    public Number multiply(Number a, Number b) {
        if (a instanceof Double || b instanceof Double || a instanceof Float || b instanceof Float) {
            return a.doubleValue() * b.doubleValue();
        } else if (a instanceof Integer) {
            return a.intValue() * b.intValue();
        } else throw new IllegalArgumentException();
    }

    public Number divide(Number a, Number b) {
        if (a instanceof Double || b instanceof Double || a instanceof Float || b instanceof Float) {
            return a.doubleValue() / b.doubleValue();
        } else if (a instanceof Integer) return a.intValue() / b.intValue();
        else throw new IllegalArgumentException();
    }

    public Number subtract(Number a, Number b) {
        if (a instanceof Double || b instanceof Double || a instanceof Float || b instanceof Float) {
            return a.doubleValue() - b.doubleValue();
        } else if (a instanceof Integer) return a.intValue() - b.intValue();
        else throw new IllegalArgumentException();
    }

    public boolean compareArrays(Object [] a, Object [] b) {

        return Arrays.equals(a, b);

    }


}

