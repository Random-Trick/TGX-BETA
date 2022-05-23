package j$.util.stream;

import j$.util.H;
import j$.util.function.F;
import j$.util.function.o;
import java.util.Objects;

public abstract class AbstractC0301c extends E0 implements AbstractC0326h {
    public static final int f14708s = 0;
    private final AbstractC0301c f14709h;
    private final AbstractC0301c f14710i;
    protected final int f14711j;
    private AbstractC0301c f14712k;
    private int f14713l;
    private int f14714m;
    private H f14715n;
    private boolean f14716o;
    private boolean f14717p;
    private Runnable f14718q;
    private boolean f14719r;

    public AbstractC0301c(H h10, int i10, boolean z10) {
        this.f14710i = null;
        this.f14715n = h10;
        this.f14709h = this;
        int i11 = EnumC0325g3.f14752g & i10;
        this.f14711j = i11;
        this.f14714m = (~(i11 << 1)) & EnumC0325g3.f14757l;
        this.f14713l = 0;
        this.f14719r = z10;
    }

    public AbstractC0301c(AbstractC0301c cVar, int i10) {
        if (!cVar.f14716o) {
            cVar.f14716o = true;
            cVar.f14712k = this;
            this.f14710i = cVar;
            this.f14711j = EnumC0325g3.f14753h & i10;
            this.f14714m = EnumC0325g3.a(i10, cVar.f14714m);
            AbstractC0301c cVar2 = cVar.f14709h;
            this.f14709h = cVar2;
            if (H0()) {
                cVar2.f14717p = true;
            }
            this.f14713l = cVar.f14713l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    private H L0(int i10) {
        int i11;
        int i12;
        AbstractC0301c cVar = this.f14709h;
        H h10 = cVar.f14715n;
        if (h10 != null) {
            cVar.f14715n = null;
            if (cVar.f14719r && cVar.f14717p) {
                AbstractC0301c cVar2 = cVar.f14712k;
                int i13 = 1;
                while (cVar != this) {
                    int i14 = cVar2.f14711j;
                    if (cVar2.H0()) {
                        i13 = 0;
                        if (EnumC0325g3.SHORT_CIRCUIT.d(i14)) {
                            i14 &= ~EnumC0325g3.f14766u;
                        }
                        h10 = cVar2.G0(cVar, h10);
                        if (h10.hasCharacteristics(64)) {
                            i12 = i14 & (~EnumC0325g3.f14765t);
                            i11 = EnumC0325g3.f14764s;
                        } else {
                            i12 = i14 & (~EnumC0325g3.f14764s);
                            i11 = EnumC0325g3.f14765t;
                        }
                        i14 = i12 | i11;
                    }
                    i13++;
                    cVar2.f14713l = i13;
                    cVar2.f14714m = EnumC0325g3.a(i14, cVar.f14714m);
                    cVar2 = cVar2.f14712k;
                    cVar = cVar2;
                }
            }
            if (i10 != 0) {
                this.f14714m = EnumC0325g3.a(i10, this.f14714m);
            }
            return h10;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    abstract void A0(H h10, AbstractC0378r2 r2Var);

    public abstract int B0();

    public final boolean C0() {
        return EnumC0325g3.ORDERED.d(this.f14714m);
    }

    public final H D0() {
        return L0(0);
    }

    public final AbstractC0326h E0(Runnable runnable) {
        AbstractC0301c cVar = this.f14709h;
        Runnable runnable2 = cVar.f14718q;
        if (runnable2 != null) {
            runnable = new N3(runnable2, runnable);
        }
        cVar.f14718q = runnable;
        return this;
    }

    Q0 F0(E0 e02, H h10, o oVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    H G0(E0 e02, H h10) {
        return F0(e02, h10, C0291a.f14668a).mo31spliterator();
    }

    abstract boolean H0();

    public abstract AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var);

    public final AbstractC0326h J0() {
        this.f14709h.f14719r = true;
        return this;
    }

    public final AbstractC0326h K0() {
        this.f14709h.f14719r = false;
        return this;
    }

    public final H M0() {
        AbstractC0301c cVar = this.f14709h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f14716o) {
            this.f14716o = true;
            H h10 = cVar.f14715n;
            if (h10 != null) {
                cVar.f14715n = null;
                return h10;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    abstract H N0(E0 e02, F f10, boolean z10);

    @Override
    public final void R(AbstractC0378r2 r2Var, H h10) {
        Objects.requireNonNull(r2Var);
        if (!EnumC0325g3.SHORT_CIRCUIT.d(this.f14714m)) {
            r2Var.k(h10.getExactSizeIfKnown());
            h10.forEachRemaining(r2Var);
            r2Var.h();
            return;
        }
        S(r2Var, h10);
    }

    @Override
    public final void S(AbstractC0378r2 r2Var, H h10) {
        AbstractC0301c cVar = this;
        while (cVar.f14713l > 0) {
            cVar = cVar.f14710i;
        }
        r2Var.k(h10.getExactSizeIfKnown());
        cVar.A0(h10, r2Var);
        r2Var.h();
    }

    @Override
    public final Q0 W(H h10, boolean z10, o oVar) {
        if (this.f14709h.f14719r) {
            return z0(this, h10, z10, oVar);
        }
        I0 p02 = p0(X(h10), oVar);
        u0(p02, h10);
        return p02.mo32b();
    }

    @Override
    public final long X(H h10) {
        if (EnumC0325g3.SIZED.d(this.f14714m)) {
            return h10.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override
    public final void close() {
        this.f14716o = true;
        this.f14715n = null;
        AbstractC0301c cVar = this.f14709h;
        Runnable runnable = cVar.f14718q;
        if (runnable != null) {
            cVar.f14718q = null;
            runnable.run();
        }
    }

    @Override
    public final int d0() {
        AbstractC0301c cVar = this;
        while (cVar.f14713l > 0) {
            cVar = cVar.f14710i;
        }
        return cVar.B0();
    }

    @Override
    public final int e0() {
        return this.f14714m;
    }

    public final boolean isParallel() {
        return this.f14709h.f14719r;
    }

    public H spliterator() {
        if (!this.f14716o) {
            this.f14716o = true;
            AbstractC0301c cVar = this.f14709h;
            if (this != cVar) {
                return N0(this, new C0296b(this, 1), cVar.f14719r);
            }
            H h10 = cVar.f14715n;
            if (h10 != null) {
                cVar.f14715n = null;
                return h10;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    @Override
    public final AbstractC0378r2 u0(AbstractC0378r2 r2Var, H h10) {
        Objects.requireNonNull(r2Var);
        R(v0(r2Var), h10);
        return r2Var;
    }

    @Override
    public final AbstractC0378r2 v0(AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        for (AbstractC0301c cVar = this; cVar.f14713l > 0; cVar = cVar.f14710i) {
            r2Var = cVar.I0(cVar.f14710i.f14714m, r2Var);
        }
        return r2Var;
    }

    @Override
    public final H w0(H h10) {
        return this.f14713l == 0 ? h10 : N0(this, new C0296b(h10, 0), this.f14709h.f14719r);
    }

    public final Object x0(O3 o32) {
        if (!this.f14716o) {
            this.f14716o = true;
            return this.f14709h.f14719r ? o32.f(this, L0(o32.a())) : o32.g(this, L0(o32.a()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public final Q0 y0(o oVar) {
        if (!this.f14716o) {
            this.f14716o = true;
            if (!this.f14709h.f14719r || this.f14710i == null || !H0()) {
                return W(L0(0), true, oVar);
            }
            this.f14713l = 0;
            AbstractC0301c cVar = this.f14710i;
            return F0(cVar, cVar.L0(0), oVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract Q0 z0(E0 e02, H h10, boolean z10, o oVar);
}
