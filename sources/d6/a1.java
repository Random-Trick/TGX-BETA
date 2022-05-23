package d6;

import java.io.Serializable;

public final class a1<K, V> extends h0<K, V> implements Serializable {
    public final K f6339a;
    public final V f6340b;

    public a1(K k10, V v10) {
        this.f6339a = k10;
        this.f6340b = v10;
    }

    @Override
    public final K getKey() {
        return this.f6339a;
    }

    @Override
    public final V getValue() {
        return this.f6340b;
    }

    @Override
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
