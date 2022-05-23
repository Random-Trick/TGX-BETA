package c6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class i<E> extends f<E> implements List<E>, RandomAccess {
    public static final m<Object> f4954b = new g(k.N, 0);

    public static <E> i<E> t(Object[] objArr, int i10) {
        if (i10 == 0) {
            return (i<E>) k.N;
        }
        return new k(objArr, i10);
    }

    public static <E> i<E> u(E e10) {
        Object[] objArr = {e10};
        j.a(objArr, 1);
        return t(objArr, 1);
    }

    public static <E> i<E> v(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16, e17, e18};
        j.a(objArr, 9);
        return t(objArr, 9);
    }

    @Override
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (q0.a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!q0.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int f(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    public i<E> subList(int i10, int i11) {
        b.c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return (i<E>) k.N;
        }
        return new h(this, i10, i12);
    }

    @Override
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    public final m<E> listIterator(int i10) {
        b.b(i10, size(), "index");
        return isEmpty() ? (m<E>) f4954b : new g(this, i10);
    }
}
