package j$.util;

import j$.util.function.Consumer;
import j$.util.function.m;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final class A implements Spliterator.OfInt {
    final B f14312a;

    private A(B b10) {
        this.f14312a = b10;
    }

    public static Spliterator.OfInt a(B b10) {
        if (b10 == null) {
            return null;
        }
        return new A(b10);
    }

    @Override
    public final int characteristics() {
        return this.f14312a.characteristics();
    }

    @Override
    public final long estimateSize() {
        return this.f14312a.estimateSize();
    }

    @Override
    public final void forEachRemaining(IntConsumer intConsumer) {
        this.f14312a.forEachRemaining(intConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        this.f14312a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final void forEachRemaining2(IntConsumer intConsumer) {
        this.f14312a.n(m.a(intConsumer));
    }

    @Override
    public final Comparator getComparator() {
        return this.f14312a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return this.f14312a.getExactSizeIfKnown();
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return this.f14312a.hasCharacteristics(i10);
    }

    @Override
    public final boolean tryAdvance(IntConsumer intConsumer) {
        return this.f14312a.tryAdvance(intConsumer);
    }

    @Override
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f14312a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f14312a.i(m.a(intConsumer));
    }
}
