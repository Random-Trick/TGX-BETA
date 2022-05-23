package j$.util.stream;

import j$.util.function.A;
import j$.util.function.C0274b;
import j$.util.function.v;
import j$.util.function.w;
import j$.util.function.x;
import j$.util.function.y;
import j$.util.function.z;

final class C0367p0 extends AbstractC0354m2 {
    public final int f14836b;
    final Object f14837c;

    public C0367p0(AbstractC0301c cVar, AbstractC0378r2 r2Var, int i10) {
        super(r2Var);
        this.f14836b = i10;
        this.f14837c = cVar;
    }

    @Override
    public final void e(long j10) {
        switch (this.f14836b) {
            case 0:
                this.f14819a.c(j10);
                return;
            case 1:
                this.f14819a.e(((A) ((B) this.f14837c).f14487v).B(j10));
                return;
            case 2:
                this.f14819a.l(((w) ((C0408z) this.f14837c).f14907v).A(j10));
                return;
            case 3:
                this.f14819a.d(((C0274b) ((z) ((A) this.f14837c).f14480v)).g(j10));
                return;
            case 4:
                this.f14819a.c(((C0274b) ((y) ((C0404y) this.f14837c).f14898v)).d(j10));
                return;
            case 5:
                AbstractC0393v0 v0Var = (AbstractC0393v0) ((w) ((B) this.f14837c).f14487v).A(j10);
                if (v0Var != null) {
                    try {
                        v0Var.sequential().b(new C0362o0(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0301c) v0Var).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (v0Var != null) {
                    ((AbstractC0301c) v0Var).close();
                    return;
                }
                return;
            case 6:
                if (((C0274b) ((x) ((B) this.f14837c).f14487v)).E(j10)) {
                    this.f14819a.e(j10);
                    return;
                }
                return;
            default:
                ((v) ((B) this.f14837c).f14487v).e(j10);
                this.f14819a.e(j10);
                return;
        }
    }

    @Override
    public final void k(long j10) {
        switch (this.f14836b) {
            case 5:
                this.f14819a.k(-1L);
                return;
            case 6:
                this.f14819a.k(-1L);
                return;
            default:
                this.f14819a.k(j10);
                return;
        }
    }
}
