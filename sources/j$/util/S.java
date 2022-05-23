package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

final class S extends AbstractC0264a implements H {
    @Override
    public final boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return false;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
    }

    @Override
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return AbstractC0264a.h(this);
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return AbstractC0264a.k(this, i10);
    }
}
