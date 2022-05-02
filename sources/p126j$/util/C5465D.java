package p126j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p126j$.util.function.Consumer;

public final class C5465D implements Spliterator.OfPrimitive {
    final AbstractC5466E f17926a;

    private C5465D(AbstractC5466E e) {
        this.f17926a = e;
    }

    public static Spliterator.OfPrimitive m22610a(AbstractC5466E e) {
        if (e == null) {
            return null;
        }
        return new C5465D(e);
    }

    @Override
    public int characteristics() {
        return this.f17926a.characteristics();
    }

    @Override
    public long estimateSize() {
        return this.f17926a.estimateSize();
    }

    @Override
    public void forEachRemaining(Object obj) {
        this.f17926a.forEachRemaining(obj);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        this.f17926a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Comparator getComparator() {
        return this.f17926a.getComparator();
    }

    @Override
    public long getExactSizeIfKnown() {
        return this.f17926a.getExactSizeIfKnown();
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return this.f17926a.hasCharacteristics(i);
    }

    @Override
    public boolean tryAdvance(Object obj) {
        return this.f17926a.tryAdvance(obj);
    }

    @Override
    public boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f17926a.mo22125a(Consumer.VivifiedWrapper.convert(consumer));
    }
}
