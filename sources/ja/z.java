package ja;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import ra.f;
import ra.k;
import sa.a;

public final class z implements Set, Serializable, a {
    public static final z f15180a = new z();

    @Override
    public boolean add(Object obj) {
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
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public boolean f(Void r22) {
        k.e(r22, "element");
        return false;
    }

    public int getSize() {
        return 0;
    }

    @Override
    public int hashCode() {
        return 0;
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
    public final int size() {
        return getSize();
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
}
