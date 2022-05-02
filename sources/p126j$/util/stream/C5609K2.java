package p126j$.util.stream;

import java.util.Arrays;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;

final class C5609K2 extends AbstractC5757q0 {
    public C5609K2(AbstractC5686c cVar) {
        super(cVar, 3, EnumC5705f3.f18367q | EnumC5705f3.f18365o);
    }

    @Override
    public AbstractC5632P0 mo22142B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        if (EnumC5705f3.SORTED.m22266d(d0.mo22302Z())) {
            return d0.mo22305R(g, false, mVar);
        }
        long[] jArr = (long[]) ((AbstractC5622N0) d0.mo22305R(g, true, mVar)).mo22157l();
        Arrays.sort(jArr);
        return new C5773t1(jArr);
    }

    @Override
    public AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        Objects.requireNonNull(q2Var);
        return EnumC5705f3.SORTED.m22266d(i) ? q2Var : EnumC5705f3.SIZED.m22266d(i) ? new C5634P2(q2Var) : new C5594H2(q2Var);
    }
}
