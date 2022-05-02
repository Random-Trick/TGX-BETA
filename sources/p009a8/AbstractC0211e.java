package p009a8;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractC0211e<K, V> {
    public final Map<K, V> f685a = new HashMap();

    @RecentlyNonNull
    public abstract V mo29613a(@RecentlyNonNull K k);

    @RecentlyNonNull
    public V m42085b(@RecentlyNonNull K k) {
        synchronized (this.f685a) {
            if (this.f685a.containsKey(k)) {
                return this.f685a.get(k);
            }
            V a = mo29613a(k);
            this.f685a.put(k, a);
            return a;
        }
    }
}
