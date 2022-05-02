package p126j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.Comparator;
import p126j$.util.function.AbstractC5531m;

final class C5614L2 extends AbstractC5709g2 {
    private final boolean f18183u;
    private final Comparator f18184v;

    public C5614L2(AbstractC5686c cVar) {
        super(cVar, 1, EnumC5705f3.f18367q | EnumC5705f3.f18365o);
        this.f18183u = true;
        this.f18184v = Comparator.CC.m22610a();
    }

    public C5614L2(AbstractC5686c cVar, java.util.Comparator comparator) {
        super(cVar, 1, EnumC5705f3.f18367q | EnumC5705f3.f18366p);
        this.f18183u = false;
        Objects.requireNonNull(comparator);
        this.f18184v = comparator;
    }

    @Override
    public AbstractC5632P0 mo22141B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        if (EnumC5705f3.SORTED.m22265d(d0.mo22301Z()) && this.f18183u) {
            return d0.mo22304R(g, false, mVar);
        }
        Object[] p = d0.mo22304R(g, true, mVar).mo22152p(mVar);
        Arrays.sort(p, this.f18184v);
        return new C5645S0(p);
    }

    @Override
    public AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        Objects.requireNonNull(q2Var);
        return (!EnumC5705f3.SORTED.m22265d(i) || !this.f18183u) ? EnumC5705f3.SIZED.m22265d(i) ? new C5639Q2(q2Var, this.f18184v) : new C5619M2(q2Var, this.f18184v) : q2Var;
    }
}
