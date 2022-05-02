package p358z6;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class C11394p<K, V> extends AbstractC11356e<K, V> implements Serializable {
    @NullableDecl
    public final K f36346a;
    @NullableDecl
    public final V f36347b;

    public C11394p(@NullableDecl K k, @NullableDecl V v) {
        this.f36346a = k;
        this.f36347b = v;
    }

    @Override
    @NullableDecl
    public final K getKey() {
        return this.f36346a;
    }

    @Override
    @NullableDecl
    public final V getValue() {
        return this.f36347b;
    }

    @Override
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
