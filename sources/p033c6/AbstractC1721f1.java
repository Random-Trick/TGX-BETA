package p033c6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class AbstractC1721f1<E> extends AbstractC2006z0<E> implements List<E>, RandomAccess {
    public static final AbstractC1951v1<Object> f6262b = new C1691d1(C1881q1.f6818N, 0);

    public static <E> AbstractC1721f1<E> m36059u(Object[] objArr, int i) {
        if (i == 0) {
            return (AbstractC1721f1<E>) C1881q1.f6818N;
        }
        return new C1881q1(objArr, i);
    }

    public static <E> AbstractC1721f1<E> m36058v(E e, E e2) {
        Object[] objArr = {e, e2};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i);
                throw new NullPointerException(sb2.toString());
            }
        }
        return m36059u(objArr, 2);
    }

    @Override
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
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
                    for (int i = 0; i < size; i++) {
                        if (C1837n.m35975a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C1837n.m35975a(it.next(), it2.next())) {
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
    public int mo35829h(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
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
    public final AbstractC1937u1<E> mo35826r() {
        return listIterator(0);
    }

    @Override
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public AbstractC1721f1<E> subList(int i, int i2) {
        C1893r.m35933c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (AbstractC1721f1<E>) C1881q1.f6818N;
        }
        return new C1706e1(this, i, i3);
    }

    public final AbstractC1951v1<E> listIterator(int i) {
        C1893r.m35934b(i, size(), "index");
        return isEmpty() ? (AbstractC1951v1<E>) f6262b : new C1691d1(this, i);
    }
}
