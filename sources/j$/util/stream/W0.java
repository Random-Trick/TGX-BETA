package j$.util.stream;

import j$.util.H;
import j$.util.function.AbstractC0275c;
import j$.util.function.w;
import java.util.concurrent.CountedCompleter;

public class W0 extends AbstractC0316f {
    protected final E0 f14647h;
    protected final w f14648i;
    protected final AbstractC0275c f14649j;

    public W0(E0 e02, H h10, w wVar, AbstractC0275c cVar) {
        super(e02, h10);
        this.f14647h = e02;
        this.f14648i = wVar;
        this.f14649j = cVar;
    }

    W0(W0 w02, H h10) {
        super(w02, h10);
        this.f14647h = w02.f14647h;
        this.f14648i = w02.f14648i;
        this.f14649j = w02.f14649j;
    }

    @Override
    public final Object a() {
        I0 i02 = (I0) this.f14648i.A(this.f14647h.X(this.f14741b));
        this.f14647h.u0(i02, this.f14741b);
        return i02.mo32b();
    }

    @Override
    public final AbstractC0316f f(H h10) {
        return new W0(this, h10);
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            g((Q0) this.f14649j.v((Q0) ((W0) this.f14743d).b(), (Q0) ((W0) this.f14744e).b()));
        }
        super.onCompletion(countedCompleter);
    }
}
