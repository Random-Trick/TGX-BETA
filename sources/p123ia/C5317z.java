package p123ia;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p251ra.AbstractC8415a;
import qa.C8293f;
import qa.C8298k;

public final class C5317z implements Set, Serializable, AbstractC8415a {
    public static final C5317z f17493a = new C5317z();

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
        return m23302i((Void) obj);
    }

    @Override
    public boolean containsAll(Collection collection) {
        C8298k.m12933e(collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int getSize() {
        return 0;
    }

    public boolean add(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public boolean m23302i(Void r2) {
        C8298k.m12933e(r2, "element");
        return false;
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
        return C8293f.m12939a(this);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        C8298k.m12933e(tArr, "array");
        return (T[]) C8293f.m12938b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
