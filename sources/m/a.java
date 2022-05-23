package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> N = new HashMap<>();

    public boolean contains(K k10) {
        return this.N.containsKey(k10);
    }

    @Override
    public b.c<K, V> g(K k10) {
        return this.N.get(k10);
    }

    @Override
    public V t(K k10, V v10) {
        b.c<K, V> g10 = g(k10);
        if (g10 != null) {
            return g10.f16434b;
        }
        this.N.put(k10, s(k10, v10));
        return null;
    }

    @Override
    public V u(K k10) {
        V v10 = (V) super.u(k10);
        this.N.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> v(K k10) {
        if (contains(k10)) {
            return this.N.get(k10).M;
        }
        return null;
    }
}
