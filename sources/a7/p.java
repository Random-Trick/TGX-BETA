package a7;

import java.io.Serializable;

public class p<K, V> extends e<K, V> implements Serializable {
    public final K f647a;
    public final V f648b;

    public p(K k10, V v10) {
        this.f647a = k10;
        this.f648b = v10;
    }

    @Override
    public final K getKey() {
        return this.f647a;
    }

    @Override
    public final V getValue() {
        return this.f648b;
    }

    @Override
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
