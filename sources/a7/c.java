package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

public abstract class c<K, V> extends d<K, V> implements v<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override
    public Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override
    @CanIgnoreReturnValue
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override
    public <E> Collection<E> u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override
    public Collection<V> v(K k10, Collection<V> collection) {
        return w(k10, (List) collection, null);
    }
}
