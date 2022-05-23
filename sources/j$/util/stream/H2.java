package j$.util.stream;

import java.util.Arrays;

final class H2 extends D2 {
    private W2 f14542c;

    public H2(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void d(int i10) {
        this.f14542c.d(i10);
    }

    @Override
    public final void h() {
        int[] iArr = (int[]) this.f14542c.m();
        Arrays.sort(iArr);
        this.f14807a.k(iArr.length);
        int i10 = 0;
        if (!this.f14510b) {
            int length = iArr.length;
            while (i10 < length) {
                this.f14807a.d(iArr[i10]);
                i10++;
            }
        } else {
            int length2 = iArr.length;
            while (i10 < length2) {
                int i11 = iArr[i10];
                if (this.f14807a.u()) {
                    break;
                }
                this.f14807a.d(i11);
                i10++;
            }
        }
        this.f14807a.h();
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14542c = j10 > 0 ? new W2((int) j10) : new W2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
