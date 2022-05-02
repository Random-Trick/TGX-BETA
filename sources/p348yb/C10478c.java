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
    public boolean f33563a;
    public final C10486f f33564b;
    public final C10482e f33565c;
    public final AbstractC9114t f33566d;
    public final C10481d f33567e;
    public final AbstractC11463d f33568f;

    public final class C10479a extends AbstractC4554i {
        public boolean f33569M;
        public final long f33570N;
        public final C10478c f33571O;
        public boolean f33572b;
        public long f33573c;

        public C10479a(C10478c cVar, AbstractC4572y yVar, long j) {
            super(yVar);
            C8298k.m12934e(yVar, "delegate");
            this.f33571O = cVar;
            this.f33570N = j;
        }

        @Override
        public void close() {
            if (!this.f33569M) {
                this.f33569M = true;
                long j = this.f33570N;
                if (j == -1 || this.f33573c == j) {
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
            C8298k.m12934e(eVar, "source");
            if (!this.f33569M) {
                long j2 = this.f33570N;
                if (j2 == -1 || this.f33573c + j <= j2) {
                    try {
                        super.mo5030h0(eVar, j);
                        this.f33573c += j;
                    } catch (IOException e) {
                        throw m5029m(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f33570N + " bytes but received " + (this.f33573c + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E m5029m(E e) {
            if (this.f33572b) {
                return e;
            }
            this.f33572b = true;
            return (E) this.f33571O.m5050a(this.f33573c, false, true, e);
        }
    }

    public final class C10480b extends AbstractC4555j {
        public boolean f33574M;
        public boolean f33575N;
        public final long f33576O;
        public final C10478c f33577P;
        public long f33578b;
        public boolean f33579c = true;

        public C10480b(C10478c cVar, AbstractC4537a0 a0Var, long j) {
            super(a0Var);
            C8298k.m12934e(a0Var, "delegate");
            this.f33577P = cVar;
            this.f33576O = j;
            if (j == 0) {
                m5027t(null);
            }
        }

        @Override
        public void close() {
            if (!this.f33575N) {
                this.f33575N = true;
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
            C8298k.m12934e(eVar, "sink");
            if (!this.f33575N) {
                try {
                    long s = m27396m().mo5028s(eVar, j);
                    if (this.f33579c) {
                        this.f33579c = false;
                        this.f33577P.m5042i().m10387v(this.f33577P.m5044g());
                    }
                    if (s == -1) {
                        m5027t(null);
                        return -1L;
                    }
                    long j2 = this.f33578b + s;
                    long j3 = this.f33576O;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.f33576O + " bytes but received " + j2);
                    }
                    this.f33578b = j2;
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
            if (this.f33574M) {
                return e;
            }
            this.f33574M = true;
            if (e == null && this.f33579c) {
                this.f33579c = false;
                this.f33577P.m5042i().m10387v(this.f33577P.m5044g());
            }
            return (E) this.f33577P.m5050a(this.f33578b, true, false, e);
        }
    }

    public C10478c(C10482e eVar, AbstractC9114t tVar, C10481d dVar, AbstractC11463d dVar2) {
        C8298k.m12934e(eVar, "call");
        C8298k.m12934e(tVar, "eventListener");
        C8298k.m12934e(dVar, "finder");
        C8298k.m12934e(dVar2, "codec");
        this.f33565c = eVar;
        this.f33566d = tVar;
        this.f33567e = dVar;
        this.f33568f = dVar2;
        this.f33564b = dVar2.mo553g();
    }

    public final <E extends IOException> E m5050a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m5032s(e);
        }
        if (z2) {
            if (e != null) {
                this.f33566d.m10391r(this.f33565c, e);
            } else {
                this.f33566d.m10393p(this.f33565c, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f33566d.m10386w(this.f33565c, e);
            } else {
                this.f33566d.m10388u(this.f33565c, j);
            }
        }
        return (E) this.f33565c.m4998s(this, z2, z, e);
    }

    public final void m5049b() {
        this.f33568f.cancel();
    }

    public final AbstractC4572y m5048c(C9069b0 b0Var, boolean z) {
        C8298k.m12934e(b0Var, "request");
        this.f33563a = z;
        AbstractC9072c0 a = b0Var.m10567a();
        C8298k.m12936c(a);
        long a2 = a.mo10547a();
        this.f33566d.m10392q(this.f33565c);
        return new C10479a(this, this.f33568f.mo558b(b0Var, a2), a2);
    }

    public final void m5047d() {
        this.f33568f.cancel();
        this.f33565c.m4998s(this, true, true, null);
    }

    public final void m5046e() {
        try {
            this.f33568f.mo556d();
        } catch (IOException e) {
            this.f33566d.m10391r(this.f33565c, e);
            m5032s(e);
            throw e;
        }
    }

    public final void m5045f() {
        try {
            this.f33568f.mo552h();
        } catch (IOException e) {
            this.f33566d.m10391r(this.f33565c, e);
            m5032s(e);
            throw e;
        }
    }

    public final C10482e m5044g() {
        return this.f33565c;
    }

    public final C10486f m5043h() {
        return this.f33564b;
    }

    public final AbstractC9114t m5042i() {
        return this.f33566d;
    }

    public final C10481d m5041j() {
        return this.f33567e;
    }

    public final boolean m5040k() {
        return !C8298k.m12937b(this.f33567e.m5023d().m10570l().m10347h(), this.f33564b.m4951z().m10485a().m10570l().m10347h());
    }

    public final boolean m5039l() {
        return this.f33563a;
    }

    public final void m5038m() {
        this.f33568f.mo553g().m4952y();
    }

    public final void m5037n() {
        this.f33565c.m4998s(this, true, false, null);
    }

    public final AbstractC9081e0 m5036o(C9078d0 d0Var) {
        C8298k.m12934e(d0Var, "response");
        try {
            String E0 = C9078d0.m10524E0(d0Var, "Content-Type", null, 2, null);
            long a = this.f33568f.mo559a(d0Var);
            return new C11467h(E0, a, C4560o.m27378b(new C10480b(this, this.f33568f.mo557c(d0Var), a)));
        } catch (IOException e) {
            this.f33566d.m10386w(this.f33565c, e);
            m5032s(e);
            throw e;
        }
    }

    public final C9078d0.C9079a m5035p(boolean z) {
        try {
            C9078d0.C9079a f = this.f33568f.mo554f(z);
            if (f != null) {
                f.m10498l(this);
            }
            return f;
        } catch (IOException e) {
            this.f33566d.m10386w(this.f33565c, e);
            m5032s(e);
            throw e;
        }
    }

    public final void m5034q(C9078d0 d0Var) {
        C8298k.m12934e(d0Var, "response");
        this.f33566d.m10385x(this.f33565c, d0Var);
    }

    public final void m5033r() {
        this.f33566d.m10384y(this.f33565c);
    }

    public final void m5032s(IOException iOException) {
        this.f33567e.m5019h(iOException);
        this.f33568f.mo553g().m4977G(this.f33565c, iOException);
    }

    public final void m5031t(C9069b0 b0Var) {
        C8298k.m12934e(b0Var, "request");
        try {
            this.f33566d.m10389t(this.f33565c);
            this.f33568f.mo555e(b0Var);
            this.f33566d.m10390s(this.f33565c, b0Var);
        } catch (IOException e) {
            this.f33566d.m10391r(this.f33565c, e);
            m5032s(e);
            throw e;
        }
    }
}
