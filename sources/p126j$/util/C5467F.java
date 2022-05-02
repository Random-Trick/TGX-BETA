package p126j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p126j$.util.function.Consumer;

public final class C5467F implements Spliterator {
    final AbstractC5468G f17933a;

    private C5467F(AbstractC5468G g) {
        this.f17933a = g;
    }

    public static Spliterator m22604a(AbstractC5468G g) {
        if (g == null) {
            return null;
        }
        return new C5467F(g);
    }

    @Override
    public int characteristics() {
        return this.f17933a.characteristics();
    }

    @Override
    public long estimateSize() {
        return this.f17933a.estimateSize();
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        this.f17933a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Comparator getComparator() {
        return this.f17933a.getComparator();
    }

    @Override
    public long getExactSizeIfKnown() {
        return this.f17933a.getExactSizeIfKnown();
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return this.f17933a.hasCharacteristics(i);
    }

    @Override
    public boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f17933a.mo22124a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Spliterator trySplit() {
        return m22604a(this.f17933a.trySplit());
    }
}
