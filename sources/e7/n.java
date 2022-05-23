package e7;

import android.util.Log;
import e7.n;
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
import k7.c;
import k7.d;

public class n extends e7.a implements g7.a {
    public static final n7.b<Set<Object>> f11322g = m.f11321a;
    public final Map<d<?>, n7.b<?>> f11323a;
    public final Map<Class<?>, n7.b<?>> f11324b;
    public final Map<Class<?>, x<?>> f11325c;
    public final List<n7.b<i>> f11326d;
    public final u f11327e;
    public final AtomicReference<Boolean> f11328f;

    public static final class b {
        public final Executor f11329a;
        public final List<n7.b<i>> f11330b = new ArrayList();
        public final List<d<?>> f11331c = new ArrayList();

        public b(Executor executor) {
            this.f11329a = executor;
        }

        public static i f(i iVar) {
            return iVar;
        }

        public b b(d<?> dVar) {
            this.f11331c.add(dVar);
            return this;
        }

        public b c(final i iVar) {
            this.f11330b.add(new n7.b() {
                @Override
                public final Object get() {
                    i f10;
                    f10 = n.b.f(i.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<n7.b<i>> collection) {
            this.f11330b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f11329a, this.f11330b, this.f11331c);
        }
    }

    public static b h(Executor executor) {
        return new b(executor);
    }

    public static <T> List<T> l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    public Object m(d dVar) {
        return dVar.f().a(new d0(dVar, this));
    }

    @Override
    public Object a(Class cls) {
        return super.a(cls);
    }

    @Override
    public synchronized <T> n7.b<T> b(Class<T> cls) {
        c0.c(cls, "Null interface requested.");
        return (n7.b<T>) this.f11324b.get(cls);
    }

    @Override
    public synchronized <T> n7.b<Set<T>> c(Class<T> cls) {
        x<?> xVar = this.f11325c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (n7.b<Set<T>>) f11322g;
    }

    @Override
    public Set d(Class cls) {
        return super.d(cls);
    }

    public final void i(List<d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<n7.b<i>> it = this.f11326d.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f11323a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f11323a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final d<?> dVar : list) {
                this.f11323a.put(dVar, new w(new n7.b() {
                    @Override
                    public final Object get() {
                        Object m10;
                        m10 = n.this.m(dVar);
                        return m10;
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        p();
    }

    public final void j(Map<d<?>, n7.b<?>> map, boolean z10) {
        for (Map.Entry<d<?>, n7.b<?>> entry : map.entrySet()) {
            d<?> key = entry.getKey();
            n7.b<?> value = entry.getValue();
            if (key.k() || (key.l() && z10)) {
                value.get();
            }
        }
        this.f11327e.c();
    }

    public void k(boolean z10) {
        HashMap hashMap;
        if (this.f11328f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f11323a);
            }
            j(hashMap, z10);
        }
    }

    public final void p() {
        Boolean bool = this.f11328f.get();
        if (bool != null) {
            j(this.f11323a, bool.booleanValue());
        }
    }

    public final void q() {
        for (d<?> dVar : this.f11323a.keySet()) {
            for (q qVar : dVar.e()) {
                if (qVar.f() && !this.f11325c.containsKey(qVar.b())) {
                    this.f11325c.put(qVar.b(), x.b(Collections.emptySet()));
                } else if (this.f11324b.containsKey(qVar.b())) {
                    continue;
                } else if (qVar.e()) {
                    throw new y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.b()));
                } else if (!qVar.f()) {
                    this.f11324b.put(qVar.b(), b0.c());
                }
            }
        }
    }

    public final List<Runnable> r(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : list) {
            if (dVar.m()) {
                final n7.b<?> bVar = this.f11323a.get(dVar);
                for (Class<? super Object> cls : dVar.g()) {
                    if (!this.f11324b.containsKey(cls)) {
                        this.f11324b.put(cls, bVar);
                    } else {
                        final b0 b0Var = (b0) this.f11324b.get(cls);
                        arrayList.add(new Runnable() {
                            @Override
                            public final void run() {
                                b0.this.f(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, n7.b<?>> entry : this.f11323a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.m()) {
                n7.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f11325c.containsKey(entry2.getKey())) {
                this.f11325c.put((Class) entry2.getKey(), x.b((Collection) entry2.getValue()));
            } else {
                final x<?> xVar = this.f11325c.get(entry2.getKey());
                for (final n7.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            x.this.a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    public n(Executor executor, Iterable<n7.b<i>> iterable, Collection<d<?>> collection) {
        this.f11323a = new HashMap();
        this.f11324b = new HashMap();
        this.f11325c = new HashMap();
        this.f11328f = new AtomicReference<>();
        u uVar = new u(executor);
        this.f11327e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.p(uVar, u.class, d.class, c.class));
        arrayList.add(d.p(this, g7.a.class, new Class[0]));
        for (d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f11326d = l(iterable);
        i(arrayList);
    }
}
