package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

final class C5475N extends AbstractC5485a implements AbstractC5811y {
    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22564q(this, consumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572c(this, consumer);
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
    public boolean mo22123l(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        return false;
    }

    @Override
    public void mo22122m(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
    }
}
