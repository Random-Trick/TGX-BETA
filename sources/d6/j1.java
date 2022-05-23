package d6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class j1<K, V> extends r1<Map.Entry<K, V>> {
    @Override
    public final void clear() {
        f().clear();
    }

    @Override
    public abstract boolean contains(@CheckForNull Object obj);

    public abstract Map<K, V> f();

    @Override
    public final boolean isEmpty() {
        return f().isEmpty();
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return s1.a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return s1.b(this, collection.iterator());
        }
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        int i10;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            } else if (size >= 0) {
                i10 = size + 1;
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("expectedSize cannot be negative but was: ");
                sb2.append(size);
                throw new IllegalArgumentException(sb2.toString());
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((x) f()).M.d().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return f().size();
    }
}
