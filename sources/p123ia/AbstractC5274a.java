package p123ia;

import java.util.Collection;
import p251ra.AbstractC8415a;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8293f;
import qa.C8298k;

public abstract class AbstractC5274a<E> implements Collection<E>, AbstractC8415a {

    public static final class C5275a extends AbstractC8299l implements AbstractC8088l<E, CharSequence> {
        public final AbstractC5274a<E> f17466b;

        public C5275a(AbstractC5274a<? extends E> aVar) {
            super(1);
            this.f17466b = aVar;
        }

        public final CharSequence mo568a(E e) {
            return e == this.f17466b ? "(this Collection)" : String.valueOf(e);
        }
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (E e2 : this) {
            if (C8298k.m12937b(e2, e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<? extends Object> collection) {
        C8298k.m12934e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override
    public boolean isEmpty() {
        return size() == 0;
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
    public Object[] toArray() {
        return C8293f.m12940a(this);
    }

    public String toString() {
        return C5312v.m23340H(this, ", ", "[", "]", 0, null, new C5275a(this), 24, null);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        C8298k.m12934e(tArr, "array");
        return (T[]) C8293f.m12939b(this, tArr);
    }
}
