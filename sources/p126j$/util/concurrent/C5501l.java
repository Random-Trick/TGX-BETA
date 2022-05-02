package p126j$.util.concurrent;

import java.util.Map;
import java.util.Objects;

final class C5501l implements Map.Entry {
    final Object f18017a;
    Object f18018b;
    final ConcurrentHashMap f18019c;

    public C5501l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f18017a = obj;
        this.f18018b = obj2;
        this.f18019c = concurrentHashMap;
    }

    @Override
    public boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f18017a) || key.equals(obj2)) && (value == (obj3 = this.f18018b) || value.equals(obj3));
    }

    @Override
    public Object getKey() {
        return this.f18017a;
    }

    @Override
    public Object getValue() {
        return this.f18018b;
    }

    @Override
    public int hashCode() {
        return this.f18017a.hashCode() ^ this.f18018b.hashCode();
    }

    @Override
    public Object setValue(Object obj) {
        Objects.requireNonNull(obj);
        Object obj2 = this.f18018b;
        this.f18018b = obj;
        this.f18019c.put(this.f18017a, obj);
        return obj2;
    }

    public String toString() {
        return this.f18017a + "=" + this.f18018b;
    }
}
