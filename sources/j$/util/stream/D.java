package j$.util.stream;

import j$.util.H;
import j$.util.function.AbstractC0278f;
import j$.util.z;
import java.util.Objects;

public final class D extends G {
    public D(H h10, int i10) {
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
    public final void d(AbstractC0278f fVar) {
        z P0;
        if (!isParallel()) {
            P0 = G.P0(M0());
            P0.m(fVar);
            return;
        }
        super.d(fVar);
    }

    @Override
    public final void h(AbstractC0278f fVar) {
        z P0;
        if (!isParallel()) {
            P0 = G.P0(M0());
            P0.m(fVar);
            return;
        }
        Objects.requireNonNull(fVar);
        x0(new V(fVar, true));
    }

    @Override
    public final I parallel() {
        J0();
        return this;
    }

    @Override
    public final I sequential() {
        K0();
        return this;
    }
}
