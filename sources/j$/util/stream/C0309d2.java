package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;

final class C0309d2 extends AbstractC0359n2 {
    public final int f14730b;
    final Object f14731c;

    public C0309d2(AbstractC0301c cVar, AbstractC0378r2 r2Var, int i10) {
        super(r2Var);
        this.f14730b = i10;
        this.f14731c = cVar;
    }

    @Override
    public final void k(long j10) {
        switch (this.f14730b) {
            case 1:
                this.f14822a.k(-1L);
                return;
            case 6:
                this.f14822a.k(-1L);
                return;
            default:
                this.f14822a.k(j10);
                return;
        }
    }

    @Override
    public final void l(Object obj) {
        switch (this.f14730b) {
            case 0:
                ((Consumer) ((C0408z) this.f14731c).f14907v).l(obj);
                this.f14822a.l(obj);
                return;
            case 1:
                if (((E) ((C0408z) this.f14731c).f14907v).n(obj)) {
                    this.f14822a.l(obj);
                    return;
                }
                return;
            case 2:
                this.f14822a.l(((C0319f2) this.f14731c).f14748v.a(obj));
                return;
            case 3:
                this.f14822a.d(((ToIntFunction) ((A) this.f14731c).f14480v).f(obj));
                return;
            case 4:
                this.f14822a.e(((ToLongFunction) ((B) this.f14731c).f14487v).g(obj));
                return;
            case 5:
                this.f14822a.c(((ToDoubleFunction) ((C0404y) this.f14731c).f14898v).w(obj));
                return;
            default:
                AbstractC0310d3 d3Var = (AbstractC0310d3) ((C0319f2) this.f14731c).f14748v.a(obj);
                if (d3Var != null) {
                    try {
                        AbstractC0301c cVar = (AbstractC0301c) d3Var;
                        cVar.K0();
                        ((AbstractC0310d3) cVar).a(this.f14822a);
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0301c) d3Var).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (d3Var != null) {
                    ((AbstractC0301c) d3Var).close();
                    return;
                }
                return;
        }
    }
}
