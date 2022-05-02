package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

final class C5475N extends AbstractC5485a implements AbstractC5811y {
    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22565q(this, consumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22573c(this, consumer);
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
    public boolean mo22124l(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        return false;
    }

    @Override
    public void mo22123m(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
    }
}
