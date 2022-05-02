package p033c6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C1852o0 extends AbstractSet<Map.Entry> {
    public final C1936u0 f6575a;

    public C1852o0(C1936u0 u0Var) {
        this.f6575a = u0Var;
    }

    @Override
    public final void clear() {
        this.f6575a.clear();
    }

    @Override
    public final boolean contains(@NullableDecl Object obj) {
        int q;
        Map j = this.f6575a.m35875j();
        if (j != null) {
            return j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            q = this.f6575a.m35868q(entry.getKey());
            if (q != -1 && C1837n.m35975a(this.f6575a.f6957M[q], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator<Map.Entry> iterator() {
        C1936u0 u0Var = this.f6575a;
        Map j = u0Var.m35875j();
        if (j != null) {
            return j.entrySet().iterator();
        }
        return new C1824m0(u0Var);
    }

    @Override
    public final boolean remove(@NullableDecl Object obj) {
        int p;
        Object obj2;
        int i;
        Map j = this.f6575a.m35875j();
        if (j != null) {
            return j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f6575a.m35870o()) {
            return false;
        }
        p = this.f6575a.m35869p();
        Object key = entry.getKey();
        Object value = entry.getValue();
        obj2 = this.f6575a.f6963a;
        C1936u0 u0Var = this.f6575a;
        int b = C1950v0.m35859b(key, value, p, obj2, u0Var.f6964b, u0Var.f6965c, u0Var.f6957M);
        if (b == -1) {
            return false;
        }
        this.f6575a.m35871n(b, p);
        C1936u0 u0Var2 = this.f6575a;
        i = u0Var2.f6959O;
        u0Var2.f6959O = i - 1;
        this.f6575a.m35873l();
        return true;
    }

    @Override
    public final int size() {
        return this.f6575a.size();
    }
}
