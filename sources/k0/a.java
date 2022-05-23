package k0;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V>, j$.util.Map {
    public a<K, V>.C0139a Q;
    public a<K, V>.c R;
    public a<K, V>.e S;

    public final class C0139a extends AbstractSet<Map.Entry<K, V>> {
        public C0139a() {
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override
        public int size() {
            return a.this.f15590c;
        }
    }

    public final class b extends k0.d<K> {
        public b() {
            super(a.this.f15590c);
        }

        @Override
        public K a(int i10) {
            return a.this.i(i10);
        }

        @Override
        public void b(int i10) {
            a.this.j(i10);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, j$.util.Iterator, Map.Entry {
        public int f15564a;
        public int f15565b = -1;
        public boolean f15566c;

        public d() {
            this.f15564a = a.this.f15590c - 1;
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f15565b++;
                this.f15566c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean equals(Object obj) {
            if (!this.f15566c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return k0.c.c(entry.getKey(), a.this.i(this.f15565b)) && k0.c.c(entry.getValue(), a.this.l(this.f15565b));
            }
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public K getKey() {
            if (this.f15566c) {
                return a.this.i(this.f15565b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public V getValue() {
            if (this.f15566c) {
                return a.this.l(this.f15565b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public boolean hasNext() {
            return this.f15565b < this.f15564a;
        }

        @Override
        public int hashCode() {
            if (this.f15566c) {
                K i10 = a.this.i(this.f15565b);
                V l10 = a.this.l(this.f15565b);
                int i11 = 0;
                int hashCode = i10 == null ? 0 : i10.hashCode();
                if (l10 != null) {
                    i11 = l10.hashCode();
                }
                return hashCode ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public void remove() {
            if (this.f15566c) {
                a.this.j(this.f15565b);
                this.f15565b--;
                this.f15564a--;
                this.f15566c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override
        public V setValue(V v10) {
            if (this.f15566c) {
                return a.this.k(this.f15565b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends k0.d<V> {
        public f() {
            super(a.this.f15590c);
        }

        @Override
        public V a(int i10) {
            return a.this.l(i10);
        }

        @Override
        public void b(int i10) {
            a.this.j(i10);
        }
    }

    public a() {
    }

    public static <T> boolean n(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
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
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0139a aVar = this.Q;
        if (aVar != null) {
            return aVar;
        }
        a<K, V>.C0139a aVar2 = new C0139a();
        this.Q = aVar2;
        return aVar2;
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public Set<K> keySet() {
        a<K, V>.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.R = cVar2;
        return cVar2;
    }

    public boolean m(Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean o(Collection<?> collection) {
        int i10 = this.f15590c;
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f15590c;
    }

    public boolean p(Collection<?> collection) {
        int i10 = this.f15590c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(i(i11))) {
                j(i11);
            }
        }
        return i10 != this.f15590c;
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        c(this.f15590c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public <T> T[] q(T[] tArr, int i10) {
        int i11 = this.f15590c;
        if (tArr.length < i11) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            tArr[i12] = this.f15589b[(i12 << 1) + i10];
        }
        if (tArr.length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override
    public void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public Collection<V> values() {
        a<K, V>.e eVar = this.S;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.S = eVar2;
        return eVar2;
    }

    public a(int i10) {
        super(i10);
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            a.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return a.this.m(collection);
        }

        @Override
        public boolean equals(Object obj) {
            return a.n(this, obj);
        }

        @Override
        public int hashCode() {
            int i10 = 0;
            for (int i11 = a.this.f15590c - 1; i11 >= 0; i11--) {
                K i12 = a.this.i(i11);
                i10 += i12 == null ? 0 : i12.hashCode();
            }
            return i10;
        }

        @Override
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override
        public java.util.Iterator<K> iterator() {
            return new b();
        }

        @Override
        public boolean remove(Object obj) {
            int f10 = a.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            a.this.j(f10);
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return a.this.o(collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return a.this.p(collection);
        }

        @Override
        public int size() {
            return a.this.f15590c;
        }

        @Override
        public Object[] toArray() {
            int i10 = a.this.f15590c;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = a.this.i(i11);
            }
            return objArr;
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.q(tArr, 0);
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            a.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return a.this.h(obj) >= 0;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override
        public java.util.Iterator<V> iterator() {
            return new f();
        }

        @Override
        public boolean remove(Object obj) {
            int h10 = a.this.h(obj);
            if (h10 < 0) {
                return false;
            }
            a.this.j(h10);
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            int i10 = a.this.f15590c;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (collection.contains(a.this.l(i11))) {
                    a.this.j(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            int i10 = a.this.f15590c;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (!collection.contains(a.this.l(i11))) {
                    a.this.j(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override
        public int size() {
            return a.this.f15590c;
        }

        @Override
        public Object[] toArray() {
            int i10 = a.this.f15590c;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = a.this.l(i11);
            }
            return objArr;
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.q(tArr, 1);
        }
    }
}
