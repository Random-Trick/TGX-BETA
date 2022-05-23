package d6;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

public abstract class r1<E> extends AbstractSet<E> {
    @Override
    public boolean removeAll(Collection<?> collection) {
        return s1.a(this, collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
