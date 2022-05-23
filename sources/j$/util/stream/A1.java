package j$.util.stream;

import j$.util.H;

public final class A1 extends B1 {
    private final Object[] f14483h;

    public A1(H h10, E0 e02, Object[] objArr) {
        super(h10, e02, objArr.length);
        this.f14483h = objArr;
    }

    A1(A1 a12, H h10, long j10, long j11) {
        super(a12, h10, j10, j11, a12.f14483h.length);
        this.f14483h = a12.f14483h;
    }

    @Override
    final B1 a(H h10, long j10, long j11) {
        return new A1(this, h10, j10, j11);
    }

    @Override
    public final void l(Object obj) {
        int i10 = this.f14496f;
        if (i10 < this.f14497g) {
            Object[] objArr = this.f14483h;
            this.f14496f = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f14496f));
    }
}
