package a7;

import a7.o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableMap.of or another implementation")
public abstract class r<K, V> implements Map<K, V>, Serializable, j$.util.Map {
    public static final Map.Entry<?, ?>[] M = new Map.Entry[0];
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient s<Map.Entry<K, V>> f656a;
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient s<K> f657b;
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient o<V> f658c;

    @DoNotMock
    public static class a<K, V> {
        @CheckForNull
        public Comparator<? super V> f659a;
        public Object[] f660b;
        public int f661c;
        public boolean f662d;

        public a() {
            this(4);
        }

        public r<K, V> a() {
            return b();
        }

        public r<K, V> b() {
            g();
            this.f662d = true;
            return k0.l(this.f661c, this.f660b);
        }

        public final void c(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f660b;
            if (i11 > objArr.length) {
                this.f660b = Arrays.copyOf(objArr, o.b.c(objArr.length, i11));
                this.f662d = false;
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> d(K k10, V v10) {
            c(this.f661c + 1);
            h.a(k10, v10);
            Object[] objArr = this.f660b;
            int i10 = this.f661c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f661c = i10 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            return d(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                c(this.f661c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                e(entry);
            }
            return this;
        }

        public void g() {
            int i10;
            if (this.f659a != null) {
                if (this.f662d) {
                    this.f660b = Arrays.copyOf(this.f660b, this.f661c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f661c];
                int i11 = 0;
                while (true) {
                    i10 = this.f661c;
                    if (i11 >= i10) {
                        break;
                    }
                    int i12 = i11 * 2;
                    Object obj = this.f660b[i12];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.f660b[i12 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, h0.a(this.f659a).c(y.j()));
                for (int i13 = 0; i13 < this.f661c; i13++) {
                    int i14 = i13 * 2;
                    this.f660b[i14] = entryArr[i13].getKey();
                    this.f660b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        public a(int i10) {
            this.f660b = new Object[i10 * 2];
            this.f661c = 0;
            this.f662d = false;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> r<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.f(iterable);
        return aVar.a();
    }

    public static <K, V> r<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof r) && !(map instanceof SortedMap)) {
            r<K, V> rVar = (r) map;
            if (!rVar.h()) {
                return rVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> r<K, V> j() {
        return (r<K, V>) k0.Q;
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
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
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract s<Map.Entry<K, V>> d();

    public abstract s<K> e();

    @Override
    public boolean equals(@CheckForNull Object obj) {
        return y.c(this, obj);
    }

    public abstract o<V> f();

    @Override
    public void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public s<Map.Entry<K, V>> entrySet() {
        s<Map.Entry<K, V>> sVar = this.f656a;
        if (sVar != null) {
            return sVar;
        }
        s<Map.Entry<K, V>> d10 = d();
        this.f656a = d10;
        return d10;
    }

    @Override
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public abstract boolean h();

    @Override
    public int hashCode() {
        return p0.d(entrySet());
    }

    public s<K> keySet() {
        s<K> sVar = this.f657b;
        if (sVar != null) {
            return sVar;
        }
        s<K> e10 = e();
        this.f657b = e10;
        return e10;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public o<V> values() {
        o<V> oVar = this.f658c;
        if (oVar != null) {
            return oVar;
        }
        o<V> f10 = f();
        this.f658c = f10;
        return f10;
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
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
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
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
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
        return y.i(this);
    }
}
