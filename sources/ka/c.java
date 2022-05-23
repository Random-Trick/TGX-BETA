package ka;

import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;
import java.util.Objects;
import ra.k;

public final class c implements Comparator<Comparable<? super Object>>, j$.util.Comparator {
    public static final c f15746a = new c();

    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        k.e(comparable, "a");
        k.e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override
    public final Comparator<Comparable<Object>> reversed() {
        return b.f15745a;
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
    public java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function) {
        return thenComparing(Function.VivifiedWrapper.convert(function));
    }

    @Override
    public java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return thenComparing(Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override
    public java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(toDoubleFunction);
    }

    @Override
    public java.util.Comparator<Comparable<? super Object>> thenComparingDouble(java.util.function.ToDoubleFunction<? super Comparable<? super Object>> toDoubleFunction) {
        return thenComparingDouble(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override
    public java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Objects.requireNonNull(toIntFunction);
    }

    @Override
    public java.util.Comparator<Comparable<? super Object>> thenComparingInt(java.util.function.ToIntFunction<? super Comparable<? super Object>> toIntFunction) {
        return thenComparingInt(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override
    public java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Objects.requireNonNull(toLongFunction);
    }

    @Override
    public java.util.Comparator<Comparable<? super Object>> thenComparingLong(java.util.function.ToLongFunction<? super Comparable<? super Object>> toLongFunction) {
        return thenComparingLong(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}
