package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;
import z6.j;

@DoNotMock("Use ImmutableList.of or another implementation")
public abstract class o<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] f643a = new Object[0];

    public static abstract class a<E> extends b<E> {
        public Object[] f644a;
        public int f645b = 0;
        public boolean f646c;

        public a(int i10) {
            h.b(i10, "initialCapacity");
            this.f644a = new Object[i10];
        }

        @Override
        @CanIgnoreReturnValue
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(this.f645b + collection.size());
                if (collection instanceof o) {
                    this.f645b = ((o) collection).g(this.f644a, this.f645b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        public a<E> d(E e10) {
            j.i(e10);
            e(this.f645b + 1);
            Object[] objArr = this.f644a;
            int i10 = this.f645b;
            this.f645b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public final void e(int i10) {
            Object[] objArr = this.f644a;
            if (objArr.length < i10) {
                this.f644a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
                this.f646c = false;
            } else if (this.f646c) {
                this.f644a = (Object[]) objArr.clone();
                this.f646c = false;
            }
        }
    }

    @DoNotMock
    public static abstract class b<E> {
        public static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        @CanIgnoreReturnValue
        public abstract b<E> a(E e10);

        @CanIgnoreReturnValue
        public b<E> b(Iterable<? extends E> iterable) {
            for (E e10 : iterable) {
                a(e10);
            }
            return this;
        }
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(@CheckForNull Object obj);

    public q<E> f() {
        return isEmpty() ? q.D() : q.v(toArray());
    }

    @CanIgnoreReturnValue
    public int g(Object[] objArr, int i10) {
        s0<E> u10 = iterator();
        while (u10.hasNext()) {
            i10++;
            objArr[i10] = u10.next();
        }
        return i10;
    }

    @CheckForNull
    public Object[] m() {
        return null;
    }

    public int r() {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int s() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean t();

    @Override
    public final Object[] toArray() {
        return toArray(f643a);
    }

    public abstract s0<E> iterator();

    @Override
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        j.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] m10 = m();
            if (m10 != null) {
                return (T[]) i0.a(m10, s(), r(), tArr);
            }
            tArr = (T[]) g0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        g(tArr, 0);
        return tArr;
    }
}
