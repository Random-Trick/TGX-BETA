package p126j$.util.stream;

import java.util.Iterator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.C5546j;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.Consumer;
import p126j$.util.function.ToDoubleFunction;
import p126j$.util.function.ToIntFunction;
import p126j$.util.function.ToLongFunction;

public abstract class AbstractC5719i2 extends AbstractC5686c implements AbstractC5690c3 {
    public static final int f18390t = 0;

    public AbstractC5719i2(AbstractC5468G g, int i, boolean z) {
        super(g, i, z);
    }

    public AbstractC5719i2(AbstractC5686c cVar, int i) {
        super(cVar, i);
    }

    @Override
    final AbstractC5468G mo22197J0(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        return new C5615L3(d0, xVar, z);
    }

    public final AbstractC5690c3 m22249K0() {
        return new C5761r(this, 1, EnumC5705f3.f18363m | EnumC5705f3.f18370t);
    }

    public final AbstractC5591H m22248L0(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C5791x(this, this, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n, toDoubleFunction, 6);
    }

    public final AbstractC5732l0 m22247M0(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C5801z(this, this, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n, toIntFunction, 6);
    }

    public final AbstractC5777u0 m22246N0(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C5556A(this, this, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n, toLongFunction, 7);
    }

    public final C5546j m22245O0(AbstractC5521c cVar) {
        Objects.requireNonNull(cVar);
        return (C5546j) m22297t0(new C5603J1(1, cVar, 1));
    }

    public void mo22244a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m22297t0(new C5664X(consumer, false));
    }

    public void mo22243c(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m22297t0(new C5664X(consumer, true));
    }

    @Override
    public final Iterator iterator() {
        return AbstractC5482V.m22591i(spliterator());
    }

    @Override
    public final AbstractC5592H0 mo22189k0(long j, AbstractC5531m mVar) {
        return AbstractC5572D0.m22444F(j, mVar);
    }

    @Override
    public AbstractC5711h unordered() {
        return !m22295y0() ? this : new C5694d2(this, this, 1, EnumC5705f3.f18368r);
    }

    @Override
    final AbstractC5632P0 mo22188v0(AbstractC5572D0 d0, AbstractC5468G g, boolean z, AbstractC5531m mVar) {
        return AbstractC5572D0.m22442H(d0, g, z, mVar);
    }

    @Override
    final void mo22187w0(AbstractC5468G g, AbstractC5759q2 q2Var) {
        while (!q2Var.mo22130t() && g.mo22124a(q2Var)) {
        }
    }

    @Override
    public final int mo22186x0() {
        return 1;
    }
}
