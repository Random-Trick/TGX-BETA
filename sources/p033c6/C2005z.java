package p033c6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

public final class C2005z extends C1796k1 {
    public final AbstractC1735g0 f7141b;

    public C2005z(AbstractC1735g0 g0Var, Map map) {
        super(map);
        this.f7141b = g0Var;
    }

    @Override
    public final void clear() {
        C1736g1.m36034a(iterator());
    }

    @Override
    public final boolean containsAll(Collection<?> collection) {
        return this.f6418a.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f6418a.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f6418a.keySet().hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new C1991y(this, this.f6418a.entrySet().iterator());
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        int i;
        Collection collection = (Collection) this.f6418a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        AbstractC1735g0 g0Var = this.f7141b;
        i = g0Var.f6289M;
        g0Var.f6289M = i - size;
        return size > 0;
    }
}
