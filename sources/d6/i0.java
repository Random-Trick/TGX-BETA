package d6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class i0<K, V> implements o1<K, V> {
    @CheckForNull
    public transient Set<K> f6558a;
    @CheckForNull
    public transient Map<K, Collection<V>> f6559b;

    @Override
    public final Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f6559b;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e10 = e();
        this.f6559b = e10;
        return e10;
    }

    @Override
    public final Set<K> d() {
        Set<K> set = this.f6558a;
        if (set != null) {
            return set;
        }
        Set<K> f10 = f();
        this.f6558a = f10;
        return f10;
    }

    public abstract Map<K, Collection<V>> e();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return a().equals(((o1) obj).a());
    }

    public abstract Set<K> f();

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return ((x) a()).f7099c.toString();
    }
}
