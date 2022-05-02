package p138ja;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.Comparator;
import p126j$.util.function.Function;
import p126j$.util.function.ToDoubleFunction;
import p126j$.util.function.ToIntFunction;
import p126j$.util.function.ToLongFunction;
import qa.C8298k;

public final class C5908c implements Comparator<Comparable<? super Object>>, p126j$.util.Comparator {
    public static final C5908c f18810a = new C5908c();

    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C8298k.m12934e(comparable, "a");
        C8298k.m12934e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override
    public final Comparator<Comparable<Object>> reversed() {
        return C5907b.f18809a;
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
