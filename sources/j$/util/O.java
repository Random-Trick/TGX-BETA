package j$.util;

import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

final class O extends AbstractC0264a implements z {
    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
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

    @Override
    public final boolean j(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        return false;
    }

    @Override
    public final void m(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
    }
}
