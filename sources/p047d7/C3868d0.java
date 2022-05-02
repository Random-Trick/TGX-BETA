package p047d7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p135j7.AbstractC5895c;
import p178m7.AbstractC6794b;

public final class C3868d0 extends AbstractC3859a {
    public final Set<Class<?>> f13129a;
    public final Set<Class<?>> f13130b;
    public final Set<Class<?>> f13131c;
    public final Set<Class<?>> f13132d;
    public final Set<Class<?>> f13133e;
    public final Set<Class<?>> f13134f;
    public final AbstractC3870e f13135g;

    public static class C3869a implements AbstractC5895c {
        public final Set<Class<?>> f13136a;
        public final AbstractC5895c f13137b;

        public C3869a(Set<Class<?>> set, AbstractC5895c cVar) {
            this.f13136a = set;
            this.f13137b = cVar;
        }
    }

    public C3868d0(C3865d<?> dVar, AbstractC3870e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3890q qVar : dVar.m29707e()) {
            if (qVar.m29640d()) {
                if (qVar.m29638f()) {
                    hashSet4.add(qVar.m29642b());
                } else {
                    hashSet.add(qVar.m29642b());
                }
            } else if (qVar.m29641c()) {
                hashSet3.add(qVar.m29642b());
            } else if (qVar.m29638f()) {
                hashSet5.add(qVar.m29642b());
            } else {
                hashSet2.add(qVar.m29642b());
            }
        }
        if (!dVar.m29704h().isEmpty()) {
            hashSet.add(AbstractC5895c.class);
        }
        this.f13129a = Collections.unmodifiableSet(hashSet);
        this.f13130b = Collections.unmodifiableSet(hashSet2);
        this.f13131c = Collections.unmodifiableSet(hashSet3);
        this.f13132d = Collections.unmodifiableSet(hashSet4);
        this.f13133e = Collections.unmodifiableSet(hashSet5);
        this.f13134f = dVar.m29704h();
        this.f13135g = eVar;
    }

    @Override
    public <T> T mo29679a(Class<T> cls) {
        if (this.f13129a.contains(cls)) {
            T t = (T) this.f13135g.mo29679a(cls);
            return !cls.equals(AbstractC5895c.class) ? t : (T) new C3869a(this.f13134f, (AbstractC5895c) t);
        }
        throw new C3892s(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override
    public <T> AbstractC6794b<T> mo29678b(Class<T> cls) {
        if (this.f13130b.contains(cls)) {
            return this.f13135g.mo29678b(cls);
        }
        throw new C3892s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override
    public <T> AbstractC6794b<Set<T>> mo29677c(Class<T> cls) {
        if (this.f13133e.contains(cls)) {
            return this.f13135g.mo29677c(cls);
        }
        throw new C3892s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override
    public <T> Set<T> mo29676d(Class<T> cls) {
        if (this.f13132d.contains(cls)) {
            return this.f13135g.mo29676d(cls);
        }
        throw new C3892s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
