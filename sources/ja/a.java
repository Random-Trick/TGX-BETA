package ja;

import java.util.Collection;
import ra.f;
import ra.k;
import ra.l;

public abstract class a<E> implements Collection<E>, sa.a {

    public static final class C0129a extends l implements qa.l<E, CharSequence> {
        public final a<E> f15156b;

        public C0129a(a<? extends E> aVar) {
            super(1);
            this.f15156b = aVar;
        }

        public final CharSequence a(E e10) {
            return e10 == this.f15156b ? "(this Collection)" : String.valueOf(e10);
        }
    }

    @Override
    public boolean add(E e10) {
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
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (E e11 : this) {
            if (k.b(e11, e10)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<? extends Object> collection) {
        k.e(collection, "elements");
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
        return f.a(this);
    }

    public String toString() {
        return v.H(this, ", ", "[", "]", 0, null, new C0129a(this), 24, null);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        return (T[]) f.b(this, tArr);
    }
}
