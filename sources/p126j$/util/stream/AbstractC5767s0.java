package p126j$.util.stream;

import java.util.Iterator;
import java.util.Objects;
import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.C5549m;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5533o;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.AbstractC5536r;
import p126j$.util.function.AbstractC5537s;
import p126j$.util.function.AbstractC5540v;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

public abstract class AbstractC5767s0 extends AbstractC5686c implements AbstractC5777u0 {
    public static final int f18463t = 0;

    public AbstractC5767s0(AbstractC5468G g, int i, boolean z) {
        super(g, i, z);
    }

    public AbstractC5767s0(AbstractC5686c cVar, int i) {
        super(cVar, i);
    }

    public static AbstractC5464C m22195L0(AbstractC5468G g) {
        if (g instanceof AbstractC5464C) {
            return (AbstractC5464C) g;
        }
        if (AbstractC5640Q3.f18220a) {
            AbstractC5640Q3.m22369a(AbstractC5686c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override
    final AbstractC5468G mo22197J0(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        return new C5780u3(d0, xVar, z);
    }

    public final Object m22194M0(AbstractC5542x xVar, AbstractC5540v vVar, BiConsumer biConsumer) {
        C5776u uVar = new C5776u(biConsumer, 2);
        Objects.requireNonNull(xVar);
        Objects.requireNonNull(vVar);
        return m22297t0(new C5583F1(3, uVar, vVar, xVar, 0));
    }

    public final AbstractC5777u0 m22193N0(AbstractC5537s sVar) {
        Objects.requireNonNull(sVar);
        return new C5556A(this, this, 3, EnumC5705f3.f18366p | EnumC5705f3.f18364n, sVar, 2);
    }

    public final AbstractC5690c3 m22192O0(AbstractC5536r rVar) {
        Objects.requireNonNull(rVar);
        return new C5796y(this, this, 3, EnumC5705f3.f18366p | EnumC5705f3.f18364n, rVar, 2);
    }

    public final C5549m m22191P0(AbstractC5533o oVar) {
        Objects.requireNonNull(oVar);
        return (C5549m) m22297t0(new C5603J1(3, oVar, 3));
    }

    public final AbstractC5464C spliterator() {
        return m22195L0(super.spliterator());
    }

    public void mo22171b(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        m22297t0(new C5660W(qVar, false));
    }

    public void mo22170f(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        m22297t0(new C5660W(qVar, true));
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22592h(spliterator());
    }

    @Override
    public final AbstractC5592H0 mo22189k0(long j, AbstractC5531m mVar) {
        return AbstractC5572D0.m22427c0(j);
    }

    public final long sum() {
        return ((Long) m22297t0(new C5658V1(3, C5676a.f18299p, 0L))).longValue();
    }

    @Override
    public AbstractC5711h unordered() {
        return !m22295y0() ? this : new C5697e0(this, this, 3, EnumC5705f3.f18368r, 1);
    }

    @Override
    final AbstractC5632P0 mo22188v0(AbstractC5572D0 d0, AbstractC5468G g, boolean z, AbstractC5531m mVar) {
        return AbstractC5572D0.m22439K(d0, g, z);
    }

    @Override
    final void mo22187w0(AbstractC5468G g, AbstractC5759q2 q2Var) {
        AbstractC5535q qVar;
        AbstractC5464C L0 = m22195L0(g);
        if (q2Var instanceof AbstractC5535q) {
            qVar = (AbstractC5535q) q2Var;
        } else if (!AbstractC5640Q3.f18220a) {
            qVar = new C5742n0(q2Var, 0);
        } else {
            AbstractC5640Q3.m22369a(AbstractC5686c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        }
        while (!q2Var.mo22130t() && L0.mo22165g(qVar)) {
        }
    }

    @Override
    public final int mo22186x0() {
        return 3;
    }
}
