package p143k0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p126j$.util.Iterator;
import p126j$.util.Map;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.Consumer;
import p126j$.util.function.Function;

public class C6024a<K, V> extends C6037g<K, V> implements Map<K, V>, p126j$.util.Map {
    public C6024a<K, V>.C6025a f19169Q;
    public C6024a<K, V>.C6027c f19170R;
    public C6024a<K, V>.C6029e f19171S;

    public final class C6025a extends AbstractSet<Map.Entry<K, V>> {
        public C6025a() {
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6028d();
        }

        @Override
        public int size() {
            return C6024a.this.f19216c;
        }
    }

    public final class C6026b extends AbstractC6034d<K> {
        public C6026b() {
            super(C6024a.this.f19216c);
        }

        @Override
        public K mo21513a(int i) {
            return C6024a.this.m21480i(i);
        }

        @Override
        public void mo21512b(int i) {
            C6024a.this.m21479j(i);
        }
    }

    public final class C6028d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, p126j$.util.Iterator, Map.Entry {
        public int f19176a;
        public int f19177b = -1;
        public boolean f19178c;

        public C6028d() {
            this.f19176a = C6024a.this.f19216c - 1;
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f19177b++;
                this.f19178c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean equals(Object obj) {
            if (!this.f19178c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C6033c.m21517c(entry.getKey(), C6024a.this.m21480i(this.f19177b)) && C6033c.m21517c(entry.getValue(), C6024a.this.m21477l(this.f19177b));
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
            if (this.f19178c) {
                return C6024a.this.m21480i(this.f19177b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public V getValue() {
            if (this.f19178c) {
                return C6024a.this.m21477l(this.f19177b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public boolean hasNext() {
            return this.f19177b < this.f19176a;
        }

        @Override
        public int hashCode() {
            if (this.f19178c) {
                K i = C6024a.this.m21480i(this.f19177b);
                V l = C6024a.this.m21477l(this.f19177b);
                int i2 = 0;
                int hashCode = i == null ? 0 : i.hashCode();
                if (l != null) {
                    i2 = l.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public void remove() {
            if (this.f19178c) {
                C6024a.this.m21479j(this.f19177b);
                this.f19177b--;
                this.f19176a--;
                this.f19178c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override
        public V setValue(V v) {
            if (this.f19178c) {
                return C6024a.this.m21478k(this.f19177b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class C6030f extends AbstractC6034d<V> {
        public C6030f() {
            super(C6024a.this.f19216c);
        }

        @Override
        public V mo21513a(int i) {
            return C6024a.this.m21477l(i);
        }

        @Override
        public void mo21512b(int i) {
            C6024a.this.m21479j(i);
        }
    }

    public C6024a() {
    }

    public static <T> boolean m21532n(Set<T> set, Object obj) {
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
        C6024a<K, V>.C6025a aVar = this.f19169Q;
        if (aVar != null) {
            return aVar;
        }
        C6024a<K, V>.C6025a aVar2 = new C6025a();
        this.f19169Q = aVar2;
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
        C6024a<K, V>.C6027c cVar = this.f19170R;
        if (cVar != null) {
            return cVar;
        }
        C6024a<K, V>.C6027c cVar2 = new C6027c();
        this.f19170R = cVar2;
        return cVar2;
    }

    public boolean m21533m(Collection<?> collection) {
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

    public boolean m21531o(Collection<?> collection) {
        int i = this.f19216c;
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f19216c;
    }

    public boolean m21530p(Collection<?> collection) {
        int i = this.f19216c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m21480i(i2))) {
                m21479j(i2);
            }
        }
        return i != this.f19216c;
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        m21486c(this.f19216c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public <T> T[] m21529q(T[] tArr, int i) {
        int i2 = this.f19216c;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.f19215b[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
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
        C6024a<K, V>.C6029e eVar = this.f19171S;
        if (eVar != null) {
            return eVar;
        }
        C6024a<K, V>.C6029e eVar2 = new C6029e();
        this.f19171S = eVar2;
        return eVar2;
    }

    public C6024a(int i) {
        super(i);
    }

    public final class C6027c implements Set<K> {
        public C6027c() {
        }

        @Override
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            C6024a.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return C6024a.this.containsKey(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return C6024a.this.m21533m(collection);
        }

        @Override
        public boolean equals(Object obj) {
            return C6024a.m21532n(this, obj);
        }

        @Override
        public int hashCode() {
            int i = 0;
            for (int i2 = C6024a.this.f19216c - 1; i2 >= 0; i2--) {
                K i3 = C6024a.this.m21480i(i2);
                i += i3 == null ? 0 : i3.hashCode();
            }
            return i;
        }

        @Override
        public boolean isEmpty() {
            return C6024a.this.isEmpty();
        }

        @Override
        public java.util.Iterator<K> iterator() {
            return new C6026b();
        }

        @Override
        public boolean remove(Object obj) {
            int f = C6024a.this.m21483f(obj);
            if (f < 0) {
                return false;
            }
            C6024a.this.m21479j(f);
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return C6024a.this.m21531o(collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return C6024a.this.m21530p(collection);
        }

        @Override
        public int size() {
            return C6024a.this.f19216c;
        }

        @Override
        public Object[] toArray() {
            int i = C6024a.this.f19216c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C6024a.this.m21480i(i2);
            }
            return objArr;
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C6024a.this.m21529q(tArr, 0);
        }
    }

    public final class C6029e implements Collection<V> {
        public C6029e() {
        }

        @Override
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            C6024a.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return C6024a.this.m21481h(obj) >= 0;
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
            return C6024a.this.isEmpty();
        }

        @Override
        public java.util.Iterator<V> iterator() {
            return new C6030f();
        }

        @Override
        public boolean remove(Object obj) {
            int h = C6024a.this.m21481h(obj);
            if (h < 0) {
                return false;
            }
            C6024a.this.m21479j(h);
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            int i = C6024a.this.f19216c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(C6024a.this.m21477l(i2))) {
                    C6024a.this.m21479j(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            int i = C6024a.this.f19216c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(C6024a.this.m21477l(i2))) {
                    C6024a.this.m21479j(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override
        public int size() {
            return C6024a.this.f19216c;
        }

        @Override
        public Object[] toArray() {
            int i = C6024a.this.f19216c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C6024a.this.m21477l(i2);
            }
            return objArr;
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C6024a.this.m21529q(tArr, 1);
        }
    }
}
