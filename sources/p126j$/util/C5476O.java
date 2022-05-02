package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

final class C5476O extends AbstractC5485a implements AbstractC5462A {
    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22564r(this, consumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572d(this, consumer);
    }

    @Override
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22570h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22569j(this, i);
    }

    @Override
    public boolean mo22182i(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        return false;
    }

    @Override
    public void mo22181n(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
    }
}
