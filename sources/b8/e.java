package b8;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;

public abstract class e<K, V> {
    public final Map<K, V> f4029a = new HashMap();

    @RecentlyNonNull
    public abstract V a(@RecentlyNonNull K k10);

    @RecentlyNonNull
    public V b(@RecentlyNonNull K k10) {
        synchronized (this.f4029a) {
            if (this.f4029a.containsKey(k10)) {
                return this.f4029a.get(k10);
            }
            V a10 = a(k10);
            this.f4029a.put(k10, a10);
            return a10;
        }
    }
}
