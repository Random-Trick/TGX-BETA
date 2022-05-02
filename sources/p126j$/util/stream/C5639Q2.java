package p126j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

final class C5639Q2 extends AbstractC5579E2 {
    private Object[] f18218d;
    private int f18219e;

    public C5639Q2(AbstractC5759q2 q2Var, Comparator comparator) {
        super(q2Var, comparator);
    }

    @Override
    public void mo22133h() {
        int i = 0;
        Arrays.sort(this.f18218d, 0, this.f18219e, this.f18133b);
        this.f18428a.mo22132j(this.f18219e);
        if (!this.f18134c) {
            while (i < this.f18219e) {
                this.f18428a.mo22129k(this.f18218d[i]);
                i++;
            }
        } else {
            while (i < this.f18219e && !this.f18428a.mo22131t()) {
                this.f18428a.mo22129k(this.f18218d[i]);
                i++;
            }
        }
        this.f18428a.mo22133h();
        this.f18218d = null;
    }

    @Override
    public void mo22132j(long j) {
        if (j < 2147483639) {
            this.f18218d = new Object[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public void mo22129k(Object obj) {
        Object[] objArr = this.f18218d;
        int i = this.f18219e;
        this.f18219e = i + 1;
        objArr[i] = obj;
    }
}
