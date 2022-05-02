package p358z6;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class C11394p<K, V> extends AbstractC11356e<K, V> implements Serializable {
    @NullableDecl
    public final K f36349a;
    @NullableDecl
    public final V f36350b;

    public C11394p(@NullableDecl K k, @NullableDecl V v) {
        this.f36349a = k;
        this.f36350b = v;
    }

    @Override
    @NullableDecl
    public final K getKey() {
        return this.f36349a;
    }

    @Override
    @NullableDecl
    public final V getValue() {
        return this.f36350b;
    }

    @Override
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
