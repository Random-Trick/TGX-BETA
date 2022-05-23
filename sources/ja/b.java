package ja;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import ra.g;
import ra.k;

public abstract class b<E> extends ja.a<E> implements List<E> {
    public static final a f15159a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
            k.e(collection, "c");
            k.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!k.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> collection) {
            k.e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    public class C0130b implements Iterator<E>, sa.a, j$.util.Iterator {
        public int f15160a;

        public C0130b() {
        }

        public final int d() {
            return this.f15160a;
        }

        public final void f(int i10) {
            this.f15160a = i10;
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public boolean hasNext() {
            return this.f15160a < b.this.size();
        }

        @Override
        public E next() {
            if (hasNext()) {
                b<E> bVar = b.this;
                int i10 = this.f15160a;
                this.f15160a = i10 + 1;
                return bVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class c extends b<E>.C0130b implements ListIterator<E> {
        public c(int i10) {
            super();
            b.f15159a.b(i10, b.this.size());
            f(i10);
        }

        @Override
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean hasPrevious() {
            return d() > 0;
        }

        @Override
        public int nextIndex() {
            return d();
        }

        @Override
        public E previous() {
            if (hasPrevious()) {
                b<E> bVar = b.this;
                f(d() - 1);
                return bVar.get(d());
            }
            throw new NoSuchElementException();
        }

        @Override
        public int previousIndex() {
            return d() - 1;
        }

        @Override
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends b<E> implements RandomAccess {
        public int M;
        public final b<E> f15163b;
        public final int f15164c;

        public d(b<? extends E> bVar, int i10, int i11) {
            k.e(bVar, "list");
            this.f15163b = bVar;
            this.f15164c = i10;
            b.f15159a.c(i10, i11, bVar.size());
            this.M = i11 - i10;
        }

        @Override
        public E get(int i10) {
            b.f15159a.a(i10, this.M);
            return this.f15163b.get(this.f15164c + i10);
        }

        @Override
        public int getSize() {
            return this.M;
        }
    }

    @Override
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f15159a.d(this, (Collection) obj);
    }

    public abstract E get(int i10);

    @Override
    public int hashCode() {
        return f15159a.e(this);
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (k.b(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new C0130b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (k.b(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    @Override
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
