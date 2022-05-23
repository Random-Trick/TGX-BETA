package j$.util.stream;

import j$.util.function.C0274b;
import j$.util.function.n;
import j$.util.function.o;
import j$.util.function.p;
import j$.util.function.q;
import j$.util.function.r;
import j$.util.function.s;

final class C0312e0 extends AbstractC0349l2 {
    public final int f14736b;
    final Object f14737c;

    public C0312e0(AbstractC0301c cVar, AbstractC0378r2 r2Var, int i10) {
        super(r2Var);
        this.f14736b = i10;
        this.f14737c = cVar;
    }

    @Override
    public final void d(int i10) {
        switch (this.f14736b) {
            case 0:
                this.f14807a.e(i10);
                return;
            case 1:
                ((n) ((A) this.f14737c).f14480v).d(i10);
                this.f14807a.d(i10);
                return;
            case 2:
                this.f14807a.c(i10);
                return;
            case 3:
                this.f14807a.d(((C0274b) ((s) ((A) this.f14737c).f14480v)).f(i10));
                return;
            case 4:
                this.f14807a.l(((o) ((C0408z) this.f14737c).f14907v).z(i10));
                return;
            case 5:
                this.f14807a.e(((r) ((B) this.f14737c).f14487v).D(i10));
                return;
            case 6:
                this.f14807a.c(((C0274b) ((q) ((C0404y) this.f14737c).f14898v)).c(i10));
                return;
            case 7:
                AbstractC0352m0 m0Var = (AbstractC0352m0) ((o) ((A) this.f14737c).f14480v).z(i10);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().e(new C0307d0(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0301c) m0Var).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (m0Var != null) {
                    ((AbstractC0301c) m0Var).close();
                    return;
                }
                return;
            default:
                if (((C0274b) ((p) ((A) this.f14737c).f14480v)).y(i10)) {
                    this.f14807a.d(i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void k(long j10) {
        switch (this.f14736b) {
            case 7:
                this.f14807a.k(-1L);
                return;
            case 8:
                this.f14807a.k(-1L);
                return;
            default:
                this.f14807a.k(j10);
                return;
        }
    }
}
