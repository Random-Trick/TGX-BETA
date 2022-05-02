package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p126j$.util.Map;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.Function;
import p358z6.AbstractC11384o;

public abstract class AbstractC11401r<K, V> implements Map<K, V>, Serializable, p126j$.util.Map {
    public static final Map.Entry<?, ?>[] f36356M = new Map.Entry[0];
    @LazyInit
    public transient AbstractC11404s<Map.Entry<K, V>> f36357a;
    @RetainedWith
    @LazyInit
    public transient AbstractC11404s<K> f36358b;
    @RetainedWith
    @LazyInit
    public transient AbstractC11384o<V> f36359c;

    public static class C11402a<K, V> {
        @MonotonicNonNullDecl
        public Comparator<? super V> f36360a;
        public Object[] f36361b;
        public int f36362c;
        public boolean f36363d;

        public C11402a() {
            this(4);
        }

        public AbstractC11401r<K, V> m738a() {
            m733f();
            this.f36363d = true;
            return C11369j0.m812l(this.f36362c, this.f36361b);
        }

        public final void m737b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f36361b;
            if (i2 > objArr.length) {
                this.f36361b = Arrays.copyOf(objArr, AbstractC11384o.AbstractC11386b.m783a(objArr.length, i2));
                this.f36363d = false;
            }
        }

        @CanIgnoreReturnValue
        public C11402a<K, V> m736c(K k, V v) {
            m737b(this.f36362c + 1);
            C11363h.m820a(k, v);
            Object[] objArr = this.f36361b;
            int i = this.f36362c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f36362c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public C11402a<K, V> m735d(Map.Entry<? extends K, ? extends V> entry) {
            return m736c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public C11402a<K, V> m734e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m737b(this.f36362c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                m735d(entry);
            }
            return this;
        }

        public void m733f() {
            int i;
            if (this.f36360a != null) {
                if (this.f36363d) {
                    this.f36361b = Arrays.copyOf(this.f36361b, this.f36362c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f36362c];
                int i2 = 0;
                while (true) {
                    i = this.f36362c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f36361b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, AbstractC11362g0.m823a(this.f36360a).m821c(C11414y.m680j()));
                for (int i4 = 0; i4 < this.f36362c; i4++) {
                    int i5 = i4 * 2;
                    this.f36361b[i5] = entryArr[i4].getKey();
                    this.f36361b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        public C11402a(int i) {
            this.f36361b = new Object[i * 2];
            this.f36362c = 0;
            this.f36363d = false;
        }
    }

    public static <K, V> C11402a<K, V> m749a() {
        return new C11402a<>();
    }

    public static <K, V> AbstractC11401r<K, V> m748b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C11402a aVar = new C11402a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.m734e(iterable);
        return aVar.m738a();
    }

    public static <K, V> AbstractC11401r<K, V> m747c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC11401r) && !(map instanceof SortedMap)) {
            AbstractC11401r<K, V> rVar = (AbstractC11401r) map;
            if (!rVar.mo742h()) {
                return rVar;
            }
        }
        return m748b(map.entrySet());
    }

    public static <K, V> AbstractC11401r<K, V> m740j() {
        return (AbstractC11401r<K, V>) C11369j0.f36312Q;
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract AbstractC11404s<Map.Entry<K, V>> mo746d();

    public abstract AbstractC11404s<K> mo745e();

    @Override
    public boolean equals(@NullableDecl Object obj) {
        return C11414y.m687c(this, obj);
    }

    public abstract AbstractC11384o<V> mo744f();

    @Override
    public void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public AbstractC11404s<Map.Entry<K, V>> entrySet() {
        AbstractC11404s<Map.Entry<K, V>> sVar = this.f36357a;
        if (sVar != null) {
            return sVar;
        }
        AbstractC11404s<Map.Entry<K, V>> d = mo746d();
        this.f36357a = d;
        return d;
    }

    @Override
    public abstract V get(@NullableDecl Object obj);

    @Override
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public abstract boolean mo742h();

    @Override
    public int hashCode() {
        return C11387o0.m779d(entrySet());
    }

    public AbstractC11404s<K> keySet() {
        AbstractC11404s<K> sVar = this.f36358b;
        if (sVar != null) {
            return sVar;
        }
        AbstractC11404s<K> e = mo745e();
        this.f36358b = e;
        return e;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public AbstractC11384o<V> values() {
        AbstractC11384o<V> oVar = this.f36359c;
        if (oVar != null) {
            return oVar;
        }
        AbstractC11384o<V> f = mo744f();
        this.f36359c = f;
        return f;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object putIfAbsent(Object obj, Object obj2) {
        return get(obj);
    }

    @Override
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override
    public void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public String toString() {
        return C11414y.m681i(this);
    }
}
