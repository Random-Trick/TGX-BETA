package j$.util;

import j$.util.Comparator;
import j$.util.Map;
import j$.util.concurrent.v;
import j$.util.concurrent.w;
import j$.util.function.AbstractC0278f;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0274b;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.Function;
import j$.util.function.n;
import j$.util.stream.AbstractC0310d3;
import j$.util.stream.E0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;

public abstract class AbstractC0264a {
    public static Object A(Map map, Object obj, Object obj2, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map) map).merge(obj, obj2, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(obj2);
        while (true) {
            Object obj3 = concurrentMap.get(obj);
            while (obj3 == null) {
                obj3 = concurrentMap.putIfAbsent(obj, obj2);
                if (obj3 == null) {
                    return obj2;
                }
            }
            Object v10 = biFunction.v(obj3, obj2);
            if (v10 != null) {
                if (concurrentMap.replace(obj, obj3, v10)) {
                    return v10;
                }
            } else if (concurrentMap.remove(obj, obj3)) {
                return null;
            }
        }
    }

    public static Object B(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static boolean C(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
    }

    public static Object D(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
    }

    public static boolean E(java.util.Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
    }

    public static void F(java.util.Map map, final BiFunction biFunction) {
        if (map instanceof Map) {
            ((Map) map).replaceAll(biFunction);
        } else if (map instanceof ConcurrentMap) {
            final ConcurrentMap concurrentMap = (ConcurrentMap) map;
            Objects.requireNonNull(biFunction);
            BiConsumer uVar = new BiConsumer() {
                @Override
                public final void q(Object obj, Object obj2) {
                    ConcurrentMap concurrentMap2 = concurrentMap;
                    BiFunction biFunction2 = biFunction;
                    while (!concurrentMap2.replace(obj, obj2, biFunction2.v(obj, obj2)) && (obj2 = concurrentMap2.get(obj)) != null) {
                    }
                }
            };
            if (concurrentMap instanceof w) {
                ((w) concurrentMap).forEach(uVar);
            } else {
                v.a(concurrentMap, uVar);
            }
        } else {
            Map.CC.$default$replaceAll(map, biFunction);
        }
    }

    public static H G(Collection collection) {
        if (collection instanceof AbstractC0265b) {
            return ((AbstractC0265b) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            Objects.requireNonNull(linkedHashSet);
            return new U(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C0416x(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            Objects.requireNonNull(set);
            return new U(set, 1);
        } else if (collection instanceof List) {
            List list = (List) collection;
            Objects.requireNonNull(list);
            return new U(list, 16);
        } else {
            Objects.requireNonNull(collection);
            return new U(collection, 0);
        }
    }

    public static Comparator H(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static void b(AbstractC0289q qVar, Consumer consumer) {
        if (consumer instanceof AbstractC0278f) {
            ((L) qVar).forEachRemaining((AbstractC0278f) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f14360a) {
            L l10 = (L) qVar;
            while (l10.hasNext()) {
                consumer.l(Double.valueOf(l10.nextDouble()));
            }
            return;
        }
        Y.a(qVar.getClass(), "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    public static void c(z zVar, Consumer consumer) {
        if (consumer instanceof AbstractC0278f) {
            zVar.m((AbstractC0278f) consumer);
        } else if (!Y.f14360a) {
            Objects.requireNonNull(consumer);
            zVar.m(new C0287o(consumer));
        } else {
            Y.a(zVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    public static void d(B b10, Consumer consumer) {
        if (consumer instanceof n) {
            b10.n((n) consumer);
        } else if (!Y.f14360a) {
            Objects.requireNonNull(consumer);
            b10.n(new r(consumer));
        } else {
            Y.a(b10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    public static void e(D d10, Consumer consumer) {
        if (consumer instanceof j$.util.function.v) {
            d10.f((j$.util.function.v) consumer);
        } else if (!Y.f14360a) {
            Objects.requireNonNull(consumer);
            d10.f(new C0413u(consumer));
        } else {
            Y.a(d10.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    public static long h(H h10) {
        if ((h10.characteristics() & 64) == 0) {
            return -1L;
        }
        return h10.estimateSize();
    }

    public static boolean k(H h10, int i10) {
        return (h10.characteristics() & i10) == i10;
    }

    public static AbstractC0310d3 l(Collection collection) {
        return E0.t0(G(collection), true);
    }

    public static boolean o(Collection collection, E e10) {
        if (DesugarCollections.f14314a.isInstance(collection)) {
            return DesugarCollections.c(collection, e10);
        }
        Objects.requireNonNull(e10);
        boolean z10 = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((C0274b) e10).n(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static AbstractC0310d3 p(Collection collection) {
        return E0.t0(G(collection), false);
    }

    public static boolean q(z zVar, Consumer consumer) {
        if (consumer instanceof AbstractC0278f) {
            return zVar.j((AbstractC0278f) consumer);
        }
        if (!Y.f14360a) {
            Objects.requireNonNull(consumer);
            return zVar.j(new C0287o(consumer));
        }
        Y.a(zVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean r(B b10, Consumer consumer) {
        if (consumer instanceof n) {
            return b10.i((n) consumer);
        }
        if (!Y.f14360a) {
            Objects.requireNonNull(consumer);
            return b10.i(new r(consumer));
        }
        Y.a(b10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean s(D d10, Consumer consumer) {
        if (consumer instanceof j$.util.function.v) {
            return d10.g((j$.util.function.v) consumer);
        }
        if (!Y.f14360a) {
            Objects.requireNonNull(consumer);
            return d10.g(new C0413u(consumer));
        }
        Y.a(d10.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static Object t(java.util.Map map, Object obj, BiFunction biFunction) {
        Object v10;
        if (map instanceof Map) {
            return ((Map) map).compute(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$compute(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        loop0: while (true) {
            Object obj2 = concurrentMap.get(obj);
            while (true) {
                v10 = biFunction.v(obj, obj2);
                if (v10 != null) {
                    if (obj2 == null) {
                        obj2 = concurrentMap.putIfAbsent(obj, v10);
                        if (obj2 == null) {
                            break loop0;
                        }
                    } else if (concurrentMap.replace(obj, obj2, v10)) {
                        break;
                    }
                } else {
                    v10 = null;
                    if ((obj2 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj2)) {
                        break;
                    }
                }
            }
        }
        return v10;
    }

    public static Object u(java.util.Map map, Object obj, Function function) {
        Object a10;
        if (map instanceof Map) {
            return ((Map) map).computeIfAbsent(obj, function);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfAbsent(map, obj, function);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(function);
        Object obj2 = concurrentMap.get(obj);
        return (obj2 == null && (a10 = function.a(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, a10)) == null) ? a10 : obj2;
    }

    public static Object v(java.util.Map map, Object obj, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map) map).computeIfPresent(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return obj2;
            }
            Object v10 = biFunction.v(obj, obj2);
            if (v10 != null) {
                if (concurrentMap.replace(obj, obj2, v10)) {
                    return v10;
                }
            } else if (concurrentMap.remove(obj, obj2)) {
                return null;
            }
        }
    }

    public static boolean w(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void x(Collection collection, Consumer consumer) {
        if (collection instanceof AbstractC0265b) {
            ((AbstractC0265b) collection).a(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.l(obj);
        }
    }

    public static void y(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            v.a((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static Object z(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).getOrDefault(obj, obj2);
        }
        if (map instanceof ConcurrentMap) {
            Object obj3 = ((ConcurrentMap) map).get(obj);
            return obj3 != null ? obj3 : obj2;
        }
        Object obj4 = map.get(obj);
        return (obj4 != null || map.containsKey(obj)) ? obj4 : obj2;
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public H trySplit() {
        return null;
    }
}
