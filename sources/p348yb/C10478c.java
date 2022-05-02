package p348yb;

import java.io.IOException;
import java.net.ProtocolException;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4554i;
import p095gc.AbstractC4555j;
import p095gc.AbstractC4572y;
import p095gc.C4549e;
import p095gc.C4560o;
import p278tb.AbstractC9072c0;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9114t;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p362zb.AbstractC11463d;
import p362zb.C11467h;
import qa.C8298k;

public final class C10478c {
    public boolean f33566a;
    public final C10486f f33567b;
    public final C10482e f33568c;
    public final AbstractC9114t f33569d;
    public final C10481d f33570e;
    public final AbstractC11463d f33571f;

    public final class C10479a extends AbstractC4554i {
        public boolean f33572M;
        public final long f33573N;
        public final C10478c f33574O;
        public boolean f33575b;
        public long f33576c;

        public C10479a(C10478c cVar, AbstractC4572y yVar, long j) {
            super(yVar);
            C8298k.m12933e(yVar, "delegate");
            this.f33574O = cVar;
            this.f33573N = j;
        }

        @Override
        public void close() {
            if (!this.f33572M) {
                this.f33572M = true;
                long j = this.f33573N;
                if (j == -1 || this.f33576c == j) {
                    try {
                        super.close();
                        m5029m(null);
                    } catch (IOException e) {
                        throw m5029m(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        @Override
        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw m5029m(e);
            }
        }

        @Override
        public void mo5030h0(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "source");
            if (!this.f33572M) {
                long j2 = this.f33573N;
                if (j2 == -1 || this.f33576c + j <= j2) {
                    try {
                        super.mo5030h0(eVar, j);
                        this.f33576c += j;
                    } catch (IOException e) {
                        throw m5029m(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f33573N + " bytes but received " + (this.f33576c + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E m5029m(E e) {
            if (this.f33575b) {
                return e;
            }
            this.f33575b = true;
            return (E) this.f33574O.m5050a(this.f33576c, false, true, e);
        }
    }

    public final class C10480b extends AbstractC4555j {
        public boolean f33577M;
        public boolean f33578N;
        public final long f33579O;
        public final C10478c f33580P;
        public long f33581b;
        public boolean f33582c = true;

        public C10480b(C10478c cVar, AbstractC4537a0 a0Var, long j) {
            super(a0Var);
            C8298k.m12933e(a0Var, "delegate");
            this.f33580P = cVar;
            this.f33579O = j;
            if (j == 0) {
                m5027t(null);
            }
        }

        @Override
        public void close() {
            if (!this.f33578N) {
                this.f33578N = true;
                try {
                    super.close();
                    m5027t(null);
                } catch (IOException e) {
                    throw m5027t(e);
                }
            }
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            if (!this.f33578N) {
                try {
                    long s = m27398m().mo5028s(eVar, j);
                    if (this.f33582c) {
                        this.f33582c = false;
                        this.f33580P.m5042i().m10386v(this.f33580P.m5044g());
                    }
                    if (s == -1) {
                        m5027t(null);
                        return -1L;
                    }
                    long j2 = this.f33581b + s;
                    long j3 = this.f33579O;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.f33579O + " bytes but received " + j2);
                    }
                    this.f33581b = j2;
                    if (j2 == j3) {
                        m5027t(null);
                    }
                    return s;
                } catch (IOException e) {
                    throw m5027t(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E m5027t(E e) {
            if (this.f33577M) {
                return e;
            }
            this.f33577M = true;
            if (e == null && this.f33582c) {
                this.f33582c = false;
                this.f33580P.m5042i().m10386v(this.f33580P.m5044g());
            }
            return (E) this.f33580P.m5050a(this.f33581b, true, false, e);
        }
    }

    public C10478c(C10482e eVar, AbstractC9114t tVar, C10481d dVar, AbstractC11463d dVar2) {
        C8298k.m12933e(eVar, "call");
        C8298k.m12933e(tVar, "eventListener");
        C8298k.m12933e(dVar, "finder");
        C8298k.m12933e(dVar2, "codec");
        this.f33568c = eVar;
        this.f33569d = tVar;
        this.f33570e = dVar;
        this.f33571f = dVar2;
        this.f33567b = dVar2.mo553g();
    }

    public final <E extends IOException> E m5050a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m5032s(e);
        }
        if (z2) {
            if (e != null) {
                this.f33569d.m10390r(this.f33568c, e);
            } else {
                this.f33569d.m10392p(this.f33568c, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f33569d.m10385w(this.f33568c, e);
            } else {
                this.f33569d.m10387u(this.f33568c, j);
            }
        }
        return (E) this.f33568c.m4998s(this, z2, z, e);
    }

    public final void m5049b() {
        this.f33571f.cancel();
    }

    public final AbstractC4572y m5048c(C9069b0 b0Var, boolean z) {
        C8298k.m12933e(b0Var, "request");
        this.f33566a = z;
        AbstractC9072c0 a = b0Var.m10566a();
        C8298k.m12935c(a);
        long a2 = a.mo10546a();
        this.f33569d.m10391q(this.f33568c);
        return new C10479a(this, this.f33571f.mo558b(b0Var, a2), a2);
    }

    public final void m5047d() {
        this.f33571f.cancel();
        this.f33568c.m4998s(this, true, true, null);
    }

    public final void m5046e() {
        try {
            this.f33571f.mo556d();
        } catch (IOException e) {
            this.f33569d.m10390r(this.f33568c, e);
            m5032s(e);
            throw e;
        }
    }

    public final void m5045f() {
        try {
            this.f33571f.mo552h();
        } catch (IOException e) {
            this.f33569d.m10390r(this.f33568c, e);
            m5032s(e);
            throw e;
        }
    }

    public final C10482e m5044g() {
        return this.f33568c;
    }

    public final C10486f m5043h() {
        return this.f33567b;
    }

    public final AbstractC9114t m5042i() {
        return this.f33569d;
    }

    public final C10481d m5041j() {
        return this.f33570e;
    }

    public final boolean m5040k() {
        return !C8298k.m12936b(this.f33570e.m5023d().m10569l().m10346h(), this.f33567b.m4951z().m10484a().m10569l().m10346h());
    }

    public final boolean m5039l() {
        return this.f33566a;
    }

    public final void m5038m() {
        this.f33571f.mo553g().m4952y();
    }

    public final void m5037n() {
        this.f33568c.m4998s(this, true, false, null);
    }

    public final AbstractC9081e0 m5036o(C9078d0 d0Var) {
        C8298k.m12933e(d0Var, "response");
        try {
            String E0 = C9078d0.m10523E0(d0Var, "Content-Type", null, 2, null);
            long a = this.f33571f.mo559a(d0Var);
            return new C11467h(E0, a, C4560o.m27380b(new C10480b(this, this.f33571f.mo557c(d0Var), a)));
        } catch (IOException e) {
            this.f33569d.m10385w(this.f33568c, e);
            m5032s(e);
            throw e;
        }
    }

    public final C9078d0.C9079a m5035p(boolean z) {
        try {
            C9078d0.C9079a f = this.f33571f.mo554f(z);
            if (f != null) {
                f.m10497l(this);
            }
            return f;
        } catch (IOException e) {
            this.f33569d.m10385w(this.f33568c, e);
            m5032s(e);
            throw e;
        }
    }

    public final void m5034q(C9078d0 d0Var) {
        C8298k.m12933e(d0Var, "response");
        this.f33569d.m10384x(this.f33568c, d0Var);
    }

    public final void m5033r() {
        this.f33569d.m10383y(this.f33568c);
    }

    public final void m5032s(IOException iOException) {
        this.f33570e.m5019h(iOException);
        this.f33571f.mo553g().m4977G(this.f33568c, iOException);
    }

    public final void m5031t(C9069b0 b0Var) {
        C8298k.m12933e(b0Var, "request");
        try {
            this.f33569d.m10388t(this.f33568c);
            this.f33571f.mo555e(b0Var);
            this.f33569d.m10389s(this.f33568c, b0Var);
        } catch (IOException e) {
            this.f33569d.m10390r(this.f33568c, e);
            m5032s(e);
            throw e;
        }
    }
}
