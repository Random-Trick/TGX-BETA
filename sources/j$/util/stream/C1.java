package j$.util.stream;

import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.o;

public final class C1 extends C0300b3 implements Q0, I0 {
    @Override
    public final void a(Consumer consumer) {
        super.a(consumer);
    }

    @Override
    public final Q0 mo32b() {
        return this;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final Q0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        clear();
        B(j10);
    }

    @Override
    public final void l(Object obj) {
        super.l(obj);
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        super.q(objArr, i10);
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final H mo31spliterator() {
        return super.mo31spliterator();
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final Object[] v(o oVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) oVar.z((int) count);
            q(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.E(this, j10, j11, oVar);
    }
}
