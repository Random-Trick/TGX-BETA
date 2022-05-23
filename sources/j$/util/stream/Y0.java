package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.o;

public final class Y0 extends AbstractC0293a1 implements M0 {
    public Y0(M0 m02, M0 m03) {
        super(m02, m03);
    }

    @Override
    public final void a(Consumer consumer) {
        E0.z(this, consumer);
    }

    @Override
    public final Object g(int i10) {
        return new int[i10];
    }

    @Override
    public final void o(Integer[] numArr, int i10) {
        E0.u(this, numArr, i10);
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        o((Integer[]) objArr, i10);
    }

    @Override
    public final F mo31spliterator() {
        return new C0368p1(this);
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.C(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return new C0368p1(this);
    }
}
