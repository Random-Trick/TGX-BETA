package p126j$.util.stream;

import java.util.Arrays;

final class C5589G2 extends AbstractC5569C2 {
    private C5659V2 f18147c;

    public C5589G2(AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22134d(int i) {
        this.f18147c.mo22144d(i);
    }

    @Override
    public void mo22132h() {
        int[] iArr = (int[]) this.f18147c.mo22156l();
        Arrays.sort(iArr);
        this.f18413a.mo22131j(iArr.length);
        int i = 0;
        if (!this.f18115b) {
            int length = iArr.length;
            while (i < length) {
                this.f18413a.mo22134d(iArr[i]);
                i++;
            }
        } else {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (this.f18413a.mo22130t()) {
                    break;
                }
                this.f18413a.mo22134d(i2);
                i++;
            }
        }
        this.f18413a.mo22132h();
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18147c = j > 0 ? new C5659V2((int) j) : new C5659V2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
