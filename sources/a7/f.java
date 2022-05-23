package a7;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class f<K, V> implements z<K, V> {
    @CheckForNull
    @LazyInit
    public transient Set<K> f622a;
    @CheckForNull
    @LazyInit
    public transient Collection<V> f623b;
    @CheckForNull
    @LazyInit
    public transient Map<K, Collection<V>> f624c;

    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override
        public void clear() {
            f.this.clear();
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            return f.this.b(obj);
        }

        @Override
        public Iterator<V> iterator() {
            return f.this.g();
        }

        @Override
        public int size() {
            return f.this.size();
        }
    }

    @Override
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f624c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c10 = c();
        this.f624c = c10;
        return c10;
    }

    public boolean b(@CheckForNull Object obj) {
        for (Collection<V> collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> c();

    public abstract Set<K> d();

    public abstract Collection<V> e();

    public boolean equals(@CheckForNull Object obj) {
        return c0.a(this, obj);
    }

    public Set<K> f() {
        Set<K> set = this.f622a;
        if (set != null) {
            return set;
        }
        Set<K> d10 = d();
        this.f622a = d10;
        return d10;
    }

    public abstract Iterator<V> g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = this.f623b;
        if (collection != null) {
            return collection;
        }
        Collection<V> e10 = e();
        this.f623b = e10;
        return e10;
    }
}
