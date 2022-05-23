package d6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class f1<E> extends z0<E> implements List<E>, RandomAccess {
    public static final v1<Object> f6486b = new d1(q1.N, 0);

    public static <E> f1<E> u(Object[] objArr, int i10) {
        if (i10 == 0) {
            return (f1<E>) q1.N;
        }
        return new q1(objArr, i10);
    }

    public static <E> f1<E> v(E e10, E e11) {
        Object[] objArr = {e10, e11};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
        return u(objArr, 2);
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
                        if (n.a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!n.a(it.next(), it2.next())) {
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
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
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
    public final u1<E> r() {
        return listIterator(0);
    }

    @Override
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    public f1<E> subList(int i10, int i11) {
        r.c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return (f1<E>) q1.N;
        }
        return new e1(this, i10, i12);
    }

    public final v1<E> listIterator(int i10) {
        r.b(i10, size(), "index");
        return isEmpty() ? (v1<E>) f6486b : new d1(this, i10);
    }
}
