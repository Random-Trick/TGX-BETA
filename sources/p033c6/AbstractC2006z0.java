package p033c6;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class AbstractC2006z0<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] f7142a = new Object[0];

    @Override
    @Deprecated
    public final boolean add(E e) {
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

    public int mo35829h(Object[] objArr, int i) {
        throw null;
    }

    int mo35828i() {
        throw null;
    }

    public int mo35827m() {
        throw null;
    }

    public abstract AbstractC1937u1<E> iterator();

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
    public Object[] mo35825s() {
        throw null;
    }

    @Override
    public final Object[] toArray() {
        return toArray(f7142a);
    }

    @Override
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] s = mo35825s();
            if (s != null) {
                return (T[]) Arrays.copyOfRange(s, mo35827m(), mo35828i(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (length > size) {
            tArr[size] = null;
        }
        mo35829h(tArr, 0);
        return tArr;
    }
}
