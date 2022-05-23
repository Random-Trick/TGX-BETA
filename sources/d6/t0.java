package d6;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

public final class t0 extends AbstractCollection {
    public final u0 f6980a;

    public t0(u0 u0Var) {
        this.f6980a = u0Var;
    }

    @Override
    public final void clear() {
        this.f6980a.clear();
    }

    @Override
    public final Iterator iterator() {
        u0 u0Var = this.f6980a;
        Map j10 = u0Var.j();
        if (j10 != null) {
            return j10.values().iterator();
        }
        return new n0(u0Var);
    }

    @Override
    public final int size() {
        return this.f6980a.size();
    }
}
