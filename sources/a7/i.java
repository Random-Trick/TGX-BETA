package a7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import z6.j;
import z6.k;

public final class i {

    public static class a<E> extends AbstractCollection<E> {
        public final Collection<E> f628a;
        public final k<? super E> f629b;

        public a(Collection<E> collection, k<? super E> kVar) {
            this.f628a = collection;
            this.f629b = kVar;
        }

        @Override
        public boolean add(E e10) {
            j.d(this.f629b.apply(e10));
            return this.f628a.add(e10);
        }

        @Override
        public boolean addAll(Collection<? extends E> collection) {
            for (E e10 : collection) {
                j.d(this.f629b.apply(e10));
            }
            return this.f628a.addAll(collection);
        }

        @Override
        public void clear() {
            t.e(this.f628a, this.f629b);
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            if (i.c(this.f628a, obj)) {
                return this.f629b.apply(obj);
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return i.a(this, collection);
        }

        @Override
        public boolean isEmpty() {
            return !t.a(this.f628a, this.f629b);
        }

        @Override
        public Iterator<E> iterator() {
            return u.g(this.f628a.iterator(), this.f629b);
        }

        @Override
        public boolean remove(@CheckForNull Object obj) {
            return contains(obj) && this.f628a.remove(obj);
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f628a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f629b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f628a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f629b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override
        public int size() {
            int i10 = 0;
            for (E e10 : this.f628a) {
                if (this.f629b.apply(e10)) {
                    i10++;
                }
            }
            return i10;
        }

        @Override
        public Object[] toArray() {
            return w.g(iterator()).toArray();
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) w.g(iterator()).toArray(tArr);
        }
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder b(int i10) {
        h.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    public static boolean c(Collection<?> collection, @CheckForNull Object obj) {
        j.i(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
