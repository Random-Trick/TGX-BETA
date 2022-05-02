package p033c6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public final class C1977x extends AbstractC1825m1 {
    public final AbstractC1735g0 f7062M;
    public final transient Map f7063c;

    public C1977x(AbstractC1735g0 g0Var, Map map) {
        this.f7062M = g0Var;
        this.f7063c = map;
    }

    @Override
    public final Set<Map.Entry> mo35842a() {
        return new C1949v(this);
    }

    @Override
    public final void clear() {
        Map map;
        Map map2 = this.f7063c;
        map = this.f7062M.f6290c;
        if (map2 == map) {
            this.f7062M.m36038o();
        } else {
            C1736g1.m36037a(new C1963w(this));
        }
    }

    @Override
    public final boolean containsKey(@CheckForNull Object obj) {
        return C1839n1.m35976b(this.f7063c, obj);
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f7063c.equals(obj);
    }

    @Override
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) C1839n1.m35977a(this.f7063c, obj);
        if (collection == null) {
            return null;
        }
        return this.f7062M.mo35888h(obj, collection);
    }

    @Override
    public final int hashCode() {
        return this.f7063c.hashCode();
    }

    @Override
    public final Set keySet() {
        return this.f7062M.mo35970d();
    }

    @Override
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        int i;
        Collection collection = (Collection) this.f7063c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection g = this.f7062M.mo35994g();
        g.addAll(collection);
        AbstractC1735g0 g0Var = this.f7062M;
        i = g0Var.f6289M;
        g0Var.f6289M = i - collection.size();
        collection.clear();
        return g;
    }

    @Override
    public final int size() {
        return this.f7063c.size();
    }

    @Override
    public final String toString() {
        return this.f7063c.toString();
    }
}
