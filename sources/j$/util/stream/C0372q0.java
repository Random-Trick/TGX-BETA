package j$.util.stream;

import j$.util.D;
import j$.util.H;
import j$.util.function.v;
import java.util.Objects;

public final class C0372q0 extends AbstractC0385t0 {
    public C0372q0(H h10, int i10) {
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
    public final void b(v vVar) {
        D P0;
        if (!isParallel()) {
            P0 = AbstractC0385t0.P0(M0());
            P0.f(vVar);
            return;
        }
        super.b(vVar);
    }

    @Override
    public final void f(v vVar) {
        D P0;
        if (!isParallel()) {
            P0 = AbstractC0385t0.P0(M0());
            P0.f(vVar);
            return;
        }
        Objects.requireNonNull(vVar);
        x0(new X(vVar, true));
    }

    @Override
    public final AbstractC0393v0 parallel() {
        J0();
        return this;
    }

    @Override
    public final AbstractC0393v0 sequential() {
        K0();
        return this;
    }
}
