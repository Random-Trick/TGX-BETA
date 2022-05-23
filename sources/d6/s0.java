package d6;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class s0 extends h0 {
    @NullableDecl
    public final Object f6953a;
    public int f6954b;
    public final u0 f6955c;

    public s0(u0 u0Var, int i10) {
        this.f6955c = u0Var;
        this.f6953a = u0Var.f7018c[i10];
        this.f6954b = i10;
    }

    public final void a() {
        int q10;
        int i10 = this.f6954b;
        if (i10 == -1 || i10 >= this.f6955c.size() || !n.a(this.f6953a, this.f6955c.f7018c[this.f6954b])) {
            q10 = this.f6955c.q(this.f6953a);
            this.f6954b = q10;
        }
    }

    @Override
    @NullableDecl
    public final Object getKey() {
        return this.f6953a;
    }

    @Override
    @NullableDecl
    public final Object getValue() {
        Map j10 = this.f6955c.j();
        if (j10 != null) {
            return j10.get(this.f6953a);
        }
        a();
        int i10 = this.f6954b;
        if (i10 == -1) {
            return null;
        }
        return this.f6955c.M[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        Map j10 = this.f6955c.j();
        if (j10 != null) {
            return j10.put(this.f6953a, obj);
        }
        a();
        int i10 = this.f6954b;
        if (i10 == -1) {
            this.f6955c.put(this.f6953a, obj);
            return null;
        }
        Object[] objArr = this.f6955c.M;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
