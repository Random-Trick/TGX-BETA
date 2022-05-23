package j$.util.stream;

import j$.util.H;
import java.util.concurrent.CountedCompleter;

final class U extends AbstractC0306d {
    private final N f14635j;

    public U(N n10, E0 e02, H h10) {
        super(e02, h10);
        this.f14635j = n10;
    }

    U(U u10, H h10) {
        super(u10, h10);
        this.f14635j = u10.f14635j;
    }

    private void m(Object obj) {
        boolean z10;
        U u10 = this;
        while (true) {
            if (u10 != null) {
                AbstractC0316f c10 = u10.c();
                if (c10 != null && c10.f14743d != u10) {
                    z10 = false;
                    break;
                }
                u10 = c10;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            l(obj);
        } else {
            j();
        }
    }

    @Override
    public final Object a() {
        E0 e02 = this.f14740a;
        P3 p32 = (P3) this.f14635j.f14584e.get();
        e02.u0(p32, this.f14741b);
        Object obj = p32.get();
        if (!this.f14635j.f14581b) {
            if (obj != null) {
                l(obj);
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            m(obj);
            return obj;
        }
    }

    @Override
    public final AbstractC0316f f(H h10) {
        return new U(this, h10);
    }

    @Override
    protected final Object k() {
        return this.f14635j.f14582c;
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f14635j.f14581b) {
            U u10 = (U) this.f14743d;
            U u11 = null;
            while (true) {
                if (u10 != u11) {
                    Object b10 = u10.b();
                    if (b10 != null && this.f14635j.f14583d.n(b10)) {
                        g(b10);
                        m(b10);
                        break;
                    }
                    u10 = (U) this.f14744e;
                    u11 = u10;
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
