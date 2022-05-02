package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbstractC11378l<K, V> extends AbstractC11380m implements Map<K, V> {
    public abstract Map<K, V> mo794b();

    public boolean m793c(@NullableDecl Object obj) {
        return C11414y.m688b(this, obj);
    }

    @Override
    public void clear() {
        mo794b().clear();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return mo794b().containsKey(obj);
    }

    public boolean m792d(@NullableDecl Object obj) {
        return C11414y.m687c(this, obj);
    }

    public int m791e() {
        return C11387o0.m779d(entrySet());
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo794b().entrySet();
    }

    public V get(@NullableDecl Object obj) {
        return mo794b().get(obj);
    }

    public boolean isEmpty() {
        return mo794b().isEmpty();
    }

    public Set<K> keySet() {
        return mo794b().keySet();
    }

    @Override
    @CanIgnoreReturnValue
    public V put(K k, V v) {
        return mo794b().put(k, v);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        mo794b().putAll(map);
    }

    @Override
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return mo794b().remove(obj);
    }

    public int size() {
        return mo794b().size();
    }

    @Override
    public Collection<V> values() {
        return mo794b().values();
    }
}
