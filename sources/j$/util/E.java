package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

public final class E implements Spliterator.OfPrimitive {
    final F f14320a;

    private E(F f10) {
        this.f14320a = f10;
    }

    public static Spliterator.OfPrimitive a(F f10) {
        if (f10 == null) {
            return null;
        }
        return new E(f10);
    }

    @Override
    public final int characteristics() {
        return this.f14320a.characteristics();
    }

    @Override
    public final long estimateSize() {
        return this.f14320a.estimateSize();
    }

    @Override
    public final void forEachRemaining(Object obj) {
        this.f14320a.forEachRemaining(obj);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        this.f14320a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final Comparator getComparator() {
        return this.f14320a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return this.f14320a.getExactSizeIfKnown();
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return this.f14320a.hasCharacteristics(i10);
    }

    @Override
    public final boolean tryAdvance(Object obj) {
        return this.f14320a.tryAdvance(obj);
    }

    @Override
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f14320a.a(Consumer.VivifiedWrapper.convert(consumer));
    }
}
