package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

public final class C5793x1 extends AbstractC5558A1 implements AbstractC5749o2 {
    private final int[] f18507h;

    public C5793x1(AbstractC5468G g, AbstractC5572D0 d0, int[] iArr) {
        super(g, d0, iArr.length);
        this.f18507h = iArr;
    }

    C5793x1(C5793x1 x1Var, AbstractC5468G g, long j, long j2) {
        super(x1Var, g, j, j2, x1Var.f18507h.length);
        this.f18507h = x1Var.f18507h;
    }

    @Override
    AbstractC5558A1 mo22129a(AbstractC5468G g, long j, long j2) {
        return new C5793x1(this, g, j, j2);
    }

    @Override
    public void mo22134d(int i) {
        int i2 = this.f18101f;
        if (i2 < this.f18102g) {
            int[] iArr = this.f18507h;
            this.f18101f = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18101f));
    }

    public void mo22128k(Integer num) {
        AbstractC5572D0.m22417k(this, num);
    }
}
