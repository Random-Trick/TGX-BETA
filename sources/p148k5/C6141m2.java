package p148k5;

import p118i5.C5219c;
import p148k5.C6120i;
import p177m6.C6777m;

public final class C6141m2 extends AbstractC6133k2<Void> {
    public final C6166s1 f19473c;

    public C6141m2(C6166s1 s1Var, C6777m<Void> mVar) {
        super(3, mVar);
        this.f19473c = s1Var;
    }

    @Override
    public final void mo21183c(C6172u uVar, boolean z) {
    }

    @Override
    public final C5219c[] mo21187f(C6093c1<?> c1Var) {
        return this.f19473c.f19539a.m21202c();
    }

    @Override
    public final boolean mo21186g(C6093c1<?> c1Var) {
        return this.f19473c.f19539a.m21201e();
    }

    @Override
    public final void mo21189h(C6093c1<?> c1Var) {
        this.f19473c.f19539a.mo21103d(c1Var.m21341v(), this.f19440b);
        C6120i.C6121a<?> b = this.f19473c.f19539a.m21203b();
        if (b != null) {
            c1Var.m21340w().put(b, this.f19473c);
        }
    }
}
