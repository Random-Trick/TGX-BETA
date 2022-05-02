package p033c6;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public class C1796k1<K, V> extends AbstractC1895r1<K> {
    public final Map<K, V> f6418a;

    public C1796k1(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f6418a = map;
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        return this.f6418a.containsKey(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f6418a.isEmpty();
    }

    @Override
    public Iterator<K> iterator() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f6418a.size();
    }
}
