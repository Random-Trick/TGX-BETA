package d6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class r0 extends AbstractSet {
    public final u0 f6917a;

    public r0(u0 u0Var) {
        this.f6917a = u0Var;
    }

    @Override
    public final void clear() {
        this.f6917a.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6917a.containsKey(obj);
    }

    @Override
    public final Iterator iterator() {
        u0 u0Var = this.f6917a;
        Map j10 = u0Var.j();
        if (j10 != null) {
            return j10.keySet().iterator();
        }
        return new l0(u0Var);
    }

    @Override
    public final boolean remove(@NullableDecl Object obj) {
        Object s10;
        Object obj2;
        Map j10 = this.f6917a.j();
        if (j10 != null) {
            return j10.keySet().remove(obj);
        }
        s10 = this.f6917a.s(obj);
        obj2 = u0.S;
        return s10 != obj2;
    }

    @Override
    public final int size() {
        return this.f6917a.size();
    }
}
