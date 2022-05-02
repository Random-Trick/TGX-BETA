package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5542x;

public abstract class AbstractC5686c extends AbstractC5572D0 implements AbstractC5711h {
    public static final int f18319s = 0;
    private final AbstractC5686c f18320h;
    private final AbstractC5686c f18321i;
    protected final int f18322j;
    private AbstractC5686c f18323k;
    private int f18324l;
    private int f18325m;
    private AbstractC5468G f18326n;
    private boolean f18327o;
    private boolean f18328p;
    private Runnable f18329q;
    private boolean f18330r;

    public AbstractC5686c(AbstractC5468G g, int i, boolean z) {
        this.f18321i = null;
        this.f18326n = g;
        this.f18320h = this;
        int i2 = EnumC5705f3.f18357g & i;
        this.f18322j = i2;
        this.f18325m = (~(i2 << 1)) & EnumC5705f3.f18362l;
        this.f18324l = 0;
        this.f18330r = z;
    }

    public AbstractC5686c(AbstractC5686c cVar, int i) {
        if (!cVar.f18327o) {
            cVar.f18327o = true;
            cVar.f18323k = this;
            this.f18321i = cVar;
            this.f18322j = EnumC5705f3.f18358h & i;
            this.f18325m = EnumC5705f3.m22268a(i, cVar.f18325m);
            AbstractC5686c cVar2 = cVar.f18320h;
            this.f18320h = cVar2;
            if (mo22199D0()) {
                cVar2.f18328p = true;
            }
            this.f18324l = cVar.f18324l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    private AbstractC5468G m22308H0(int i) {
        int i2;
        int i3;
        AbstractC5686c cVar = this.f18320h;
        AbstractC5468G g = cVar.f18326n;
        if (g != null) {
            cVar.f18326n = null;
            if (cVar.f18330r && cVar.f18328p) {
                AbstractC5686c cVar2 = cVar.f18323k;
                int i4 = 1;
                while (cVar != this) {
                    int i5 = cVar2.f18322j;
                    if (cVar2.mo22199D0()) {
                        i4 = 0;
                        if (EnumC5705f3.SHORT_CIRCUIT.m22265d(i5)) {
                            i5 &= ~EnumC5705f3.f18371u;
                        }
                        g = cVar2.mo22140C0(cVar, g);
                        if (g.hasCharacteristics(64)) {
                            i3 = i5 & (~EnumC5705f3.f18370t);
                            i2 = EnumC5705f3.f18369s;
                        } else {
                            i3 = i5 & (~EnumC5705f3.f18369s);
                            i2 = EnumC5705f3.f18370t;
                        }
                        i5 = i3 | i2;
                    }
                    i4++;
                    cVar2.f18324l = i4;
                    cVar2.f18325m = EnumC5705f3.m22268a(i5, cVar.f18325m);
                    cVar2 = cVar2.f18323k;
                    cVar = cVar2;
                }
            }
            if (i != 0) {
                this.f18325m = EnumC5705f3.m22268a(i, this.f18325m);
            }
            return g;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public AbstractC5711h m22311A0(Runnable runnable) {
        AbstractC5686c cVar = this.f18320h;
        Runnable runnable2 = cVar.f18329q;
        if (runnable2 != null) {
            runnable = new RunnableC5620M3(runnable2, runnable);
        }
        cVar.f18329q = runnable;
        return this;
    }

    AbstractC5632P0 mo22141B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    AbstractC5468G mo22140C0(AbstractC5572D0 d0, AbstractC5468G g) {
        return mo22141B0(d0, g, C5676a.f18284a).mo42629spliterator();
    }

    abstract boolean mo22199D0();

    public abstract AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var);

    public final AbstractC5711h m22310F0() {
        this.f18320h.f18330r = true;
        return this;
    }

    public final AbstractC5711h m22309G0() {
        this.f18320h.f18330r = false;
        return this;
    }

    public final AbstractC5468G m22307I0() {
        AbstractC5686c cVar = this.f18320h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f18327o) {
            this.f18327o = true;
            AbstractC5468G g = cVar.f18326n;
            if (g != null) {
                cVar.f18326n = null;
                return g;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    abstract AbstractC5468G mo22197J0(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z);

    @Override
    public final void mo22306M(AbstractC5759q2 q2Var, AbstractC5468G g) {
        Objects.requireNonNull(q2Var);
        if (!EnumC5705f3.SHORT_CIRCUIT.m22265d(this.f18325m)) {
            q2Var.mo22131j(g.getExactSizeIfKnown());
            g.forEachRemaining(q2Var);
            q2Var.mo22132h();
            return;
        }
        mo22305N(q2Var, g);
    }

    @Override
    public final void mo22305N(AbstractC5759q2 q2Var, AbstractC5468G g) {
        AbstractC5686c cVar = this;
        while (cVar.f18324l > 0) {
            cVar = cVar.f18321i;
        }
        q2Var.mo22131j(g.getExactSizeIfKnown());
        cVar.mo22187w0(g, q2Var);
        q2Var.mo22132h();
    }

    @Override
    public final AbstractC5632P0 mo22304R(AbstractC5468G g, boolean z, AbstractC5531m mVar) {
        if (this.f18320h.f18330r) {
            return mo22188v0(this, g, z, mVar);
        }
        AbstractC5592H0 k0 = mo22189k0(mo22303S(g), mVar);
        Objects.requireNonNull(k0);
        mo22306M(mo22299r0(k0), g);
        return k0.mo42630b();
    }

    @Override
    public final long mo22303S(AbstractC5468G g) {
        if (EnumC5705f3.SIZED.m22265d(this.f18325m)) {
            return g.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override
    public final int mo22302Y() {
        AbstractC5686c cVar = this;
        while (cVar.f18324l > 0) {
            cVar = cVar.f18321i;
        }
        return cVar.mo22186x0();
    }

    @Override
    public final int mo22301Z() {
        return this.f18325m;
    }

    @Override
    public void close() {
        this.f18327o = true;
        this.f18326n = null;
        AbstractC5686c cVar = this.f18320h;
        Runnable runnable = cVar.f18329q;
        if (runnable != null) {
            cVar.f18329q = null;
            runnable.run();
        }
    }

    public final boolean isParallel() {
        return this.f18320h.f18330r;
    }

    @Override
    public final AbstractC5759q2 mo22300q0(AbstractC5759q2 q2Var, AbstractC5468G g) {
        Objects.requireNonNull(q2Var);
        mo22306M(mo22299r0(q2Var), g);
        return q2Var;
    }

    @Override
    public final AbstractC5759q2 mo22299r0(AbstractC5759q2 q2Var) {
        Objects.requireNonNull(q2Var);
        for (AbstractC5686c cVar = this; cVar.f18324l > 0; cVar = cVar.f18321i) {
            q2Var = cVar.mo22136E0(cVar.f18321i.f18325m, q2Var);
        }
        return q2Var;
    }

    @Override
    public final AbstractC5468G mo22298s0(AbstractC5468G g) {
        return this.f18324l == 0 ? g : mo22197J0(this, new C5681b(g, 0), this.f18320h.f18330r);
    }

    public AbstractC5468G spliterator() {
        if (!this.f18327o) {
            this.f18327o = true;
            AbstractC5686c cVar = this.f18320h;
            if (this != cVar) {
                return mo22197J0(this, new C5681b(this, 1), cVar.f18330r);
            }
            AbstractC5468G g = cVar.f18326n;
            if (g != null) {
                cVar.f18326n = null;
                return g;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public final Object m22297t0(AbstractC5625N3 n3) {
        if (!this.f18327o) {
            this.f18327o = true;
            return this.f18320h.f18330r ? n3.mo22319f(this, m22308H0(n3.mo22321a())) : n3.mo22318g(this, m22308H0(n3.mo22321a()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public final AbstractC5632P0 m22296u0(AbstractC5531m mVar) {
        if (!this.f18327o) {
            this.f18327o = true;
            if (!this.f18320h.f18330r || this.f18321i == null || !mo22199D0()) {
                return mo22304R(m22308H0(0), true, mVar);
            }
            this.f18324l = 0;
            AbstractC5686c cVar = this.f18321i;
            return mo22141B0(cVar, cVar.m22308H0(0), mVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract AbstractC5632P0 mo22188v0(AbstractC5572D0 d0, AbstractC5468G g, boolean z, AbstractC5531m mVar);

    abstract void mo22187w0(AbstractC5468G g, AbstractC5759q2 q2Var);

    public abstract int mo22186x0();

    public final boolean m22295y0() {
        return EnumC5705f3.ORDERED.m22265d(this.f18325m);
    }

    public AbstractC5468G m22294z0() {
        return m22308H0(0);
    }
}
