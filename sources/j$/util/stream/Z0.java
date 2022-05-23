package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.o;

public final class Z0 extends AbstractC0293a1 implements O0 {
    public Z0(O0 o02, O0 o03) {
        super(o02, o03);
    }

    @Override
    public final void a(Consumer consumer) {
        E0.A(this, consumer);
    }

    @Override
    public final Object g(int i10) {
        return new long[i10];
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        r((Long[]) objArr, i10);
    }

    @Override
    public final void r(Long[] lArr, int i10) {
        E0.w(this, lArr, i10);
    }

    @Override
    public final F mo31spliterator() {
        return new C0373q1(this);
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.D(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return new C0373q1(this);
    }
}
