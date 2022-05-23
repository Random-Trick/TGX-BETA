package ja;

import ia.h;
import java.util.Collections;
import java.util.Map;
import ra.k;

public class g0 extends f0 {
    public static final int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(h<? extends K, ? extends V> hVar) {
        k.e(hVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(hVar.c(), hVar.d());
        k.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        k.e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        k.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
