package p123ia;

import java.util.AbstractList;
import p251ra.AbstractC8416b;

public abstract class AbstractC5283c<E> extends AbstractList<E> implements AbstractC8416b {
    public abstract int getSize();

    public abstract E mo23451h(int i);

    @Override
    public final E remove(int i) {
        return mo23451h(i);
    }

    @Override
    public final int size() {
        return getSize();
    }
}
