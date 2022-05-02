package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public interface AbstractC11423z<K, V> {
    Map<K, Collection<V>> mo669a();

    void clear();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k, @NullableDecl V v);

    int size();

    Collection<V> values();
}
