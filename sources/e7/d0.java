package e7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k7.c;
import n7.b;

public final class d0 extends e7.a {
    public final Set<Class<?>> f11302a;
    public final Set<Class<?>> f11303b;
    public final Set<Class<?>> f11304c;
    public final Set<Class<?>> f11305d;
    public final Set<Class<?>> f11306e;
    public final Set<Class<?>> f11307f;
    public final e f11308g;

    public static class a implements c {
        public final Set<Class<?>> f11309a;
        public final c f11310b;

        public a(Set<Class<?>> set, c cVar) {
            this.f11309a = set;
            this.f11310b = cVar;
        }
    }

    public d0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.e()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!dVar.h().isEmpty()) {
            hashSet.add(c.class);
        }
        this.f11302a = Collections.unmodifiableSet(hashSet);
        this.f11303b = Collections.unmodifiableSet(hashSet2);
        this.f11304c = Collections.unmodifiableSet(hashSet3);
        this.f11305d = Collections.unmodifiableSet(hashSet4);
        this.f11306e = Collections.unmodifiableSet(hashSet5);
        this.f11307f = dVar.h();
        this.f11308g = eVar;
    }

    @Override
    public <T> T a(Class<T> cls) {
        if (this.f11302a.contains(cls)) {
            T t10 = (T) this.f11308g.a(cls);
            return !cls.equals(c.class) ? t10 : (T) new a(this.f11307f, (c) t10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override
    public <T> b<T> b(Class<T> cls) {
        if (this.f11303b.contains(cls)) {
            return this.f11308g.b(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override
    public <T> b<Set<T>> c(Class<T> cls) {
        if (this.f11306e.contains(cls)) {
            return this.f11308g.c(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override
    public <T> Set<T> d(Class<T> cls) {
        if (this.f11305d.contains(cls)) {
            return this.f11308g.d(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
