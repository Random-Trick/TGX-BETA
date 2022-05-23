package j$.util;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public final class C0417y implements Spliterator.OfDouble {
    final z f14917a;

    private C0417y(z zVar) {
        this.f14917a = zVar;
    }

    public static Spliterator.OfDouble a(z zVar) {
        if (zVar == null) {
            return null;
        }
        return new C0417y(zVar);
    }

    @Override
    public final int characteristics() {
        return this.f14917a.characteristics();
    }

    @Override
    public final long estimateSize() {
        return this.f14917a.estimateSize();
    }

    @Override
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f14917a.forEachRemaining(doubleConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        this.f14917a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f14917a.m(C0277e.a(doubleConsumer));
    }

    @Override
    public final Comparator getComparator() {
        return this.f14917a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return this.f14917a.getExactSizeIfKnown();
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return this.f14917a.hasCharacteristics(i10);
    }

    @Override
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f14917a.tryAdvance(doubleConsumer);
    }

    @Override
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f14917a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f14917a.j(C0277e.a(doubleConsumer));
    }
}
