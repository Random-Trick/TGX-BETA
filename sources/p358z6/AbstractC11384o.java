package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public abstract class AbstractC11384o<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] f36338a = new Object[0];

    public static abstract class AbstractC11385a<E> extends AbstractC11386b<E> {
        public Object[] f36339a;
        public int f36340b = 0;
        public boolean f36341c;

        public AbstractC11385a(int i) {
            C11363h.m819b(i, "initialCapacity");
            this.f36339a = new Object[i];
        }

        @CanIgnoreReturnValue
        public AbstractC11385a<E> m785b(E e) {
            C10433i.m5129i(e);
            m784c(this.f36340b + 1);
            Object[] objArr = this.f36339a;
            int i = this.f36340b;
            this.f36340b = i + 1;
            objArr[i] = e;
            return this;
        }

        public final void m784c(int i) {
            Object[] objArr = this.f36339a;
            if (objArr.length < i) {
                this.f36339a = Arrays.copyOf(objArr, AbstractC11386b.m783a(objArr.length, i));
                this.f36341c = false;
            } else if (this.f36341c) {
                this.f36339a = (Object[]) objArr.clone();
                this.f36341c = false;
            }
        }
    }

    public static abstract class AbstractC11386b<E> {
        public static int m783a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(@NullableDecl Object obj);

    public AbstractC11396q<E> mo726h() {
        return isEmpty() ? AbstractC11396q.m768D() : AbstractC11396q.m762v(toArray());
    }

    @CanIgnoreReturnValue
    public int mo763i(Object[] objArr, int i) {
        AbstractC11403r0<E> u = iterator();
        while (u.hasNext()) {
            i++;
            objArr[i] = u.next();
        }
        return i;
    }

    public Object[] mo753m() {
        return null;
    }

    public int mo752r() {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int mo751s() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean mo750t();

    @Override
    public final Object[] toArray() {
        return toArray(f36338a);
    }

    public abstract AbstractC11403r0<E> iterator();

    @Override
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        C10433i.m5129i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] m = mo753m();
            if (m != null) {
                return (T[]) C11364h0.m817a(m, mo751s(), mo752r(), tArr);
            }
            tArr = (T[]) C11360f0.m824d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo763i(tArr, 0);
        return tArr;
    }
}
