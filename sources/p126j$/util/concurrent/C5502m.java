package p126j$.util.concurrent;

import java.util.Map;

public class C5502m implements Map.Entry {
    final int f18020a;
    final Object f18021b;
    volatile Object f18022c;
    volatile C5502m f18023d;

    public C5502m(int i, Object obj, Object obj2, C5502m mVar) {
        this.f18020a = i;
        this.f18021b = obj;
        this.f18022c = obj2;
        this.f18023d = mVar;
    }

    public C5502m mo22512a(int i, Object obj) {
        Object obj2;
        C5502m mVar = this;
        do {
            if (mVar.f18020a == i && ((obj2 = mVar.f18021b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return mVar;
            }
            mVar = mVar.f18023d;
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
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f18021b) || key.equals(obj2)) && (value == (obj3 = this.f18022c) || value.equals(obj3));
    }

    @Override
    public final Object getKey() {
        return this.f18021b;
    }

    @Override
    public final Object getValue() {
        return this.f18022c;
    }

    @Override
    public final int hashCode() {
        return this.f18021b.hashCode() ^ this.f18022c.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f18021b + "=" + this.f18022c;
    }
}
