package p033c6;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class C1935u<K, V> extends AbstractC1735g0<K, V> implements AbstractC1751h1<K, V> {
    public C1935u(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override
    public final List<V> mo35886c(K k) {
        return (List<V>) super.m36040j(k);
    }

    @Override
    public final Collection<V> mo35885h(K k, Collection<V> collection) {
        return m36039k(k, (List) collection, null);
    }
}
