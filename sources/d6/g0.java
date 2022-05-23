package d6;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class g0<K, V> extends i0<K, V> implements Serializable {
    public transient int M;
    public transient Map<K, Collection<V>> f6509c;

    public g0(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f6509c = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static int i(g0 g0Var) {
        return g0Var.M;
    }

    public static Map l(g0 g0Var) {
        return g0Var.f6509c;
    }

    public static void m(g0 g0Var, int i10) {
        g0Var.M = i10;
    }

    public static void n(g0 g0Var, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = g0Var.f6509c;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            g0Var.M -= size;
        }
    }

    @Override
    public final boolean b(K k10, V v10) {
        Collection<V> collection = this.f6509c.get(k10);
        if (collection == null) {
            Collection<V> g10 = g();
            if (g10.add(v10)) {
                this.M++;
                this.f6509c.put(k10, g10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v10)) {
            return false;
        } else {
            this.M++;
            return true;
        }
    }

    @Override
    public final Map<K, Collection<V>> e() {
        return new x(this, this.f6509c);
    }

    @Override
    public final Set<K> f() {
        return new z(this, this.f6509c);
    }

    public abstract Collection<V> g();

    public abstract Collection<V> h(K k10, Collection<V> collection);

    public final Collection<V> j(K k10) {
        Collection<V> collection = this.f6509c.get(k10);
        if (collection == null) {
            collection = g();
        }
        return h(k10, collection);
    }

    public final List<V> k(K k10, List<V> list, @CheckForNull d0 d0Var) {
        if (list instanceof RandomAccess) {
            return new a0(this, k10, list, d0Var);
        }
        return new f0(this, k10, list, d0Var);
    }

    public final void o() {
        for (Collection<V> collection : this.f6509c.values()) {
            collection.clear();
        }
        this.f6509c.clear();
        this.M = 0;
    }
}
