package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5530l;

public class C5707g0 extends AbstractC5722j0 {
    public C5707g0(AbstractC5468G g, int i, boolean z) {
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
    public void mo22222e(AbstractC5530l lVar) {
        AbstractC5462A L0;
        if (!isParallel()) {
            L0 = AbstractC5722j0.m22240L0(m22308I0());
            L0.mo22181n(lVar);
            return;
        }
        super.mo22222e(lVar);
    }

    @Override
    public void mo22221g(AbstractC5530l lVar) {
        AbstractC5462A L0;
        if (!isParallel()) {
            L0 = AbstractC5722j0.m22240L0(m22308I0());
            L0.mo22181n(lVar);
            return;
        }
        Objects.requireNonNull(lVar);
        m22298t0(new C5656V(lVar, true));
    }

    @Override
    public AbstractC5732l0 parallel() {
        m22311F0();
        return this;
    }

    @Override
    public AbstractC5732l0 sequential() {
        m22310G0();
        return this;
    }
}
