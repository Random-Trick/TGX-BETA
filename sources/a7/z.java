package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
public interface z<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    @CanIgnoreReturnValue
    boolean put(K k10, V v10);

    int size();

    Collection<V> values();
}
