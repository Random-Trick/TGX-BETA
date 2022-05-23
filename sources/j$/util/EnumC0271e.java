package j$.util;

import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public final class EnumC0271e extends Enum implements Comparator, Comparator {
    public static final EnumC0271e INSTANCE;
    private static final EnumC0271e[] f14443a;

    static {
        EnumC0271e eVar = new EnumC0271e();
        INSTANCE = eVar;
        f14443a = new EnumC0271e[]{eVar};
    }

    private EnumC0271e() {
    }

    public static EnumC0271e valueOf(String str) {
        return (EnumC0271e) Enum.valueOf(EnumC0271e.class, str);
    }

    public static EnumC0271e[] values() {
        return (EnumC0271e[]) f14443a.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override
    public final Comparator thenComparing(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override
    public final java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Objects.requireNonNull(comparator);
    }

    @Override
    public final java.util.Comparator thenComparing(java.util.function.Function function) {
        return Objects.requireNonNull(Function.VivifiedWrapper.convert(function));
    }

    @Override
    public final java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(toDoubleFunction);
    }

    @Override
    public final java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override
    public final java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Objects.requireNonNull(toIntFunction);
    }

    @Override
    public final java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return Objects.requireNonNull(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override
    public final java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Objects.requireNonNull(toLongFunction);
    }

    @Override
    public final java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return Objects.requireNonNull(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }

    @Override
    public final java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }
}
