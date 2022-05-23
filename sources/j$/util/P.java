package j$.util;

import j$.util.function.Consumer;
import j$.util.function.n;
import java.util.Comparator;
import java.util.Objects;

final class P extends AbstractC0264a implements B {
    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
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
    public final boolean i(n nVar) {
        Objects.requireNonNull(nVar);
        return false;
    }

    @Override
    public final void n(n nVar) {
        Objects.requireNonNull(nVar);
    }
}
