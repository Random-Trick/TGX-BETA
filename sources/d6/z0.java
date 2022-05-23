package d6;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class z0<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] f7171a = new Object[0];

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

    public int f(Object[] objArr, int i10) {
        throw null;
    }

    int g() {
        throw null;
    }

    public int m() {
        throw null;
    }

    public abstract u1<E> iterator();

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

    @CheckForNull
    public Object[] s() {
        throw null;
    }

    @Override
    public final Object[] toArray() {
        return toArray(f7171a);
    }

    @Override
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] s10 = s();
            if (s10 != null) {
                return (T[]) Arrays.copyOfRange(s10, m(), g(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
