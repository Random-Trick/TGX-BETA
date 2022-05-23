package j$.util.concurrent;

import java.util.Map;

public class m implements Map.Entry {
    final int f14412a;
    final Object f14413b;
    volatile Object f14414c;
    volatile m f14415d;

    public m(int i10, Object obj, Object obj2, m mVar) {
        this.f14412a = i10;
        this.f14413b = obj;
        this.f14414c = obj2;
        this.f14415d = mVar;
    }

    public m a(int i10, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        m mVar = this;
        do {
            if (mVar.f14412a == i10 && ((obj2 = mVar.f14413b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return mVar;
            }
            mVar = mVar.f14415d;
        } while (mVar != null);
        return null;
    }

    @Override
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f14413b) || key.equals(obj2)) && (value == (obj3 = this.f14414c) || value.equals(obj3));
    }

    @Override
    public final Object getKey() {
        return this.f14413b;
    }

    @Override
    public final Object getValue() {
        return this.f14414c;
    }

    @Override
    public final int hashCode() {
        return this.f14413b.hashCode() ^ this.f14414c.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f14413b + "=" + this.f14414c;
    }
}
