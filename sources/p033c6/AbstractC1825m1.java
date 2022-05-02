package p033c6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class AbstractC1825m1<K, V> extends AbstractMap<K, V> {
    @CheckForNull
    public transient Set<Map.Entry<K, V>> f6471a;
    @CheckForNull
    public transient Collection<V> f6472b;

    public abstract Set<Map.Entry<K, V>> mo35839a();

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f6471a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo35839a();
        this.f6471a = a;
        return a;
    }

    @Override
    public final Collection<V> values() {
        Collection<V> collection = this.f6472b;
        if (collection != null) {
            return collection;
        }
        C1811l1 l1Var = new C1811l1(this);
        this.f6472b = l1Var;
        return l1Var;
    }
}
