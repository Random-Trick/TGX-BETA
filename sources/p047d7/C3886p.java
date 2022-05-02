package p047d7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C3886p {

    public static class C3888b {
        public final C3865d<?> f13160a;
        public final Set<C3888b> f13161b = new HashSet();
        public final Set<C3888b> f13162c = new HashSet();

        public C3888b(C3865d<?> dVar) {
            this.f13160a = dVar;
        }

        public void m29651a(C3888b bVar) {
            this.f13161b.add(bVar);
        }

        public void m29650b(C3888b bVar) {
            this.f13162c.add(bVar);
        }

        public C3865d<?> m29649c() {
            return this.f13160a;
        }

        public Set<C3888b> m29648d() {
            return this.f13161b;
        }

        public boolean m29647e() {
            return this.f13161b.isEmpty();
        }

        public boolean m29646f() {
            return this.f13162c.isEmpty();
        }

        public void m29645g(C3888b bVar) {
            this.f13162c.remove(bVar);
        }
    }

    public static class C3889c {
        public final Class<?> f13163a;
        public final boolean f13164b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C3889c)) {
                return false;
            }
            C3889c cVar = (C3889c) obj;
            return cVar.f13163a.equals(this.f13163a) && cVar.f13164b == this.f13164b;
        }

        public int hashCode() {
            return ((this.f13163a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f13164b).hashCode();
        }

        public C3889c(Class<?> cls, boolean z) {
            this.f13163a = cls;
            this.f13164b = z;
        }
    }

    public static void m29654a(List<C3865d<?>> list) {
        Set<C3888b> c = m29652c(list);
        Set<C3888b> b = m29653b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C3888b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C3888b bVar : next.m29648d()) {
                bVar.m29645g(next);
                if (bVar.m29646f()) {
                    b.add(bVar);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C3888b bVar2 : c) {
                if (!bVar2.m29646f() && !bVar2.m29647e()) {
                    arrayList.add(bVar2.m29649c());
                }
            }
            throw new C3891r(arrayList);
        }
    }

    public static Set<C3888b> m29653b(Set<C3888b> set) {
        HashSet hashSet = new HashSet();
        for (C3888b bVar : set) {
            if (bVar.m29646f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set<C3888b> m29652c(List<C3865d<?>> list) {
        Set<C3888b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C3865d<?> dVar : list) {
            C3888b bVar = new C3888b(dVar);
            for (Class<? super Object> cls : dVar.m29705g()) {
                C3889c cVar = new C3889c(cls, !dVar.m29699m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (set2.isEmpty() || cVar.f13164b) {
                    set2.add(bVar);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (Set<C3888b> set3 : hashMap.values()) {
            for (C3888b bVar2 : set3) {
                for (C3890q qVar : bVar2.m29649c().m29707e()) {
                    if (qVar.m29640d() && (set = (Set) hashMap.get(new C3889c(qVar.m29642b(), qVar.m29638f()))) != null) {
                        for (C3888b bVar3 : set) {
                            bVar2.m29651a(bVar3);
                            bVar3.m29650b(bVar2);
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
