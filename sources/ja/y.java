package ja;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ra.k;
import sa.a;

public final class y implements Map, Serializable, a {
    public static final y f15179a = new y();

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return d((Void) obj);
    }

    public boolean d(Void r22) {
        k.e(r22, "value");
        return false;
    }

    @Override
    public final Set<Map.Entry> entrySet() {
        return g();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Void get(Object obj) {
        return null;
    }

    public Set<Map.Entry> g() {
        return z.f15180a;
    }

    public int getSize() {
        return 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public final Set<Object> keySet() {
        return m();
    }

    public Set<Object> m() {
        return z.f15180a;
    }

    @Override
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection r() {
        return x.f15178a;
    }

    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return getSize();
    }

    public String toString() {
        return "{}";
    }

    @Override
    public final Collection values() {
        return r();
    }
}
