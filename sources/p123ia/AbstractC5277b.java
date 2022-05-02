package p123ia;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC5277b<E> extends AbstractC5274a<E> implements List<E> {
    public static final C5278a f17469a = new C5278a(null);

    public static final class C5278a {
        public C5278a() {
        }

        public C5278a(C8294g gVar) {
            this();
        }

        public final void m23466a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void m23465b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void m23464c(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        public final boolean m23463d(Collection<?> collection, Collection<?> collection2) {
            C8298k.m12933e(collection, "c");
            C8298k.m12933e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C8298k.m12936b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int m23462e(Collection<?> collection) {
            C8298k.m12933e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next == null ? 0 : next.hashCode());
            }
            return i;
        }
    }

    public class C5279b implements Iterator<E>, AbstractC8415a, p126j$.util.Iterator {
        public int f17470a;
        public final AbstractC5277b<E> f17471b;

        public C5279b(AbstractC5277b bVar) {
            C8298k.m12933e(bVar, "this$0");
            this.f17471b = bVar;
        }

        public final int m23461e() {
            return this.f17470a;
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final void m23460h(int i) {
            this.f17470a = i;
        }

        @Override
        public boolean hasNext() {
            return this.f17470a < this.f17471b.size();
        }

        @Override
        public E next() {
            if (hasNext()) {
                AbstractC5277b<E> bVar = this.f17471b;
                int i = this.f17470a;
                this.f17470a = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class C5280c extends AbstractC5277b<E>.C5279b implements ListIterator<E> {
        public final AbstractC5277b<E> f17472c;

        public C5280c(AbstractC5277b bVar, int i) {
            super(bVar);
            C8298k.m12933e(bVar, "this$0");
            this.f17472c = bVar;
            AbstractC5277b.f17469a.m23465b(i, bVar.size());
            m23460h(i);
        }

        @Override
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean hasPrevious() {
            return m23461e() > 0;
        }

        @Override
        public int nextIndex() {
            return m23461e();
        }

        @Override
        public E previous() {
            if (hasPrevious()) {
                AbstractC5277b<E> bVar = this.f17472c;
                m23460h(m23461e() - 1);
                return bVar.get(m23461e());
            }
            throw new NoSuchElementException();
        }

        @Override
        public int previousIndex() {
            return m23461e() - 1;
        }

        @Override
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class C5281d<E> extends AbstractC5277b<E> implements RandomAccess {
        public int f17473M;
        public final AbstractC5277b<E> f17474b;
        public final int f17475c;

        public C5281d(AbstractC5277b<? extends E> bVar, int i, int i2) {
            C8298k.m12933e(bVar, "list");
            this.f17474b = bVar;
            this.f17475c = i;
            AbstractC5277b.f17469a.m23464c(i, i2, bVar.size());
            this.f17473M = i2 - i;
        }

        @Override
        public E get(int i) {
            AbstractC5277b.f17469a.m23466a(i, this.f17473M);
            return this.f17474b.get(this.f17475c + i);
        }

        @Override
        public int getSize() {
            return this.f17473M;
        }
    }

    @Override
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
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
        return f17469a.m23463d(this, (Collection) obj);
    }

    public abstract E get(int i);

    @Override
    public int hashCode() {
        return f17469a.m23462e(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (C8298k.m12936b(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new C5279b(this);
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C8298k.m12936b(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new C5280c(this, 0);
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public List<E> subList(int i, int i2) {
        return new C5281d(this, i, i2);
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return new C5280c(this, i);
    }
}
