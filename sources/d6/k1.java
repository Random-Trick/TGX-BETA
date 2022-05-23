package d6;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public class k1<K, V> extends r1<K> {
    public final Map<K, V> f6619a;

    public k1(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f6619a = map;
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        return this.f6619a.containsKey(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f6619a.isEmpty();
    }

    @Override
    public Iterator<K> iterator() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f6619a.size();
    }
}
