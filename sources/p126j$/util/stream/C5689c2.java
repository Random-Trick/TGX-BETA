package p126j$.util.stream;

import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.Consumer;
import p126j$.util.function.ToDoubleFunction;
import p126j$.util.function.ToIntFunction;
import p126j$.util.function.ToLongFunction;

class C5689c2 extends AbstractC5739m2 {
    public final int f18333b;
    final Object f18334c;

    public C5689c2(AbstractC5686c cVar, AbstractC5759q2 q2Var, int i) {
        super(q2Var);
        this.f18333b = i;
        this.f18334c = cVar;
    }

    @Override
    public void mo22132j(long j) {
        switch (this.f18333b) {
            case 1:
                this.f18428a.mo22132j(-1L);
                return;
            case 6:
                this.f18428a.mo22132j(-1L);
                return;
            default:
                this.f18428a.mo22132j(j);
                return;
        }
    }

    @Override
    public void mo22129k(Object obj) {
        switch (this.f18333b) {
            case 0:
                ((Consumer) ((C5796y) this.f18334c).f18513v).mo22129k(obj);
                this.f18428a.mo22129k(obj);
                return;
            case 1:
                if (((AbstractC5541w) ((C5796y) this.f18334c).f18513v).mo22211n(obj)) {
                    this.f18428a.mo22129k(obj);
                    return;
                }
                return;
            case 2:
                this.f18428a.mo22129k(((C5699e2) this.f18334c).f18346v.mo22503a(obj));
                return;
            case 3:
                this.f18428a.mo22135d(((ToIntFunction) ((C5801z) this.f18334c).f18521v).mo22327f(obj));
                return;
            case 4:
                this.f18428a.mo22134e(((ToLongFunction) ((C5556A) this.f18334c).f18092v).mo22233g(obj));
                return;
            case 5:
                this.f18428a.mo22136c(((ToDoubleFunction) ((C5791x) this.f18334c).f18504v).mo22325v(obj));
                return;
            default:
                AbstractC5690c3 c3Var = (AbstractC5690c3) ((C5699e2) this.f18334c).f18346v.mo22503a(obj);
                if (c3Var != null) {
                    try {
                        AbstractC5686c cVar = (AbstractC5686c) c3Var;
                        cVar.m22310G0();
                        ((AbstractC5690c3) cVar).mo22245a(this.f18428a);
                    } catch (Throwable th) {
                        try {
                            ((AbstractC5686c) c3Var).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c3Var != null) {
                    ((AbstractC5686c) c3Var).close();
                    return;
                }
                return;
        }
    }
}
