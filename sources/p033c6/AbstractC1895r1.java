package p033c6;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

public abstract class AbstractC1895r1<E> extends AbstractSet<E> {
    @Override
    public boolean removeAll(Collection<?> collection) {
        return C1909s1.m35908a(this, collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
