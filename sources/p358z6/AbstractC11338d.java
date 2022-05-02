package p358z6;

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
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p343y6.C10433i;
import p358z6.AbstractC11358f;
import p358z6.C11414y;

public abstract class AbstractC11338d<K, V> extends AbstractC11358f<K, V> implements Serializable {
    public transient Map<K, Collection<V>> f36265M;
    public transient int f36266N;

    public class C11339a extends AbstractC11338d<K, V>.AbstractC11343c<V> {
        public C11339a() {
            super();
        }

        @Override
        public V mo861a(K k, V v) {
            return v;
        }
    }

    public class C11340b extends C11414y.AbstractC11422f<K, Collection<V>> {
        public final transient Map<K, Collection<V>> f36269c;

        public class C11341a extends C11414y.AbstractC11419c<K, Collection<V>> {
            public C11341a() {
            }

            @Override
            public boolean contains(Object obj) {
                return C11365i.m813c(C11340b.this.f36269c.entrySet(), obj);
            }

            @Override
            public Map<K, Collection<V>> mo674h() {
                return C11340b.this;
            }

            @Override
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C11342b();
            }

            @Override
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractC11338d.this.m869t(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public class C11342b implements Iterator<Map.Entry<K, Collection<V>>>, p126j$.util.Iterator {
            public final Iterator<Map.Entry<K, Collection<V>>> f36271a;
            @NullableDecl
            public Collection<V> f36272b;

            public C11342b() {
                this.f36271a = C11340b.this.f36269c.entrySet().iterator();
            }

            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f36271a.next();
                this.f36272b = next.getValue();
                return C11340b.this.m863e(next);
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
                return this.f36271a.hasNext();
            }

            @Override
            public void remove() {
                C11363h.m818c(this.f36272b != null);
                this.f36271a.remove();
                AbstractC11338d.this.f36266N -= this.f36272b.size();
                this.f36272b.clear();
                this.f36272b = null;
            }
        }

        public C11340b(Map<K, Collection<V>> map) {
            this.f36269c = map;
        }

        @Override
        public Set<Map.Entry<K, Collection<V>>> mo671a() {
            return new C11341a();
        }

        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) C11414y.m683g(this.f36269c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC11338d.this.mo867v(obj, collection);
        }

        @Override
        public void clear() {
            if (this.f36269c == AbstractC11338d.this.f36265M) {
                AbstractC11338d.this.clear();
            } else {
                C11407u.m710c(new C11342b());
            }
        }

        @Override
        public boolean containsKey(Object obj) {
            return C11414y.m684f(this.f36269c, obj);
        }

        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f36269c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o = AbstractC11338d.this.mo874o();
            o.addAll(remove);
            AbstractC11338d.this.f36266N -= remove.size();
            remove.clear();
            return o;
        }

        public Map.Entry<K, Collection<V>> m863e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C11414y.m686d(key, AbstractC11338d.this.mo867v(key, entry.getValue()));
        }

        @Override
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f36269c.equals(obj);
        }

        @Override
        public int hashCode() {
            return this.f36269c.hashCode();
        }

        @Override
        public Set<K> keySet() {
            return AbstractC11338d.this.m829f();
        }

        @Override
        public int size() {
            return this.f36269c.size();
        }

        @Override
        public String toString() {
            return this.f36269c.toString();
        }
    }

    public abstract class AbstractC11343c<T> implements java.util.Iterator<T>, p126j$.util.Iterator {
        public final java.util.Iterator<Map.Entry<K, Collection<V>>> f36276a;
        @NullableDecl
        public K f36277b = null;
        @MonotonicNonNullDecl
        public Collection<V> f36278c = null;
        public java.util.Iterator<V> f36274M = C11407u.m707f();

        public AbstractC11343c() {
            this.f36276a = (java.util.Iterator<Map.Entry<K, V>>) AbstractC11338d.this.f36265M.entrySet().iterator();
        }

        public abstract T mo861a(K k, V v);

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
            return this.f36276a.hasNext() || this.f36274M.hasNext();
        }

        @Override
        public T next() {
            if (!this.f36274M.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f36276a.next();
                this.f36277b = next.getKey();
                Collection<V> value = next.getValue();
                this.f36278c = value;
                this.f36274M = value.iterator();
            }
            return mo861a(this.f36277b, this.f36274M.next());
        }

        @Override
        public void remove() {
            this.f36274M.remove();
            if (this.f36278c.isEmpty()) {
                this.f36276a.remove();
            }
            AbstractC11338d.m876m(AbstractC11338d.this);
        }
    }

    public class C11344d extends C11414y.C11420d<K, Collection<V>> {

        public class C11345a implements java.util.Iterator<K>, p126j$.util.Iterator {
            @NullableDecl
            public Map.Entry<K, Collection<V>> f36280a;
            public final java.util.Iterator f36281b;

            public C11345a(java.util.Iterator it) {
                this.f36281b = it;
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
                return this.f36281b.hasNext();
            }

            @Override
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f36281b.next();
                this.f36280a = entry;
                return entry.getKey();
            }

            @Override
            public void remove() {
                C11363h.m818c(this.f36280a != null);
                Collection<V> value = this.f36280a.getValue();
                this.f36281b.remove();
                AbstractC11338d.this.f36266N -= value.size();
                value.clear();
                this.f36280a = null;
            }
        }

        public C11344d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override
        public void clear() {
            C11407u.m710c(iterator());
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return m673h().keySet().containsAll(collection);
        }

        @Override
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || m673h().keySet().equals(obj);
        }

        @Override
        public int hashCode() {
            return m673h().keySet().hashCode();
        }

        @Override
        public java.util.Iterator<K> iterator() {
            return new C11345a(m673h().entrySet().iterator());
        }

        @Override
        public boolean remove(Object obj) {
            int i;
            Collection<V> remove = m673h().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractC11338d.this.f36266N -= i;
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    public class C11346e extends AbstractC11338d<K, V>.C11349h implements NavigableMap<K, Collection<V>> {
        public C11346e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo847h().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m863e(ceilingEntry);
        }

        @Override
        public K ceilingKey(K k) {
            return mo847h().ceilingKey(k);
        }

        @Override
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C11346e(mo847h().descendingMap());
        }

        @Override
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo847h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m863e(firstEntry);
        }

        @Override
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = mo847h().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m863e(floorEntry);
        }

        @Override
        public K floorKey(K k) {
            return mo847h().floorKey(k);
        }

        @Override
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = mo847h().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m863e(higherEntry);
        }

        @Override
        public K higherKey(K k) {
            return mo847h().higherKey(k);
        }

        public NavigableSet<K> mo849f() {
            return new C11347f(mo847h());
        }

        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> m857l(java.util.Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> o = AbstractC11338d.this.mo874o();
            o.addAll(next.getValue());
            it.remove();
            return C11414y.m686d(next.getKey(), AbstractC11338d.this.mo868u(o));
        }

        @Override
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo847h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m863e(lastEntry);
        }

        @Override
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = mo847h().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m863e(lowerEntry);
        }

        @Override
        public K lowerKey(K k) {
            return mo847h().lowerKey(k);
        }

        public NavigableMap<K, Collection<V>> mo847h() {
            return (NavigableMap) super.mo847h();
        }

        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m857l(entrySet().iterator());
        }

        @Override
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m857l(descendingMap().entrySet().iterator());
        }

        @Override
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C11346e(mo847h().headMap(k, z));
        }

        @Override
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C11346e(mo847h().subMap(k, z, k2, z2));
        }

        @Override
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C11346e(mo847h().tailMap(k, z));
        }
    }

    public class C11347f extends AbstractC11338d<K, V>.C11350i implements NavigableSet<K> {
        public C11347f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override
        public K ceiling(K k) {
            return mo846i().ceilingKey(k);
        }

        @Override
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override
        public NavigableSet<K> descendingSet() {
            return new C11347f(mo846i().descendingMap());
        }

        @Override
        public K floor(K k) {
            return mo846i().floorKey(k);
        }

        @Override
        public K higher(K k) {
            return mo846i().higherKey(k);
        }

        @Override
        public K lower(K k) {
            return mo846i().lowerKey(k);
        }

        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override
        public K pollFirst() {
            return (K) C11407u.m701l(iterator());
        }

        @Override
        public K pollLast() {
            return (K) C11407u.m701l(descendingIterator());
        }

        public NavigableMap<K, Collection<V>> mo846i() {
            return (NavigableMap) super.mo846i();
        }

        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override
        public NavigableSet<K> headSet(K k, boolean z) {
            return new C11347f(mo846i().headMap(k, z));
        }

        @Override
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C11347f(mo846i().subMap(k, z, k2, z2));
        }

        @Override
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C11347f(mo846i().tailMap(k, z));
        }
    }

    public class C11348g extends AbstractC11338d<K, V>.C11353k implements RandomAccess {
        public C11348g(@NullableDecl K k, List<V> list, @NullableDecl AbstractC11338d<K, V>.C11351j jVar) {
            super(k, list, jVar);
        }
    }

    public class C11349h extends AbstractC11338d<K, V>.C11340b implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl
        public SortedSet<K> f36286N;

        public C11349h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override
        public Comparator<? super K> comparator() {
            return mo847h().comparator();
        }

        public SortedSet<K> mo849f() {
            return new C11350i(mo847h());
        }

        @Override
        public K firstKey() {
            return mo847h().firstKey();
        }

        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f36286N;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f = mo849f();
            this.f36286N = f;
            return f;
        }

        public SortedMap<K, Collection<V>> mo847h() {
            return (SortedMap) this.f36269c;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C11349h(mo847h().headMap(k));
        }

        @Override
        public K lastKey() {
            return mo847h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C11349h(mo847h().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C11349h(mo847h().tailMap(k));
        }
    }

    public class C11350i extends AbstractC11338d<K, V>.C11344d implements SortedSet<K> {
        public C11350i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override
        public Comparator<? super K> comparator() {
            return mo846i().comparator();
        }

        @Override
        public K first() {
            return mo846i().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C11350i(mo846i().headMap(k));
        }

        public SortedMap<K, Collection<V>> mo846i() {
            return (SortedMap) super.m673h();
        }

        @Override
        public K last() {
            return mo846i().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C11350i(mo846i().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C11350i(mo846i().tailMap(k));
        }
    }

    public AbstractC11338d(Map<K, Collection<V>> map) {
        C10433i.m5134d(map.isEmpty());
        this.f36265M = map;
    }

    public static int m877l(AbstractC11338d dVar) {
        int i = dVar.f36266N;
        dVar.f36266N = i + 1;
        return i;
    }

    public static int m876m(AbstractC11338d dVar) {
        int i = dVar.f36266N;
        dVar.f36266N = i - 1;
        return i;
    }

    public static <E> java.util.Iterator<E> m870s(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    @Override
    public void clear() {
        for (Collection<V> collection : this.f36265M.values()) {
            collection.clear();
        }
        this.f36265M.clear();
        this.f36266N = 0;
    }

    @Override
    public Collection<V> mo830e() {
        return new AbstractC11358f.C11359a();
    }

    @Override
    public java.util.Iterator<V> mo828g() {
        return new C11339a();
    }

    public abstract Collection<V> mo874o();

    public Collection<V> m873p(@NullableDecl K k) {
        return mo874o();
    }

    @Override
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        Collection<V> collection = this.f36265M.get(k);
        if (collection == null) {
            Collection<V> p = m873p(k);
            if (p.add(v)) {
                this.f36266N++;
                this.f36265M.put(k, p);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f36266N++;
            return true;
        }
    }

    public final Map<K, Collection<V>> m872q() {
        Map<K, Collection<V>> map = this.f36265M;
        if (map instanceof NavigableMap) {
            return new C11346e((NavigableMap) this.f36265M);
        }
        if (map instanceof SortedMap) {
            return new C11349h((SortedMap) this.f36265M);
        }
        return new C11340b(this.f36265M);
    }

    public final Set<K> m871r() {
        Map<K, Collection<V>> map = this.f36265M;
        if (map instanceof NavigableMap) {
            return new C11347f((NavigableMap) this.f36265M);
        }
        if (map instanceof SortedMap) {
            return new C11350i((SortedMap) this.f36265M);
        }
        return new C11344d(this.f36265M);
    }

    @Override
    public int size() {
        return this.f36266N;
    }

    public final void m869t(Object obj) {
        Collection collection = (Collection) C11414y.m682h(this.f36265M, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f36266N -= size;
        }
    }

    public abstract <E> Collection<E> mo868u(Collection<E> collection);

    public abstract Collection<V> mo867v(@NullableDecl K k, Collection<V> collection);

    @Override
    public Collection<V> values() {
        return super.values();
    }

    public final List<V> m866w(@NullableDecl K k, List<V> list, @NullableDecl AbstractC11338d<K, V>.C11351j jVar) {
        return list instanceof RandomAccess ? new C11348g(k, list, jVar) : new C11353k(k, list, jVar);
    }

    public class C11351j extends AbstractCollection<V> {
        @NullableDecl
        public final Collection<V> f36289M;
        @NullableDecl
        public final K f36291a;
        public Collection<V> f36292b;
        @NullableDecl
        public final AbstractC11338d<K, V>.C11351j f36293c;

        public C11351j(@NullableDecl K k, Collection<V> collection, @NullableDecl AbstractC11338d<K, V>.C11351j jVar) {
            this.f36291a = k;
            this.f36292b = collection;
            this.f36293c = jVar;
            this.f36289M = jVar == null ? null : jVar.m843m();
        }

        @Override
        public boolean add(V v) {
            m841s();
            boolean isEmpty = this.f36292b.isEmpty();
            boolean add = this.f36292b.add(v);
            if (add) {
                AbstractC11338d.m877l(AbstractC11338d.this);
                if (isEmpty) {
                    m845h();
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
            boolean addAll = this.f36292b.addAll(collection);
            if (addAll) {
                int size2 = this.f36292b.size();
                AbstractC11338d.this.f36266N += size2 - size;
                if (size == 0) {
                    m845h();
                }
            }
            return addAll;
        }

        @Override
        public void clear() {
            int size = size();
            if (size != 0) {
                this.f36292b.clear();
                AbstractC11338d.this.f36266N -= size;
                m840t();
            }
        }

        @Override
        public boolean contains(Object obj) {
            m841s();
            return this.f36292b.contains(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            m841s();
            return this.f36292b.containsAll(collection);
        }

        @Override
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            m841s();
            return this.f36292b.equals(obj);
        }

        public void m845h() {
            AbstractC11338d<K, V>.C11351j jVar = this.f36293c;
            if (jVar != null) {
                jVar.m845h();
            } else {
                AbstractC11338d.this.f36265M.put(this.f36291a, this.f36292b);
            }
        }

        @Override
        public int hashCode() {
            m841s();
            return this.f36292b.hashCode();
        }

        public AbstractC11338d<K, V>.C11351j m844i() {
            return this.f36293c;
        }

        @Override
        public java.util.Iterator<V> iterator() {
            m841s();
            return new C11352a();
        }

        public Collection<V> m843m() {
            return this.f36292b;
        }

        K m842r() {
            return this.f36291a;
        }

        @Override
        public boolean remove(Object obj) {
            m841s();
            boolean remove = this.f36292b.remove(obj);
            if (remove) {
                AbstractC11338d.m876m(AbstractC11338d.this);
                m840t();
            }
            return remove;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f36292b.removeAll(collection);
            if (removeAll) {
                int size2 = this.f36292b.size();
                AbstractC11338d.this.f36266N += size2 - size;
                m840t();
            }
            return removeAll;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            C10433i.m5129i(collection);
            int size = size();
            boolean retainAll = this.f36292b.retainAll(collection);
            if (retainAll) {
                int size2 = this.f36292b.size();
                AbstractC11338d.this.f36266N += size2 - size;
                m840t();
            }
            return retainAll;
        }

        public void m841s() {
            Collection<V> collection;
            AbstractC11338d<K, V>.C11351j jVar = this.f36293c;
            if (jVar != null) {
                jVar.m841s();
                if (this.f36293c.m843m() != this.f36289M) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f36292b.isEmpty() && (collection = (Collection) AbstractC11338d.this.f36265M.get(this.f36291a)) != null) {
                this.f36292b = collection;
            }
        }

        @Override
        public int size() {
            m841s();
            return this.f36292b.size();
        }

        public void m840t() {
            AbstractC11338d<K, V>.C11351j jVar = this.f36293c;
            if (jVar != null) {
                jVar.m840t();
            } else if (this.f36292b.isEmpty()) {
                AbstractC11338d.this.f36265M.remove(this.f36291a);
            }
        }

        @Override
        public String toString() {
            m841s();
            return this.f36292b.toString();
        }

        public class C11352a implements java.util.Iterator<V>, p126j$.util.Iterator {
            public final java.util.Iterator<V> f36294a;
            public final Collection<V> f36295b;

            public C11352a() {
                Collection<V> collection = C11351j.this.f36292b;
                this.f36295b = collection;
                this.f36294a = AbstractC11338d.m870s(collection);
            }

            public java.util.Iterator<V> m839a() {
                m838b();
                return this.f36294a;
            }

            public void m838b() {
                C11351j.this.m841s();
                if (C11351j.this.f36292b != this.f36295b) {
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
                m838b();
                return this.f36294a.hasNext();
            }

            @Override
            public V next() {
                m838b();
                return this.f36294a.next();
            }

            @Override
            public void remove() {
                this.f36294a.remove();
                AbstractC11338d.m876m(AbstractC11338d.this);
                C11351j.this.m840t();
            }

            public C11352a(java.util.Iterator<V> it) {
                this.f36295b = C11351j.this.f36292b;
                this.f36294a = it;
            }
        }
    }

    public class C11353k extends AbstractC11338d<K, V>.C11351j implements List<V> {

        public class C11354a extends AbstractC11338d<K, V>.C11351j.C11352a implements ListIterator<V> {
            public C11354a() {
                super();
            }

            @Override
            public void add(V v) {
                boolean isEmpty = C11353k.this.isEmpty();
                m836c().add(v);
                AbstractC11338d.m877l(AbstractC11338d.this);
                if (isEmpty) {
                    C11353k.this.m845h();
                }
            }

            public final ListIterator<V> m836c() {
                return (ListIterator) m839a();
            }

            @Override
            public boolean hasPrevious() {
                return m836c().hasPrevious();
            }

            @Override
            public int nextIndex() {
                return m836c().nextIndex();
            }

            @Override
            public V previous() {
                return m836c().previous();
            }

            @Override
            public int previousIndex() {
                return m836c().previousIndex();
            }

            @Override
            public void set(V v) {
                m836c().set(v);
            }

            public C11354a(int i) {
                super(C11353k.this.m837u().listIterator(i));
            }
        }

        public C11353k(@NullableDecl K k, List<V> list, @NullableDecl AbstractC11338d<K, V>.C11351j jVar) {
            super(k, list, jVar);
        }

        @Override
        public void add(int i, V v) {
            m841s();
            boolean isEmpty = m843m().isEmpty();
            m837u().add(i, v);
            AbstractC11338d.m877l(AbstractC11338d.this);
            if (isEmpty) {
                m845h();
            }
        }

        @Override
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m837u().addAll(i, collection);
            if (addAll) {
                int size2 = m843m().size();
                AbstractC11338d.this.f36266N += size2 - size;
                if (size == 0) {
                    m845h();
                }
            }
            return addAll;
        }

        @Override
        public V get(int i) {
            m841s();
            return m837u().get(i);
        }

        @Override
        public int indexOf(Object obj) {
            m841s();
            return m837u().indexOf(obj);
        }

        @Override
        public int lastIndexOf(Object obj) {
            m841s();
            return m837u().lastIndexOf(obj);
        }

        @Override
        public ListIterator<V> listIterator() {
            m841s();
            return new C11354a();
        }

        @Override
        public V remove(int i) {
            m841s();
            V remove = m837u().remove(i);
            AbstractC11338d.m876m(AbstractC11338d.this);
            m840t();
            return remove;
        }

        @Override
        public V set(int i, V v) {
            m841s();
            return m837u().set(i, v);
        }

        @Override
        public List<V> subList(int i, int i2) {
            m841s();
            return AbstractC11338d.this.m866w(m842r(), m837u().subList(i, i2), m844i() == null ? this : m844i());
        }

        public List<V> m837u() {
            return (List) m843m();
        }

        @Override
        public ListIterator<V> listIterator(int i) {
            m841s();
            return new C11354a(i);
        }
    }
}
