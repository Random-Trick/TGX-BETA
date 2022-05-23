package j$.util.stream;

import j$.util.H;
import j$.util.function.Consumer;
import java.util.Objects;

public final class C0324g2 extends AbstractC0339j2 {
    public C0324g2(H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    @Override
    final boolean H0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void a(Consumer consumer) {
        if (!isParallel()) {
            M0().forEachRemaining(consumer);
        } else {
            super.a(consumer);
        }
    }

    @Override
    public final void c(Consumer consumer) {
        if (!isParallel()) {
            M0().forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        x0(new Y(consumer, true));
    }
}
