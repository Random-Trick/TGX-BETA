package j$.util;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public interface Map<K, V> {

    public final class CC<K, V> {
        public static Object $default$compute(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            Object v10 = biFunction.v(obj, obj2);
            if (v10 != null) {
                map.put(obj, v10);
                return v10;
            } else if (obj2 == null && !map.containsKey(obj)) {
                return null;
            } else {
                map.remove(obj);
                return null;
            }
        }

        public static Object $default$computeIfAbsent(java.util.Map map, Object obj, Function function) {
            Object a10;
            Objects.requireNonNull(function);
            Object obj2 = map.get(obj);
            if (obj2 != null || (a10 = function.a(obj)) == null) {
                return obj2;
            }
            map.put(obj, a10);
            return a10;
        }

        public static Object $default$computeIfPresent(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                Object v10 = biFunction.v(obj, obj2);
                if (v10 != null) {
                    map.put(obj, v10);
                    return v10;
                }
                map.remove(obj);
            }
            return null;
        }

        public static void $default$forEach(java.util.Map map, BiConsumer biConsumer) {
            Objects.requireNonNull(biConsumer);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    biConsumer.q(entry.getKey(), entry.getValue());
                } catch (IllegalStateException e10) {
                    throw new ConcurrentModificationException(e10);
                }
            }
        }

        public static Object $default$merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Objects.requireNonNull(obj2);
            Object obj3 = map.get(obj);
            if (obj3 != null) {
                obj2 = biFunction.v(obj3, obj2);
            }
            if (obj2 == null) {
                map.remove(obj);
            } else {
                map.put(obj, obj2);
            }
            return obj2;
        }

        public static Object $default$putIfAbsent(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return obj3 == null ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$remove(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            if (!AbstractC0264a.w(obj3, obj2)) {
                return false;
            }
            if (obj3 == null && !map.containsKey(obj)) {
                return false;
            }
            map.remove(obj);
            return true;
        }

        public static Object $default$replace(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$replace(java.util.Map map, Object obj, Object obj2, Object obj3) {
            Object obj4 = map.get(obj);
            if (!AbstractC0264a.w(obj4, obj2)) {
                return false;
            }
            if (obj4 == null && !map.containsKey(obj)) {
                return false;
            }
            map.put(obj, obj3);
            return true;
        }

        public static void $default$replaceAll(java.util.Map map, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue((V) biFunction.v(entry.getKey(), entry.getValue()));
                    } catch (IllegalStateException e10) {
                        throw new ConcurrentModificationException(e10);
                    }
                } catch (IllegalStateException e11) {
                    throw new ConcurrentModificationException(e11);
                }
            }
        }
    }

    public interface Entry<K, V> {
        boolean equals(Object obj);

        K getKey();

        V getValue();

        int hashCode();

        V setValue(V v10);
    }

    void clear();

    V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction);

    V computeIfAbsent(K k10, Function<? super K, ? extends V> function);

    V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Set<Map.Entry<K, V>> entrySet();

    boolean equals(Object obj);

    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    V get(Object obj);

    V getOrDefault(Object obj, V v10);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction);

    V put(K k10, V v10);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    V putIfAbsent(K k10, V v10);

    V remove(Object obj);

    boolean remove(Object obj, Object obj2);

    V replace(K k10, V v10);

    boolean replace(K k10, V v10, V v11);

    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);

    int size();

    Collection<V> values();
}
