package p033c6;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C1908s0 extends AbstractC1750h0 {
    @NullableDecl
    public final Object f6884a;
    public int f6885b;
    public final C1936u0 f6886c;

    public C1908s0(C1936u0 u0Var, int i) {
        this.f6886c = u0Var;
        this.f6884a = u0Var.f6965c[i];
        this.f6885b = i;
    }

    public final void m35912a() {
        int q;
        int i = this.f6885b;
        if (i == -1 || i >= this.f6886c.size() || !C1837n.m35978a(this.f6884a, this.f6886c.f6965c[this.f6885b])) {
            q = this.f6886c.m35871q(this.f6884a);
            this.f6885b = q;
        }
    }

    @Override
    @NullableDecl
    public final Object getKey() {
        return this.f6884a;
    }

    @Override
    @NullableDecl
    public final Object getValue() {
        Map j = this.f6886c.m35878j();
        if (j != null) {
            return j.get(this.f6884a);
        }
        m35912a();
        int i = this.f6885b;
        if (i == -1) {
            return null;
        }
        return this.f6886c.f6957M[i];
    }

    @Override
    public final Object setValue(Object obj) {
        Map j = this.f6886c.m35878j();
        if (j != null) {
            return j.put(this.f6884a, obj);
        }
        m35912a();
        int i = this.f6885b;
        if (i == -1) {
            this.f6886c.put(this.f6884a, obj);
            return null;
        }
        Object[] objArr = this.f6886c.f6957M;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
