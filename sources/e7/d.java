package e7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d<T> {
    public final Set<Class<? super T>> f11290a;
    public final Set<q> f11291b;
    public final int f11292c;
    public final int f11293d;
    public final h<T> f11294e;
    public final Set<Class<?>> f11295f;

    public static class b<T> {
        public final Set<Class<? super T>> f11296a;
        public final Set<q> f11297b;
        public int f11298c;
        public int f11299d;
        public h<T> f11300e;
        public Set<Class<?>> f11301f;

        public b<T> b(q qVar) {
            c0.c(qVar, "Null dependency");
            h(qVar.b());
            this.f11297b.add(qVar);
            return this;
        }

        public b<T> c() {
            return g(1);
        }

        public d<T> d() {
            c0.d(this.f11300e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f11296a), new HashSet(this.f11297b), this.f11298c, this.f11299d, this.f11300e, this.f11301f);
        }

        public b<T> e(h<T> hVar) {
            this.f11300e = (h) c0.c(hVar, "Null factory");
            return this;
        }

        public final b<T> f() {
            this.f11299d = 1;
            return this;
        }

        public final b<T> g(int i10) {
            c0.d(this.f11298c == 0, "Instantiation type has already been set.");
            this.f11298c = i10;
            return this;
        }

        public final void h(Class<?> cls) {
            c0.a(!this.f11296a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f11296a = hashSet;
            this.f11297b = new HashSet();
            this.f11298c = 0;
            this.f11299d = 0;
            this.f11301f = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                c0.c(cls2, "Null interface");
            }
            Collections.addAll(this.f11296a, clsArr);
        }
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> i(final T t10, Class<T> cls) {
        return j(cls).e(new h() {
            @Override
            public final Object a(e eVar) {
                Object n10;
                n10 = d.n(t10, eVar);
                return n10;
            }
        }).d();
    }

    public static <T> b<T> j(Class<T> cls) {
        return c(cls).f();
    }

    public static Object n(Object obj, e eVar) {
        return obj;
    }

    public static Object o(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> p(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).e(new h() {
            @Override
            public final Object a(e eVar) {
                Object o10;
                o10 = d.o(t10, eVar);
                return o10;
            }
        }).d();
    }

    public Set<q> e() {
        return this.f11291b;
    }

    public h<T> f() {
        return this.f11294e;
    }

    public Set<Class<? super T>> g() {
        return this.f11290a;
    }

    public Set<Class<?>> h() {
        return this.f11295f;
    }

    public boolean k() {
        return this.f11292c == 1;
    }

    public boolean l() {
        return this.f11292c == 2;
    }

    public boolean m() {
        return this.f11293d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f11290a.toArray()) + ">{" + this.f11292c + ", type=" + this.f11293d + ", deps=" + Arrays.toString(this.f11291b.toArray()) + "}";
    }

    public d(Set<Class<? super T>> set, Set<q> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f11290a = Collections.unmodifiableSet(set);
        this.f11291b = Collections.unmodifiableSet(set2);
        this.f11292c = i10;
        this.f11293d = i11;
        this.f11294e = hVar;
        this.f11295f = Collections.unmodifiableSet(set3);
    }
}
