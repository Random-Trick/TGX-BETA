package j$.util.stream;

import j$.util.B;
import j$.util.H;
import j$.util.function.n;
import java.util.Objects;

public final class C0327h0 extends AbstractC0342k0 {
    public C0327h0(H h10, int i10) {
        super(h10, i10);
    }

    @Override
    final boolean H0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void e(n nVar) {
        B P0;
        if (!isParallel()) {
            P0 = AbstractC0342k0.P0(M0());
            P0.n(nVar);
            return;
        }
        super.e(nVar);
    }

    @Override
    public final void g(n nVar) {
        B P0;
        if (!isParallel()) {
            P0 = AbstractC0342k0.P0(M0());
            P0.n(nVar);
            return;
        }
        Objects.requireNonNull(nVar);
        x0(new W(nVar, true));
    }

    @Override
    public final AbstractC0352m0 parallel() {
        J0();
        return this;
    }

    @Override
    public final AbstractC0352m0 sequential() {
        K0();
        return this;
    }
}
