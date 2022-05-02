package p033c6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class C1811l1<K, V> extends AbstractCollection<V> {
    public final Map<K, V> f6452a;

    public C1811l1(Map<K, V> map) {
        this.f6452a = map;
    }

    @Override
    public final void clear() {
        this.f6452a.clear();
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        return this.f6452a.containsValue(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f6452a.isEmpty();
    }

    @Override
    public final Iterator<V> iterator() {
        return new C1766i1(this.f6452a.entrySet().iterator());
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry<K, V> entry : this.f6452a.entrySet()) {
                if (C1837n.m35975a(obj, entry.getValue())) {
                    this.f6452a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f6452a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f6452a.keySet().removeAll(hashSet);
        }
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f6452a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f6452a.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f6452a.size();
    }
}
