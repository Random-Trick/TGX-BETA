package p143k0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class C6031b<E> implements Collection<E>, Set<E> {
    public static Object[] f19181M;
    public static int f19182N;
    public static Object[] f19183O;
    public static int f19184P;
    public static final Object f19185Q = new Object();
    public static final Object f19186R = new Object();
    public int[] f19187a;
    public Object[] f19188b;
    public int f19189c;

    public class C6032a extends AbstractC6034d<E> {
        public C6032a() {
            super(C6031b.this.f19189c);
        }

        @Override
        public E mo21513a(int i) {
            return (E) C6031b.this.m21520v(i);
        }

        @Override
        public void mo21512b(int i) {
            C6031b.this.m21521u(i);
        }
    }

    public C6031b() {
        this(0);
    }

    public static void m21524r(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f19186R) {
                if (f19184P < 10) {
                    objArr[0] = f19183O;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f19183O = objArr;
                    f19184P++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f19185Q) {
                if (f19182N < 10) {
                    objArr[0] = f19181M;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f19181M = objArr;
                    f19182N++;
                }
            }
        }
    }

    @Override
    public boolean add(E e) {
        int i;
        int i2;
        int i3 = this.f19189c;
        if (e == null) {
            i2 = m21522t();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m21523s(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        int[] iArr = this.f19187a;
        if (i3 >= iArr.length) {
            int i5 = 4;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f19188b;
            m21527h(i5);
            if (i3 == this.f19189c) {
                int[] iArr2 = this.f19187a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f19188b, 0, objArr.length);
                }
                m21524r(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f19187a;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.f19188b;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.f19189c;
        if (i3 == i8) {
            int[] iArr4 = this.f19187a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.f19188b[i4] = e;
                this.f19189c = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        m21525m(this.f19189c + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override
    public void clear() {
        int i = this.f19189c;
        if (i != 0) {
            int[] iArr = this.f19187a;
            Object[] objArr = this.f19188b;
            this.f19187a = C6033c.f19191a;
            this.f19188b = C6033c.f19193c;
            this.f19189c = 0;
            m21524r(iArr, objArr, i);
        }
        if (this.f19189c != 0) {
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
            for (int i = 0; i < this.f19189c; i++) {
                try {
                    if (!set.contains(m21520v(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void m21527h(int i) {
        if (i == 8) {
            synchronized (f19186R) {
                Object[] objArr = f19183O;
                if (objArr != null) {
                    try {
                        this.f19188b = objArr;
                        f19183O = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f19187a = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f19184P--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f19183O = null;
                    f19184P = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f19185Q) {
                Object[] objArr2 = f19181M;
                if (objArr2 != null) {
                    try {
                        this.f19188b = objArr2;
                        f19181M = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f19187a = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f19182N--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f19181M = null;
                    f19182N = 0;
                }
            }
        }
        this.f19187a = new int[i];
        this.f19188b = new Object[i];
    }

    @Override
    public int hashCode() {
        int[] iArr = this.f19187a;
        int i = this.f19189c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int m21526i(int i) {
        try {
            return C6033c.m21519a(this.f19187a, this.f19189c, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int indexOf(Object obj) {
        return obj == null ? m21522t() : m21523s(obj, obj.hashCode());
    }

    @Override
    public boolean isEmpty() {
        return this.f19189c <= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new C6032a();
    }

    public void m21525m(int i) {
        int i2 = this.f19189c;
        int[] iArr = this.f19187a;
        if (iArr.length < i) {
            Object[] objArr = this.f19188b;
            m21527h(i);
            int i3 = this.f19189c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f19187a, 0, i3);
                System.arraycopy(objArr, 0, this.f19188b, 0, this.f19189c);
            }
            m21524r(iArr, objArr, this.f19189c);
        }
        if (this.f19189c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m21521u(indexOf);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f19189c - 1; i >= 0; i--) {
            if (!collection.contains(this.f19188b[i])) {
                m21521u(i);
                z = true;
            }
        }
        return z;
    }

    public final int m21523s(Object obj, int i) {
        int i2 = this.f19189c;
        if (i2 == 0) {
            return -1;
        }
        int i3 = m21526i(i);
        if (i3 < 0 || obj.equals(this.f19188b[i3])) {
            return i3;
        }
        int i4 = i3 + 1;
        while (i4 < i2 && this.f19187a[i4] == i) {
            if (obj.equals(this.f19188b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = i3 - 1; i5 >= 0 && this.f19187a[i5] == i; i5--) {
            if (obj.equals(this.f19188b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override
    public int size() {
        return this.f19189c;
    }

    public final int m21522t() {
        int i = this.f19189c;
        if (i == 0) {
            return -1;
        }
        int i2 = m21526i(0);
        if (i2 < 0 || this.f19188b[i2] == null) {
            return i2;
        }
        int i3 = i2 + 1;
        while (i3 < i && this.f19187a[i3] == 0) {
            if (this.f19188b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = i2 - 1; i4 >= 0 && this.f19187a[i4] == 0; i4--) {
            if (this.f19188b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override
    public Object[] toArray() {
        int i = this.f19189c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f19188b, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f19189c * 14);
        sb2.append('{');
        for (int i = 0; i < this.f19189c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            E v = m21520v(i);
            if (v != this) {
                sb2.append(v);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public E m21521u(int i) {
        int i2 = this.f19189c;
        Object[] objArr = this.f19188b;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f19187a;
            int i4 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i5 = i + 1;
                    int i6 = i3 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.f19188b;
                    System.arraycopy(objArr2, i5, objArr2, i, i6);
                }
                this.f19188b[i3] = null;
            } else {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                m21527h(i4);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f19187a, 0, i);
                    System.arraycopy(objArr, 0, this.f19188b, 0, i);
                }
                if (i < i3) {
                    int i7 = i + 1;
                    int i8 = i3 - i;
                    System.arraycopy(iArr, i7, this.f19187a, i, i8);
                    System.arraycopy(objArr, i7, this.f19188b, i, i8);
                }
            }
            if (i2 == this.f19189c) {
                this.f19189c = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    public E m21520v(int i) {
        return (E) this.f19188b[i];
    }

    public C6031b(int i) {
        if (i == 0) {
            this.f19187a = C6033c.f19191a;
            this.f19188b = C6033c.f19193c;
        } else {
            m21527h(i);
        }
        this.f19189c = 0;
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f19189c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f19189c));
        }
        System.arraycopy(this.f19188b, 0, tArr, 0, this.f19189c);
        int length = tArr.length;
        int i = this.f19189c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
