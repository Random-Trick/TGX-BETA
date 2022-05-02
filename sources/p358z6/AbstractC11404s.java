package p358z6;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.thunderdog.challegram.Log;
import p343y6.C10433i;

public abstract class AbstractC11404s<E> extends AbstractC11384o<E> implements Set<E> {
    @RetainedWith
    @NullableDecl
    @LazyInit
    public transient AbstractC11396q<E> f36364b;

    public static <E> AbstractC11404s<E> m731B() {
        return C11377k0.f36330Q;
    }

    public static <E> AbstractC11404s<E> m730C(E e) {
        return new C11395p0(e);
    }

    public static <E> AbstractC11404s<E> m729D(E e, E e2) {
        return m723w(2, e, e2);
    }

    public static <E> AbstractC11404s<E> m728E(E e, E e2, E e3) {
        return m723w(3, e, e2, e3);
    }

    public static boolean m727F(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static int m724v(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C10433i.m5133e(z, "collection too large");
        return Log.TAG_TDLIB_OPTIONS;
    }

    public static <E> AbstractC11404s<E> m723w(int i, Object... objArr) {
        if (i == 0) {
            return m731B();
        }
        if (i == 1) {
            return m730C(objArr[0]);
        }
        int v = m724v(i);
        Object[] objArr2 = new Object[v];
        int i2 = v - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a = C11360f0.m827a(objArr[i5], i5);
            int hashCode = a.hashCode();
            int a2 = C11382n.m787a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    i4++;
                    objArr[i4] = a;
                    objArr2[i6] = a;
                    i3 += hashCode;
                    break;
                } else if (obj.equals(a)) {
                    break;
                } else {
                    a2++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new C11395p0(objArr[0], i3);
        }
        if (m724v(i4) < v / 2) {
            return m723w(i4, objArr);
        }
        if (m727F(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C11377k0(objArr, i3, objArr2, i2, i4);
    }

    public static <E> AbstractC11404s<E> m722x(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC11404s) && !(collection instanceof SortedSet)) {
            AbstractC11404s<E> sVar = (AbstractC11404s) collection;
            if (!sVar.mo750t()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return m723w(array.length, array);
    }

    public static <E> AbstractC11404s<E> m721y(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m731B();
        }
        if (length != 1) {
            return m723w(eArr.length, (Object[]) eArr.clone());
        }
        return m730C(eArr[0]);
    }

    public boolean mo732A() {
        return false;
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11404s) || !mo732A() || !((AbstractC11404s) obj).mo732A() || hashCode() == obj.hashCode()) {
            return C11387o0.m782a(this, obj);
        }
        return false;
    }

    @Override
    public AbstractC11396q<E> mo726h() {
        AbstractC11396q<E> qVar = this.f36364b;
        if (qVar != null) {
            return qVar;
        }
        AbstractC11396q<E> z = mo720z();
        this.f36364b = z;
        return z;
    }

    @Override
    public int hashCode() {
        return C11387o0.m779d(this);
    }

    @Override
    public abstract AbstractC11403r0<E> iterator();

    public AbstractC11396q<E> mo720z() {
        return AbstractC11396q.m762v(toArray());
    }
}
