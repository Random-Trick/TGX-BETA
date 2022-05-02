package p170m;

import java.util.HashMap;
import java.util.Map;
import p170m.C6531b;

public class C6530a<K, V> extends C6531b<K, V> {
    public HashMap<K, C6531b.C6534c<K, V>> f20342N = new HashMap<>();

    public boolean contains(K k) {
        return this.f20342N.containsKey(k);
    }

    @Override
    public C6531b.C6534c<K, V> mo20150i(K k) {
        return this.f20342N.get(k);
    }

    @Override
    public V mo20146t(K k, V v) {
        C6531b.C6534c<K, V> i = mo20150i(k);
        if (i != null) {
            return i.f20349b;
        }
        this.f20342N.put(k, m20147s(k, v));
        return null;
    }

    @Override
    public V mo20145u(K k) {
        V v = (V) super.mo20145u(k);
        this.f20342N.remove(k);
        return v;
    }

    public Map.Entry<K, V> m20152v(K k) {
        if (contains(k)) {
            return this.f20342N.get(k).f20347M;
        }
        return null;
    }
}
