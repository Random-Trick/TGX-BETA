package k0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {
    public static Object[] M;
    public static int N;
    public static Object[] O;
    public static int P;
    public static final Object Q = new Object();
    public static final Object R = new Object();
    public int[] f15568a;
    public Object[] f15569b;
    public int f15570c;

    public class a extends d<E> {
        public a() {
            super(b.this.f15570c);
        }

        @Override
        public E a(int i10) {
            return (E) b.this.v(i10);
        }

        @Override
        public void b(int i10) {
            b.this.u(i10);
        }
    }

    public b() {
        this(0);
    }

    public static void r(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (R) {
                if (P < 10) {
                    objArr[0] = O;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    O = objArr;
                    P++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (Q) {
                if (N < 10) {
                    objArr[0] = M;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    M = objArr;
                    N++;
                }
            }
        }
    }

    @Override
    public boolean add(E e10) {
        int i10;
        int i11;
        int i12 = this.f15570c;
        if (e10 == null) {
            i11 = t();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = s(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i13 = ~i11;
        int[] iArr = this.f15568a;
        if (i12 >= iArr.length) {
            int i14 = 4;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f15569b;
            f(i14);
            if (i12 == this.f15570c) {
                int[] iArr2 = this.f15568a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f15569b, 0, objArr.length);
                }
                r(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i12) {
            int[] iArr3 = this.f15568a;
            int i15 = i13 + 1;
            int i16 = i12 - i13;
            System.arraycopy(iArr3, i13, iArr3, i15, i16);
            Object[] objArr2 = this.f15569b;
            System.arraycopy(objArr2, i13, objArr2, i15, i16);
        }
        int i17 = this.f15570c;
        if (i12 == i17) {
            int[] iArr4 = this.f15568a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                this.f15569b[i13] = e10;
                this.f15570c = i17 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        m(this.f15570c + collection.size());
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override
    public void clear() {
        int i10 = this.f15570c;
        if (i10 != 0) {
            int[] iArr = this.f15568a;
            Object[] objArr = this.f15569b;
            this.f15568a = c.f15571a;
            this.f15569b = c.f15573c;
            this.f15570c = 0;
            r(iArr, objArr, i10);
        }
        if (this.f15570c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f15570c; i10++) {
                try {
                    if (!set.contains(v(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i10) {
        if (i10 == 8) {
            synchronized (R) {
                Object[] objArr = O;
                if (objArr != null) {
                    try {
                        this.f15569b = objArr;
                        O = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f15568a = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            P--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    O = null;
                    P = 0;
                }
            }
        } else if (i10 == 4) {
            synchronized (Q) {
                Object[] objArr2 = M;
                if (objArr2 != null) {
                    try {
                        this.f15569b = objArr2;
                        M = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f15568a = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            N--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    M = null;
                    N = 0;
                }
            }
        }
        this.f15568a = new int[i10];
        this.f15569b = new Object[i10];
    }

    public final int g(int i10) {
        try {
            return c.a(this.f15568a, this.f15570c, i10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public int hashCode() {
        int[] iArr = this.f15568a;
        int i10 = this.f15570c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? t() : s(obj, obj.hashCode());
    }

    @Override
    public boolean isEmpty() {
        return this.f15570c <= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new a();
    }

    public void m(int i10) {
        int i11 = this.f15570c;
        int[] iArr = this.f15568a;
        if (iArr.length < i10) {
            Object[] objArr = this.f15569b;
            f(i10);
            int i12 = this.f15570c;
            if (i12 > 0) {
                System.arraycopy(iArr, 0, this.f15568a, 0, i12);
                System.arraycopy(objArr, 0, this.f15569b, 0, this.f15570c);
            }
            r(iArr, objArr, this.f15570c);
        }
        if (this.f15570c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        u(indexOf);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f15570c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f15569b[i10])) {
                u(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final int s(Object obj, int i10) {
        int i11 = this.f15570c;
        if (i11 == 0) {
            return -1;
        }
        int g10 = g(i10);
        if (g10 < 0 || obj.equals(this.f15569b[g10])) {
            return g10;
        }
        int i12 = g10 + 1;
        while (i12 < i11 && this.f15568a[i12] == i10) {
            if (obj.equals(this.f15569b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = g10 - 1; i13 >= 0 && this.f15568a[i13] == i10; i13--) {
            if (obj.equals(this.f15569b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override
    public int size() {
        return this.f15570c;
    }

    public final int t() {
        int i10 = this.f15570c;
        if (i10 == 0) {
            return -1;
        }
        int g10 = g(0);
        if (g10 < 0 || this.f15569b[g10] == null) {
            return g10;
        }
        int i11 = g10 + 1;
        while (i11 < i10 && this.f15568a[i11] == 0) {
            if (this.f15569b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = g10 - 1; i12 >= 0 && this.f15568a[i12] == 0; i12--) {
            if (this.f15569b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override
    public Object[] toArray() {
        int i10 = this.f15570c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f15569b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15570c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15570c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E v10 = v(i10);
            if (v10 != this) {
                sb2.append(v10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public E u(int i10) {
        int i11 = this.f15570c;
        Object[] objArr = this.f15569b;
        E e10 = (E) objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f15568a;
            int i13 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    int i15 = i12 - i10;
                    System.arraycopy(iArr, i14, iArr, i10, i15);
                    Object[] objArr2 = this.f15569b;
                    System.arraycopy(objArr2, i14, objArr2, i10, i15);
                }
                this.f15569b[i12] = null;
            } else {
                if (i11 > 8) {
                    i13 = i11 + (i11 >> 1);
                }
                f(i13);
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f15568a, 0, i10);
                    System.arraycopy(objArr, 0, this.f15569b, 0, i10);
                }
                if (i10 < i12) {
                    int i16 = i10 + 1;
                    int i17 = i12 - i10;
                    System.arraycopy(iArr, i16, this.f15568a, i10, i17);
                    System.arraycopy(objArr, i16, this.f15569b, i10, i17);
                }
            }
            if (i11 == this.f15570c) {
                this.f15570c = i12;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e10;
    }

    public E v(int i10) {
        return (E) this.f15569b[i10];
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f15568a = c.f15571a;
            this.f15569b = c.f15573c;
        } else {
            f(i10);
        }
        this.f15570c = 0;
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f15570c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f15570c));
        }
        System.arraycopy(this.f15569b, 0, tArr, 0, this.f15570c);
        int length = tArr.length;
        int i10 = this.f15570c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
