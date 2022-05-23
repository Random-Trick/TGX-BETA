package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.o;

final class C0318f1 extends AbstractC0338j1 implements K0 {
    @Override
    public final void a(Consumer consumer) {
        E0.y(this, consumer);
    }

    @Override
    public final P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void i(Double[] dArr, int i10) {
        E0.s(this, dArr, i10);
    }

    @Override
    public final Object m() {
        double[] dArr;
        dArr = E0.f14517g;
        return dArr;
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        i((Double[]) objArr, i10);
    }

    @Override
    public final F mo31spliterator() {
        return W.b();
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.B(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return W.b();
    }
}
