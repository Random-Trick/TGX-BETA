package p033c6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class AbstractC1765i0<K, V> implements AbstractC1853o1<K, V> {
    @CheckForNull
    public transient Set<K> f6354a;
    @CheckForNull
    public transient Map<K, Collection<V>> f6355b;

    @Override
    public final Map<K, Collection<V>> mo35972a() {
        Map<K, Collection<V>> map = this.f6355b;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e = mo35998e();
        this.f6355b = e;
        return e;
    }

    @Override
    public final Set<K> mo35970d() {
        Set<K> set = this.f6354a;
        if (set != null) {
            return set;
        }
        Set<K> f = mo35997f();
        this.f6354a = f;
        return f;
    }

    public abstract Map<K, Collection<V>> mo35998e();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1853o1)) {
            return false;
        }
        return mo35972a().equals(((AbstractC1853o1) obj).mo35972a());
    }

    public abstract Set<K> mo35997f();

    public final int hashCode() {
        return mo35972a().hashCode();
    }

    public final String toString() {
        return ((C1977x) mo35972a()).f7063c.toString();
    }
}
