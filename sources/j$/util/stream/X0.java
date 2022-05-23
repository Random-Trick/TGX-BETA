package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.o;

public final class X0 extends AbstractC0293a1 implements K0 {
    public X0(K0 k02, K0 k03) {
        super(k02, k03);
    }

    @Override
    public final void a(Consumer consumer) {
        E0.y(this, consumer);
    }

    @Override
    public final Object g(int i10) {
        return new double[i10];
    }

    @Override
    public final void i(Double[] dArr, int i10) {
        E0.s(this, dArr, i10);
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        i((Double[]) objArr, i10);
    }

    @Override
    public final F mo31spliterator() {
        return new C0363o1(this);
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.B(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return new C0363o1(this);
    }
}
