package d6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public final class x extends m1 {
    public final g0 M;
    public final transient Map f7099c;

    public x(g0 g0Var, Map map) {
        this.M = g0Var;
        this.f7099c = map;
    }

    @Override
    public final Set<Map.Entry> a() {
        return new v(this);
    }

    @Override
    public final void clear() {
        Map map;
        Map map2 = this.f7099c;
        map = this.M.f6509c;
        if (map2 == map) {
            this.M.o();
        } else {
            g1.a(new w(this));
        }
    }

    @Override
    public final boolean containsKey(@CheckForNull Object obj) {
        return n1.b(this.f7099c, obj);
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f7099c.equals(obj);
    }

    @Override
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) n1.a(this.f7099c, obj);
        if (collection == null) {
            return null;
        }
        return this.M.h(obj, collection);
    }

    @Override
    public final int hashCode() {
        return this.f7099c.hashCode();
    }

    @Override
    public final Set keySet() {
        return this.M.d();
    }

    @Override
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        int i10;
        Collection collection = (Collection) this.f7099c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection g10 = this.M.g();
        g10.addAll(collection);
        g0 g0Var = this.M;
        i10 = g0Var.M;
        g0Var.M = i10 - collection.size();
        collection.clear();
        return g10;
    }

    @Override
    public final int size() {
        return this.f7099c.size();
    }

    @Override
    public final String toString() {
        return this.f7099c.toString();
    }
}
