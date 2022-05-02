package p126j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p126j$.util.function.C5524f;
import p126j$.util.function.Consumer;

public final class C5810x implements Spliterator.OfDouble {
    final AbstractC5811y f18530a;

    private C5810x(AbstractC5811y yVar) {
        this.f18530a = yVar;
    }

    public static Spliterator.OfDouble m22126a(AbstractC5811y yVar) {
        if (yVar == null) {
            return null;
        }
        return new C5810x(yVar);
    }

    @Override
    public int characteristics() {
        return this.f18530a.characteristics();
    }

    @Override
    public long estimateSize() {
        return this.f18530a.estimateSize();
    }

    @Override
    public void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18530a.forEachRemaining(doubleConsumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        this.f18530a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f18530a.mo22123m(C5524f.m22486a(doubleConsumer));
    }

    @Override
    public Comparator getComparator() {
        return this.f18530a.getComparator();
    }

    @Override
    public long getExactSizeIfKnown() {
        return this.f18530a.getExactSizeIfKnown();
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return this.f18530a.hasCharacteristics(i);
    }

    @Override
    public boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f18530a.tryAdvance(doubleConsumer);
    }

    @Override
    public boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f18530a.mo22125a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f18530a.mo22124l(C5524f.m22486a(doubleConsumer));
    }
}
