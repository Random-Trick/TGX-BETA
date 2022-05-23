package j$.util;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class C0272f implements Map, Serializable, Map {
    private final Map f14444a;
    final Object f14445b = this;
    private transient Set f14446c;
    private transient Set f14447d;
    private transient Collection f14448e;

    public C0272f(Map map) {
        Objects.requireNonNull(map);
        this.f14444a = map;
    }

    private Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f14319f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f14319f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new Error("Unable to instantiate a synchronized list.", e10);
        }
    }

    @Override
    public final void clear() {
        synchronized (this.f14445b) {
            this.f14444a.clear();
        }
    }

    @Override
    public final Object compute(Object obj, BiFunction biFunction) {
        Object t10;
        synchronized (this.f14445b) {
            t10 = AbstractC0264a.t(this.f14444a, obj, biFunction);
        }
        return t10;
    }

    @Override
    public final Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public final Object computeIfAbsent(Object obj, Function function) {
        Object u10;
        synchronized (this.f14445b) {
            u10 = AbstractC0264a.u(this.f14444a, obj, function);
        }
        return u10;
    }

    @Override
    public final Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object v10;
        synchronized (this.f14445b) {
            v10 = AbstractC0264a.v(this.f14444a, obj, biFunction);
        }
        return v10;
    }

    @Override
    public final Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f14445b) {
            containsKey = this.f14444a.containsKey(obj);
        }
        return containsKey;
    }

    @Override
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f14445b) {
            containsValue = this.f14444a.containsValue(obj);
        }
        return containsValue;
    }

    @Override
    public final Set entrySet() {
        Set set;
        synchronized (this.f14445b) {
            if (this.f14447d == null) {
                this.f14447d = a(this.f14444a.entrySet(), this.f14445b);
            }
            set = this.f14447d;
        }
        return set;
    }

    @Override
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f14445b) {
            equals = this.f14444a.equals(obj);
        }
        return equals;
    }

    @Override
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f14445b) {
            AbstractC0264a.y(this.f14444a, biConsumer);
        }
    }

    @Override
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f14445b) {
            obj2 = this.f14444a.get(obj);
        }
        return obj2;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object z10;
        synchronized (this.f14445b) {
            z10 = AbstractC0264a.z(this.f14444a, obj, obj2);
        }
        return z10;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        synchronized (this.f14445b) {
            hashCode = this.f14444a.hashCode();
        }
        return hashCode;
    }

    @Override
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f14445b) {
            isEmpty = this.f14444a.isEmpty();
        }
        return isEmpty;
    }

    @Override
    public final Set keySet() {
        Set set;
        synchronized (this.f14445b) {
            if (this.f14446c == null) {
                this.f14446c = a(this.f14444a.keySet(), this.f14445b);
            }
            set = this.f14446c;
        }
        return set;
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object A;
        synchronized (this.f14445b) {
            A = AbstractC0264a.A(this.f14444a, obj, obj2, biFunction);
        }
        return A;
    }

    @Override
    public final Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f14445b) {
            put = this.f14444a.put(obj, obj2);
        }
        return put;
    }

    @Override
    public final void putAll(Map map) {
        synchronized (this.f14445b) {
            this.f14444a.putAll(map);
        }
    }

    @Override
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object B;
        synchronized (this.f14445b) {
            B = AbstractC0264a.B(this.f14444a, obj, obj2);
        }
        return B;
    }

    @Override
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f14445b) {
            remove = this.f14444a.remove(obj);
        }
        return remove;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        boolean C;
        synchronized (this.f14445b) {
            C = AbstractC0264a.C(this.f14444a, obj, obj2);
        }
        return C;
    }

    @Override
    public final Object replace(Object obj, Object obj2) {
        Object D;
        synchronized (this.f14445b) {
            D = AbstractC0264a.D(this.f14444a, obj, obj2);
        }
        return D;
    }

    @Override
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean E;
        synchronized (this.f14445b) {
            E = AbstractC0264a.E(this.f14444a, obj, obj2, obj3);
        }
        return E;
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f14445b) {
            AbstractC0264a.F(this.f14444a, biFunction);
        }
    }

    @Override
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public final int size() {
        int size;
        synchronized (this.f14445b) {
            size = this.f14444a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f14445b) {
            obj = this.f14444a.toString();
        }
        return obj;
    }

    @Override
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Throwable e10;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f14445b) {
            if (this.f14448e == null) {
                Collection values = this.f14444a.values();
                Object obj = this.f14445b;
                constructor = DesugarCollections.f14318e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f14318e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e11) {
                        e10 = e11;
                        throw new Error("Unable to instantiate a synchronized list.", e10);
                    } catch (InstantiationException e12) {
                        e10 = e12;
                        throw new Error("Unable to instantiate a synchronized list.", e10);
                    } catch (InvocationTargetException e13) {
                        e10 = e13;
                        throw new Error("Unable to instantiate a synchronized list.", e10);
                    }
                }
                this.f14448e = collection2;
            }
            collection = this.f14448e;
        }
        return collection;
    }
}
