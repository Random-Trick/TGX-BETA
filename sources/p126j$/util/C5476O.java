package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

final class C5476O extends AbstractC5485a implements AbstractC5462A {
    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22563r(this, consumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571d(this, consumer);
    }

    @Override
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22569h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22568j(this, i);
    }

    @Override
    public boolean mo22181i(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        return false;
    }

    @Override
    public void mo22180n(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
    }
}
