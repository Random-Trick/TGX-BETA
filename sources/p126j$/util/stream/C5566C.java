package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5525g;

public class C5566C extends AbstractC5581F {
    public C5566C(AbstractC5468G g, int i, boolean z) {
        super(g, i, z);
    }

    @Override
    final boolean mo22200D0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void mo22386d(AbstractC5525g gVar) {
        AbstractC5811y L0;
        if (!isParallel()) {
            L0 = AbstractC5581F.m22394L0(m22308I0());
            L0.mo22123m(gVar);
            return;
        }
        super.mo22386d(gVar);
    }

    @Override
    public void mo22385h(AbstractC5525g gVar) {
        AbstractC5811y L0;
        if (!isParallel()) {
            L0 = AbstractC5581F.m22394L0(m22308I0());
            L0.mo22123m(gVar);
            return;
        }
        Objects.requireNonNull(gVar);
        m22298t0(new C5652U(gVar, true));
    }

    @Override
    public AbstractC5591H parallel() {
        m22311F0();
        return this;
    }

    @Override
    public AbstractC5591H sequential() {
        m22310G0();
        return this;
    }
}
