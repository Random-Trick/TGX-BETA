package p126j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import p126j$.util.Comparator;
import p126j$.util.Map;
import p126j$.util.concurrent.AbstractC5490a;
import p126j$.util.concurrent.AbstractC5511v;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.Consumer;
import p126j$.util.function.Function;
import p126j$.util.stream.AbstractC5572D0;
import p126j$.util.stream.AbstractC5690c3;

public abstract class AbstractC5485a {
    public static boolean m22585A(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void m22584B(Collection collection, Consumer consumer) {
        if (collection instanceof AbstractC5486b) {
            ((AbstractC5486b) collection).mo22509a(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.mo22128k(obj);
        }
    }

    public static void m22583C(Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            AbstractC5490a.m22524a((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static Object m22582D(java.util.Map map, Object obj, Object obj2) {
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

    public static Object m22581E(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
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
            Object u = biFunction.mo22172u(obj3, obj2);
            if (u != null) {
                if (concurrentMap.replace(obj, obj3, u)) {
                    return u;
                }
            } else if (concurrentMap.remove(obj, obj3)) {
                return null;
            }
        }
    }

    public static Object m22580F(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static boolean m22579G(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
    }

    public static Object m22578H(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
    }

    public static boolean m22577I(java.util.Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
    }

    public static void m22576J(java.util.Map map, final BiFunction biFunction) {
        if (map instanceof Map) {
            ((Map) map).replaceAll(biFunction);
        } else if (map instanceof ConcurrentMap) {
            final ConcurrentMap concurrentMap = (ConcurrentMap) map;
            Objects.requireNonNull(biFunction);
            BiConsumer uVar = new BiConsumer() {
                @Override
                public final void mo22179p(Object obj, Object obj2) {
                    ConcurrentMap concurrentMap2 = concurrentMap;
                    BiFunction biFunction2 = biFunction;
                    while (!concurrentMap2.replace(obj, obj2, biFunction2.mo22172u(obj, obj2)) && (obj2 = concurrentMap2.get(obj)) != null) {
                    }
                }
            };
            if (concurrentMap instanceof AbstractC5511v) {
                ((AbstractC5511v) concurrentMap).forEach(uVar);
            } else {
                AbstractC5490a.m22524a(concurrentMap, uVar);
            }
        } else {
            Map.CC.$default$replaceAll(map, biFunction);
        }
    }

    public static AbstractC5468G m22575K(Collection collection) {
        if (collection instanceof AbstractC5486b) {
            return ((AbstractC5486b) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            Objects.requireNonNull(linkedHashSet);
            return new C5480T(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C5809w(sortedSet, sortedSet, 21);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            Objects.requireNonNull(set);
            return new C5480T(set, 1);
        } else if (collection instanceof List) {
            List list = (List) collection;
            Objects.requireNonNull(list);
            return new C5480T(list, 16);
        } else {
            Objects.requireNonNull(collection);
            return new C5480T(collection, 0);
        }
    }

    public static Comparator m22574L(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static void m22573b(AbstractC5552p pVar, Consumer consumer) {
        if (consumer instanceof AbstractC5525g) {
            ((C5472K) pVar).m22600a((AbstractC5525g) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!AbstractC5484X.f17972a) {
            C5472K k = (C5472K) pVar;
            while (k.hasNext()) {
                consumer.mo22128k(Double.valueOf(k.nextDouble()));
            }
            return;
        }
        AbstractC5484X.m22586a(pVar.getClass(), "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    public static void m22572c(AbstractC5811y yVar, Consumer consumer) {
        if (consumer instanceof AbstractC5525g) {
            yVar.mo22122m((AbstractC5525g) consumer);
        } else if (!AbstractC5484X.f17972a) {
            Objects.requireNonNull(consumer);
            yVar.mo22122m(new C5550n(consumer));
        } else {
            AbstractC5484X.m22586a(yVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    public static void m22571d(AbstractC5462A a, Consumer consumer) {
        if (consumer instanceof AbstractC5530l) {
            a.mo22180n((AbstractC5530l) consumer);
        } else if (!AbstractC5484X.f17972a) {
            Objects.requireNonNull(consumer);
            a.mo22180n(new C5553q(consumer));
        } else {
            AbstractC5484X.m22586a(a.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    public static void m22570e(AbstractC5464C c, Consumer consumer) {
        if (consumer instanceof AbstractC5535q) {
            c.mo22166f((AbstractC5535q) consumer);
        } else if (!AbstractC5484X.f17972a) {
            Objects.requireNonNull(consumer);
            c.mo22166f(new C5806t(consumer));
        } else {
            AbstractC5484X.m22586a(c.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    public static long m22569h(AbstractC5468G g) {
        if ((g.characteristics() & 64) == 0) {
            return -1L;
        }
        return g.estimateSize();
    }

    public static boolean m22568j(AbstractC5468G g, int i) {
        return (g.characteristics() & i) == i;
    }

    public static AbstractC5690c3 m22567k(Collection collection) {
        return AbstractC5572D0.m22407p0(m22575K(collection), true);
    }

    public static boolean m22566o(Collection collection, AbstractC5541w wVar) {
        if (DesugarCollections.f17927a.isInstance(collection)) {
            return DesugarCollections.m22606c(collection, wVar);
        }
        Objects.requireNonNull(wVar);
        boolean z = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (wVar.mo22210n(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static AbstractC5690c3 m22565p(Collection collection) {
        return AbstractC5572D0.m22407p0(m22575K(collection), false);
    }

    public static boolean m22564q(AbstractC5811y yVar, Consumer consumer) {
        if (consumer instanceof AbstractC5525g) {
            return yVar.mo22123l((AbstractC5525g) consumer);
        }
        if (!AbstractC5484X.f17972a) {
            Objects.requireNonNull(consumer);
            return yVar.mo22123l(new C5550n(consumer));
        }
        AbstractC5484X.m22586a(yVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean m22563r(AbstractC5462A a, Consumer consumer) {
        if (consumer instanceof AbstractC5530l) {
            return a.mo22181i((AbstractC5530l) consumer);
        }
        if (!AbstractC5484X.f17972a) {
            Objects.requireNonNull(consumer);
            return a.mo22181i(new C5553q(consumer));
        }
        AbstractC5484X.m22586a(a.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean m22562s(AbstractC5464C c, Consumer consumer) {
        if (consumer instanceof AbstractC5535q) {
            return c.mo22165g((AbstractC5535q) consumer);
        }
        if (!AbstractC5484X.f17972a) {
            Objects.requireNonNull(consumer);
            return c.mo22165g(new C5806t(consumer));
        }
        AbstractC5484X.m22586a(c.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static Object m22561t(java.util.Map map, Object obj, BiFunction biFunction) {
        Object u;
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
                u = biFunction.mo22172u(obj, obj2);
                if (u != null) {
                    if (obj2 == null) {
                        obj2 = concurrentMap.putIfAbsent(obj, u);
                        if (obj2 == null) {
                            break loop0;
                        }
                    } else if (concurrentMap.replace(obj, obj2, u)) {
                        break;
                    }
                } else {
                    u = null;
                    if ((obj2 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj2)) {
                        break;
                    }
                }
            }
        }
        return u;
    }

    public static Object m22560u(java.util.Map map, Object obj, Function function) {
        Object a;
        if (map instanceof Map) {
            return ((Map) map).computeIfAbsent(obj, function);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfAbsent(map, obj, function);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(function);
        Object obj2 = concurrentMap.get(obj);
        return (obj2 == null && (a = function.mo22502a(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, a)) == null) ? a : obj2;
    }

    public static Object m22559v(java.util.Map map, Object obj, BiFunction biFunction) {
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
            Object u = biFunction.mo22172u(obj, obj2);
            if (u != null) {
                if (concurrentMap.replace(obj, obj2, u)) {
                    return u;
                }
            } else if (concurrentMap.remove(obj, obj2)) {
                return null;
            }
        }
    }

    public static Optional m22558w(C5546j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.m22475c() ? Optional.of(jVar.m22476b()) : Optional.empty();
    }

    public static OptionalDouble m22557x(C5547k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.m22471c() ? OptionalDouble.of(kVar.m22472b()) : OptionalDouble.empty();
    }

    public static OptionalInt m22556y(C5548l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar.m22467c() ? OptionalInt.of(lVar.m22468b()) : OptionalInt.empty();
    }

    public static OptionalLong m22555z(C5549m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.m22463c() ? OptionalLong.of(mVar.m22464b()) : OptionalLong.empty();
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

    public AbstractC5468G trySplit() {
        return null;
    }
}
