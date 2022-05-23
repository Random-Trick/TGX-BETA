package ja;

import java.util.AbstractList;
import sa.d;

public abstract class c<E> extends AbstractList<E> implements d {
    public abstract E f(int i10);

    public abstract int getSize();

    @Override
    public final E remove(int i10) {
        return f(i10);
    }

    @Override
    public final int size() {
        return getSize();
    }
}
