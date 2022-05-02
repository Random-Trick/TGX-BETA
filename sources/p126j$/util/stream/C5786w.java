package p126j$.util.stream;

import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5526h;
import p126j$.util.function.AbstractC5527i;
import p126j$.util.function.C5520b;

class C5786w extends AbstractC5724j2 {
    public final int f18495b;
    final Object f18496c;

    public C5786w(AbstractC5686c cVar, AbstractC5759q2 q2Var, int i) {
        super(q2Var);
        this.f18495b = i;
        this.f18496c = cVar;
    }

    @Override
    public void mo22135c(double d) {
        switch (this.f18495b) {
            case 0:
                this.f18394a.mo22135c(((C5520b) ((C5791x) this.f18496c).f18504v).m22497b(d));
                return;
            case 1:
                this.f18394a.mo22128k(((AbstractC5526h) ((C5796y) this.f18496c).f18513v).mo22322z(d));
                return;
            case 2:
                this.f18394a.mo22134d(((C5520b) ((C5801z) this.f18496c).f18521v).m22494e(d));
                return;
            case 3:
                this.f18394a.mo22133e(((AbstractC5527i) ((C5556A) this.f18496c).f18092v).mo22325r(d));
                return;
            case 4:
                AbstractC5591H h = (AbstractC5591H) ((AbstractC5526h) ((C5791x) this.f18496c).f18504v).mo22322z(d);
                if (h != null) {
                    try {
                        h.sequential().mo22385d(new C5781v(this, 1));
                    } catch (Throwable th) {
                        try {
                            ((AbstractC5686c) h).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (h != null) {
                    ((AbstractC5686c) h).close();
                    return;
                }
                return;
            case 5:
                if (((C5520b) ((C5791x) this.f18496c).f18504v).m22500C(d)) {
                    this.f18394a.mo22135c(d);
                    return;
                }
                return;
            default:
                ((AbstractC5525g) ((C5791x) this.f18496c).f18504v).mo22150c(d);
                this.f18394a.mo22135c(d);
                return;
        }
    }

    @Override
    public void mo22131j(long j) {
        switch (this.f18495b) {
            case 4:
                this.f18394a.mo22131j(-1L);
                return;
            case 5:
                this.f18394a.mo22131j(-1L);
                return;
            default:
                this.f18394a.mo22131j(j);
                return;
        }
    }
}
