package p033c6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.thunderdog.challegram.Log;

public final class C1936u0<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object f6956S = new Object();
    @NullableDecl
    public transient Object[] f6957M;
    public transient int f6958N;
    public transient int f6959O;
    @NullableDecl
    public transient Set<K> f6960P;
    @NullableDecl
    public transient Set<Map.Entry<K, V>> f6961Q;
    @NullableDecl
    public transient Collection<V> f6962R;
    @NullableDecl
    public transient Object f6963a;
    @NullableDecl
    public transient int[] f6964b;
    @NullableDecl
    public transient Object[] f6965c;

    public C1936u0(int i) {
        m35872m(12);
    }

    @Override
    public final void clear() {
        if (!m35870o()) {
            m35873l();
            Map<K, V> j = m35875j();
            if (j != null) {
                this.f6958N = C1965w1.m35841a(size(), 3, 1073741823);
                j.clear();
                this.f6963a = null;
                this.f6959O = 0;
                return;
            }
            Arrays.fill(this.f6965c, 0, this.f6959O, (Object) null);
            Arrays.fill(this.f6957M, 0, this.f6959O, (Object) null);
            Object obj = this.f6963a;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f6964b, 0, this.f6959O, 0);
            this.f6959O = 0;
        }
    }

    @Override
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> j = m35875j();
        if (j != null) {
            return j.containsKey(obj);
        }
        return m35868q(obj) != -1;
    }

    @Override
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> j = m35875j();
        if (j != null) {
            return j.containsValue(obj);
        }
        for (int i = 0; i < this.f6959O; i++) {
            if (C1837n.m35975a(obj, this.f6957M[i])) {
                return true;
            }
        }
        return false;
    }

    public final int m35880e() {
        return isEmpty() ? -1 : 0;
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f6961Q;
        if (set != null) {
            return set;
        }
        C1852o0 o0Var = new C1852o0(this);
        this.f6961Q = o0Var;
        return o0Var;
    }

    public final int m35879f(int i) {
        int i2 = i + 1;
        if (i2 < this.f6959O) {
            return i2;
        }
        return -1;
    }

    @Override
    public final V get(@NullableDecl Object obj) {
        Map<K, V> j = m35875j();
        if (j != null) {
            return j.get(obj);
        }
        int q = m35868q(obj);
        if (q == -1) {
            return null;
        }
        return (V) this.f6957M[q];
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @NullableDecl
    public final Map<K, V> m35875j() {
        Object obj = this.f6963a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override
    public final Set<K> keySet() {
        Set<K> set = this.f6960P;
        if (set != null) {
            return set;
        }
        C1894r0 r0Var = new C1894r0(this);
        this.f6960P = r0Var;
        return r0Var;
    }

    public final void m35873l() {
        this.f6958N += 32;
    }

    public final void m35872m(int i) {
        this.f6958N = C1965w1.m35841a(12, 1, 1073741823);
    }

    public final void m35871n(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f6965c;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f6957M;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f6964b;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = C1964w0.m35842a(obj) & i2;
            int c = C1950v0.m35858c(this.f6963a, a);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int[] iArr2 = this.f6964b;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c = i6;
                    } else {
                        iArr2[i4] = ((i + 1) & i2) | ((~i2) & i5);
                        return;
                    }
                }
            } else {
                C1950v0.m35856e(this.f6963a, a, i + 1);
            }
        } else {
            this.f6965c[i] = null;
            this.f6957M[i] = null;
            this.f6964b[i] = 0;
        }
    }

    public final boolean m35870o() {
        return this.f6963a == null;
    }

    public final int m35869p() {
        return (1 << (this.f6958N & 31)) - 1;
    }

    @Override
    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        if (m35870o()) {
            C1893r.m35932d(m35870o(), "Arrays already allocated");
            int i = this.f6958N;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = Log.TAG_TDLIB_OPTIONS;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f6963a = C1950v0.m35857d(max2);
            m35865t(max2 - 1);
            this.f6964b = new int[i];
            this.f6965c = new Object[i];
            this.f6957M = new Object[i];
        }
        Map<K, V> j = m35875j();
        if (j != null) {
            return j.put(k, v);
        }
        int[] iArr = this.f6964b;
        Object[] objArr = this.f6965c;
        Object[] objArr2 = this.f6957M;
        int i2 = this.f6959O;
        int i3 = i2 + 1;
        int a = C1964w0.m35842a(k);
        int p = m35869p();
        int i4 = a & p;
        int c = C1950v0.m35858c(this.f6963a, i4);
        if (c != 0) {
            int i5 = ~p;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !C1837n.m35975a(k, objArr[i8])) {
                    int i11 = i9 & p;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m35869p() + 1, 1.0f);
                        int e = m35880e();
                        while (e >= 0) {
                            linkedHashMap.put(this.f6965c[e], this.f6957M[e]);
                            e = m35879f(e);
                        }
                        this.f6963a = linkedHashMap;
                        this.f6964b = null;
                        this.f6965c = null;
                        this.f6957M = null;
                        m35873l();
                        return (V) linkedHashMap.put(k, v);
                    } else if (i3 > p) {
                        p = m35867r(p, C1950v0.m35860a(p), a, i2);
                    } else {
                        iArr[i8] = (i3 & p) | i10;
                    }
                } else {
                    V v2 = (V) objArr2[i8];
                    objArr2[i8] = v;
                    return v2;
                }
            }
        } else if (i3 > p) {
            p = m35867r(p, C1950v0.m35860a(p), a, i2);
        } else {
            C1950v0.m35856e(this.f6963a, i4, i3);
        }
        int length = this.f6964b.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f6964b = Arrays.copyOf(this.f6964b, min);
            this.f6965c = Arrays.copyOf(this.f6965c, min);
            this.f6957M = Arrays.copyOf(this.f6957M, min);
        }
        this.f6964b[i2] = (~p) & a;
        this.f6965c[i2] = k;
        this.f6957M[i2] = v;
        this.f6959O = i3;
        m35873l();
        return null;
    }

    public final int m35868q(@NullableDecl Object obj) {
        if (m35870o()) {
            return -1;
        }
        int a = C1964w0.m35842a(obj);
        int p = m35869p();
        int c = C1950v0.m35858c(this.f6963a, a & p);
        if (c == 0) {
            return -1;
        }
        int i = ~p;
        int i2 = a & i;
        do {
            int i3 = c - 1;
            int i4 = this.f6964b[i3];
            if ((i4 & i) == i2 && C1837n.m35975a(obj, this.f6965c[i3])) {
                return i3;
            }
            c = i4 & p;
        } while (c != 0);
        return -1;
    }

    public final int m35867r(int i, int i2, int i3, int i4) {
        Object d = C1950v0.m35857d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C1950v0.m35856e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f6963a;
        int[] iArr = this.f6964b;
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C1950v0.m35858c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C1950v0.m35858c(d, i10);
                C1950v0.m35856e(d, i10, c);
                iArr[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f6963a = d;
        m35865t(i5);
        return i5;
    }

    @Override
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> j = m35875j();
        if (j != null) {
            return j.remove(obj);
        }
        V v = (V) m35866s(obj);
        if (v == f6956S) {
            return null;
        }
        return v;
    }

    @NullableDecl
    public final Object m35866s(@NullableDecl Object obj) {
        if (m35870o()) {
            return f6956S;
        }
        int p = m35869p();
        int b = C1950v0.m35859b(obj, null, p, this.f6963a, this.f6964b, this.f6965c, null);
        if (b == -1) {
            return f6956S;
        }
        Object obj2 = this.f6957M[b];
        m35871n(b, p);
        this.f6959O--;
        m35873l();
        return obj2;
    }

    @Override
    public final int size() {
        Map<K, V> j = m35875j();
        return j != null ? j.size() : this.f6959O;
    }

    public final void m35865t(int i) {
        this.f6958N = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f6958N & (-32));
    }

    @Override
    public final Collection<V> values() {
        Collection<V> collection = this.f6962R;
        if (collection != null) {
            return collection;
        }
        C1922t0 t0Var = new C1922t0(this);
        this.f6962R = t0Var;
        return t0Var;
    }
}
