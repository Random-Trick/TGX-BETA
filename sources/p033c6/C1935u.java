package p033c6;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class C1935u<K, V> extends AbstractC1735g0<K, V> implements AbstractC1751h1<K, V> {
    public C1935u(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override
    public final List<V> mo35889c(K k) {
        return (List<V>) super.m36043j(k);
    }

    @Override
    public final Collection<V> mo35888h(K k, Collection<V> collection) {
        return m36042k(k, (List) collection, null);
    }
}
