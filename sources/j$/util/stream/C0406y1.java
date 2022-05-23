package j$.util.stream;

import j$.util.H;

public final class C0406y1 extends B1 implements AbstractC0369p2 {
    private final int[] f14901h;

    public C0406y1(H h10, E0 e02, int[] iArr) {
        super(h10, e02, iArr.length);
        this.f14901h = iArr;
    }

    C0406y1(C0406y1 y1Var, H h10, long j10, long j11) {
        super(y1Var, h10, j10, j11, y1Var.f14901h.length);
        this.f14901h = y1Var.f14901h;
    }

    @Override
    final B1 a(H h10, long j10, long j11) {
        return new C0406y1(this, h10, j10, j11);
    }

    @Override
    public final void d(int i10) {
        int i11 = this.f14496f;
        if (i11 < this.f14497g) {
            int[] iArr = this.f14901h;
            this.f14496f = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f14496f));
    }

    @Override
    public final void l(Object obj) {
        p((Integer) obj);
    }

    @Override
    public final void p(Integer num) {
        E0.l(this, num);
    }
}
