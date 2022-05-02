package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

final class C5477P extends AbstractC5485a implements AbstractC5464C {
    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22563s(this, consumer);
    }

    @Override
    public void mo22167f(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571e(this, consumer);
    }

    @Override
    public boolean mo22166g(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        return false;
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
}
