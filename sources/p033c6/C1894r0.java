package p033c6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C1894r0 extends AbstractSet {
    public final C1936u0 f6848a;

    public C1894r0(C1936u0 u0Var) {
        this.f6848a = u0Var;
    }

    @Override
    public final void clear() {
        this.f6848a.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6848a.containsKey(obj);
    }

    @Override
    public final Iterator iterator() {
        C1936u0 u0Var = this.f6848a;
        Map j = u0Var.m35878j();
        if (j != null) {
            return j.keySet().iterator();
        }
        return new C1810l0(u0Var);
    }

    @Override
    public final boolean remove(@NullableDecl Object obj) {
        Object s;
        Object obj2;
        Map j = this.f6848a.m35878j();
        if (j != null) {
            return j.keySet().remove(obj);
        }
        s = this.f6848a.m35869s(obj);
        obj2 = C1936u0.f6956S;
        return s != obj2;
    }

    @Override
    public final int size() {
        return this.f6848a.size();
    }
}
