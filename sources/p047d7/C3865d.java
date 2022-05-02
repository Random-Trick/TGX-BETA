package p047d7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C3865d<T> {
    public final Set<Class<? super T>> f13117a;
    public final Set<C3890q> f13118b;
    public final int f13119c;
    public final int f13120d;
    public final AbstractC3876h<T> f13121e;
    public final Set<Class<?>> f13122f;

    public static class C3867b<T> {
        public final Set<Class<? super T>> f13123a;
        public final Set<C3890q> f13124b;
        public int f13125c;
        public int f13126d;
        public AbstractC3876h<T> f13127e;
        public Set<Class<?>> f13128f;

        public C3867b<T> m29692b(C3890q qVar) {
            C3864c0.m29711c(qVar, "Null dependency");
            m29686h(qVar.m29640b());
            this.f13124b.add(qVar);
            return this;
        }

        public C3867b<T> m29691c() {
            return m29687g(1);
        }

        public C3865d<T> m29690d() {
            C3864c0.m29710d(this.f13127e != null, "Missing required property: factory.");
            return new C3865d<>(new HashSet(this.f13123a), new HashSet(this.f13124b), this.f13125c, this.f13126d, this.f13127e, this.f13128f);
        }

        public C3867b<T> m29689e(AbstractC3876h<T> hVar) {
            this.f13127e = (AbstractC3876h) C3864c0.m29711c(hVar, "Null factory");
            return this;
        }

        public final C3867b<T> m29688f() {
            this.f13126d = 1;
            return this;
        }

        public final C3867b<T> m29687g(int i) {
            C3864c0.m29710d(this.f13125c == 0, "Instantiation type has already been set.");
            this.f13125c = i;
            return this;
        }

        public final void m29686h(Class<?> cls) {
            C3864c0.m29713a(!this.f13123a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public C3867b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f13123a = hashSet;
            this.f13124b = new HashSet();
            this.f13125c = 0;
            this.f13126d = 0;
            this.f13128f = new HashSet();
            C3864c0.m29711c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C3864c0.m29711c(cls2, "Null interface");
            }
            Collections.addAll(this.f13123a, clsArr);
        }
    }

    public static <T> C3867b<T> m29707c(Class<T> cls) {
        return new C3867b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> C3867b<T> m29706d(Class<T> cls, Class<? super T>... clsArr) {
        return new C3867b<>(cls, clsArr);
    }

    public static <T> C3865d<T> m29701i(final T t, Class<T> cls) {
        return m29700j(cls).m29689e(new AbstractC3876h() {
            @Override
            public final Object mo5891a(AbstractC3870e eVar) {
                Object n;
                n = C3865d.m29696n(t, eVar);
                return n;
            }
        }).m29690d();
    }

    public static <T> C3867b<T> m29700j(Class<T> cls) {
        return m29707c(cls).m29688f();
    }

    public static Object m29696n(Object obj, AbstractC3870e eVar) {
        return obj;
    }

    public static Object m29695o(Object obj, AbstractC3870e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> C3865d<T> m29694p(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m29706d(cls, clsArr).m29689e(new AbstractC3876h() {
            @Override
            public final Object mo5891a(AbstractC3870e eVar) {
                Object o;
                o = C3865d.m29695o(t, eVar);
                return o;
            }
        }).m29690d();
    }

    public Set<C3890q> m29705e() {
        return this.f13118b;
    }

    public AbstractC3876h<T> m29704f() {
        return this.f13121e;
    }

    public Set<Class<? super T>> m29703g() {
        return this.f13117a;
    }

    public Set<Class<?>> m29702h() {
        return this.f13122f;
    }

    public boolean m29699k() {
        return this.f13119c == 1;
    }

    public boolean m29698l() {
        return this.f13119c == 2;
    }

    public boolean m29697m() {
        return this.f13120d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f13117a.toArray()) + ">{" + this.f13119c + ", type=" + this.f13120d + ", deps=" + Arrays.toString(this.f13118b.toArray()) + "}";
    }

    public C3865d(Set<Class<? super T>> set, Set<C3890q> set2, int i, int i2, AbstractC3876h<T> hVar, Set<Class<?>> set3) {
        this.f13117a = Collections.unmodifiableSet(set);
        this.f13118b = Collections.unmodifiableSet(set2);
        this.f13119c = i;
        this.f13120d = i2;
        this.f13121e = hVar;
        this.f13122f = Collections.unmodifiableSet(set3);
    }
}