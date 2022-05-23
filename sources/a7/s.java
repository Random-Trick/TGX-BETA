package a7;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import org.thunderdog.challegram.Log;
import z6.j;

public abstract class s<E> extends o<E> implements Set<E> {
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient q<E> f664b;

    public static <E> s<E> B() {
        return l0.R;
    }

    public static <E> s<E> C(E e10) {
        return new q0(e10);
    }

    public static <E> s<E> D(E e10, E e11) {
        return w(2, e10, e11);
    }

    public static <E> s<E> E(E e10, E e11, E e12) {
        return w(3, e10, e11, e12);
    }

    public static boolean F(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static int v(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        j.e(z10, "collection too large");
        return Log.TAG_TDLIB_OPTIONS;
    }

    public static <E> s<E> w(int i10, Object... objArr) {
        if (i10 == 0) {
            return B();
        }
        if (i10 != 1) {
            int v10 = v(i10);
            Object[] objArr2 = new Object[v10];
            int i11 = v10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = g0.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int a11 = n.a(hashCode);
                while (true) {
                    int i15 = a11 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        i13++;
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        break;
                    } else if (obj.equals(a10)) {
                        break;
                    } else {
                        a11++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new q0(obj2);
            } else if (v(i13) < v10 / 2) {
                return w(i13, objArr);
            } else {
                if (F(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new l0(objArr, i12, objArr2, i11, i13);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return C(obj3);
        }
    }

    public static <E> s<E> x(Collection<? extends E> collection) {
        if ((collection instanceof s) && !(collection instanceof SortedSet)) {
            s<E> sVar = (s) collection;
            if (!sVar.t()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return w(array.length, array);
    }

    public static <E> s<E> y(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return B();
        }
        if (length != 1) {
            return w(eArr.length, (Object[]) eArr.clone());
        }
        return C(eArr[0]);
    }

    public boolean A() {
        return false;
    }

    @Override
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || !A() || !((s) obj).A() || hashCode() == obj.hashCode()) {
            return p0.a(this, obj);
        }
        return false;
    }

    @Override
    public q<E> f() {
        q<E> qVar = this.f664b;
        if (qVar != null) {
            return qVar;
        }
        q<E> z10 = z();
        this.f664b = z10;
        return z10;
    }

    @Override
    public int hashCode() {
        return p0.d(this);
    }

    @Override
    public abstract s0<E> iterator();

    public q<E> z() {
        return q.v(toArray());
    }
}
