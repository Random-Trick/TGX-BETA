package p123ia;

import java.util.Collection;
import java.util.Iterator;
import p251ra.AbstractC8415a;
import qa.C8287b;
import qa.C8293f;
import qa.C8298k;

public final class C5285d<T> implements Collection<T>, AbstractC8415a {
    public final T[] f17479a;
    public final boolean f17480b;

    public C5285d(T[] tArr, boolean z) {
        C8298k.m12934e(tArr, "values");
        this.f17479a = tArr;
        this.f17480b = z;
    }

    @Override
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object obj) {
        return C5296i.m23392o(this.f17479a, obj);
    }

    @Override
    public boolean containsAll(Collection<? extends Object> collection) {
        C8298k.m12934e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f17479a.length;
    }

    @Override
    public boolean isEmpty() {
        return this.f17479a.length == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return C8287b.m12950a(this.f17479a);
    }

    @Override
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return getSize();
    }

    @Override
    public final Object[] toArray() {
        return C5303m.m23371a(this.f17479a, this.f17480b);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        C8298k.m12934e(tArr, "array");
        return (T[]) C8293f.m12939b(this, tArr);
    }
}
