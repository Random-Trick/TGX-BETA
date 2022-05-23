package j$.util;

import j$.util.function.Consumer;
import j$.util.function.u;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public final class C implements Spliterator.OfLong {
    final D f14313a;

    private C(D d10) {
        this.f14313a = d10;
    }

    public static Spliterator.OfLong a(D d10) {
        if (d10 == null) {
            return null;
        }
        return new C(d10);
    }

    @Override
    public final int characteristics() {
        return this.f14313a.characteristics();
    }

    @Override
    public final long estimateSize() {
        return this.f14313a.estimateSize();
    }

    @Override
    public final void forEachRemaining(LongConsumer longConsumer) {
        this.f14313a.forEachRemaining(longConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        this.f14313a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final void forEachRemaining2(LongConsumer longConsumer) {
        this.f14313a.f(u.a(longConsumer));
    }

    @Override
    public final Comparator getComparator() {
        return this.f14313a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return this.f14313a.getExactSizeIfKnown();
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return this.f14313a.hasCharacteristics(i10);
    }

    @Override
    public final boolean tryAdvance(LongConsumer longConsumer) {
        return this.f14313a.tryAdvance(longConsumer);
    }

    @Override
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f14313a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f14313a.g(u.a(longConsumer));
    }
}
