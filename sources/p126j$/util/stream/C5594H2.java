package p126j$.util.stream;

import java.util.Arrays;

final class C5594H2 extends AbstractC5574D2 {
    private C5667X2 f18151c;

    public C5594H2(AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22133e(long j) {
        this.f18151c.mo22127e(j);
    }

    @Override
    public void mo22132h() {
        long[] jArr = (long[]) this.f18151c.mo22156l();
        Arrays.sort(jArr);
        this.f18425a.mo22131j(jArr.length);
        int i = 0;
        if (!this.f18125b) {
            int length = jArr.length;
            while (i < length) {
                this.f18425a.mo22133e(jArr[i]);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (this.f18425a.mo22130t()) {
                    break;
                }
                this.f18425a.mo22133e(j);
                i++;
            }
        }
        this.f18425a.mo22132h();
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18151c = j > 0 ? new C5667X2((int) j) : new C5667X2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}