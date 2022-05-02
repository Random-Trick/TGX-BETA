package p123ia;

import java.util.Collections;
import java.util.Map;
import p107ha.C5048h;
import qa.C8298k;

public class C5293g0 extends C5291f0 {
    public static final int m23436a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> m23435b(C5048h<? extends K, ? extends V> hVar) {
        C8298k.m12934e(hVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(hVar.m24194c(), hVar.m24193d());
        C8298k.m12935d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> m23434c(Map<? extends K, ? extends V> map) {
        C8298k.m12934e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C8298k.m12935d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
