package d6;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class u<K, V> extends g0<K, V> implements h1<K, V> {
    public u(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override
    public final List<V> c(K k10) {
        return (List<V>) super.j(k10);
    }

    @Override
    public final Collection<V> h(K k10, Collection<V> collection) {
        return k(k10, (List) collection, null);
    }
}
