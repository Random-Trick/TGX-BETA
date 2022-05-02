package p126j$.util.stream;

import java.util.Arrays;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;

final class C5604J2 extends AbstractC5712h0 {
    public C5604J2(AbstractC5686c cVar) {
        super(cVar, 2, EnumC5705f3.f18367q | EnumC5705f3.f18365o);
    }

    @Override
    public AbstractC5632P0 mo22141B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        if (EnumC5705f3.SORTED.m22265d(d0.mo22301Z())) {
            return d0.mo22304R(g, false, mVar);
        }
        int[] iArr = (int[]) ((AbstractC5612L0) d0.mo22304R(g, true, mVar)).mo22156l();
        Arrays.sort(iArr);
        return new C5728k1(iArr);
    }

    @Override
    public AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        Objects.requireNonNull(q2Var);
        return EnumC5705f3.SORTED.m22265d(i) ? q2Var : EnumC5705f3.SIZED.m22265d(i) ? new C5629O2(q2Var) : new C5589G2(q2Var);
    }
}
