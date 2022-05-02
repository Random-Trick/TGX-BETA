package p143k0;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class C6037g<K, V> {
    public static Object[] f19210M;
    public static int f19211N;
    public static Object[] f19212O;
    public static int f19213P;
    public int[] f19214a;
    public Object[] f19215b;
    public int f19216c;

    public C6037g() {
        this.f19214a = C6033c.f19191a;
        this.f19215b = C6033c.f19193c;
        this.f19216c = 0;
    }

    private void m21488a(int i) {
        if (i == 8) {
            synchronized (C6037g.class) {
                Object[] objArr = f19212O;
                if (objArr != null) {
                    this.f19215b = objArr;
                    f19212O = (Object[]) objArr[0];
                    this.f19214a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f19213P--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6037g.class) {
                Object[] objArr2 = f19210M;
                if (objArr2 != null) {
                    this.f19215b = objArr2;
                    f19210M = (Object[]) objArr2[0];
                    this.f19214a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f19211N--;
                    return;
                }
            }
        }
        this.f19214a = new int[i];
        this.f19215b = new Object[i << 1];
    }

    public static int m21487b(int[] iArr, int i, int i2) {
        try {
            return C6033c.m21519a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void m21485d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6037g.class) {
                if (f19213P < 10) {
                    objArr[0] = f19212O;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f19212O = objArr;
                    f19213P++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6037g.class) {
                if (f19211N < 10) {
                    objArr[0] = f19210M;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f19210M = objArr;
                    f19211N++;
                }
            }
        }
    }

    public void m21486c(int i) {
        int i2 = this.f19216c;
        int[] iArr = this.f19214a;
        if (iArr.length < i) {
            Object[] objArr = this.f19215b;
            m21488a(i);
            if (this.f19216c > 0) {
                System.arraycopy(iArr, 0, this.f19214a, 0, i2);
                System.arraycopy(objArr, 0, this.f19215b, 0, i2 << 1);
            }
            m21485d(iArr, objArr, i2);
        }
        if (this.f19216c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f19216c;
        if (i > 0) {
            int[] iArr = this.f19214a;
            Object[] objArr = this.f19215b;
            this.f19214a = C6033c.f19191a;
            this.f19215b = C6033c.f19193c;
            this.f19216c = 0;
            m21485d(iArr, objArr, i);
        }
        if (this.f19216c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m21483f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m21481h(obj) >= 0;
    }

    public int m21484e(Object obj, int i) {
        int i2 = this.f19216c;
        if (i2 == 0) {
            return -1;
        }
        int b = m21487b(this.f19214a, i2, i);
        if (b < 0 || obj.equals(this.f19215b[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f19214a[i3] == i) {
            if (obj.equals(this.f19215b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b - 1; i4 >= 0 && this.f19214a[i4] == i; i4--) {
            if (obj.equals(this.f19215b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6037g) {
            C6037g gVar = (C6037g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f19216c; i++) {
                K i2 = m21480i(i);
                V l = m21477l(i);
                Object obj2 = gVar.get(i2);
                if (l == null) {
                    if (obj2 != null || !gVar.containsKey(i2)) {
                        return false;
                    }
                } else if (!l.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f19216c; i3++) {
                K i4 = m21480i(i3);
                V l2 = m21477l(i3);
                Object obj3 = map.get(i4);
                if (l2 == null) {
                    if (obj3 != null || !map.containsKey(i4)) {
                        return false;
                    }
                } else if (!l2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int m21483f(Object obj) {
        return obj == null ? m21482g() : m21484e(obj, obj.hashCode());
    }

    public int m21482g() {
        int i = this.f19216c;
        if (i == 0) {
            return -1;
        }
        int b = m21487b(this.f19214a, i, 0);
        if (b < 0 || this.f19215b[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f19214a[i2] == 0) {
            if (this.f19215b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b - 1; i3 >= 0 && this.f19214a[i3] == 0; i3--) {
            if (this.f19215b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = m21483f(obj);
        return f >= 0 ? (V) this.f19215b[(f << 1) + 1] : v;
    }

    public int m21481h(Object obj) {
        int i = this.f19216c * 2;
        Object[] objArr = this.f19215b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f19214a;
        Object[] objArr = this.f19215b;
        int i = this.f19216c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K m21480i(int i) {
        return (K) this.f19215b[i << 1];
    }

    public boolean isEmpty() {
        return this.f19216c <= 0;
    }

    public V m21479j(int i) {
        Object[] objArr = this.f19215b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f19216c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f19214a;
            int i5 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f19215b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f19215b;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                m21488a(i5);
                if (i3 == this.f19216c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f19214a, 0, i);
                        System.arraycopy(objArr, 0, this.f19215b, 0, i2);
                    }
                    if (i < i4) {
                        int i9 = i + 1;
                        int i10 = i4 - i;
                        System.arraycopy(iArr, i9, this.f19214a, i, i10);
                        System.arraycopy(objArr, i9 << 1, this.f19215b, i2, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i3 == this.f19216c) {
                this.f19216c = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    public V m21478k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f19215b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V m21477l(int i) {
        return (V) this.f19215b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f19216c;
        if (k == null) {
            i2 = m21482g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = m21484e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f19215b;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f19214a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f19215b;
            m21488a(i6);
            if (i3 == this.f19216c) {
                int[] iArr2 = this.f19214a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f19215b, 0, objArr2.length);
                }
                m21485d(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f19214a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f19215b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f19216c - i5) << 1);
        }
        int i8 = this.f19216c;
        if (i3 == i8) {
            int[] iArr4 = this.f19214a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f19215b;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f19216c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = m21483f(obj);
        if (f >= 0) {
            return m21479j(f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f = m21483f(k);
        if (f >= 0) {
            return m21478k(f, v);
        }
        return null;
    }

    public int size() {
        return this.f19216c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f19216c * 28);
        sb2.append('{');
        for (int i = 0; i < this.f19216c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            K i2 = m21480i(i);
            if (i2 != this) {
                sb2.append(i2);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V l = m21477l(i);
            if (l != this) {
                sb2.append(l);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = m21483f(obj);
        if (f < 0) {
            return false;
        }
        V l = m21477l(f);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        m21479j(f);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f = m21483f(k);
        if (f < 0) {
            return false;
        }
        V l = m21477l(f);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        m21478k(f, v2);
        return true;
    }

    public C6037g(int i) {
        if (i == 0) {
            this.f19214a = C6033c.f19191a;
            this.f19215b = C6033c.f19193c;
        } else {
            m21488a(i);
        }
        this.f19216c = 0;
    }
}
