package j$.util.concurrent;

import java.util.Map;
import java.util.Objects;

final class l implements Map.Entry {
    final Object f14409a;
    Object f14410b;
    final ConcurrentHashMap f14411c;

    public l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f14409a = obj;
        this.f14410b = obj2;
        this.f14411c = concurrentHashMap;
    }

    @Override
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f14409a) || key.equals(obj2)) && (value == (obj3 = this.f14410b) || value.equals(obj3));
    }

    @Override
    public final Object getKey() {
        return this.f14409a;
    }

    @Override
    public final Object getValue() {
        return this.f14410b;
    }

    @Override
    public final int hashCode() {
        return this.f14409a.hashCode() ^ this.f14410b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        Objects.requireNonNull(obj);
        Object obj2 = this.f14410b;
        this.f14410b = obj;
        this.f14411c.put(this.f14409a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f14409a + "=" + this.f14410b;
    }
}
