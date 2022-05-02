package p033c6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class AbstractC1781j1<K, V> extends AbstractC1895r1<Map.Entry<K, V>> {
    @Override
    public final void clear() {
        mo35861h().clear();
    }

    @Override
    public abstract boolean contains(@CheckForNull Object obj);

    public abstract Map<K, V> mo35861h();

    @Override
    public final boolean isEmpty() {
        return mo35861h().isEmpty();
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return C1909s1.m35908a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C1909s1.m35907b(this, collection.iterator());
        }
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                i = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            } else if (size >= 0) {
                i = size + 1;
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("expectedSize cannot be negative but was: ");
                sb2.append(size);
                throw new IllegalArgumentException(sb2.toString());
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C1977x) mo35861h()).f7062M.mo35967d().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return mo35861h().size();
    }
}
