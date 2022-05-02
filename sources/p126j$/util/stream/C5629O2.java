package p126j$.util.stream;

import java.util.Arrays;

final class C5629O2 extends AbstractC5569C2 {
    private int[] f18206c;
    private int f18207d;

    public C5629O2(AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22134d(int i) {
        int[] iArr = this.f18206c;
        int i2 = this.f18207d;
        this.f18207d = i2 + 1;
        iArr[i2] = i;
    }

    @Override
    public void mo22132h() {
        int i = 0;
        Arrays.sort(this.f18206c, 0, this.f18207d);
        this.f18413a.mo22131j(this.f18207d);
        if (!this.f18115b) {
            while (i < this.f18207d) {
                this.f18413a.mo22134d(this.f18206c[i]);
                i++;
            }
        } else {
            while (i < this.f18207d && !this.f18413a.mo22130t()) {
                this.f18413a.mo22134d(this.f18206c[i]);
                i++;
            }
        }
        this.f18413a.mo22132h();
        this.f18206c = null;
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18206c = new int[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
