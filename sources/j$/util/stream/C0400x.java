package j$.util.stream;

import j$.util.function.AbstractC0278f;
import j$.util.function.C0274b;
import j$.util.function.g;
import j$.util.function.h;
import j$.util.function.i;
import j$.util.function.j;
import j$.util.function.k;

final class C0400x extends AbstractC0344k2 {
    public final int f14889b;
    final Object f14890c;

    public C0400x(AbstractC0301c cVar, AbstractC0378r2 r2Var, int i10) {
        super(r2Var);
        this.f14889b = i10;
        this.f14890c = cVar;
    }

    @Override
    public final void c(double d10) {
        switch (this.f14889b) {
            case 0:
                this.f14788a.c(((C0274b) ((k) ((C0404y) this.f14890c).f14898v)).b(d10));
                return;
            case 1:
                this.f14788a.l(((g) ((C0408z) this.f14890c).f14907v).C(d10));
                return;
            case 2:
                this.f14788a.d(((C0274b) ((i) ((A) this.f14890c).f14480v)).e(d10));
                return;
            case 3:
                this.f14788a.e(((j) ((B) this.f14890c).f14487v).s(d10));
                return;
            case 4:
                I i10 = (I) ((g) ((C0404y) this.f14890c).f14898v).C(d10);
                if (i10 != null) {
                    try {
                        i10.sequential().d(new C0396w(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0301c) i10).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (i10 != null) {
                    ((AbstractC0301c) i10).close();
                    return;
                }
                return;
            case 5:
                if (((C0274b) ((h) ((C0404y) this.f14890c).f14898v)).x(d10)) {
                    this.f14788a.c(d10);
                    return;
                }
                return;
            default:
                ((AbstractC0278f) ((C0404y) this.f14890c).f14898v).c(d10);
                this.f14788a.c(d10);
                return;
        }
    }

    @Override
    public final void k(long j10) {
        switch (this.f14889b) {
            case 4:
                this.f14788a.k(-1L);
                return;
            case 5:
                this.f14788a.k(-1L);
                return;
            default:
                this.f14788a.k(j10);
                return;
        }
    }
}
