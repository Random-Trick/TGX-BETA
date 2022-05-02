package p358z6;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public final class C11369j0<K, V> extends AbstractC11401r<K, V> {
    public static final AbstractC11401r<Object, Object> f36312Q = new C11369j0(null, new Object[0], 0);
    public final transient int[] f36313N;
    public final transient Object[] f36314O;
    public final transient int f36315P;

    public static class C11370a<K, V> extends AbstractC11404s<Map.Entry<K, V>> {
        public final transient Object[] f36316M;
        public final transient int f36317N;
        public final transient int f36318O;
        public final transient AbstractC11401r<K, V> f36319c;

        public class C11371a extends AbstractC11396q<Map.Entry<K, V>> {
            public C11371a() {
            }

            public Map.Entry<K, V> get(int i) {
                C10433i.m5131g(i, C11370a.this.f36318O);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C11370a.this.f36316M[C11370a.this.f36317N + i2], C11370a.this.f36316M[i2 + (C11370a.this.f36317N ^ 1)]);
            }

            @Override
            public int size() {
                return C11370a.this.f36318O;
            }

            @Override
            public boolean mo750t() {
                return true;
            }
        }

        public C11370a(AbstractC11401r<K, V> rVar, Object[] objArr, int i, int i2) {
            this.f36319c = rVar;
            this.f36316M = objArr;
            this.f36317N = i;
            this.f36318O = i2;
        }

        @Override
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f36319c.get(key));
        }

        @Override
        public int mo763i(Object[] objArr, int i) {
            return mo726h().mo763i(objArr, i);
        }

        @Override
        public int size() {
            return this.f36318O;
        }

        @Override
        public boolean mo750t() {
            return true;
        }

        @Override
        public AbstractC11403r0<Map.Entry<K, V>> iterator() {
            return mo726h().iterator();
        }

        @Override
        public AbstractC11396q<Map.Entry<K, V>> mo720z() {
            return new C11371a();
        }
    }

    public static final class C11372b<K> extends AbstractC11404s<K> {
        public final transient AbstractC11396q<K> f36321M;
        public final transient AbstractC11401r<K, ?> f36322c;

        public C11372b(AbstractC11401r<K, ?> rVar, AbstractC11396q<K> qVar) {
            this.f36322c = rVar;
            this.f36321M = qVar;
        }

        @Override
        public boolean contains(@NullableDecl Object obj) {
            return this.f36322c.get(obj) != null;
        }

        @Override
        public AbstractC11396q<K> mo726h() {
            return this.f36321M;
        }

        @Override
        public int mo763i(Object[] objArr, int i) {
            return mo726h().mo763i(objArr, i);
        }

        @Override
        public int size() {
            return this.f36322c.size();
        }

        @Override
        public boolean mo750t() {
            return true;
        }

        @Override
        public AbstractC11403r0<K> iterator() {
            return mo726h().iterator();
        }
    }

    public static final class C11373c extends AbstractC11396q<Object> {
        public final transient int f36323M;
        public final transient int f36324N;
        public final transient Object[] f36325c;

        public C11373c(Object[] objArr, int i, int i2) {
            this.f36325c = objArr;
            this.f36323M = i;
            this.f36324N = i2;
        }

        @Override
        public Object get(int i) {
            C10433i.m5131g(i, this.f36324N);
            return this.f36325c[(i * 2) + this.f36323M];
        }

        @Override
        public int size() {
            return this.f36324N;
        }

        @Override
        public boolean mo750t() {
            return true;
        }
    }

    public C11369j0(int[] iArr, Object[] objArr, int i) {
        this.f36313N = iArr;
        this.f36314O = objArr;
        this.f36315P = i;
    }

    public static <K, V> C11369j0<K, V> m812l(int i, Object[] objArr) {
        if (i == 0) {
            return (C11369j0) f36312Q;
        }
        if (i == 1) {
            C11363h.m820a(objArr[0], objArr[1]);
            return new C11369j0<>(null, objArr, 1);
        }
        C10433i.m5127k(i, objArr.length >> 1);
        return new C11369j0<>(m811m(objArr, i, AbstractC11404s.m724v(i), 0), objArr, i);
    }

    public static int[] m811m(java.lang.Object[] r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: p358z6.C11369j0.m811m(java.lang.Object[], int, int, int):int[]");
    }

    public static Object m810n(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a = C11382n.m787a(obj.hashCode());
            while (true) {
                int i3 = a & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a = i3 + 1;
            }
        }
    }

    @Override
    public AbstractC11404s<Map.Entry<K, V>> mo746d() {
        return new C11370a(this, this.f36314O, 0, this.f36315P);
    }

    @Override
    public AbstractC11404s<K> mo745e() {
        return new C11372b(this, new C11373c(this.f36314O, 0, this.f36315P));
    }

    @Override
    public AbstractC11384o<V> mo744f() {
        return new C11373c(this.f36314O, 1, this.f36315P);
    }

    @Override
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) m810n(this.f36313N, this.f36314O, this.f36315P, 0, obj);
    }

    @Override
    public boolean mo742h() {
        return false;
    }

    @Override
    public int size() {
        return this.f36315P;
    }
}
