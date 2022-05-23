package ja;

import java.util.Collection;
import java.util.Iterator;
import ra.b;
import ra.f;
import ra.k;
import sa.a;

public final class d<T> implements Collection<T>, a {
    public final T[] f15168a;
    public final boolean f15169b;

    public d(T[] tArr, boolean z10) {
        k.e(tArr, "values");
        this.f15168a = tArr;
        this.f15169b = z10;
    }

    @Override
    public boolean add(T t10) {
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
        return i.o(this.f15168a, obj);
    }

    @Override
    public boolean containsAll(Collection<? extends Object> collection) {
        k.e(collection, "elements");
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
        return this.f15168a.length;
    }

    @Override
    public boolean isEmpty() {
        return this.f15168a.length == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return b.a(this.f15168a);
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
        return m.a(this.f15168a, this.f15169b);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        return (T[]) f.b(this, tArr);
    }
}
