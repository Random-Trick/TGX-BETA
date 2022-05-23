package d6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class l1<K, V> extends AbstractCollection<V> {
    public final Map<K, V> f6648a;

    public l1(Map<K, V> map) {
        this.f6648a = map;
    }

    @Override
    public final void clear() {
        this.f6648a.clear();
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        return this.f6648a.containsValue(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f6648a.isEmpty();
    }

    @Override
    public final Iterator<V> iterator() {
        return new i1(this.f6648a.entrySet().iterator());
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry<K, V> entry : this.f6648a.entrySet()) {
                if (n.a(obj, entry.getValue())) {
                    this.f6648a.remove(entry.getKey());
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
            for (Map.Entry<K, V> entry : this.f6648a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f6648a.keySet().removeAll(hashSet);
        }
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f6648a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f6648a.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f6648a.size();
    }
}
