package d6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class m1<K, V> extends AbstractMap<K, V> {
    @CheckForNull
    public transient Set<Map.Entry<K, V>> f6666a;
    @CheckForNull
    public transient Collection<V> f6667b;

    public abstract Set<Map.Entry<K, V>> a();

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f6666a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a10 = a();
        this.f6666a = a10;
        return a10;
    }

    @Override
    public final Collection<V> values() {
        Collection<V> collection = this.f6667b;
        if (collection != null) {
            return collection;
        }
        l1 l1Var = new l1(this);
        this.f6667b = l1Var;
        return l1Var;
    }
}
