package l5;

import j5.c;
import l5.i;
import n6.m;

public final class m2 extends k2<Void> {
    public final s1 f16160c;

    public m2(s1 s1Var, m<Void> mVar) {
        super(3, mVar);
        this.f16160c = s1Var;
    }

    @Override
    public final void c(u uVar, boolean z10) {
    }

    @Override
    public final c[] f(c1<?> c1Var) {
        return this.f16160c.f16225a.c();
    }

    @Override
    public final boolean g(c1<?> c1Var) {
        return this.f16160c.f16225a.e();
    }

    @Override
    public final void h(c1<?> c1Var) {
        this.f16160c.f16225a.d(c1Var.v(), this.f16127b);
        i.a<?> b10 = this.f16160c.f16225a.b();
        if (b10 != null) {
            c1Var.w().put(b10, this.f16160c);
        }
    }
}
