package j$.util.stream;

import java.util.Arrays;

final class O2 extends C2 {
    private double[] f14595c;
    private int f14596d;

    public O2(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void c(double d10) {
        double[] dArr = this.f14595c;
        int i10 = this.f14596d;
        this.f14596d = i10 + 1;
        dArr[i10] = d10;
    }

    @Override
    public final void h() {
        int i10 = 0;
        Arrays.sort(this.f14595c, 0, this.f14596d);
        this.f14788a.k(this.f14596d);
        if (!this.f14508b) {
            while (i10 < this.f14596d) {
                this.f14788a.c(this.f14595c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f14596d && !this.f14788a.u()) {
                this.f14788a.c(this.f14595c[i10]);
                i10++;
            }
        }
        this.f14788a.h();
        this.f14595c = null;
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14595c = new double[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
