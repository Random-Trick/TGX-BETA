package a7;

import a7.o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import z6.j;

public abstract class q<E> extends o<E> implements List<E>, RandomAccess {
    public static final t0<Object> f652b = new b(j0.N, 0);

    public static final class a<E> extends o.a<E> {
        public a() {
            this(4);
        }

        @CanIgnoreReturnValue
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        @CanIgnoreReturnValue
        public a<E> g(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public q<E> h() {
            this.f646c = true;
            return q.w(this.f644a, this.f645b);
        }

        public a(int i10) {
            super(i10);
        }
    }

    public static class b<E> extends a7.a<E> {
        public final q<E> f653c;

        public b(q<E> qVar, int i10) {
            super(qVar.size(), i10);
            this.f653c = qVar;
        }

        @Override
        public E a(int i10) {
            return this.f653c.get(i10);
        }
    }

    public class c extends q<E> {
        public final transient int M;
        public final transient int f654c;

        public c(int i10, int i11) {
            this.f654c = i10;
            this.M = i11;
        }

        @Override
        public q<E> subList(int i10, int i11) {
            j.m(i10, i11, this.M);
            q qVar = q.this;
            int i12 = this.f654c;
            return qVar.subList(i10 + i12, i11 + i12);
        }

        @Override
        public E get(int i10) {
            j.g(i10, this.M);
            return q.this.get(i10 + this.f654c);
        }

        @Override
        public Iterator iterator() {
            return q.super.iterator();
        }

        @Override
        public ListIterator listIterator() {
            return q.super.listIterator();
        }

        @Override
        @CheckForNull
        public Object[] m() {
            return q.this.m();
        }

        @Override
        public int r() {
            return q.this.s() + this.f654c + this.M;
        }

        @Override
        public int s() {
            return q.this.s() + this.f654c;
        }

        @Override
        public int size() {
            return this.M;
        }

        @Override
        public boolean t() {
            return true;
        }

        @Override
        public ListIterator listIterator(int i10) {
            return q.super.listIterator(i10);
        }
    }

    public static <E> q<E> A(E[] eArr) {
        if (eArr.length == 0) {
            return D();
        }
        return y((Object[]) eArr.clone());
    }

    public static <E> q<E> D() {
        return (q<E>) j0.N;
    }

    public static <E> q<E> E(E e10) {
        return y(e10);
    }

    public static <E> q<E> F(E e10, E e11) {
        return y(e10, e11);
    }

    public static <E> q<E> G(E e10, E e11, E e12, E e13, E e14) {
        return y(e10, e11, e12, e13, e14);
    }

    public static <E> q<E> v(Object[] objArr) {
        return w(objArr, objArr.length);
    }

    public static <E> q<E> w(Object[] objArr, int i10) {
        if (i10 == 0) {
            return D();
        }
        return new j0(objArr, i10);
    }

    public static <E> a<E> x() {
        return new a<>();
    }

    public static <E> q<E> y(Object... objArr) {
        return v(g0.b(objArr));
    }

    public static <E> q<E> z(Collection<? extends E> collection) {
        if (!(collection instanceof o)) {
            return y(collection.toArray());
        }
        q<E> f10 = ((o) collection).f();
        return f10.t() ? v(f10.toArray()) : f10;
    }

    public t0<E> listIterator() {
        return listIterator(0);
    }

    public t0<E> listIterator(int i10) {
        j.k(i10, size());
        if (isEmpty()) {
            return (t0<E>) f652b;
        }
        return new b(this, i10);
    }

    public q<E> subList(int i10, int i11) {
        j.m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return D();
        }
        return I(i10, i11);
    }

    public q<E> I(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public boolean equals(@CheckForNull Object obj) {
        return w.a(this, obj);
    }

    @Override
    @InlineMe(replacement = "this")
    @Deprecated
    public final q<E> f() {
        return this;
    }

    @Override
    public int g(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.b(this, obj);
    }

    @Override
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public s0<E> iterator() {
        return listIterator();
    }
}
