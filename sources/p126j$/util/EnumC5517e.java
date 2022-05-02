package p126j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import p126j$.util.Comparator;
import p126j$.util.function.Function;
import p126j$.util.function.ToDoubleFunction;
import p126j$.util.function.ToIntFunction;
import p126j$.util.function.ToLongFunction;

public enum EnumC5517e implements Comparator, Comparator {
    INSTANCE;

    @Override
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override
    public Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override
    public Comparator thenComparing(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override
    public Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override
    public java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Objects.requireNonNull(comparator);
    }

    @Override
    public java.util.Comparator thenComparing(java.util.function.Function function) {
        return Objects.requireNonNull(Function.VivifiedWrapper.convert(function));
    }

    @Override
    public java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(toDoubleFunction);
    }

    @Override
    public java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override
    public java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Objects.requireNonNull(toIntFunction);
    }

    @Override
    public java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return Objects.requireNonNull(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override
    public java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Objects.requireNonNull(toLongFunction);
    }

    @Override
    public java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return Objects.requireNonNull(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }

    @Override
    public java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }
}
