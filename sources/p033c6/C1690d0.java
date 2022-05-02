package p033c6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public class C1690d0 extends AbstractCollection {
    @CheckForNull
    public final Collection f6178M;
    public final AbstractC1735g0 f6179N;
    public final Object f6180a;
    public Collection f6181b;
    @CheckForNull
    public final C1690d0 f6182c;

    public C1690d0(AbstractC1735g0 g0Var, Object obj, @CheckForNull Collection collection, C1690d0 d0Var) {
        this.f6179N = g0Var;
        this.f6180a = obj;
        this.f6181b = collection;
        this.f6182c = d0Var;
        this.f6178M = d0Var == null ? null : d0Var.f6181b;
    }

    @Override
    public final boolean add(Object obj) {
        int i;
        m36091i();
        boolean isEmpty = this.f6181b.isEmpty();
        boolean add = this.f6181b.add(obj);
        if (add) {
            AbstractC1735g0 g0Var = this.f6179N;
            i = g0Var.f6289M;
            g0Var.f6289M = i + 1;
            if (isEmpty) {
                m36092h();
                return true;
            }
        }
        return add;
    }

    @Override
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f6181b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f6181b.size();
        AbstractC1735g0 g0Var = this.f6179N;
        i = g0Var.f6289M;
        g0Var.f6289M = i + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        m36092h();
        return true;
    }

    @Override
    public final void clear() {
        int i;
        int size = size();
        if (size != 0) {
            this.f6181b.clear();
            AbstractC1735g0 g0Var = this.f6179N;
            i = g0Var.f6289M;
            g0Var.f6289M = i - size;
            m36090m();
        }
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        m36091i();
        return this.f6181b.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection<?> collection) {
        m36091i();
        return this.f6181b.containsAll(collection);
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        m36091i();
        return this.f6181b.equals(obj);
    }

    public final void m36092h() {
        Map map;
        C1690d0 d0Var = this.f6182c;
        if (d0Var != null) {
            d0Var.m36092h();
            return;
        }
        map = this.f6179N.f6290c;
        map.put(this.f6180a, this.f6181b);
    }

    @Override
    public final int hashCode() {
        m36091i();
        return this.f6181b.hashCode();
    }

    public final void m36091i() {
        Map map;
        C1690d0 d0Var = this.f6182c;
        if (d0Var != null) {
            d0Var.m36091i();
            if (this.f6182c.f6181b != this.f6178M) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f6181b.isEmpty()) {
            map = this.f6179N.f6290c;
            Collection collection = (Collection) map.get(this.f6180a);
            if (collection != null) {
                this.f6181b = collection;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        m36091i();
        return new C1675c0(this);
    }

    public final void m36090m() {
        Map map;
        C1690d0 d0Var = this.f6182c;
        if (d0Var != null) {
            d0Var.m36090m();
        } else if (this.f6181b.isEmpty()) {
            map = this.f6179N.f6290c;
            map.remove(this.f6180a);
        }
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        int i;
        m36091i();
        boolean remove = this.f6181b.remove(obj);
        if (remove) {
            AbstractC1735g0 g0Var = this.f6179N;
            i = g0Var.f6289M;
            g0Var.f6289M = i - 1;
            m36090m();
        }
        return remove;
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f6181b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f6181b.size();
            AbstractC1735g0 g0Var = this.f6179N;
            i = g0Var.f6289M;
            g0Var.f6289M = i + (size2 - size);
            m36090m();
        }
        return removeAll;
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        int i;
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f6181b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f6181b.size();
            AbstractC1735g0 g0Var = this.f6179N;
            i = g0Var.f6289M;
            g0Var.f6289M = i + (size2 - size);
            m36090m();
        }
        return retainAll;
    }

    @Override
    public final int size() {
        m36091i();
        return this.f6181b.size();
    }

    @Override
    public final String toString() {
        m36091i();
        return this.f6181b.toString();
    }
}
