package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbstractC11335c<K, V> extends AbstractC11338d<K, V> implements AbstractC11411v<K, V> {
    public AbstractC11335c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override
    public Map<K, Collection<V>> mo669a() {
        return super.mo669a();
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return super.put(k, v);
    }

    @Override
    public <E> Collection<E> mo868u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override
    public Collection<V> mo867v(K k, Collection<V> collection) {
        return m866w(k, (List) collection, null);
    }
}
