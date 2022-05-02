package p047d7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p047d7.C3882n;
import p076f7.AbstractC4320a;
import p135j7.AbstractC5895c;
import p135j7.AbstractC5896d;
import p178m7.AbstractC6794b;

public class C3882n extends AbstractC3859a implements AbstractC4320a {
    public static final AbstractC6794b<Set<Object>> f13149g = C3881m.f13148a;
    public final Map<C3865d<?>, AbstractC6794b<?>> f13150a;
    public final Map<Class<?>, AbstractC6794b<?>> f13151b;
    public final Map<Class<?>, C3897x<?>> f13152c;
    public final List<AbstractC6794b<AbstractC3877i>> f13153d;
    public final C3894u f13154e;
    public final AtomicReference<Boolean> f13155f;

    public static final class C3884b {
        public final Executor f13156a;
        public final List<AbstractC6794b<AbstractC3877i>> f13157b = new ArrayList();
        public final List<C3865d<?>> f13158c = new ArrayList();

        public C3884b(Executor executor) {
            this.f13156a = executor;
        }

        public static AbstractC3877i m29655f(AbstractC3877i iVar) {
            return iVar;
        }

        public C3884b m29659b(C3865d<?> dVar) {
            this.f13158c.add(dVar);
            return this;
        }

        public C3884b m29658c(final AbstractC3877i iVar) {
            this.f13157b.add(new AbstractC6794b() {
                @Override
                public final Object get() {
                    AbstractC3877i f;
                    f = C3882n.C3884b.m29655f(AbstractC3877i.this);
                    return f;
                }
            });
            return this;
        }

        public C3884b m29657d(Collection<AbstractC6794b<AbstractC3877i>> collection) {
            this.f13157b.addAll(collection);
            return this;
        }

        public C3882n m29656e() {
            return new C3882n(this.f13156a, this.f13157b, this.f13158c);
        }
    }

    public static C3884b m29672h(Executor executor) {
        return new C3884b(executor);
    }

    public static <T> List<T> m29668l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public Object m29667m(C3865d dVar) {
        return dVar.m29706f().mo5891a(new C3868d0(dVar, this));
    }

    @Override
    public Object mo29679a(Class cls) {
        return super.mo29679a(cls);
    }

    @Override
    public synchronized <T> AbstractC6794b<T> mo29678b(Class<T> cls) {
        C3864c0.m29713c(cls, "Null interface requested.");
        return (AbstractC6794b<T>) this.f13151b.get(cls);
    }

    @Override
    public synchronized <T> AbstractC6794b<Set<T>> mo29677c(Class<T> cls) {
        C3897x<?> xVar = this.f13152c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (AbstractC6794b<Set<T>>) f13149g;
    }

    @Override
    public Set mo29676d(Class cls) {
        return super.mo29676d(cls);
    }

    public final void m29671i(List<C3865d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<AbstractC6794b<AbstractC3877i>> it = this.f13153d.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC3877i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (C3895v e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f13150a.isEmpty()) {
                C3886p.m29654a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f13150a.keySet());
                arrayList2.addAll(list);
                C3886p.m29654a(arrayList2);
            }
            for (final C3865d<?> dVar : list) {
                this.f13150a.put(dVar, new C3896w(new AbstractC6794b() {
                    @Override
                    public final Object get() {
                        Object m;
                        m = C3882n.this.m29667m(dVar);
                        return m;
                    }
                }));
            }
            arrayList.addAll(m29662r(list));
            arrayList.addAll(m29661s());
            m29663q();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m29664p();
    }

    public final void m29670j(Map<C3865d<?>, AbstractC6794b<?>> map, boolean z) {
        for (Map.Entry<C3865d<?>, AbstractC6794b<?>> entry : map.entrySet()) {
            C3865d<?> key = entry.getKey();
            AbstractC6794b<?> value = entry.getValue();
            if (key.m29701k() || (key.m29700l() && z)) {
                value.get();
            }
        }
        this.f13154e.m29631c();
    }

    public void m29669k(boolean z) {
        HashMap hashMap;
        if (this.f13155f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f13150a);
            }
            m29670j(hashMap, z);
        }
    }

    public final void m29664p() {
        Boolean bool = this.f13155f.get();
        if (bool != null) {
            m29670j(this.f13150a, bool.booleanValue());
        }
    }

    public final void m29663q() {
        for (C3865d<?> dVar : this.f13150a.keySet()) {
            for (C3890q qVar : dVar.m29707e()) {
                if (qVar.m29638f() && !this.f13152c.containsKey(qVar.m29642b())) {
                    this.f13152c.put(qVar.m29642b(), C3897x.m29625b(Collections.emptySet()));
                } else if (this.f13151b.containsKey(qVar.m29642b())) {
                    continue;
                } else if (qVar.m29639e()) {
                    throw new C3898y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.m29642b()));
                } else if (!qVar.m29638f()) {
                    this.f13151b.put(qVar.m29642b(), C3862b0.m29719c());
                }
            }
        }
    }

    public final List<Runnable> m29662r(List<C3865d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C3865d<?> dVar : list) {
            if (dVar.m29699m()) {
                final AbstractC6794b<?> bVar = this.f13150a.get(dVar);
                for (Class<? super Object> cls : dVar.m29705g()) {
                    if (!this.f13151b.containsKey(cls)) {
                        this.f13151b.put(cls, bVar);
                    } else {
                        final C3862b0 b0Var = (C3862b0) this.f13151b.get(cls);
                        arrayList.add(new Runnable() {
                            @Override
                            public final void run() {
                                C3862b0.this.m29716f(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> m29661s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C3865d<?>, AbstractC6794b<?>> entry : this.f13150a.entrySet()) {
            C3865d<?> key = entry.getKey();
            if (!key.m29699m()) {
                AbstractC6794b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m29705g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f13152c.containsKey(entry2.getKey())) {
                this.f13152c.put((Class) entry2.getKey(), C3897x.m29625b((Collection) entry2.getValue()));
            } else {
                final C3897x<?> xVar = this.f13152c.get(entry2.getKey());
                for (final AbstractC6794b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            C3897x.this.m29626a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    public C3882n(Executor executor, Iterable<AbstractC6794b<AbstractC3877i>> iterable, Collection<C3865d<?>> collection) {
        this.f13150a = new HashMap();
        this.f13151b = new HashMap();
        this.f13152c = new HashMap();
        this.f13155f = new AtomicReference<>();
        C3894u uVar = new C3894u(executor);
        this.f13154e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3865d.m29696p(uVar, C3894u.class, AbstractC5896d.class, AbstractC5895c.class));
        arrayList.add(C3865d.m29696p(this, AbstractC4320a.class, new Class[0]));
        for (C3865d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f13153d = m29668l(iterable);
        m29671i(arrayList);
    }
}
