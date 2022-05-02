package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.Consumer;

public class C5704f2 extends AbstractC5719i2 {
    public C5704f2(AbstractC5468G g, int i, boolean z) {
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
    public void mo22244a(Consumer consumer) {
        if (!isParallel()) {
            m22307I0().forEachRemaining(consumer);
        } else {
            super.mo22244a(consumer);
        }
    }

    @Override
    public void mo22243c(Consumer consumer) {
        if (!isParallel()) {
            m22307I0().forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        m22297t0(new C5664X(consumer, true));
    }
}
