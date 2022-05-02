package p123ia;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p107ha.C5048h;
import qa.C8298k;

public class C5295h0 extends C5293g0 {
    public static final <K, V> Map<K, V> m23423d() {
        return C5316y.f17492a;
    }

    public static final <K, V> Map<K, V> m23422e(C5048h<? extends K, ? extends V>... hVarArr) {
        C8298k.m12934e(hVarArr, "pairs");
        return hVarArr.length > 0 ? m23414m(hVarArr, new LinkedHashMap(C5293g0.m23436a(hVarArr.length))) : m23423d();
    }

    public static final <K, V> Map<K, V> m23421f(C5048h<? extends K, ? extends V>... hVarArr) {
        C8298k.m12934e(hVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5293g0.m23436a(hVarArr.length));
        m23418i(linkedHashMap, hVarArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> m23420g(Map<K, ? extends V> map) {
        C8298k.m12934e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : C5293g0.m23434c(map);
        }
        return m23423d();
    }

    public static final <K, V> void m23419h(Map<? super K, ? super V> map, Iterable<? extends C5048h<? extends K, ? extends V>> iterable) {
        C8298k.m12934e(map, "<this>");
        C8298k.m12934e(iterable, "pairs");
        for (C5048h<? extends K, ? extends V> hVar : iterable) {
            map.put((K) hVar.m24196a(), (V) hVar.m24195b());
        }
    }

    public static final <K, V> void m23418i(Map<? super K, ? super V> map, C5048h<? extends K, ? extends V>[] hVarArr) {
        C8298k.m12934e(map, "<this>");
        C8298k.m12934e(hVarArr, "pairs");
        int length = hVarArr.length;
        int i = 0;
        while (i < length) {
            C5048h<? extends K, ? extends V> hVar = hVarArr[i];
            i++;
            map.put((K) hVar.m24196a(), (V) hVar.m24195b());
        }
    }

    public static final <K, V> Map<K, V> m23417j(Iterable<? extends C5048h<? extends K, ? extends V>> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m23420g(m23416k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m23423d();
        }
        if (size != 1) {
            return m23416k(iterable, new LinkedHashMap(C5293g0.m23436a(collection.size())));
        }
        return C5293g0.m23435b(iterable instanceof List ? (C5048h<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m23416k(Iterable<? extends C5048h<? extends K, ? extends V>> iterable, M m) {
        C8298k.m12934e(iterable, "<this>");
        C8298k.m12934e(m, "destination");
        m23419h(m, iterable);
        return m;
    }

    public static final <K, V> Map<K, V> m23415l(Map<? extends K, ? extends V> map) {
        C8298k.m12934e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m23423d();
        }
        if (size != 1) {
            return m23413n(map);
        }
        return C5293g0.m23434c(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m23414m(C5048h<? extends K, ? extends V>[] hVarArr, M m) {
        C8298k.m12934e(hVarArr, "<this>");
        C8298k.m12934e(m, "destination");
        m23418i(m, hVarArr);
        return m;
    }

    public static final <K, V> Map<K, V> m23413n(Map<? extends K, ? extends V> map) {
        C8298k.m12934e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
