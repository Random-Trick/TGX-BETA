package p126j$.util.stream;

import java.util.Iterator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5811y;
import p126j$.util.C5547k;
import p126j$.util.function.AbstractC5523e;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5526h;
import p126j$.util.function.AbstractC5527i;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5538t;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

abstract class AbstractC5581F extends AbstractC5686c implements AbstractC5591H {
    public static final int f18136t = 0;

    public AbstractC5581F(AbstractC5468G g, int i, boolean z) {
        super(g, i, z);
    }

    public AbstractC5581F(AbstractC5686c cVar, int i) {
        super(cVar, i);
    }

    public static AbstractC5811y m22393L0(AbstractC5468G g) {
        if (g instanceof AbstractC5811y) {
            return (AbstractC5811y) g;
        }
        if (AbstractC5640Q3.f18220a) {
            AbstractC5640Q3.m22369a(AbstractC5686c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override
    final AbstractC5468G mo22197J0(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        return new C5760q3(d0, xVar, z);
    }

    public final Object m22392M0(AbstractC5542x xVar, AbstractC5538t tVar, BiConsumer biConsumer) {
        C5776u uVar = new C5776u(biConsumer, 0);
        Objects.requireNonNull(xVar);
        Objects.requireNonNull(tVar);
        return m22297t0(new C5583F1(4, uVar, tVar, xVar, 1));
    }

    public final AbstractC5777u0 m22391N0(AbstractC5527i iVar) {
        Objects.requireNonNull(iVar);
        return new C5556A(this, this, 4, EnumC5705f3.f18366p | EnumC5705f3.f18364n, iVar, 0);
    }

    public final AbstractC5690c3 m22390O0(AbstractC5526h hVar) {
        Objects.requireNonNull(hVar);
        return new C5796y(this, this, 4, EnumC5705f3.f18366p | EnumC5705f3.f18364n, hVar, 0);
    }

    public final C5547k m22389P0(AbstractC5523e eVar) {
        Objects.requireNonNull(eVar);
        return (C5547k) m22297t0(new C5603J1(4, eVar, 0));
    }

    public final AbstractC5811y spliterator() {
        return m22393L0(super.spliterator());
    }

    public void mo22385d(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        m22297t0(new C5652U(gVar, false));
    }

    public void mo22384h(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        m22297t0(new C5652U(gVar, true));
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22594f(spliterator());
    }

    @Override
    public final AbstractC5592H0 mo22189k0(long j, AbstractC5531m mVar) {
        return AbstractC5572D0.m22437O(j);
    }

    @Override
    public AbstractC5711h unordered() {
        return !m22295y0() ? this : new C5561B(this, this, 4, EnumC5705f3.f18368r, 0);
    }

    @Override
    final AbstractC5632P0 mo22188v0(AbstractC5572D0 d0, AbstractC5468G g, boolean z, AbstractC5531m mVar) {
        return AbstractC5572D0.m22441I(d0, g, z);
    }

    @Override
    final void mo22187w0(AbstractC5468G g, AbstractC5759q2 q2Var) {
        AbstractC5525g gVar;
        AbstractC5811y L0 = m22393L0(g);
        if (q2Var instanceof AbstractC5525g) {
            gVar = (AbstractC5525g) q2Var;
        } else if (!AbstractC5640Q3.f18220a) {
            gVar = new C5781v(q2Var, 0);
        } else {
            AbstractC5640Q3.m22369a(AbstractC5686c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        }
        while (!q2Var.mo22130t() && L0.mo22123l(gVar)) {
        }
    }

    @Override
    public final int mo22186x0() {
        return 4;
    }
}
