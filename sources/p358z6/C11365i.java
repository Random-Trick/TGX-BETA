package p358z6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10434j;
import p343y6.C10433i;

public final class C11365i {

    public static class C11366a<E> extends AbstractCollection<E> {
        public final Collection<E> f36306a;
        public final AbstractC10434j<? super E> f36307b;

        public C11366a(Collection<E> collection, AbstractC10434j<? super E> jVar) {
            this.f36306a = collection;
            this.f36307b = jVar;
        }

        @Override
        public boolean add(E e) {
            C10433i.m5134d(this.f36307b.apply(e));
            return this.f36306a.add(e);
        }

        @Override
        public boolean addAll(Collection<? extends E> collection) {
            for (E e : collection) {
                C10433i.m5134d(this.f36307b.apply(e));
            }
            return this.f36306a.addAll(collection);
        }

        @Override
        public void clear() {
            C11406t.m715e(this.f36306a, this.f36307b);
        }

        @Override
        public boolean contains(@NullableDecl Object obj) {
            if (C11365i.m813c(this.f36306a, obj)) {
                return this.f36307b.apply(obj);
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return C11365i.m815a(this, collection);
        }

        @Override
        public boolean isEmpty() {
            return !C11406t.m719a(this.f36306a, this.f36307b);
        }

        @Override
        public Iterator<E> iterator() {
            return C11407u.m706g(this.f36306a.iterator(), this.f36307b);
        }

        @Override
        public boolean remove(Object obj) {
            return contains(obj) && this.f36306a.remove(obj);
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f36306a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f36307b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f36306a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f36307b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override
        public int size() {
            int i = 0;
            for (E e : this.f36306a) {
                if (this.f36307b.apply(e)) {
                    i++;
                }
            }
            return i;
        }

        @Override
        public Object[] toArray() {
            return C11412w.m690g(iterator()).toArray();
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C11412w.m690g(iterator()).toArray(tArr);
        }
    }

    public static boolean m815a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder m814b(int i) {
        C11363h.m819b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    public static boolean m813c(Collection<?> collection, @NullableDecl Object obj) {
        C10433i.m5129i(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
