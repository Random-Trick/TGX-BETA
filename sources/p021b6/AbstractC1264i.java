package p021b6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class AbstractC1264i<E> extends AbstractC1258f<E> implements List<E>, RandomAccess {
    public static final AbstractC1272m<Object> f4627b = new C1260g(C1268k.f4629N, 0);

    public static <E> AbstractC1264i<E> m37818t(Object[] objArr, int i) {
        if (i == 0) {
            return (AbstractC1264i<E>) C1268k.f4629N;
        }
        return new C1268k(objArr, i);
    }

    public static <E> AbstractC1264i<E> m37817u(E e) {
        Object[] objArr = {e};
        C1266j.m37813a(objArr, 1);
        return m37818t(objArr, 1);
    }

    public static <E> AbstractC1264i<E> m37816v(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9};
        C1266j.m37813a(objArr, 9);
        return m37818t(objArr, 9);
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
                        if (C1281q0.m37801a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C1281q0.m37801a(it.next(), it2.next())) {
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
    public int mo37811h(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
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
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public AbstractC1264i<E> subList(int i, int i2) {
        C1250b.m37826c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (AbstractC1264i<E>) C1268k.f4629N;
        }
        return new C1262h(this, i, i3);
    }

    @Override
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final AbstractC1272m<E> listIterator(int i) {
        C1250b.m37827b(i, size(), "index");
        return isEmpty() ? (AbstractC1272m<E>) f4627b : new C1260g(this, i);
    }
}
