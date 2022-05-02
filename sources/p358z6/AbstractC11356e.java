package p358z6;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10432h;

public abstract class AbstractC11356e<K, V> implements Map.Entry<K, V> {
    @Override
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C10432h.m5139a(getKey(), entry.getKey()) && C10432h.m5139a(getValue(), entry.getValue());
    }

    @Override
    public abstract K getKey();

    @Override
    public abstract V getValue();

    @Override
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
