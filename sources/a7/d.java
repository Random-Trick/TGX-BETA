package a7;

import a7.f;
import a7.y;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

public abstract class d<K, V> extends a7.f<K, V> implements Serializable {
    public transient Map<K, Collection<V>> M;
    public transient int N;

    public class a extends d<K, V>.c<V> {
        public a(d dVar) {
            super();
        }

        @Override
        public V a(K k10, V v10) {
            return v10;
        }
    }

    public class b extends y.f<K, Collection<V>> {
        public final transient Map<K, Collection<V>> f602c;

        public class a extends y.c<K, Collection<V>> {
            public a() {
            }

            @Override
            public boolean contains(@CheckForNull Object obj) {
                return a7.i.c(b.this.f602c.entrySet(), obj);
            }

            @Override
            public Map<K, Collection<V>> f() {
                return b.this;
            }

            @Override
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0015b();
            }

            @Override
            public boolean remove(@CheckForNull Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.t(entry.getKey());
                return true;
            }
        }

        public class C0015b implements Iterator<Map.Entry<K, Collection<V>>>, j$.util.Iterator {
            public final Iterator<Map.Entry<K, Collection<V>>> f604a;
            @CheckForNull
            public Collection<V> f605b;

            public C0015b() {
                this.f604a = b.this.f602c.entrySet().iterator();
            }

            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f604a.next();
                this.f605b = next.getValue();
                return b.this.e(next);
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
            public boolean hasNext() {
                return this.f604a.hasNext();
            }

            @Override
            public void remove() {
                z6.j.o(this.f605b != null, "no calls to next() since the last call to remove()");
                this.f604a.remove();
                d.m(d.this, this.f605b.size());
                this.f605b.clear();
                this.f605b = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f602c = map;
        }

        @Override
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @CheckForNull
        public Collection<V> get(@CheckForNull Object obj) {
            Collection<V> collection = (Collection) y.g(this.f602c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.v(obj, collection);
        }

        @Override
        public void clear() {
            if (this.f602c == d.this.M) {
                d.this.clear();
            } else {
                u.c(new C0015b());
            }
        }

        @Override
        public boolean containsKey(@CheckForNull Object obj) {
            return y.f(this.f602c, obj);
        }

        @CheckForNull
        public Collection<V> remove(@CheckForNull Object obj) {
            Collection<V> remove = this.f602c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o10 = d.this.o();
            o10.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return o10;
        }

        public Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return y.d(key, d.this.v(key, entry.getValue()));
        }

        @Override
        public boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f602c.equals(obj);
        }

        @Override
        public int hashCode() {
            return this.f602c.hashCode();
        }

        @Override
        public Set<K> keySet() {
            return d.this.f();
        }

        @Override
        public int size() {
            return this.f602c.size();
        }

        @Override
        public String toString() {
            return this.f602c.toString();
        }
    }

    public abstract class c<T> implements java.util.Iterator<T>, j$.util.Iterator {
        public final java.util.Iterator<Map.Entry<K, Collection<V>>> f607a;
        @CheckForNull
        public K f608b = null;
        @CheckForNull
        public Collection<V> f609c = null;
        public java.util.Iterator<V> M = u.f();

        public c() {
            this.f607a = (java.util.Iterator<Map.Entry<K, V>>) d.this.M.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public boolean hasNext() {
            return this.f607a.hasNext() || this.M.hasNext();
        }

        @Override
        public T next() {
            if (!this.M.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f607a.next();
                this.f608b = next.getKey();
                Collection<V> value = next.getValue();
                this.f609c = value;
                this.M = value.iterator();
            }
            return a(f0.a(this.f608b), this.M.next());
        }

        @Override
        public void remove() {
            this.M.remove();
            Collection<V> collection = this.f609c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f607a.remove();
            }
            d.k(d.this);
        }
    }

    public class C0016d extends y.d<K, Collection<V>> {

        public class a implements java.util.Iterator<K>, j$.util.Iterator {
            @CheckForNull
            public Map.Entry<K, Collection<V>> f611a;
            public final java.util.Iterator f612b;

            public a(java.util.Iterator it) {
                this.f612b = it;
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
            public boolean hasNext() {
                return this.f612b.hasNext();
            }

            @Override
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f612b.next();
                this.f611a = entry;
                return entry.getKey();
            }

            @Override
            public void remove() {
                z6.j.o(this.f611a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f611a.getValue();
                this.f612b.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f611a = null;
            }
        }

        public C0016d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override
        public void clear() {
            u.c(iterator());
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return f().keySet().containsAll(collection);
        }

        @Override
        public boolean equals(@CheckForNull Object obj) {
            return this == obj || f().keySet().equals(obj);
        }

        @Override
        public int hashCode() {
            return f().keySet().hashCode();
        }

        @Override
        public java.util.Iterator<K> iterator() {
            return new a(f().entrySet().iterator());
        }

        @Override
        public boolean remove(@CheckForNull Object obj) {
            int i10;
            Collection<V> remove = f().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.m(d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    public class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = h().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override
        @CheckForNull
        public K ceilingKey(K k10) {
            return h().ceilingKey(k10);
        }

        @Override
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(h().descendingMap());
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = h().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override
        @CheckForNull
        public K floorKey(K k10) {
            return h().floorKey(k10);
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = h().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override
        @CheckForNull
        public K higherKey(K k10) {
            return h().higherKey(k10);
        }

        public NavigableSet<K> f() {
            return new f(h());
        }

        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @CheckForNull
        public Map.Entry<K, Collection<V>> l(java.util.Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> o10 = d.this.o();
            o10.addAll(next.getValue());
            it.remove();
            return y.d(next.getKey(), d.this.u(o10));
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = h().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override
        @CheckForNull
        public K lowerKey(K k10) {
            return h().lowerKey(k10);
        }

        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(h().headMap(k10, z10));
        }

        @Override
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(h().subMap(k10, z10, k11, z11));
        }

        @Override
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(h().tailMap(k10, z10));
        }
    }

    public class f extends d<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override
        @CheckForNull
        public K ceiling(K k10) {
            return g().ceilingKey(k10);
        }

        @Override
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override
        public NavigableSet<K> descendingSet() {
            return new f(g().descendingMap());
        }

        @Override
        @CheckForNull
        public K floor(K k10) {
            return g().floorKey(k10);
        }

        @Override
        @CheckForNull
        public K higher(K k10) {
            return g().higherKey(k10);
        }

        @Override
        @CheckForNull
        public K lower(K k10) {
            return g().lowerKey(k10);
        }

        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override
        @CheckForNull
        public K pollFirst() {
            return (K) u.l(iterator());
        }

        @Override
        @CheckForNull
        public K pollLast() {
            return (K) u.l(descendingIterator());
        }

        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(g().headMap(k10, z10));
        }

        @Override
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(g().subMap(k10, z10, k11, z11));
        }

        @Override
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(g().tailMap(k10, z10));
        }
    }

    public class g extends d<K, V>.k implements RandomAccess {
        public g(d dVar, K k10, @CheckForNull List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    public class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {
        @CheckForNull
        public SortedSet<K> N;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override
        @CheckForNull
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        public SortedSet<K> f() {
            return new i(h());
        }

        @Override
        public K firstKey() {
            return h().firstKey();
        }

        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.N;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f10 = f();
            this.N = f10;
            return f10;
        }

        public SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f602c;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(h().headMap(k10));
        }

        @Override
        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(h().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(h().tailMap(k10));
        }
    }

    public class i extends d<K, V>.C0016d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override
        @CheckForNull
        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override
        public K first() {
            return g().firstKey();
        }

        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) super.f();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(g().headMap(k10));
        }

        @Override
        public K last() {
            return g().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(g().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(g().tailMap(k10));
        }
    }

    public d(Map<K, Collection<V>> map) {
        z6.j.d(map.isEmpty());
        this.M = map;
    }

    public static int j(d dVar) {
        int i10 = dVar.N;
        dVar.N = i10 + 1;
        return i10;
    }

    public static int k(d dVar) {
        int i10 = dVar.N;
        dVar.N = i10 - 1;
        return i10;
    }

    public static int l(d dVar, int i10) {
        int i11 = dVar.N + i10;
        dVar.N = i11;
        return i11;
    }

    public static int m(d dVar, int i10) {
        int i11 = dVar.N - i10;
        dVar.N = i11;
        return i11;
    }

    public static <E> java.util.Iterator<E> s(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    @Override
    public void clear() {
        for (Collection<V> collection : this.M.values()) {
            collection.clear();
        }
        this.M.clear();
        this.N = 0;
    }

    @Override
    public Collection<V> e() {
        return new f.a();
    }

    @Override
    public java.util.Iterator<V> g() {
        return new a(this);
    }

    public abstract Collection<V> o();

    public Collection<V> p(K k10) {
        return o();
    }

    @Override
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.M.get(k10);
        if (collection == null) {
            Collection<V> p10 = p(k10);
            if (p10.add(v10)) {
                this.N++;
                this.M.put(k10, p10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v10)) {
            return false;
        } else {
            this.N++;
            return true;
        }
    }

    public final Map<K, Collection<V>> q() {
        Map<K, Collection<V>> map = this.M;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.M);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.M);
        }
        return new b(this.M);
    }

    public final Set<K> r() {
        Map<K, Collection<V>> map = this.M;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.M);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.M);
        }
        return new C0016d(this.M);
    }

    @Override
    public int size() {
        return this.N;
    }

    public final void t(@CheckForNull Object obj) {
        Collection collection = (Collection) y.h(this.M, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.N -= size;
        }
    }

    public abstract <E> Collection<E> u(Collection<E> collection);

    public abstract Collection<V> v(K k10, Collection<V> collection);

    @Override
    public Collection<V> values() {
        return super.values();
    }

    public final List<V> w(K k10, List<V> list, @CheckForNull d<K, V>.j jVar) {
        if (list instanceof RandomAccess) {
            return new g(this, k10, list, jVar);
        }
        return new k(k10, list, jVar);
    }

    public class j extends AbstractCollection<V> {
        @CheckForNull
        public final Collection<V> M;
        public final K f615a;
        public Collection<V> f616b;
        @CheckForNull
        public final d<K, V>.j f617c;

        public j(K k10, Collection<V> collection, @CheckForNull d<K, V>.j jVar) {
            this.f615a = k10;
            this.f616b = collection;
            this.f617c = jVar;
            this.M = jVar == null ? null : jVar.m();
        }

        @Override
        public boolean add(V v10) {
            s();
            boolean isEmpty = this.f616b.isEmpty();
            boolean add = this.f616b.add(v10);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    f();
                }
            }
            return add;
        }

        @Override
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f616b.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f616b.size() - size);
                if (size == 0) {
                    f();
                }
            }
            return addAll;
        }

        @Override
        public void clear() {
            int size = size();
            if (size != 0) {
                this.f616b.clear();
                d.m(d.this, size);
                t();
            }
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            s();
            return this.f616b.contains(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            s();
            return this.f616b.containsAll(collection);
        }

        @Override
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            s();
            return this.f616b.equals(obj);
        }

        public void f() {
            d<K, V>.j jVar = this.f617c;
            if (jVar != null) {
                jVar.f();
            } else {
                d.this.M.put(this.f615a, this.f616b);
            }
        }

        @CheckForNull
        public d<K, V>.j g() {
            return this.f617c;
        }

        @Override
        public int hashCode() {
            s();
            return this.f616b.hashCode();
        }

        @Override
        public java.util.Iterator<V> iterator() {
            s();
            return new a();
        }

        public Collection<V> m() {
            return this.f616b;
        }

        K r() {
            return this.f615a;
        }

        @Override
        public boolean remove(@CheckForNull Object obj) {
            s();
            boolean remove = this.f616b.remove(obj);
            if (remove) {
                d.k(d.this);
                t();
            }
            return remove;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f616b.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f616b.size() - size);
                t();
            }
            return removeAll;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            z6.j.i(collection);
            int size = size();
            boolean retainAll = this.f616b.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f616b.size() - size);
                t();
            }
            return retainAll;
        }

        public void s() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f617c;
            if (jVar != null) {
                jVar.s();
                if (this.f617c.m() != this.M) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f616b.isEmpty() && (collection = (Collection) d.this.M.get(this.f615a)) != null) {
                this.f616b = collection;
            }
        }

        @Override
        public int size() {
            s();
            return this.f616b.size();
        }

        public void t() {
            d<K, V>.j jVar = this.f617c;
            if (jVar != null) {
                jVar.t();
            } else if (this.f616b.isEmpty()) {
                d.this.M.remove(this.f615a);
            }
        }

        @Override
        public String toString() {
            s();
            return this.f616b.toString();
        }

        public class a implements java.util.Iterator<V>, j$.util.Iterator {
            public final java.util.Iterator<V> f618a;
            public final Collection<V> f619b;

            public a() {
                Collection<V> collection = j.this.f616b;
                this.f619b = collection;
                this.f618a = d.s(collection);
            }

            public java.util.Iterator<V> a() {
                b();
                return this.f618a;
            }

            public void b() {
                j.this.s();
                if (j.this.f616b != this.f619b) {
                    throw new ConcurrentModificationException();
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
            public boolean hasNext() {
                b();
                return this.f618a.hasNext();
            }

            @Override
            public V next() {
                b();
                return this.f618a.next();
            }

            @Override
            public void remove() {
                this.f618a.remove();
                d.k(d.this);
                j.this.t();
            }

            public a(java.util.Iterator<V> it) {
                this.f619b = j.this.f616b;
                this.f618a = it;
            }
        }
    }

    public class k extends d<K, V>.j implements List<V> {

        public class a extends d<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override
            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                c().add(v10);
                d.j(d.this);
                if (isEmpty) {
                    k.this.f();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override
            public V previous() {
                return c().previous();
            }

            @Override
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override
            public void set(V v10) {
                c().set(v10);
            }

            public a(int i10) {
                super(k.this.u().listIterator(i10));
            }
        }

        public k(K k10, List<V> list, @CheckForNull d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override
        public void add(int i10, V v10) {
            s();
            boolean isEmpty = m().isEmpty();
            u().add(i10, v10);
            d.j(d.this);
            if (isEmpty) {
                f();
            }
        }

        @Override
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = u().addAll(i10, collection);
            if (addAll) {
                d.l(d.this, m().size() - size);
                if (size == 0) {
                    f();
                }
            }
            return addAll;
        }

        @Override
        public V get(int i10) {
            s();
            return u().get(i10);
        }

        @Override
        public int indexOf(@CheckForNull Object obj) {
            s();
            return u().indexOf(obj);
        }

        @Override
        public int lastIndexOf(@CheckForNull Object obj) {
            s();
            return u().lastIndexOf(obj);
        }

        @Override
        public ListIterator<V> listIterator() {
            s();
            return new a();
        }

        @Override
        public V remove(int i10) {
            s();
            V remove = u().remove(i10);
            d.k(d.this);
            t();
            return remove;
        }

        @Override
        public V set(int i10, V v10) {
            s();
            return u().set(i10, v10);
        }

        @Override
        public List<V> subList(int i10, int i11) {
            s();
            return d.this.w(r(), u().subList(i10, i11), g() == null ? this : g());
        }

        public List<V> u() {
            return (List) m();
        }

        @Override
        public ListIterator<V> listIterator(int i10) {
            s();
            return new a(i10);
        }
    }
}
