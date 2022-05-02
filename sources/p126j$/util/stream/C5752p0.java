package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5535q;

public class C5752p0 extends AbstractC5767s0 {
    public C5752p0(AbstractC5468G g, int i, boolean z) {
        super(g, i, z);
    }

    @Override
    final boolean mo22199D0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void mo22171b(AbstractC5535q qVar) {
        AbstractC5464C L0;
        if (!isParallel()) {
            L0 = AbstractC5767s0.m22195L0(m22307I0());
            L0.mo22166f(qVar);
            return;
        }
        super.mo22171b(qVar);
    }

    @Override
    public void mo22170f(AbstractC5535q qVar) {
        AbstractC5464C L0;
        if (!isParallel()) {
            L0 = AbstractC5767s0.m22195L0(m22307I0());
            L0.mo22166f(qVar);
            return;
        }
        Objects.requireNonNull(qVar);
        m22297t0(new C5660W(qVar, true));
    }

    @Override
    public AbstractC5777u0 parallel() {
        m22310F0();
        return this;
    }

    @Override
    public AbstractC5777u0 sequential() {
        m22309G0();
        return this;
    }
}
