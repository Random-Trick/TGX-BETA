package j$.util.stream;

import j$.util.H;
import j$.util.function.o;

final class B2 extends AbstractC0306d {
    private final AbstractC0301c f14498j;
    private final o f14499k;
    private final long f14500l;
    private final long f14501m;
    private long f14502n;
    private volatile boolean f14503o;

    B2(B2 b22, H h10) {
        super(b22, h10);
        this.f14498j = b22.f14498j;
        this.f14499k = b22.f14499k;
        this.f14500l = b22.f14500l;
        this.f14501m = b22.f14501m;
    }

    public B2(AbstractC0301c cVar, E0 e02, H h10, o oVar, long j10, long j11) {
        super(e02, h10);
        this.f14498j = cVar;
        this.f14499k = oVar;
        this.f14500l = j10;
        this.f14501m = j11;
    }

    private long m(long j10) {
        if (this.f14503o) {
            return this.f14502n;
        }
        B2 b22 = (B2) this.f14743d;
        B2 b23 = (B2) this.f14744e;
        if (b22 == null || b23 == null) {
            return this.f14502n;
        }
        long m10 = b22.m(j10);
        return m10 >= j10 ? m10 : m10 + b23.m(j10);
    }

    @Override
    protected final Object a() {
        long j10 = -1;
        if (e()) {
            if (EnumC0325g3.SIZED.e(this.f14498j.f14711j)) {
                j10 = this.f14498j.X(this.f14741b);
            }
            I0 p02 = this.f14498j.p0(j10, this.f14499k);
            AbstractC0378r2 I0 = this.f14498j.I0(this.f14740a.e0(), p02);
            E0 e02 = this.f14740a;
            e02.S(e02.v0(I0), this.f14741b);
            return p02.mo32b();
        }
        E0 e03 = this.f14740a;
        I0 p03 = e03.p0(-1L, this.f14499k);
        e03.u0(p03, this.f14741b);
        Q0 b10 = p03.mo32b();
        this.f14502n = b10.count();
        this.f14503o = true;
        this.f14741b = null;
        return b10;
    }

    @Override
    protected final AbstractC0316f f(H h10) {
        return new B2(this, h10);
    }

    @Override
    protected final void i() {
        this.f14727i = true;
        if (this.f14503o) {
            g(k());
        }
    }

    public final Q0 k() {
        return E0.V(this.f14498j.B0());
    }

    @Override
    public final void onCompletion(java.util.concurrent.CountedCompleter r13) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.B2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
