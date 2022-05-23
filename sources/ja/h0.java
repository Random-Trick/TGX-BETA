package ja;

import ia.h;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ra.k;

public class h0 extends g0 {
    public static final <K, V> Map<K, V> d() {
        return y.f15179a;
    }

    public static final <K, V> Map<K, V> e(h<? extends K, ? extends V>... hVarArr) {
        k.e(hVarArr, "pairs");
        return hVarArr.length > 0 ? m(hVarArr, new LinkedHashMap(g0.a(hVarArr.length))) : d();
    }

    public static final <K, V> Map<K, V> f(h<? extends K, ? extends V>... hVarArr) {
        k.e(hVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.a(hVarArr.length));
        i(linkedHashMap, hVarArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        k.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : g0.c(map);
        }
        return d();
    }

    public static final <K, V> void h(Map<? super K, ? super V> map, Iterable<? extends h<? extends K, ? extends V>> iterable) {
        k.e(map, "<this>");
        k.e(iterable, "pairs");
        for (h<? extends K, ? extends V> hVar : iterable) {
            map.put((K) hVar.a(), (V) hVar.b());
        }
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, h<? extends K, ? extends V>[] hVarArr) {
        k.e(map, "<this>");
        k.e(hVarArr, "pairs");
        for (h<? extends K, ? extends V> hVar : hVarArr) {
            map.put((K) hVar.a(), (V) hVar.b());
        }
    }

    public static final <K, V> Map<K, V> j(Iterable<? extends h<? extends K, ? extends V>> iterable) {
        k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return k(iterable, new LinkedHashMap(g0.a(collection.size())));
        }
        return g0.b(iterable instanceof List ? (h<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M k(Iterable<? extends h<? extends K, ? extends V>> iterable, M m10) {
        k.e(iterable, "<this>");
        k.e(m10, "destination");
        h(m10, iterable);
        return m10;
    }

    public static final <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        k.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return n(map);
        }
        return g0.c(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(h<? extends K, ? extends V>[] hVarArr, M m10) {
        k.e(hVarArr, "<this>");
        k.e(m10, "destination");
        i(m10, hVarArr);
        return m10;
    }

    public static final <K, V> Map<K, V> n(Map<? extends K, ? extends V> map) {
        k.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
