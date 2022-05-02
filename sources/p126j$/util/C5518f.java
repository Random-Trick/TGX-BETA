package p126j$.util;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.Function;

public class C5518f implements Map, Serializable, Map {
    private final Map f18056a;
    final Object f18057b = this;
    private transient Set f18058c;
    private transient Set f18059d;
    private transient Collection f18060e;

    public C5518f(Map map) {
        Objects.requireNonNull(map);
        this.f18056a = map;
    }

    private Set m22503a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f17932f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f17932f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override
    public void clear() {
        synchronized (this.f18057b) {
            this.f18056a.clear();
        }
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        Object t;
        synchronized (this.f18057b) {
            t = AbstractC5485a.m22561t(this.f18056a, obj, biFunction);
        }
        return t;
    }

    @Override
    public Object compute(Object obj, java.util.function.BiFunction biFunction) {
        Object t;
        BiFunction convert = BiFunction.VivifiedWrapper.convert(biFunction);
        synchronized (this.f18057b) {
            t = AbstractC5485a.m22561t(this.f18056a, obj, convert);
        }
        return t;
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        Object u;
        synchronized (this.f18057b) {
            u = AbstractC5485a.m22560u(this.f18056a, obj, function);
        }
        return u;
    }

    @Override
    public Object computeIfAbsent(Object obj, java.util.function.Function function) {
        Object u;
        Function convert = Function.VivifiedWrapper.convert(function);
        synchronized (this.f18057b) {
            u = AbstractC5485a.m22560u(this.f18056a, obj, convert);
        }
        return u;
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object v;
        synchronized (this.f18057b) {
            v = AbstractC5485a.m22559v(this.f18056a, obj, biFunction);
        }
        return v;
    }

    @Override
    public Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        Object v;
        BiFunction convert = BiFunction.VivifiedWrapper.convert(biFunction);
        synchronized (this.f18057b) {
            v = AbstractC5485a.m22559v(this.f18056a, obj, convert);
        }
        return v;
    }

    @Override
    public boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f18057b) {
            containsKey = this.f18056a.containsKey(obj);
        }
        return containsKey;
    }

    @Override
    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f18057b) {
            containsValue = this.f18056a.containsValue(obj);
        }
        return containsValue;
    }

    @Override
    public Set entrySet() {
        Set set;
        synchronized (this.f18057b) {
            if (this.f18059d == null) {
                this.f18059d = m22503a(this.f18056a.entrySet(), this.f18057b);
            }
            set = this.f18059d;
        }
        return set;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18057b) {
            equals = this.f18056a.equals(obj);
        }
        return equals;
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        synchronized (this.f18057b) {
            AbstractC5485a.m22583C(this.f18056a, biConsumer);
        }
    }

    @Override
    public void forEach(java.util.function.BiConsumer biConsumer) {
        BiConsumer convert = BiConsumer.VivifiedWrapper.convert(biConsumer);
        synchronized (this.f18057b) {
            AbstractC5485a.m22583C(this.f18056a, convert);
        }
    }

    @Override
    public Object get(Object obj) {
        Object obj2;
        synchronized (this.f18057b) {
            obj2 = this.f18056a.get(obj);
        }
        return obj2;
    }

    @Override
    public Object getOrDefault(Object obj, Object obj2) {
        Object D;
        synchronized (this.f18057b) {
            D = AbstractC5485a.m22582D(this.f18056a, obj, obj2);
        }
        return D;
    }

    @Override
    public int hashCode() {
        int hashCode;
        synchronized (this.f18057b) {
            hashCode = this.f18056a.hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f18057b) {
            isEmpty = this.f18056a.isEmpty();
        }
        return isEmpty;
    }

    @Override
    public Set keySet() {
        Set set;
        synchronized (this.f18057b) {
            if (this.f18058c == null) {
                this.f18058c = m22503a(this.f18056a.keySet(), this.f18057b);
            }
            set = this.f18058c;
        }
        return set;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object E;
        synchronized (this.f18057b) {
            E = AbstractC5485a.m22581E(this.f18056a, obj, obj2, biFunction);
        }
        return E;
    }

    @Override
    public Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        Object E;
        BiFunction convert = BiFunction.VivifiedWrapper.convert(biFunction);
        synchronized (this.f18057b) {
            E = AbstractC5485a.m22581E(this.f18056a, obj, obj2, convert);
        }
        return E;
    }

    @Override
    public Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f18057b) {
            put = this.f18056a.put(obj, obj2);
        }
        return put;
    }

    @Override
    public void putAll(Map map) {
        synchronized (this.f18057b) {
            this.f18056a.putAll(map);
        }
    }

    @Override
    public Object putIfAbsent(Object obj, Object obj2) {
        Object F;
        synchronized (this.f18057b) {
            F = AbstractC5485a.m22580F(this.f18056a, obj, obj2);
        }
        return F;
    }

    @Override
    public Object remove(Object obj) {
        Object remove;
        synchronized (this.f18057b) {
            remove = this.f18056a.remove(obj);
        }
        return remove;
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        boolean G;
        synchronized (this.f18057b) {
            G = AbstractC5485a.m22579G(this.f18056a, obj, obj2);
        }
        return G;
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        Object H;
        synchronized (this.f18057b) {
            H = AbstractC5485a.m22578H(this.f18056a, obj, obj2);
        }
        return H;
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        boolean I;
        synchronized (this.f18057b) {
            I = AbstractC5485a.m22577I(this.f18056a, obj, obj2, obj3);
        }
        return I;
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        synchronized (this.f18057b) {
            AbstractC5485a.m22576J(this.f18056a, biFunction);
        }
    }

    @Override
    public void replaceAll(java.util.function.BiFunction biFunction) {
        BiFunction convert = BiFunction.VivifiedWrapper.convert(biFunction);
        synchronized (this.f18057b) {
            AbstractC5485a.m22576J(this.f18056a, convert);
        }
    }

    @Override
    public int size() {
        int size;
        synchronized (this.f18057b) {
            size = this.f18056a.size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f18057b) {
            obj = this.f18056a.toString();
        }
        return obj;
    }

    @Override
    public Collection values() {
        Collection collection;
        Constructor constructor;
        Throwable e;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f18057b) {
            if (this.f18060e == null) {
                Collection values = this.f18056a.values();
                Object obj = this.f18057b;
                constructor = DesugarCollections.f17931e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f17931e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f18060e = collection2;
            }
            collection = this.f18060e;
        }
        return collection;
    }
}
