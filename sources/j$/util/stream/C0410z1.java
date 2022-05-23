package j$.util.stream;

import j$.util.H;

public final class C0410z1 extends B1 implements AbstractC0374q2 {
    private final long[] f14910h;

    public C0410z1(H h10, E0 e02, long[] jArr) {
        super(h10, e02, jArr.length);
        this.f14910h = jArr;
    }

    C0410z1(C0410z1 z1Var, H h10, long j10, long j11) {
        super(z1Var, h10, j10, j11, z1Var.f14910h.length);
        this.f14910h = z1Var.f14910h;
    }

    @Override
    final B1 a(H h10, long j10, long j11) {
        return new C0410z1(this, h10, j10, j11);
    }

    @Override
    public final void e(long j10) {
        int i10 = this.f14496f;
        if (i10 < this.f14497g) {
            long[] jArr = this.f14910h;
            this.f14496f = i10 + 1;
            jArr[i10] = j10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f14496f));
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public final void x(Long l10) {
        E0.n(this, l10);
    }
}
