package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

public final class G implements Spliterator {
    final H f14321a;

    private G(H h10) {
        this.f14321a = h10;
    }

    public static Spliterator a(H h10) {
        if (h10 == null) {
            return null;
        }
        return new G(h10);
    }

    @Override
    public final int characteristics() {
        return this.f14321a.characteristics();
    }

    @Override
    public final long estimateSize() {
        return this.f14321a.estimateSize();
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        this.f14321a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final Comparator getComparator() {
        return this.f14321a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return this.f14321a.getExactSizeIfKnown();
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return this.f14321a.hasCharacteristics(i10);
    }

    @Override
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f14321a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final Spliterator trySplit() {
        return a(this.f14321a.trySplit());
    }
}
