package p126j$.util.stream;

import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.AbstractC5536r;
import p126j$.util.function.AbstractC5537s;
import p126j$.util.function.C5520b;

class C5747o0 extends AbstractC5734l2 {
    public final int f18442b;
    final Object f18443c;

    public C5747o0(AbstractC5686c cVar, AbstractC5759q2 q2Var, int i) {
        super(q2Var);
        this.f18442b = i;
        this.f18443c = cVar;
    }

    @Override
    public void mo22133e(long j) {
        switch (this.f18442b) {
            case 0:
                this.f18425a.mo22135c(j);
                return;
            case 1:
                this.f18425a.mo22133e(((AbstractC5537s) ((C5556A) this.f18443c).f18092v).mo22323y(j));
                return;
            case 2:
                this.f18425a.mo22128k(((AbstractC5536r) ((C5796y) this.f18443c).f18513v).mo22209x(j));
                return;
            case 3:
                this.f18425a.mo22134d(((C5520b) ((C5801z) this.f18443c).f18521v).m22492g(j));
                return;
            case 4:
                this.f18425a.mo22135c(((C5520b) ((C5791x) this.f18443c).f18504v).m22495d(j));
                return;
            case 5:
                AbstractC5777u0 u0Var = (AbstractC5777u0) ((AbstractC5536r) ((C5556A) this.f18443c).f18092v).mo22209x(j);
                if (u0Var != null) {
                    try {
                        u0Var.sequential().mo22171b(new C5742n0(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC5686c) u0Var).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (u0Var != null) {
                    ((AbstractC5686c) u0Var).close();
                    return;
                }
                return;
            case 6:
                if (((C5520b) ((C5556A) this.f18443c).f18092v).m22498E(j)) {
                    this.f18425a.mo22133e(j);
                    return;
                }
                return;
            default:
                ((AbstractC5535q) ((C5556A) this.f18443c).f18092v).mo22127e(j);
                this.f18425a.mo22133e(j);
                return;
        }
    }

    @Override
    public void mo22131j(long j) {
        switch (this.f18442b) {
            case 5:
                this.f18425a.mo22131j(-1L);
                return;
            case 6:
                this.f18425a.mo22131j(-1L);
                return;
            default:
                this.f18425a.mo22131j(j);
                return;
        }
    }
}
