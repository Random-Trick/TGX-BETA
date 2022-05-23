package d6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class o0 extends AbstractSet<Map.Entry> {
    public final u0 f6739a;

    public o0(u0 u0Var) {
        this.f6739a = u0Var;
    }

    @Override
    public final void clear() {
        this.f6739a.clear();
    }

    @Override
    public final boolean contains(@NullableDecl Object obj) {
        int q10;
        Map j10 = this.f6739a.j();
        if (j10 != null) {
            return j10.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            q10 = this.f6739a.q(entry.getKey());
            if (q10 != -1 && n.a(this.f6739a.M[q10], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator<Map.Entry> iterator() {
        u0 u0Var = this.f6739a;
        Map j10 = u0Var.j();
        if (j10 != null) {
            return j10.entrySet().iterator();
        }
        return new m0(u0Var);
    }

    @Override
    public final boolean remove(@NullableDecl Object obj) {
        int p10;
        Object obj2;
        int i10;
        Map j10 = this.f6739a.j();
        if (j10 != null) {
            return j10.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f6739a.o()) {
            return false;
        }
        p10 = this.f6739a.p();
        Object key = entry.getKey();
        Object value = entry.getValue();
        obj2 = this.f6739a.f7016a;
        u0 u0Var = this.f6739a;
        int b10 = v0.b(key, value, p10, obj2, u0Var.f7017b, u0Var.f7018c, u0Var.M);
        if (b10 == -1) {
            return false;
        }
        this.f6739a.n(b10, p10);
        u0 u0Var2 = this.f6739a;
        i10 = u0Var2.O;
        u0Var2.O = i10 - 1;
        this.f6739a.l();
        return true;
    }

    @Override
    public final int size() {
        return this.f6739a.size();
    }
}
