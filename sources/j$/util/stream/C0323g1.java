package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.o;

final class C0323g1 extends AbstractC0338j1 implements M0 {
    @Override
    public final void a(Consumer consumer) {
        E0.z(this, consumer);
    }

    @Override
    public final P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Object m() {
        int[] iArr;
        iArr = E0.f14515e;
        return iArr;
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
        return W.c();
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.C(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return W.c();
    }
}
