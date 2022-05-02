package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

public final class C5788w1 extends AbstractC5558A1 implements AbstractC5744n2 {
    private final double[] f18499h;

    public C5788w1(AbstractC5468G g, AbstractC5572D0 d0, double[] dArr) {
        super(g, d0, dArr.length);
        this.f18499h = dArr;
    }

    C5788w1(C5788w1 w1Var, AbstractC5468G g, long j, long j2) {
        super(w1Var, g, j, j2, w1Var.f18499h.length);
        this.f18499h = w1Var.f18499h;
    }

    @Override
    AbstractC5558A1 mo22130a(AbstractC5468G g, long j, long j2) {
        return new C5788w1(this, g, j, j2);
    }

    @Override
    public void mo22136c(double d) {
        int i = this.f18101f;
        if (i < this.f18102g) {
            double[] dArr = this.f18499h;
            this.f18101f = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18101f));
    }

    public void mo22129k(Double d) {
        AbstractC5572D0.m22420j(this, d);
    }
}
