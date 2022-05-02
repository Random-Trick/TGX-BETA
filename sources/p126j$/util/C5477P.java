package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

final class C5477P extends AbstractC5485a implements AbstractC5464C {
    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22562s(this, consumer);
    }

    @Override
    public void mo22166f(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22570e(this, consumer);
    }

    @Override
    public boolean mo22165g(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        return false;
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
}
