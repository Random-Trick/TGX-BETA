package j$.util.stream;

import java.util.Arrays;

final class P2 extends D2 {
    private int[] f14601c;
    private int f14602d;

    public P2(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void d(int i10) {
        int[] iArr = this.f14601c;
        int i11 = this.f14602d;
        this.f14602d = i11 + 1;
        iArr[i11] = i10;
    }

    @Override
    public final void h() {
        int i10 = 0;
        Arrays.sort(this.f14601c, 0, this.f14602d);
        this.f14807a.k(this.f14602d);
        if (!this.f14510b) {
            while (i10 < this.f14602d) {
                this.f14807a.d(this.f14601c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f14602d && !this.f14807a.u()) {
                this.f14807a.d(this.f14601c[i10]);
                i10++;
            }
        }
        this.f14807a.h();
        this.f14601c = null;
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14601c = new int[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
