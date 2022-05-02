package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

public final class C5798y1 extends AbstractC5558A1 implements AbstractC5754p2 {
    private final long[] f18516h;

    public C5798y1(AbstractC5468G g, AbstractC5572D0 d0, long[] jArr) {
        super(g, d0, jArr.length);
        this.f18516h = jArr;
    }

    C5798y1(C5798y1 y1Var, AbstractC5468G g, long j, long j2) {
        super(y1Var, g, j, j2, y1Var.f18516h.length);
        this.f18516h = y1Var.f18516h;
    }

    @Override
    AbstractC5558A1 mo22129a(AbstractC5468G g, long j, long j2) {
        return new C5798y1(this, g, j, j2);
    }

    @Override
    public void mo22133e(long j) {
        int i = this.f18101f;
        if (i < this.f18102g) {
            long[] jArr = this.f18516h;
            this.f18101f = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18101f));
    }

    public void mo22128k(Long l) {
        AbstractC5572D0.m22416l(this, l);
    }
}
