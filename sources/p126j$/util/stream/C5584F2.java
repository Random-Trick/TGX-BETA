package p126j$.util.stream;

import java.util.Arrays;

final class C5584F2 extends AbstractC5564B2 {
    private C5651T2 f18141c;

    public C5584F2(AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22135c(double d) {
        this.f18141c.mo22150c(d);
    }

    @Override
    public void mo22132h() {
        double[] dArr = (double[]) this.f18141c.mo22156l();
        Arrays.sort(dArr);
        this.f18394a.mo22131j(dArr.length);
        int i = 0;
        if (!this.f18113b) {
            int length = dArr.length;
            while (i < length) {
                this.f18394a.mo22135c(dArr[i]);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (this.f18394a.mo22130t()) {
                    break;
                }
                this.f18394a.mo22135c(d);
                i++;
            }
        }
        this.f18394a.mo22132h();
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18141c = j > 0 ? new C5651T2((int) j) : new C5651T2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
