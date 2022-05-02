package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.function.Consumer;

final class C5478Q extends AbstractC5485a implements AbstractC5468G {
    @Override
    public boolean mo22125a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return false;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
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
