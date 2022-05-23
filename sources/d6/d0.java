package d6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

public class d0 extends AbstractCollection {
    @CheckForNull
    public final Collection M;
    public final g0 N;
    public final Object f6426a;
    public Collection f6427b;
    @CheckForNull
    public final d0 f6428c;

    public d0(g0 g0Var, Object obj, @CheckForNull Collection collection, d0 d0Var) {
        this.N = g0Var;
        this.f6426a = obj;
        this.f6427b = collection;
        this.f6428c = d0Var;
        this.M = d0Var == null ? null : d0Var.f6427b;
    }

    @Override
    public final boolean add(Object obj) {
        g();
        boolean isEmpty = this.f6427b.isEmpty();
        boolean add = this.f6427b.add(obj);
        if (add) {
            g0 g0Var = this.N;
            g0.m(g0Var, g0.i(g0Var) + 1);
            if (isEmpty) {
                f();
                return true;
            }
        }
        return add;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f6427b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f6427b.size();
        g0 g0Var = this.N;
        g0.m(g0Var, g0.i(g0Var) + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        f();
        return true;
    }

    @Override
    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f6427b.clear();
            g0 g0Var = this.N;
            g0.m(g0Var, g0.i(g0Var) - size);
            m();
        }
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        g();
        return this.f6427b.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection<?> collection) {
        g();
        return this.f6427b.containsAll(collection);
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        g();
        return this.f6427b.equals(obj);
    }

    public final void f() {
        d0 d0Var = this.f6428c;
        if (d0Var != null) {
            d0Var.f();
        } else {
            g0.l(this.N).put(this.f6426a, this.f6427b);
        }
    }

    public final void g() {
        Collection collection;
        d0 d0Var = this.f6428c;
        if (d0Var != null) {
            d0Var.g();
            if (this.f6428c.f6427b != this.M) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f6427b.isEmpty() && (collection = (Collection) g0.l(this.N).get(this.f6426a)) != null) {
            this.f6427b = collection;
        }
    }

    @Override
    public final int hashCode() {
        g();
        return this.f6427b.hashCode();
    }

    @Override
    public final Iterator iterator() {
        g();
        return new c0(this);
    }

    public final void m() {
        d0 d0Var = this.f6428c;
        if (d0Var != null) {
            d0Var.m();
        } else if (this.f6427b.isEmpty()) {
            g0.l(this.N).remove(this.f6426a);
        }
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        g();
        boolean remove = this.f6427b.remove(obj);
        if (remove) {
            g0 g0Var = this.N;
            g0.m(g0Var, g0.i(g0Var) - 1);
            m();
        }
        return remove;
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f6427b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f6427b.size();
            g0 g0Var = this.N;
            g0.m(g0Var, g0.i(g0Var) + (size2 - size));
            m();
        }
        return removeAll;
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f6427b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f6427b.size();
            g0 g0Var = this.N;
            g0.m(g0Var, g0.i(g0Var) + (size2 - size));
            m();
        }
        return retainAll;
    }

    @Override
    public final int size() {
        g();
        return this.f6427b.size();
    }

    @Override
    public final String toString() {
        g();
        return this.f6427b.toString();
    }
}
