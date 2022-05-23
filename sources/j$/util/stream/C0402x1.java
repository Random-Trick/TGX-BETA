package j$.util.stream;

import j$.util.H;

public final class C0402x1 extends B1 implements AbstractC0364o2 {
    private final double[] f14893h;

    public C0402x1(H h10, E0 e02, double[] dArr) {
        super(h10, e02, dArr.length);
        this.f14893h = dArr;
    }

    C0402x1(C0402x1 x1Var, H h10, long j10, long j11) {
        super(x1Var, h10, j10, j11, x1Var.f14893h.length);
        this.f14893h = x1Var.f14893h;
    }

    @Override
    final B1 a(H h10, long j10, long j11) {
        return new C0402x1(this, h10, j10, j11);
    }

    @Override
    public final void c(double d10) {
        int i10 = this.f14496f;
        if (i10 < this.f14497g) {
            double[] dArr = this.f14893h;
            this.f14496f = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f14496f));
    }

    @Override
    public final void l(Object obj) {
        y((Double) obj);
    }

    @Override
    public final void y(Double d10) {
        E0.j(this, d10);
    }
}
