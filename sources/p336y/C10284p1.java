package p336y;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p336y.AbstractC10268n0;

public final class C10284p1 extends C10300t1 implements AbstractC10277o1 {
    public static final AbstractC10268n0.EnumC10271c f33111z = AbstractC10268n0.EnumC10271c.OPTIONAL;

    public C10284p1(TreeMap<AbstractC10268n0.AbstractC10269a<?>, Map<AbstractC10268n0.EnumC10271c, Object>> treeMap) {
        super(treeMap);
    }

    public static C10284p1 m5569J() {
        return new C10284p1(new TreeMap(C10300t1.f33147x));
    }

    public static C10284p1 m5568K(AbstractC10268n0 n0Var) {
        TreeMap treeMap = new TreeMap(C10300t1.f33147x);
        for (AbstractC10268n0.AbstractC10269a<?> aVar : n0Var.mo5425b()) {
            Set<AbstractC10268n0.EnumC10271c> l = n0Var.mo5436l(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (AbstractC10268n0.EnumC10271c cVar : l) {
                arrayMap.put(cVar, n0Var.mo5427x(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C10284p1(treeMap);
    }

    public <ValueT> ValueT m5567L(AbstractC10268n0.AbstractC10269a<ValueT> aVar) {
        return (ValueT) this.f33149w.remove(aVar);
    }

    @Override
    public <ValueT> void mo5566n(AbstractC10268n0.AbstractC10269a<ValueT> aVar, ValueT valuet) {
        mo5565y(aVar, f33111z, valuet);
    }

    @Override
    public <ValueT> void mo5565y(AbstractC10268n0.AbstractC10269a<ValueT> aVar, AbstractC10268n0.EnumC10271c cVar, ValueT valuet) {
        Map<AbstractC10268n0.EnumC10271c, Object> map = this.f33149w.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f33149w.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        AbstractC10268n0.EnumC10271c cVar2 = (AbstractC10268n0.EnumC10271c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !C10262m0.m5604a(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.mo5580c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }
}
