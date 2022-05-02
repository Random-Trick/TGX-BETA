package p126j$.util.stream;

import java.util.Arrays;

final class C5624N2 extends AbstractC5564B2 {
    private double[] f18200c;
    private int f18201d;

    public C5624N2(AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22135c(double d) {
        double[] dArr = this.f18200c;
        int i = this.f18201d;
        this.f18201d = i + 1;
        dArr[i] = d;
    }

    @Override
    public void mo22132h() {
        int i = 0;
        Arrays.sort(this.f18200c, 0, this.f18201d);
        this.f18394a.mo22131j(this.f18201d);
        if (!this.f18113b) {
            while (i < this.f18201d) {
                this.f18394a.mo22135c(this.f18200c[i]);
                i++;
            }
        } else {
            while (i < this.f18201d && !this.f18394a.mo22130t()) {
                this.f18394a.mo22135c(this.f18200c[i]);
                i++;
            }
        }
        this.f18394a.mo22132h();
        this.f18200c = null;
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18200c = new double[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
