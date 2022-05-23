package d6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

public final class z extends k1 {
    public final g0 f7170b;

    public z(g0 g0Var, Map map) {
        super(map);
        this.f7170b = g0Var;
    }

    @Override
    public final void clear() {
        g1.a(iterator());
    }

    @Override
    public final boolean containsAll(Collection<?> collection) {
        return this.f6619a.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f6619a.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f6619a.keySet().hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new y(this, this.f6619a.entrySet().iterator());
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        int i10;
        Collection collection = (Collection) this.f6619a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        g0 g0Var = this.f7170b;
        i10 = g0Var.M;
        g0Var.M = i10 - size;
        return size > 0;
    }
}
