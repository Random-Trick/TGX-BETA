package p123ia;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p251ra.AbstractC8415a;
import qa.C8298k;

public final class C5316y implements Map, Serializable, AbstractC8415a {
    public static final C5316y f17492a = new C5316y();

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
        return m23309e((Void) obj);
    }

    public boolean m23309e(Void r2) {
        C8298k.m12934e(r2, "value");
        return false;
    }

    @Override
    public final Set<Map.Entry> entrySet() {
        return m23307i();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public int getSize() {
        return 0;
    }

    public Void get(Object obj) {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Set<Map.Entry> m23307i() {
        return C5317z.f17493a;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public final Set<Object> keySet() {
        return m23306m();
    }

    public Set<Object> m23306m() {
        return C5317z.f17493a;
    }

    @Override
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection m23305r() {
        return C5315x.f17491a;
    }

    public Void put(Object obj, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return getSize();
    }

    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "{}";
    }

    @Override
    public final Collection values() {
        return m23305r();
    }
}
