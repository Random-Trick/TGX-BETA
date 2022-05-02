package p126j$.util.stream;

import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5532n;
import p126j$.util.function.C5520b;

class C5692d0 extends AbstractC5729k2 {
    public final int f18337b;
    final Object f18338c;

    public C5692d0(AbstractC5686c cVar, AbstractC5759q2 q2Var, int i) {
        super(q2Var);
        this.f18337b = i;
        this.f18338c = cVar;
    }

    @Override
    public void mo22135d(int i) {
        switch (this.f18337b) {
            case 0:
                this.f18413a.mo22134e(i);
                return;
            case 1:
                ((AbstractC5530l) ((C5801z) this.f18338c).f18521v).mo22145d(i);
                this.f18413a.mo22135d(i);
                return;
            case 2:
                this.f18413a.mo22136c(i);
                return;
            case 3:
                this.f18413a.mo22135d(((C5520b) ((C5801z) this.f18338c).f18521v).m22494f(i));
                return;
            case 4:
                this.f18413a.mo22129k(((AbstractC5531m) ((C5796y) this.f18338c).f18513v).mo22179w(i));
                return;
            case 5:
                this.f18413a.mo22134e(((AbstractC5532n) ((C5556A) this.f18338c).f18092v).mo22328A(i));
                return;
            case 6:
                this.f18413a.mo22136c(((C5520b) ((C5791x) this.f18338c).f18504v).m22497c(i));
                return;
            case 7:
                AbstractC5732l0 l0Var = (AbstractC5732l0) ((AbstractC5531m) ((C5801z) this.f18338c).f18521v).mo22179w(i);
                if (l0Var != null) {
                    try {
                        l0Var.sequential().mo22222e(new C5687c0(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC5686c) l0Var).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (l0Var != null) {
                    ((AbstractC5686c) l0Var).close();
                    return;
                }
                return;
            default:
                if (((C5520b) ((C5801z) this.f18338c).f18521v).m22500D(i)) {
                    this.f18413a.mo22135d(i);
                    return;
                }
                return;
        }
    }

    @Override
    public void mo22132j(long j) {
        switch (this.f18337b) {
            case 7:
                this.f18413a.mo22132j(-1L);
                return;
            case 8:
                this.f18413a.mo22132j(-1L);
                return;
            default:
                this.f18413a.mo22132j(j);
                return;
        }
    }
}
