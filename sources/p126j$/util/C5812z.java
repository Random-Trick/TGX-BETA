package p126j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p126j$.util.function.C5529k;
import p126j$.util.function.Consumer;

public final class C5812z implements Spliterator.OfInt {
    final AbstractC5462A f18531a;

    private C5812z(AbstractC5462A a) {
        this.f18531a = a;
    }

    public static Spliterator.OfInt m22121a(AbstractC5462A a) {
        if (a == null) {
            return null;
        }
        return new C5812z(a);
    }

    @Override
    public int characteristics() {
        return this.f18531a.characteristics();
    }

    @Override
    public long estimateSize() {
        return this.f18531a.estimateSize();
    }

    @Override
    public void forEachRemaining(IntConsumer intConsumer) {
        this.f18531a.forEachRemaining(intConsumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        this.f18531a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public void forEachRemaining2(IntConsumer intConsumer) {
        this.f18531a.mo22180n(C5529k.m22484a(intConsumer));
    }

    @Override
    public Comparator getComparator() {
        return this.f18531a.getComparator();
    }

    @Override
    public long getExactSizeIfKnown() {
        return this.f18531a.getExactSizeIfKnown();
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return this.f18531a.hasCharacteristics(i);
    }

    @Override
    public boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18531a.tryAdvance(intConsumer);
    }

    @Override
    public boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f18531a.mo22124a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f18531a.mo22181i(C5529k.m22484a(intConsumer));
    }
}
