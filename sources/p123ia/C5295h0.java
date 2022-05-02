package p123ia;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p107ha.C5048h;
import qa.C8298k;

public class C5295h0 extends C5293g0 {
    public static final <K, V> Map<K, V> m23424d() {
        return C5316y.f17492a;
    }

    public static final <K, V> Map<K, V> m23423e(C5048h<? extends K, ? extends V>... hVarArr) {
        C8298k.m12933e(hVarArr, "pairs");
        return hVarArr.length > 0 ? m23415m(hVarArr, new LinkedHashMap(C5293g0.m23437a(hVarArr.length))) : m23424d();
    }

    public static final <K, V> Map<K, V> m23422f(C5048h<? extends K, ? extends V>... hVarArr) {
        C8298k.m12933e(hVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5293g0.m23437a(hVarArr.length));
        m23419i(linkedHashMap, hVarArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> m23421g(Map<K, ? extends V> map) {
        C8298k.m12933e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : C5293g0.m23435c(map);
        }
        return m23424d();
    }

    public static final <K, V> void m23420h(Map<? super K, ? super V> map, Iterable<? extends C5048h<? extends K, ? extends V>> iterable) {
        C8298k.m12933e(map, "<this>");
        C8298k.m12933e(iterable, "pairs");
        for (C5048h<? extends K, ? extends V> hVar : iterable) {
            map.put((K) hVar.m24197a(), (V) hVar.m24196b());
        }
    }

    public static final <K, V> void m23419i(Map<? super K, ? super V> map, C5048h<? extends K, ? extends V>[] hVarArr) {
        C8298k.m12933e(map, "<this>");
        C8298k.m12933e(hVarArr, "pairs");
        int length = hVarArr.length;
        int i = 0;
        while (i < length) {
            C5048h<? extends K, ? extends V> hVar = hVarArr[i];
            i++;
            map.put((K) hVar.m24197a(), (V) hVar.m24196b());
        }
    }

    public static final <K, V> Map<K, V> m23418j(Iterable<? extends C5048h<? extends K, ? extends V>> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m23421g(m23417k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m23424d();
        }
        if (size != 1) {
            return m23417k(iterable, new LinkedHashMap(C5293g0.m23437a(collection.size())));
        }
        return C5293g0.m23436b(iterable instanceof List ? (C5048h<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m23417k(Iterable<? extends C5048h<? extends K, ? extends V>> iterable, M m) {
        C8298k.m12933e(iterable, "<this>");
        C8298k.m12933e(m, "destination");
        m23420h(m, iterable);
        return m;
    }

    public static final <K, V> Map<K, V> m23416l(Map<? extends K, ? extends V> map) {
        C8298k.m12933e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m23424d();
        }
        if (size != 1) {
            return m23414n(map);
        }
        return C5293g0.m23435c(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m23415m(C5048h<? extends K, ? extends V>[] hVarArr, M m) {
        C8298k.m12933e(hVarArr, "<this>");
        C8298k.m12933e(m, "destination");
        m23419i(m, hVarArr);
        return m;
    }

    public static final <K, V> Map<K, V> m23414n(Map<? extends K, ? extends V> map) {
        C8298k.m12933e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
