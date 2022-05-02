package p123ia;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p251ra.AbstractC8415a;
import qa.C8293f;
import qa.C8298k;

public final class C5315x implements List, Serializable, RandomAccess, AbstractC8415a {
    public static final C5315x f17491a = new C5315x();

    @Override
    public boolean addAll(int i, Collection collection) {
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
        return m23314m((Void) obj);
    }

    @Override
    public boolean containsAll(Collection collection) {
        C8298k.m12934e(collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int getSize() {
        return 0;
    }

    public void add(int i, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public boolean add(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m23312s((Void) obj);
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator iterator() {
        return C5314w.f17490a;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m23311t((Void) obj);
    }

    @Override
    public ListIterator listIterator() {
        return C5314w.f17490a;
    }

    public boolean m23314m(Void r2) {
        C8298k.m12934e(r2, "element");
        return false;
    }

    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override
    public Object remove(int i) {
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

    public int m23312s(Void r2) {
        C8298k.m12934e(r2, "element");
        return -1;
    }

    @Override
    public final int size() {
        return getSize();
    }

    @Override
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public int m23311t(Void r2) {
        C8298k.m12934e(r2, "element");
        return -1;
    }

    @Override
    public Object[] toArray() {
        return C8293f.m12940a(this);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        C8298k.m12934e(tArr, "array");
        return (T[]) C8293f.m12939b(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    public Void set(int i, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C5314w.f17490a;
        }
        throw new IndexOutOfBoundsException(C8298k.m12929j("Index: ", Integer.valueOf(i)));
    }
}
