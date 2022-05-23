package e7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p {

    public static class b {
        public final d<?> f11333a;
        public final Set<b> f11334b = new HashSet();
        public final Set<b> f11335c = new HashSet();

        public b(d<?> dVar) {
            this.f11333a = dVar;
        }

        public void a(b bVar) {
            this.f11334b.add(bVar);
        }

        public void b(b bVar) {
            this.f11335c.add(bVar);
        }

        public d<?> c() {
            return this.f11333a;
        }

        public Set<b> d() {
            return this.f11334b;
        }

        public boolean e() {
            return this.f11334b.isEmpty();
        }

        public boolean f() {
            return this.f11335c.isEmpty();
        }

        public void g(b bVar) {
            this.f11335c.remove(bVar);
        }
    }

    public static class c {
        public final Class<?> f11336a;
        public final boolean f11337b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f11336a.equals(this.f11336a) && cVar.f11337b == this.f11337b;
        }

        public int hashCode() {
            return ((this.f11336a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f11337b).hashCode();
        }

        public c(Class<?> cls, boolean z10) {
            this.f11336a = cls;
            this.f11337b = z10;
        }
    }

    public static void a(List<d<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b10.add(bVar);
                }
            }
        }
        if (i10 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b bVar2 : c10) {
                if (!bVar2.f() && !bVar2.e()) {
                    arrayList.add(bVar2.c());
                }
            }
            throw new r(arrayList);
        }
    }

    public static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d<?> dVar : list) {
            b bVar = new b(dVar);
            for (Class<? super Object> cls : dVar.g()) {
                c cVar = new c(cls, !dVar.m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (set2.isEmpty() || cVar.f11337b) {
                    set2.add(bVar);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (q qVar : bVar2.c().e()) {
                    if (qVar.d() && (set = (Set) hashMap.get(new c(qVar.b(), qVar.f()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
