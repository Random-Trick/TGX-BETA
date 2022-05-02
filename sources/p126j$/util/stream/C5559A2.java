package p126j$.util.stream;

import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;

final class C5559A2 extends AbstractC5691d {
    private final AbstractC5686c f18103j;
    private final AbstractC5531m f18104k;
    private final long f18105l;
    private final long f18106m;
    private long f18107n;
    private volatile boolean f18108o;

    C5559A2(C5559A2 a2, AbstractC5468G g) {
        super(a2, g);
        this.f18103j = a2.f18103j;
        this.f18104k = a2.f18104k;
        this.f18105l = a2.f18105l;
        this.f18106m = a2.f18106m;
    }

    public C5559A2(AbstractC5686c cVar, AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar, long j, long j2) {
        super(d0, g);
        this.f18103j = cVar;
        this.f18104k = mVar;
        this.f18105l = j;
        this.f18106m = j2;
    }

    private long m22457m(long j) {
        if (this.f18108o) {
            return this.f18107n;
        }
        C5559A2 a2 = (C5559A2) this.f18353d;
        C5559A2 a22 = (C5559A2) this.f18354e;
        if (a2 == null || a22 == null) {
            return this.f18107n;
        }
        long m = a2.m22457m(j);
        return m >= j ? m : m + a22.m22457m(j);
    }

    @Override
    protected Object mo22278a() {
        long j = -1;
        if (m22274e()) {
            if (EnumC5705f3.SIZED.m22264e(this.f18103j.f18322j)) {
                j = this.f18103j.mo22303S(this.f18351b);
            }
            AbstractC5592H0 k0 = this.f18103j.mo22189k0(j, this.f18104k);
            AbstractC5759q2 E0 = this.f18103j.mo22136E0(this.f18350a.mo22301Z(), k0);
            AbstractC5572D0 d0 = this.f18350a;
            d0.mo22305N(d0.mo22299r0(E0), this.f18351b);
            return k0.mo42630b();
        }
        AbstractC5572D0 d02 = this.f18350a;
        AbstractC5592H0 k02 = d02.mo22189k0(-1L, this.f18104k);
        d02.mo22300q0(k02, this.f18351b);
        AbstractC5632P0 b = k02.mo42630b();
        this.f18107n = b.count();
        this.f18108o = true;
        this.f18351b = null;
        return b;
    }

    @Override
    protected AbstractC5701f mo22273f(AbstractC5468G g) {
        return new C5559A2(this, g);
    }

    @Override
    protected void mo22292i() {
        this.f18336i = true;
        if (this.f18108o) {
            mo22272g(mo22290k());
        }
    }

    public final AbstractC5632P0 mo22290k() {
        return AbstractC5572D0.m22435Q(this.f18103j.mo22186x0());
    }

    @Override
    public final void onCompletion(java.util.concurrent.CountedCompleter r12) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.stream.C5559A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
