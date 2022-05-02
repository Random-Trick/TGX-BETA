package p033c6;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

public final class C1922t0 extends AbstractCollection {
    public final C1936u0 f6916a;

    public C1922t0(C1936u0 u0Var) {
        this.f6916a = u0Var;
    }

    @Override
    public final void clear() {
        this.f6916a.clear();
    }

    @Override
    public final Iterator iterator() {
        C1936u0 u0Var = this.f6916a;
        Map j = u0Var.m35875j();
        if (j != null) {
            return j.values().iterator();
        }
        return new C1838n0(u0Var);
    }

    @Override
    public final int size() {
        return this.f6916a.size();
    }
}
