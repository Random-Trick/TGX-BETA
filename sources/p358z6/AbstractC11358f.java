package p358z6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbstractC11358f<K, V> implements AbstractC11423z<K, V> {
    @MonotonicNonNullDecl
    public transient Set<K> f36303a;
    @MonotonicNonNullDecl
    public transient Collection<V> f36304b;
    @MonotonicNonNullDecl
    public transient Map<K, Collection<V>> f36305c;

    public class C11359a extends AbstractCollection<V> {
        public C11359a() {
        }

        @Override
        public void clear() {
            AbstractC11358f.this.clear();
        }

        @Override
        public boolean contains(@NullableDecl Object obj) {
            return AbstractC11358f.this.m833b(obj);
        }

        @Override
        public Iterator<V> iterator() {
            return AbstractC11358f.this.mo828g();
        }

        @Override
        public int size() {
            return AbstractC11358f.this.size();
        }
    }

    @Override
    public Map<K, Collection<V>> mo669a() {
        Map<K, Collection<V>> map = this.f36305c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo832c();
        this.f36305c = c;
        return c;
    }

    public boolean m833b(@NullableDecl Object obj) {
        for (Collection<V> collection : mo669a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> mo832c();

    public abstract Set<K> mo831d();

    public abstract Collection<V> mo830e();

    public boolean equals(@NullableDecl Object obj) {
        return C11336c0.m884a(this, obj);
    }

    public Set<K> m829f() {
        Set<K> set = this.f36303a;
        if (set != null) {
            return set;
        }
        Set<K> d = mo831d();
        this.f36303a = d;
        return d;
    }

    public abstract Iterator<V> mo828g();

    public int hashCode() {
        return mo669a().hashCode();
    }

    public String toString() {
        return mo669a().toString();
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = this.f36304b;
        if (collection != null) {
            return collection;
        }
        Collection<V> e = mo830e();
        this.f36304b = e;
        return e;
    }
}
