package p033c6;

import java.io.Serializable;

public final class C1646a1<K, V> extends AbstractC1750h0<K, V> implements Serializable {
    public final K f6065a;
    public final V f6066b;

    public C1646a1(K k, V v) {
        this.f6065a = k;
        this.f6066b = v;
    }

    @Override
    public final K getKey() {
        return this.f6065a;
    }

    @Override
    public final V getValue() {
        return this.f6066b;
    }

    @Override
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
