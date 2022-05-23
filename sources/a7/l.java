package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class l<K, V> extends m implements Map<K, V> {
    public abstract Map<K, V> b();

    public boolean c(@CheckForNull Object obj) {
        return y.b(this, obj);
    }

    @Override
    public void clear() {
        b().clear();
    }

    @Override
    public boolean containsKey(@CheckForNull Object obj) {
        return b().containsKey(obj);
    }

    public boolean d(@CheckForNull Object obj) {
        return y.c(this, obj);
    }

    public int e() {
        return p0.d(entrySet());
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return b().get(obj);
    }

    @Override
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override
    public Set<K> keySet() {
        return b().keySet();
    }

    @Override
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return b().remove(obj);
    }

    @Override
    public int size() {
        return b().size();
    }

    @Override
    public Collection<V> values() {
        return b().values();
    }
}
