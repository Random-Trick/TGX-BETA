package p148k5;

import p118i5.C5219c;
import p148k5.C6120i;
import p177m6.C6777m;

public final class C6150o2 extends AbstractC6133k2<Boolean> {
    public final C6120i.C6121a<?> f19495c;

    public C6150o2(C6120i.C6121a<?> aVar, C6777m<Boolean> mVar) {
        super(4, mVar);
        this.f19495c = aVar;
    }

    @Override
    public final void mo21182c(C6172u uVar, boolean z) {
    }

    @Override
    public final C5219c[] mo21186f(C6093c1<?> c1Var) {
        C6166s1 s1Var = c1Var.m21339w().get(this.f19495c);
        if (s1Var == null) {
            return null;
        }
        return s1Var.f19539a.m21201c();
    }

    @Override
    public final boolean mo21185g(C6093c1<?> c1Var) {
        C6166s1 s1Var = c1Var.m21339w().get(this.f19495c);
        return s1Var != null && s1Var.f19539a.m21200e();
    }

    @Override
    public final void mo21188h(C6093c1<?> c1Var) {
        C6166s1 remove = c1Var.m21339w().remove(this.f19495c);
        if (remove != null) {
            remove.f19540b.mo21098b(c1Var.m21340v(), this.f19440b);
            remove.f19539a.m21203a();
            return;
        }
        this.f19440b.m19082e(Boolean.FALSE);
    }
}
