package a7;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import z6.j;

public final class k0<K, V> extends r<K, V> {
    public static final r<Object, Object> Q = new k0(null, new Object[0], 0);
    @CheckForNull
    public final transient Object N;
    public final transient Object[] O;
    public final transient int P;

    public static class a<K, V> extends s<Map.Entry<K, V>> {
        public final transient Object[] M;
        public final transient int N;
        public final transient int O;
        public final transient r<K, V> f636c;

        public class C0017a extends q<Map.Entry<K, V>> {
            public C0017a() {
            }

            public Map.Entry<K, V> get(int i10) {
                j.g(i10, a.this.O);
                int i11 = i10 * 2;
                Object obj = a.this.M[a.this.N + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.M[i11 + (a.this.N ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override
            public int size() {
                return a.this.O;
            }

            @Override
            public boolean t() {
                return true;
            }
        }

        public a(r<K, V> rVar, Object[] objArr, int i10, int i11) {
            this.f636c = rVar;
            this.M = objArr;
            this.N = i10;
            this.O = i11;
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f636c.get(key));
        }

        @Override
        public int g(Object[] objArr, int i10) {
            return f().g(objArr, i10);
        }

        @Override
        public int size() {
            return this.O;
        }

        @Override
        public boolean t() {
            return true;
        }

        @Override
        public s0<Map.Entry<K, V>> iterator() {
            return f().iterator();
        }

        @Override
        public q<Map.Entry<K, V>> z() {
            return new C0017a();
        }
    }

    public static final class b<K> extends s<K> {
        public final transient q<K> M;
        public final transient r<K, ?> f638c;

        public b(r<K, ?> rVar, q<K> qVar) {
            this.f638c = rVar;
            this.M = qVar;
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            return this.f638c.get(obj) != null;
        }

        @Override
        public q<K> f() {
            return this.M;
        }

        @Override
        public int g(Object[] objArr, int i10) {
            return f().g(objArr, i10);
        }

        @Override
        public int size() {
            return this.f638c.size();
        }

        @Override
        public boolean t() {
            return true;
        }

        @Override
        public s0<K> iterator() {
            return f().iterator();
        }
    }

    public static final class c extends q<Object> {
        public final transient int M;
        public final transient int N;
        public final transient Object[] f639c;

        public c(Object[] objArr, int i10, int i11) {
            this.f639c = objArr;
            this.M = i10;
            this.N = i11;
        }

        @Override
        public Object get(int i10) {
            j.g(i10, this.N);
            Object obj = this.f639c[(i10 * 2) + this.M];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override
        public int size() {
            return this.N;
        }

        @Override
        public boolean t() {
            return true;
        }
    }

    public k0(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.N = obj;
        this.O = objArr;
        this.P = i10;
    }

    public static <K, V> k0<K, V> l(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (k0) Q;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return new k0<>(null, objArr, 1);
        }
        j.k(i10, objArr.length >> 1);
        return new k0<>(m(objArr, i10, s.v(i10), 0), objArr, i10);
    }

    @javax.annotation.CheckForNull
    public static java.lang.Object m(java.lang.Object[] r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: a7.k0.m(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static IllegalArgumentException n(Object obj, Object obj2, Object[] objArr, int i10) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i10]);
        String valueOf4 = String.valueOf(objArr[i10 ^ 1]);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append("=");
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }

    @CheckForNull
    public static Object o(@CheckForNull Object obj, Object[] objArr, int i10, int i11, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a10 = n.a(obj2.hashCode());
                while (true) {
                    int i12 = a10 & length;
                    int i13 = bArr[i12] & 255;
                    if (i13 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i13])) {
                        return objArr[i13 ^ 1];
                    }
                    a10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a11 = n.a(obj2.hashCode());
                while (true) {
                    int i14 = a11 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    a11 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a12 = n.a(obj2.hashCode());
                while (true) {
                    int i16 = a12 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    a12 = i16 + 1;
                }
            }
        }
    }

    @Override
    public s<Map.Entry<K, V>> d() {
        return new a(this, this.O, 0, this.P);
    }

    @Override
    public s<K> e() {
        return new b(this, new c(this.O, 0, this.P));
    }

    @Override
    public o<V> f() {
        return new c(this.O, 1, this.P);
    }

    @Override
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v10 = (V) o(this.N, this.O, this.P, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public int size() {
        return this.P;
    }
}
