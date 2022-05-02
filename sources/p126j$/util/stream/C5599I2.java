package p126j$.util.stream;

import java.util.Arrays;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;

final class C5599I2 extends AbstractC5571D {
    public C5599I2(AbstractC5686c cVar) {
        super(cVar, 4, EnumC5705f3.f18367q | EnumC5705f3.f18365o);
    }

    @Override
    public AbstractC5632P0 mo22142B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        if (EnumC5705f3.SORTED.m22266d(d0.mo22302Z())) {
            return d0.mo22305R(g, false, mVar);
        }
        double[] dArr = (double[]) ((AbstractC5602J0) d0.mo22305R(g, true, mVar)).mo22157l();
        Arrays.sort(dArr);
        return new C5683b1(dArr);
    }

    @Override
    public AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        Objects.requireNonNull(q2Var);
        return EnumC5705f3.SORTED.m22266d(i) ? q2Var : EnumC5705f3.SIZED.m22266d(i) ? new C5624N2(q2Var) : new C5584F2(q2Var);
    }
}
