package p126j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p126j$.util.function.C5534p;
import p126j$.util.function.Consumer;

public final class C5463B implements Spliterator.OfLong {
    final AbstractC5464C f17925a;

    private C5463B(AbstractC5464C c) {
        this.f17925a = c;
    }

    public static Spliterator.OfLong m22611a(AbstractC5464C c) {
        if (c == null) {
            return null;
        }
        return new C5463B(c);
    }

    @Override
    public int characteristics() {
        return this.f17925a.characteristics();
    }

    @Override
    public long estimateSize() {
        return this.f17925a.estimateSize();
    }

    @Override
    public void forEachRemaining(LongConsumer longConsumer) {
        this.f17925a.forEachRemaining(longConsumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        this.f17925a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public void forEachRemaining2(LongConsumer longConsumer) {
        this.f17925a.mo22166f(C5534p.m22483a(longConsumer));
    }

    @Override
    public Comparator getComparator() {
        return this.f17925a.getComparator();
    }

    @Override
    public long getExactSizeIfKnown() {
        return this.f17925a.getExactSizeIfKnown();
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return this.f17925a.hasCharacteristics(i);
    }

    @Override
    public boolean tryAdvance(LongConsumer longConsumer) {
        return this.f17925a.tryAdvance(longConsumer);
    }

    @Override
    public boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f17925a.mo22124a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f17925a.mo22165g(C5534p.m22483a(longConsumer));
    }
}
