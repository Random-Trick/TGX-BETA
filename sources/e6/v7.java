package e6;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class v7<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] f11143a = new Object[0];

    @Override
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    abstract int f(Object[] objArr, int i10);

    abstract int g();

    public abstract int m();

    @CheckForNull
    public abstract Object[] r();

    @Override
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return toArray(f11143a);
    }

    @Override
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] r10 = r();
            if (r10 != null) {
                return (T[]) Arrays.copyOfRange(r10, m(), g(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
