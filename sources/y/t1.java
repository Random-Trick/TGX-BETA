package y;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import y.n0;

public class t1 implements n0 {
    public static final Comparator<n0.a<?>> f26420x;
    public static final t1 f26421y;
    public final TreeMap<n0.a<?>, Map<n0.c, Object>> f26422w;

    static {
        s1 s1Var = s1.f26415a;
        f26420x = s1Var;
        f26421y = new t1(new TreeMap(s1Var));
    }

    public t1(TreeMap<n0.a<?>, Map<n0.c, Object>> treeMap) {
        this.f26422w = treeMap;
    }

    public static t1 G() {
        return f26421y;
    }

    public static t1 H(n0 n0Var) {
        if (t1.class.equals(n0Var.getClass())) {
            return (t1) n0Var;
        }
        TreeMap treeMap = new TreeMap(f26420x);
        for (n0.a<?> aVar : n0Var.b()) {
            Set<n0.c> l10 = n0Var.l(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (n0.c cVar : l10) {
                arrayMap.put(cVar, n0Var.x(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new t1(treeMap);
    }

    public static int I(n0.a aVar, n0.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override
    public <ValueT> ValueT a(n0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) c(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override
    public Set<n0.a<?>> b() {
        return Collections.unmodifiableSet(this.f26422w.keySet());
    }

    @Override
    public <ValueT> ValueT c(n0.a<ValueT> aVar) {
        Map<n0.c, Object> map = this.f26422w.get(aVar);
        if (map != null) {
            return (ValueT) map.get((n0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override
    public n0.c d(n0.a<?> aVar) {
        Map<n0.c, Object> map = this.f26422w.get(aVar);
        if (map != null) {
            return (n0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override
    public boolean e(n0.a<?> aVar) {
        return this.f26422w.containsKey(aVar);
    }

    @Override
    public void g(java.lang.String r4, y.n0.b r5) {
        throw new UnsupportedOperationException("Method not decompiled: y.t1.g(java.lang.String, y.n0$b):void");
    }

    @Override
    public Set<n0.c> l(n0.a<?> aVar) {
        Map<n0.c, Object> map = this.f26422w.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override
    public <ValueT> ValueT x(n0.a<ValueT> aVar, n0.c cVar) {
        Map<n0.c, Object> map = this.f26422w.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
    }
}
