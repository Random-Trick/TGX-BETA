package y;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import y.n0;

public final class p1 extends t1 implements o1 {
    public static final n0.c f26389z = n0.c.OPTIONAL;

    public p1(TreeMap<n0.a<?>, Map<n0.c, Object>> treeMap) {
        super(treeMap);
    }

    public static p1 J() {
        return new p1(new TreeMap(t1.f26420x));
    }

    public static p1 K(n0 n0Var) {
        TreeMap treeMap = new TreeMap(t1.f26420x);
        for (n0.a<?> aVar : n0Var.b()) {
            Set<n0.c> l10 = n0Var.l(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (n0.c cVar : l10) {
                arrayMap.put(cVar, n0Var.x(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new p1(treeMap);
    }

    public <ValueT> ValueT L(n0.a<ValueT> aVar) {
        return (ValueT) this.f26422w.remove(aVar);
    }

    @Override
    public <ValueT> void n(n0.a<ValueT> aVar, ValueT valuet) {
        y(aVar, f26389z, valuet);
    }

    @Override
    public <ValueT> void y(n0.a<ValueT> aVar, n0.c cVar, ValueT valuet) {
        Map<n0.c, Object> map = this.f26422w.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f26422w.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        n0.c cVar2 = (n0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !m0.a(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }
}
