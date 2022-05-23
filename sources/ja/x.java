package ja;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import ra.f;
import ra.k;
import sa.a;

public final class x implements List, Serializable, RandomAccess, a {
    public static final x f15178a = new x();

    @Override
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return f((Void) obj);
    }

    @Override
    public boolean containsAll(Collection collection) {
        k.e(collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public boolean f(Void r22) {
        k.e(r22, "element");
        return false;
    }

    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    public int getSize() {
        return 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m((Void) obj);
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator iterator() {
        return w.f15177a;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return r((Void) obj);
    }

    @Override
    public ListIterator listIterator() {
        return w.f15177a;
    }

    public int m(Void r22) {
        k.e(r22, "element");
        return -1;
    }

    public int r(Void r22) {
        k.e(r22, "element");
        return -1;
    }

    @Override
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return getSize();
    }

    @Override
    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
    }

    @Override
    public Object[] toArray() {
        return f.a(this);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        return (T[]) f.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    @Override
    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return w.f15177a;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }
}
