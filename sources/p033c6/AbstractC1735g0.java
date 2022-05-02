package p033c6;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class AbstractC1735g0<K, V> extends AbstractC1765i0<K, V> implements Serializable {
    public transient int f6289M;
    public transient Map<K, Collection<V>> f6290c;

    public AbstractC1735g0(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f6290c = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void m36039n(AbstractC1735g0 g0Var, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = g0Var.f6290c;
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
            g0Var.f6289M -= size;
        }
    }

    @Override
    public final boolean mo35971b(K k, V v) {
        Collection<V> collection = this.f6290c.get(k);
        if (collection == null) {
            Collection<V> g = mo35994g();
            if (g.add(v)) {
                this.f6289M++;
                this.f6290c.put(k, g);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f6289M++;
            return true;
        }
    }

    @Override
    public final Map<K, Collection<V>> mo35998e() {
        return new C1977x(this, this.f6290c);
    }

    @Override
    public final Set<K> mo35997f() {
        return new C2005z(this, this.f6290c);
    }

    public abstract Collection<V> mo35994g();

    public abstract Collection<V> mo35888h(K k, Collection<V> collection);

    public final Collection<V> m36043j(K k) {
        Collection<V> collection = this.f6290c.get(k);
        if (collection == null) {
            collection = mo35994g();
        }
        return mo35888h(k, collection);
    }

    public final List<V> m36042k(K k, List<V> list, @CheckForNull C1690d0 d0Var) {
        if (list instanceof RandomAccess) {
            return new C1645a0(this, k, list, d0Var);
        }
        return new C1720f0(this, k, list, d0Var);
    }

    public final void m36038o() {
        for (Collection<V> collection : this.f6290c.values()) {
            collection.clear();
        }
        this.f6290c.clear();
        this.f6289M = 0;
    }
}
