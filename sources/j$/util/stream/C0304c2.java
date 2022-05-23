package j$.util.stream;

import j$.util.H;
import java.util.concurrent.CountedCompleter;

final class C0304c2 extends AbstractC0316f {
    private final AbstractC0299b2 f14724h;

    public C0304c2(AbstractC0299b2 b2Var, E0 e02, H h10) {
        super(e02, h10);
        this.f14724h = b2Var;
    }

    C0304c2(C0304c2 c2Var, H h10) {
        super(c2Var, h10);
        this.f14724h = c2Var.f14724h;
    }

    @Override
    protected final Object a() {
        E0 e02 = this.f14740a;
        Z1 b10 = this.f14724h.b();
        e02.u0(b10, this.f14741b);
        return b10;
    }

    @Override
    protected final AbstractC0316f f(H h10) {
        return new C0304c2(this, h10);
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            Z1 z12 = (Z1) ((C0304c2) this.f14743d).b();
            z12.t((Z1) ((C0304c2) this.f14744e).b());
            g(z12);
        }
        super.onCompletion(countedCompleter);
    }
}
