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
    public void mo22134e(long j) {
        switch (this.f18442b) {
            case 0:
                this.f18425a.mo22136c(j);
                return;
            case 1:
                this.f18425a.mo22134e(((AbstractC5537s) ((C5556A) this.f18443c).f18092v).mo22324y(j));
                return;
            case 2:
                this.f18425a.mo22129k(((AbstractC5536r) ((C5796y) this.f18443c).f18513v).mo22210x(j));
                return;
            case 3:
                this.f18425a.mo22135d(((C5520b) ((C5801z) this.f18443c).f18521v).m22493g(j));
                return;
            case 4:
                this.f18425a.mo22136c(((C5520b) ((C5791x) this.f18443c).f18504v).m22496d(j));
                return;
            case 5:
                AbstractC5777u0 u0Var = (AbstractC5777u0) ((AbstractC5536r) ((C5556A) this.f18443c).f18092v).mo22210x(j);
                if (u0Var != null) {
                    try {
                        u0Var.sequential().mo22172b(new C5742n0(this, 1));
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
                if (((C5520b) ((C5556A) this.f18443c).f18092v).m22499E(j)) {
                    this.f18425a.mo22134e(j);
                    return;
                }
                return;
            default:
                ((AbstractC5535q) ((C5556A) this.f18443c).f18092v).mo22128e(j);
                this.f18425a.mo22134e(j);
                return;
        }
    }

    @Override
    public void mo22132j(long j) {
        switch (this.f18442b) {
            case 5:
                this.f18425a.mo22132j(-1L);
                return;
            case 6:
                this.f18425a.mo22132j(-1L);
                return;
            default:
                this.f18425a.mo22132j(j);
                return;
        }
    }
}
