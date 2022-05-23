package l5;

import j5.c;
import l5.i;
import n6.m;

public final class o2 extends k2<Boolean> {
    public final i.a<?> f16182c;

    public o2(i.a<?> aVar, m<Boolean> mVar) {
        super(4, mVar);
        this.f16182c = aVar;
    }

    @Override
    public final void c(u uVar, boolean z10) {
    }

    @Override
    public final c[] f(c1<?> c1Var) {
        s1 s1Var = c1Var.w().get(this.f16182c);
        if (s1Var == null) {
            return null;
        }
        return s1Var.f16225a.c();
    }

    @Override
    public final boolean g(c1<?> c1Var) {
        s1 s1Var = c1Var.w().get(this.f16182c);
        return s1Var != null && s1Var.f16225a.e();
    }

    @Override
    public final void h(c1<?> c1Var) {
        s1 remove = c1Var.w().remove(this.f16182c);
        if (remove != null) {
            remove.f16226b.b(c1Var.v(), this.f16127b);
            remove.f16225a.a();
            return;
        }
        this.f16127b.e(Boolean.FALSE);
    }
}
