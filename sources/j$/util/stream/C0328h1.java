package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.o;

final class C0328h1 extends AbstractC0338j1 implements O0 {
    @Override
    public final void a(Consumer consumer) {
        E0.A(this, consumer);
    }

    @Override
    public final P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Object m() {
        long[] jArr;
        jArr = E0.f14516f;
        return jArr;
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
        return W.d();
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.D(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return W.d();
    }
}
