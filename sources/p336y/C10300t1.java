package p336y;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p336y.AbstractC10268n0;

public class C10300t1 implements AbstractC10268n0 {
    public static final Comparator<AbstractC10268n0.AbstractC10269a<?>> f33150x;
    public static final C10300t1 f33151y;
    public final TreeMap<AbstractC10268n0.AbstractC10269a<?>, Map<AbstractC10268n0.EnumC10271c, Object>> f33152w;

    static {
        C10297s1 s1Var = C10297s1.f33144a;
        f33150x = s1Var;
        f33151y = new C10300t1(new TreeMap(s1Var));
    }

    public C10300t1(TreeMap<AbstractC10268n0.AbstractC10269a<?>, Map<AbstractC10268n0.EnumC10271c, Object>> treeMap) {
        this.f33152w = treeMap;
    }

    public static C10300t1 m5525G() {
        return f33151y;
    }

    public static C10300t1 m5524H(AbstractC10268n0 n0Var) {
        if (C10300t1.class.equals(n0Var.getClass())) {
            return (C10300t1) n0Var;
        }
        TreeMap treeMap = new TreeMap(f33150x);
        for (AbstractC10268n0.AbstractC10269a<?> aVar : n0Var.mo5425b()) {
            Set<AbstractC10268n0.EnumC10271c> l = n0Var.mo5436l(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (AbstractC10268n0.EnumC10271c cVar : l) {
                arrayMap.put(cVar, n0Var.mo5427x(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C10300t1(treeMap);
    }

    public static int m5523I(AbstractC10268n0.AbstractC10269a aVar, AbstractC10268n0.AbstractC10269a aVar2) {
        return aVar.mo5580c().compareTo(aVar2.mo5580c());
    }

    @Override
    public <ValueT> ValueT mo5426a(AbstractC10268n0.AbstractC10269a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) mo5424c(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override
    public Set<AbstractC10268n0.AbstractC10269a<?>> mo5425b() {
        return Collections.unmodifiableSet(this.f33152w.keySet());
    }

    @Override
    public <ValueT> ValueT mo5424c(AbstractC10268n0.AbstractC10269a<ValueT> aVar) {
        Map<AbstractC10268n0.EnumC10271c, Object> map = this.f33152w.get(aVar);
        if (map != null) {
            return (ValueT) map.get((AbstractC10268n0.EnumC10271c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override
    public AbstractC10268n0.EnumC10271c mo5423d(AbstractC10268n0.AbstractC10269a<?> aVar) {
        Map<AbstractC10268n0.EnumC10271c, Object> map = this.f33152w.get(aVar);
        if (map != null) {
            return (AbstractC10268n0.EnumC10271c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override
    public boolean mo5422e(AbstractC10268n0.AbstractC10269a<?> aVar) {
        return this.f33152w.containsKey(aVar);
    }

    @Override
    public void mo5439g(java.lang.String r4, p336y.AbstractC10268n0.AbstractC10270b r5) {
        throw new UnsupportedOperationException("Method not decompiled: p336y.C10300t1.mo5439g(java.lang.String, y.n0$b):void");
    }

    @Override
    public Set<AbstractC10268n0.EnumC10271c> mo5436l(AbstractC10268n0.AbstractC10269a<?> aVar) {
        Map<AbstractC10268n0.EnumC10271c, Object> map = this.f33152w.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override
    public <ValueT> ValueT mo5427x(AbstractC10268n0.AbstractC10269a<ValueT> aVar, AbstractC10268n0.EnumC10271c cVar) {
        Map<AbstractC10268n0.EnumC10271c, Object> map = this.f33152w.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
    }
}
