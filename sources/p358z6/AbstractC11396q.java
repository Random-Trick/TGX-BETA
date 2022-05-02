package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;
import p358z6.AbstractC11384o;

public abstract class AbstractC11396q<E> extends AbstractC11384o<E> implements List<E>, RandomAccess {
    public static final AbstractC11405s0<Object> f36350b = new C11398b(C11367i0.f36308N, 0);

    public static final class C11397a<E> extends AbstractC11384o.AbstractC11385a<E> {
        public C11397a() {
            this(4);
        }

        @CanIgnoreReturnValue
        public C11397a<E> m757d(E e) {
            super.m785b(e);
            return this;
        }

        public AbstractC11396q<E> m756e() {
            this.f36341c = true;
            return AbstractC11396q.m761w(this.f36339a, this.f36340b);
        }

        public C11397a(int i) {
            super(i);
        }
    }

    public static class C11398b<E> extends AbstractC11324a<E> {
        public final AbstractC11396q<E> f36351c;

        public C11398b(AbstractC11396q<E> qVar, int i) {
            super(qVar.size(), i);
            this.f36351c = qVar;
        }

        @Override
        public E mo755a(int i) {
            return this.f36351c.get(i);
        }
    }

    public class C11399c extends AbstractC11396q<E> {
        public final transient int f36352M;
        public final transient int f36354c;

        public C11399c(int i, int i2) {
            this.f36354c = i;
            this.f36352M = i2;
        }

        @Override
        public AbstractC11396q<E> subList(int i, int i2) {
            C10433i.m5125m(i, i2, this.f36352M);
            AbstractC11396q qVar = AbstractC11396q.this;
            int i3 = this.f36354c;
            return qVar.subList(i + i3, i2 + i3);
        }

        @Override
        public E get(int i) {
            C10433i.m5131g(i, this.f36352M);
            return AbstractC11396q.this.get(i + this.f36354c);
        }

        @Override
        public Iterator iterator() {
            return AbstractC11396q.super.iterator();
        }

        @Override
        public ListIterator listIterator() {
            return AbstractC11396q.super.listIterator();
        }

        @Override
        public Object[] mo753m() {
            return AbstractC11396q.this.mo753m();
        }

        @Override
        public int mo752r() {
            return AbstractC11396q.this.mo751s() + this.f36354c + this.f36352M;
        }

        @Override
        public int mo751s() {
            return AbstractC11396q.this.mo751s() + this.f36354c;
        }

        @Override
        public int size() {
            return this.f36352M;
        }

        @Override
        public boolean mo750t() {
            return true;
        }

        @Override
        public ListIterator listIterator(int i) {
            return AbstractC11396q.super.listIterator(i);
        }
    }

    public static <E> AbstractC11396q<E> m771A(E[] eArr) {
        if (eArr.length == 0) {
            return m768D();
        }
        return m759y((Object[]) eArr.clone());
    }

    public static <E> AbstractC11396q<E> m768D() {
        return (AbstractC11396q<E>) C11367i0.f36308N;
    }

    public static <E> AbstractC11396q<E> m767E(E e) {
        return m759y(e);
    }

    public static <E> AbstractC11396q<E> m766F(E e, E e2) {
        return m759y(e, e2);
    }

    public static <E> AbstractC11396q<E> m765G(E e, E e2, E e3, E e4, E e5) {
        return m759y(e, e2, e3, e4, e5);
    }

    public static <E> AbstractC11396q<E> m762v(Object[] objArr) {
        return m761w(objArr, objArr.length);
    }

    public static <E> AbstractC11396q<E> m761w(Object[] objArr, int i) {
        if (i == 0) {
            return m768D();
        }
        return new C11367i0(objArr, i);
    }

    public static <E> C11397a<E> m760x() {
        return new C11397a<>();
    }

    public static <E> AbstractC11396q<E> m759y(Object... objArr) {
        return m762v(C11360f0.m826b(objArr));
    }

    public static <E> AbstractC11396q<E> m758z(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC11384o)) {
            return m759y(collection.toArray());
        }
        AbstractC11396q<E> h = ((AbstractC11384o) collection).mo726h();
        return h.mo750t() ? m762v(h.toArray()) : h;
    }

    public AbstractC11405s0<E> listIterator() {
        return listIterator(0);
    }

    public AbstractC11405s0<E> listIterator(int i) {
        C10433i.m5127k(i, size());
        if (isEmpty()) {
            return (AbstractC11405s0<E>) f36350b;
        }
        return new C11398b(this, i);
    }

    public AbstractC11396q<E> subList(int i, int i2) {
        C10433i.m5125m(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m768D();
        }
        return m764I(i, i2);
    }

    public AbstractC11396q<E> m764I(int i, int i2) {
        return new C11399c(i, i2 - i);
    }

    @Override
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        return C11412w.m696a(this, obj);
    }

    @Override
    public final AbstractC11396q<E> mo726h() {
        return this;
    }

    @Override
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override
    public int mo763i(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return C11412w.m695b(this, obj);
    }

    @Override
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return C11412w.m693d(this, obj);
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractC11403r0<E> iterator() {
        return listIterator();
    }
}
