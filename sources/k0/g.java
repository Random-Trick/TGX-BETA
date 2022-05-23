package k0;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {
    public static Object[] M;
    public static int N;
    public static Object[] O;
    public static int P;
    public int[] f15588a;
    public Object[] f15589b;
    public int f15590c;

    public g() {
        this.f15588a = c.f15571a;
        this.f15589b = c.f15573c;
        this.f15590c = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = O;
                if (objArr != null) {
                    this.f15589b = objArr;
                    O = (Object[]) objArr[0];
                    this.f15588a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    P--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = M;
                if (objArr2 != null) {
                    this.f15589b = objArr2;
                    M = (Object[]) objArr2[0];
                    this.f15588a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    N--;
                    return;
                }
            }
        }
        this.f15588a = new int[i10];
        this.f15589b = new Object[i10 << 1];
    }

    public static int b(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (P < 10) {
                    objArr[0] = O;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    O = objArr;
                    P++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (N < 10) {
                    objArr[0] = M;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    M = objArr;
                    N++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f15590c;
        int[] iArr = this.f15588a;
        if (iArr.length < i10) {
            Object[] objArr = this.f15589b;
            a(i10);
            if (this.f15590c > 0) {
                System.arraycopy(iArr, 0, this.f15588a, 0, i11);
                System.arraycopy(objArr, 0, this.f15589b, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f15590c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f15590c;
        if (i10 > 0) {
            int[] iArr = this.f15588a;
            Object[] objArr = this.f15589b;
            this.f15588a = c.f15571a;
            this.f15589b = c.f15573c;
            this.f15590c = 0;
            d(iArr, objArr, i10);
        }
        if (this.f15590c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i10) {
        int i11 = this.f15590c;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f15588a, i11, i10);
        if (b10 < 0 || obj.equals(this.f15589b[b10 << 1])) {
            return b10;
        }
        int i12 = b10 + 1;
        while (i12 < i11 && this.f15588a[i12] == i10) {
            if (obj.equals(this.f15589b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = b10 - 1; i13 >= 0 && this.f15588a[i13] == i10; i13--) {
            if (obj.equals(this.f15589b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f15590c; i10++) {
                K i11 = i(i10);
                V l10 = l(i10);
                Object obj2 = gVar.get(i11);
                if (l10 == null) {
                    if (obj2 != null || !gVar.containsKey(i11)) {
                        return false;
                    }
                } else if (!l10.equals(obj2)) {
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
            for (int i12 = 0; i12 < this.f15590c; i12++) {
                K i13 = i(i12);
                V l11 = l(i12);
                Object obj3 = map.get(i13);
                if (l11 == null) {
                    if (obj3 != null || !map.containsKey(i13)) {
                        return false;
                    }
                } else if (!l11.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i10 = this.f15590c;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f15588a, i10, 0);
        if (b10 < 0 || this.f15589b[b10 << 1] == null) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < i10 && this.f15588a[i11] == 0) {
            if (this.f15589b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = b10 - 1; i12 >= 0 && this.f15588a[i12] == 0; i12--) {
            if (this.f15589b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? (V) this.f15589b[(f10 << 1) + 1] : v10;
    }

    public int h(Object obj) {
        int i10 = this.f15590c * 2;
        Object[] objArr = this.f15589b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f15588a;
        Object[] objArr = this.f15589b;
        int i10 = this.f15590c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public K i(int i10) {
        return (K) this.f15589b[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f15590c <= 0;
    }

    public V j(int i10) {
        Object[] objArr = this.f15589b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f15590c;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f15588a;
            int i14 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i15 = i10 + 1;
                    int i16 = i13 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f15589b;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f15589b;
                int i17 = i13 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                if (i12 > 8) {
                    i14 = i12 + (i12 >> 1);
                }
                a(i14);
                if (i12 == this.f15590c) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f15588a, 0, i10);
                        System.arraycopy(objArr, 0, this.f15589b, 0, i11);
                    }
                    if (i10 < i13) {
                        int i18 = i10 + 1;
                        int i19 = i13 - i10;
                        System.arraycopy(iArr, i18, this.f15588a, i10, i19);
                        System.arraycopy(objArr, i18 << 1, this.f15589b, i11, i19 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i12 == this.f15590c) {
                this.f15590c = i13;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v10;
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f15589b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V l(int i10) {
        return (V) this.f15589b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.f15590c;
        if (k10 == null) {
            i11 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = e(k10, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            Object[] objArr = this.f15589b;
            V v11 = (V) objArr[i13];
            objArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.f15588a;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr2 = this.f15589b;
            a(i15);
            if (i12 == this.f15590c) {
                int[] iArr2 = this.f15588a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f15589b, 0, objArr2.length);
                }
                d(iArr, objArr2, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f15588a;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr3 = this.f15589b;
            System.arraycopy(objArr3, i14 << 1, objArr3, i16 << 1, (this.f15590c - i14) << 1);
        }
        int i17 = this.f15590c;
        if (i12 == i17) {
            int[] iArr4 = this.f15588a;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr4 = this.f15589b;
                int i18 = i14 << 1;
                objArr4[i18] = k10;
                objArr4[i18 + 1] = v10;
                this.f15590c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return j(f10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return k(f10, v10);
        }
        return null;
    }

    public int size() {
        return this.f15590c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15590c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15590c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        V l10 = l(f10);
        if (obj2 != l10 && (obj2 == null || !obj2.equals(l10))) {
            return false;
        }
        j(f10);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 < 0) {
            return false;
        }
        V l10 = l(f10);
        if (l10 != v10 && (v10 == null || !v10.equals(l10))) {
            return false;
        }
        k(f10, v11);
        return true;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f15588a = c.f15571a;
            this.f15589b = c.f15573c;
        } else {
            a(i10);
        }
        this.f15590c = 0;
    }
}
