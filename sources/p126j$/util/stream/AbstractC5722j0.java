package p126j$.util.stream;

import java.util.Iterator;
import java.util.Objects;
import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.C5548l;
import p126j$.util.function.AbstractC5528j;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5532n;
import p126j$.util.function.AbstractC5539u;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

abstract class AbstractC5722j0 extends AbstractC5686c implements AbstractC5732l0 {
    public static final int f18393t = 0;

    public AbstractC5722j0(AbstractC5468G g, int i, boolean z) {
        super(g, i, z);
    }

    public AbstractC5722j0(AbstractC5686c cVar, int i) {
        super(cVar, i);
    }

    public static AbstractC5462A m22240L0(AbstractC5468G g) {
        if (g instanceof AbstractC5462A) {
            return (AbstractC5462A) g;
        }
        if (AbstractC5640Q3.f18220a) {
            AbstractC5640Q3.m22370a(AbstractC5686c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override
    final AbstractC5468G mo22198J0(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        return new C5770s3(d0, xVar, z);
    }

    public final Object m22239M0(AbstractC5542x xVar, AbstractC5539u uVar, BiConsumer biConsumer) {
        C5776u uVar2 = new C5776u(biConsumer, 1);
        Objects.requireNonNull(xVar);
        Objects.requireNonNull(uVar);
        return m22298t0(new C5583F1(2, uVar2, uVar, xVar, 4));
    }

    public final AbstractC5777u0 m22238N0(AbstractC5532n nVar) {
        Objects.requireNonNull(nVar);
        return new C5556A(this, this, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n, nVar, 1);
    }

    public final AbstractC5690c3 m22237O0(AbstractC5531m mVar) {
        Objects.requireNonNull(mVar);
        return new C5796y(this, this, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n, mVar, 1);
    }

    public final C5548l m22236P0(AbstractC5528j jVar) {
        Objects.requireNonNull(jVar);
        return (C5548l) m22298t0(new C5603J1(2, jVar, 2));
    }

    public final AbstractC5462A spliterator() {
        return m22240L0(super.spliterator());
    }

    public void mo22222e(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        m22298t0(new C5656V(lVar, false));
    }

    public void mo22221g(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        m22298t0(new C5656V(lVar, true));
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22594g(spliterator());
    }

    @Override
    public final AbstractC5592H0 mo22190k0(long j, AbstractC5531m mVar) {
        return AbstractC5572D0.m22430a0(j);
    }

    @Override
    public AbstractC5711h unordered() {
        return !m22296y0() ? this : new C5702f0(this, this, 2, EnumC5705f3.f18368r);
    }

    @Override
    final AbstractC5632P0 mo22189v0(AbstractC5572D0 d0, AbstractC5468G g, boolean z, AbstractC5531m mVar) {
        return AbstractC5572D0.m22441J(d0, g, z);
    }

    @Override
    final void mo22188w0(AbstractC5468G g, AbstractC5759q2 q2Var) {
        AbstractC5530l lVar;
        AbstractC5462A L0 = m22240L0(g);
        if (q2Var instanceof AbstractC5530l) {
            lVar = (AbstractC5530l) q2Var;
        } else if (!AbstractC5640Q3.f18220a) {
            lVar = new C5687c0(q2Var, 0);
        } else {
            AbstractC5640Q3.m22370a(AbstractC5686c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        while (!q2Var.mo22131t() && L0.mo22182i(lVar)) {
        }
    }

    @Override
    public final int mo22187x0() {
        return 2;
    }
}
