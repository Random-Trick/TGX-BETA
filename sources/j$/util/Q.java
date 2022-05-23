package j$.util;

import j$.util.function.Consumer;
import j$.util.function.v;
import java.util.Comparator;
import java.util.Objects;

final class Q extends AbstractC0264a implements D {
    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    public final void f(v vVar) {
        Objects.requireNonNull(vVar);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }

    @Override
    public final boolean g(v vVar) {
        Objects.requireNonNull(vVar);
        return false;
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
