package j$.util.stream;

import java.util.Arrays;

final class G2 extends C2 {
    private U2 f14536c;

    public G2(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void c(double d10) {
        this.f14536c.c(d10);
    }

    @Override
    public final void h() {
        double[] dArr = (double[]) this.f14536c.m();
        Arrays.sort(dArr);
        this.f14788a.k(dArr.length);
        int i10 = 0;
        if (!this.f14508b) {
            int length = dArr.length;
            while (i10 < length) {
                this.f14788a.c(dArr[i10]);
                i10++;
            }
        } else {
            int length2 = dArr.length;
            while (i10 < length2) {
                double d10 = dArr[i10];
                if (this.f14788a.u()) {
                    break;
                }
                this.f14788a.c(d10);
                i10++;
            }
        }
        this.f14788a.h();
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14536c = j10 > 0 ? new U2((int) j10) : new U2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
