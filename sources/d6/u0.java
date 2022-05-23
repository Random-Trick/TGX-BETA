package d6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.thunderdog.challegram.Log;

public final class u0<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object S = new Object();
    @NullableDecl
    public transient Object[] M;
    public transient int N;
    public transient int O;
    @NullableDecl
    public transient Set<K> P;
    @NullableDecl
    public transient Set<Map.Entry<K, V>> Q;
    @NullableDecl
    public transient Collection<V> R;
    @NullableDecl
    public transient Object f7016a;
    @NullableDecl
    public transient int[] f7017b;
    @NullableDecl
    public transient Object[] f7018c;

    public u0(int i10) {
        m(12);
    }

    @Override
    public final void clear() {
        if (!o()) {
            l();
            Map<K, V> j10 = j();
            if (j10 != null) {
                this.N = w1.a(size(), 3, 1073741823);
                j10.clear();
                this.f7016a = null;
                this.O = 0;
                return;
            }
            Arrays.fill(this.f7018c, 0, this.O, (Object) null);
            Arrays.fill(this.M, 0, this.O, (Object) null);
            Object obj = this.f7016a;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f7017b, 0, this.O, 0);
            this.O = 0;
        }
    }

    @Override
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> j10 = j();
        if (j10 != null) {
            return j10.containsKey(obj);
        }
        return q(obj) != -1;
    }

    @Override
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> j10 = j();
        if (j10 != null) {
            return j10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.O; i10++) {
            if (n.a(obj, this.M[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int e() {
        return isEmpty() ? -1 : 0;
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.Q;
        if (set != null) {
            return set;
        }
        o0 o0Var = new o0(this);
        this.Q = o0Var;
        return o0Var;
    }

    public final int f(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.O) {
            return i11;
        }
        return -1;
    }

    @Override
    public final V get(@NullableDecl Object obj) {
        Map<K, V> j10 = j();
        if (j10 != null) {
            return j10.get(obj);
        }
        int q10 = q(obj);
        if (q10 == -1) {
            return null;
        }
        return (V) this.M[q10];
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @NullableDecl
    public final Map<K, V> j() {
        Object obj = this.f7016a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override
    public final Set<K> keySet() {
        Set<K> set = this.P;
        if (set != null) {
            return set;
        }
        r0 r0Var = new r0(this);
        this.P = r0Var;
        return r0Var;
    }

    public final void l() {
        this.N += 32;
    }

    public final void m(int i10) {
        this.N = w1.a(12, 1, 1073741823);
    }

    public final void n(int i10, int i11) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f7018c;
            Object obj = objArr[size];
            objArr[i10] = obj;
            Object[] objArr2 = this.M;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f7017b;
            iArr[i10] = iArr[size];
            iArr[size] = 0;
            int a10 = w0.a(obj) & i11;
            int c10 = v0.c(this.f7016a, a10);
            int i12 = size + 1;
            if (c10 != i12) {
                while (true) {
                    int i13 = c10 - 1;
                    int[] iArr2 = this.f7017b;
                    int i14 = iArr2[i13];
                    int i15 = i14 & i11;
                    if (i15 != i12) {
                        c10 = i15;
                    } else {
                        iArr2[i13] = ((i10 + 1) & i11) | ((~i11) & i14);
                        return;
                    }
                }
            } else {
                v0.e(this.f7016a, a10, i10 + 1);
            }
        } else {
            this.f7018c[i10] = null;
            this.M[i10] = null;
            this.f7017b[i10] = 0;
        }
    }

    public final boolean o() {
        return this.f7016a == null;
    }

    public final int p() {
        return (1 << (this.N & 31)) - 1;
    }

    @Override
    @NullableDecl
    public final V put(@NullableDecl K k10, @NullableDecl V v10) {
        int min;
        if (o()) {
            r.d(o(), "Arrays already allocated");
            int i10 = this.N;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = Log.TAG_TDLIB_OPTIONS;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f7016a = v0.d(max2);
            t(max2 - 1);
            this.f7017b = new int[i10];
            this.f7018c = new Object[i10];
            this.M = new Object[i10];
        }
        Map<K, V> j10 = j();
        if (j10 != null) {
            return j10.put(k10, v10);
        }
        int[] iArr = this.f7017b;
        Object[] objArr = this.f7018c;
        Object[] objArr2 = this.M;
        int i11 = this.O;
        int i12 = i11 + 1;
        int a10 = w0.a(k10);
        int p10 = p();
        int i13 = a10 & p10;
        int c10 = v0.c(this.f7016a, i13);
        if (c10 != 0) {
            int i14 = ~p10;
            int i15 = a10 & i14;
            int i16 = 0;
            while (true) {
                int i17 = c10 - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 != i15 || !n.a(k10, objArr[i17])) {
                    int i20 = i18 & p10;
                    i16++;
                    if (i20 != 0) {
                        c10 = i20;
                    } else if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(p() + 1, 1.0f);
                        int e10 = e();
                        while (e10 >= 0) {
                            linkedHashMap.put(this.f7018c[e10], this.M[e10]);
                            e10 = f(e10);
                        }
                        this.f7016a = linkedHashMap;
                        this.f7017b = null;
                        this.f7018c = null;
                        this.M = null;
                        l();
                        return (V) linkedHashMap.put(k10, v10);
                    } else if (i12 > p10) {
                        p10 = r(p10, v0.a(p10), a10, i11);
                    } else {
                        iArr[i17] = (i12 & p10) | i19;
                    }
                } else {
                    V v11 = (V) objArr2[i17];
                    objArr2[i17] = v10;
                    return v11;
                }
            }
        } else if (i12 > p10) {
            p10 = r(p10, v0.a(p10), a10, i11);
        } else {
            v0.e(this.f7016a, i13, i12);
        }
        int length = this.f7017b.length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f7017b = Arrays.copyOf(this.f7017b, min);
            this.f7018c = Arrays.copyOf(this.f7018c, min);
            this.M = Arrays.copyOf(this.M, min);
        }
        this.f7017b[i11] = (~p10) & a10;
        this.f7018c[i11] = k10;
        this.M[i11] = v10;
        this.O = i12;
        l();
        return null;
    }

    public final int q(@NullableDecl Object obj) {
        if (o()) {
            return -1;
        }
        int a10 = w0.a(obj);
        int p10 = p();
        int c10 = v0.c(this.f7016a, a10 & p10);
        if (c10 == 0) {
            return -1;
        }
        int i10 = ~p10;
        int i11 = a10 & i10;
        do {
            int i12 = c10 - 1;
            int i13 = this.f7017b[i12];
            if ((i13 & i10) == i11 && n.a(obj, this.f7018c[i12])) {
                return i12;
            }
            c10 = i13 & p10;
        } while (c10 != 0);
        return -1;
    }

    public final int r(int i10, int i11, int i12, int i13) {
        Object d10 = v0.d(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            v0.e(d10, i12 & i14, i13 + 1);
        }
        Object obj = this.f7016a;
        int[] iArr = this.f7017b;
        for (int i15 = 0; i15 <= i10; i15++) {
            int c10 = v0.c(obj, i15);
            while (c10 != 0) {
                int i16 = c10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int c11 = v0.c(d10, i19);
                v0.e(d10, i19, c10);
                iArr[i16] = ((~i14) & i18) | (c11 & i14);
                c10 = i17 & i10;
            }
        }
        this.f7016a = d10;
        t(i14);
        return i14;
    }

    @Override
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> j10 = j();
        if (j10 != null) {
            return j10.remove(obj);
        }
        V v10 = (V) s(obj);
        if (v10 == S) {
            return null;
        }
        return v10;
    }

    @NullableDecl
    public final Object s(@NullableDecl Object obj) {
        if (o()) {
            return S;
        }
        int p10 = p();
        int b10 = v0.b(obj, null, p10, this.f7016a, this.f7017b, this.f7018c, null);
        if (b10 == -1) {
            return S;
        }
        Object obj2 = this.M[b10];
        n(b10, p10);
        this.O--;
        l();
        return obj2;
    }

    @Override
    public final int size() {
        Map<K, V> j10 = j();
        return j10 != null ? j10.size() : this.O;
    }

    public final void t(int i10) {
        this.N = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.N & (-32));
    }

    @Override
    public final Collection<V> values() {
        Collection<V> collection = this.R;
        if (collection != null) {
            return collection;
        }
        t0 t0Var = new t0(this);
        this.R = t0Var;
        return t0Var;
    }
}
