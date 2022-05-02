package p126j$.util.stream;

import java.util.Arrays;

final class C5634P2 extends AbstractC5574D2 {
    private long[] f18211c;
    private int f18212d;

    public C5634P2(AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22133e(long j) {
        long[] jArr = this.f18211c;
        int i = this.f18212d;
        this.f18212d = i + 1;
        jArr[i] = j;
    }

    @Override
    public void mo22132h() {
        int i = 0;
        Arrays.sort(this.f18211c, 0, this.f18212d);
        this.f18425a.mo22131j(this.f18212d);
        if (!this.f18125b) {
            while (i < this.f18212d) {
                this.f18425a.mo22133e(this.f18211c[i]);
                i++;
            }
        } else {
            while (i < this.f18212d && !this.f18425a.mo22130t()) {
                this.f18425a.mo22133e(this.f18211c[i]);
                i++;
            }
        }
        this.f18425a.mo22132h();
        this.f18211c = null;
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18211c = new long[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
