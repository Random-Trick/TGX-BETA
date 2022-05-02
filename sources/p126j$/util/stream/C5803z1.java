package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

public final class C5803z1 extends AbstractC5558A1 {
    private final Object[] f18524h;

    public C5803z1(AbstractC5468G g, AbstractC5572D0 d0, Object[] objArr) {
        super(g, d0, objArr.length);
        this.f18524h = objArr;
    }

    C5803z1(C5803z1 z1Var, AbstractC5468G g, long j, long j2) {
        super(z1Var, g, j, j2, z1Var.f18524h.length);
        this.f18524h = z1Var.f18524h;
    }

    @Override
    AbstractC5558A1 mo22130a(AbstractC5468G g, long j, long j2) {
        return new C5803z1(this, g, j, j2);
    }

    @Override
    public void mo22129k(Object obj) {
        int i = this.f18101f;
        if (i < this.f18102g) {
            Object[] objArr = this.f18524h;
            this.f18101f = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18101f));
    }
}
