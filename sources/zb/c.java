package zb;

import ac.d;
import ac.h;
import hc.a0;
import hc.e;
import hc.i;
import hc.j;
import hc.o;
import hc.y;
import java.io.IOException;
import java.net.ProtocolException;
import ra.k;
import ub.b0;
import ub.c0;
import ub.d0;
import ub.e0;
import ub.t;

public final class c {
    public boolean f27072a;
    public final f f27073b;
    public final e f27074c;
    public final t f27075d;
    public final d f27076e;
    public final d f27077f;

    public final class a extends i {
        public boolean M;
        public final long N;
        public final c O;
        public boolean f27078b;
        public long f27079c;

        public a(c cVar, y yVar, long j10) {
            super(yVar);
            k.e(yVar, "delegate");
            this.O = cVar;
            this.N = j10;
        }

        @Override
        public void c0(e eVar, long j10) {
            k.e(eVar, "source");
            if (!this.M) {
                long j11 = this.N;
                if (j11 == -1 || this.f27079c + j10 <= j11) {
                    try {
                        super.c0(eVar, j10);
                        this.f27079c += j10;
                    } catch (IOException e10) {
                        throw m(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + this.N + " bytes but received " + (this.f27079c + j10));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override
        public void close() {
            if (!this.M) {
                this.M = true;
                long j10 = this.N;
                if (j10 == -1 || this.f27079c == j10) {
                    try {
                        super.close();
                        m(null);
                    } catch (IOException e10) {
                        throw m(e10);
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
            } catch (IOException e10) {
                throw m(e10);
            }
        }

        public final <E extends IOException> E m(E e10) {
            if (this.f27078b) {
                return e10;
            }
            this.f27078b = true;
            return (E) this.O.a(this.f27079c, false, true, e10);
        }
    }

    public final class b extends j {
        public boolean M;
        public boolean N;
        public final long O;
        public final c P;
        public long f27080b;
        public boolean f27081c = true;

        public b(c cVar, a0 a0Var, long j10) {
            super(a0Var);
            k.e(a0Var, "delegate");
            this.P = cVar;
            this.O = j10;
            if (j10 == 0) {
                s(null);
            }
        }

        @Override
        public long A(e eVar, long j10) {
            k.e(eVar, "sink");
            if (!this.N) {
                try {
                    long A = m().A(eVar, j10);
                    if (this.f27081c) {
                        this.f27081c = false;
                        this.P.i().v(this.P.g());
                    }
                    if (A == -1) {
                        s(null);
                        return -1L;
                    }
                    long j11 = this.f27080b + A;
                    long j12 = this.O;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.O + " bytes but received " + j11);
                    }
                    this.f27080b = j11;
                    if (j11 == j12) {
                        s(null);
                    }
                    return A;
                } catch (IOException e10) {
                    throw s(e10);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override
        public void close() {
            if (!this.N) {
                this.N = true;
                try {
                    super.close();
                    s(null);
                } catch (IOException e10) {
                    throw s(e10);
                }
            }
        }

        public final <E extends IOException> E s(E e10) {
            if (this.M) {
                return e10;
            }
            this.M = true;
            if (e10 == null && this.f27081c) {
                this.f27081c = false;
                this.P.i().v(this.P.g());
            }
            return (E) this.P.a(this.f27080b, true, false, e10);
        }
    }

    public c(e eVar, t tVar, d dVar, d dVar2) {
        k.e(eVar, "call");
        k.e(tVar, "eventListener");
        k.e(dVar, "finder");
        k.e(dVar2, "codec");
        this.f27074c = eVar;
        this.f27075d = tVar;
        this.f27076e = dVar;
        this.f27077f = dVar2;
        this.f27073b = dVar2.e();
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            s(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f27075d.r(this.f27074c, e10);
            } else {
                this.f27075d.p(this.f27074c, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f27075d.w(this.f27074c, e10);
            } else {
                this.f27075d.u(this.f27074c, j10);
            }
        }
        return (E) this.f27074c.t(this, z11, z10, e10);
    }

    public final void b() {
        this.f27077f.cancel();
    }

    public final y c(b0 b0Var, boolean z10) {
        k.e(b0Var, "request");
        this.f27072a = z10;
        c0 a10 = b0Var.a();
        k.c(a10);
        long a11 = a10.a();
        this.f27075d.q(this.f27074c);
        return new a(this, this.f27077f.g(b0Var, a11), a11);
    }

    public final void d() {
        this.f27077f.cancel();
        this.f27074c.t(this, true, true, null);
    }

    public final void e() {
        try {
            this.f27077f.a();
        } catch (IOException e10) {
            this.f27075d.r(this.f27074c, e10);
            s(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f27077f.f();
        } catch (IOException e10) {
            this.f27075d.r(this.f27074c, e10);
            s(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f27074c;
    }

    public final f h() {
        return this.f27073b;
    }

    public final t i() {
        return this.f27075d;
    }

    public final d j() {
        return this.f27076e;
    }

    public final boolean k() {
        return !k.b(this.f27076e.d().l().h(), this.f27073b.z().a().l().h());
    }

    public final boolean l() {
        return this.f27072a;
    }

    public final void m() {
        this.f27077f.e().y();
    }

    public final void n() {
        this.f27074c.t(this, true, false, null);
    }

    public final e0 o(d0 d0Var) {
        k.e(d0Var, "response");
        try {
            String E0 = d0.E0(d0Var, "Content-Type", null, 2, null);
            long b10 = this.f27077f.b(d0Var);
            return new h(E0, b10, o.b(new b(this, this.f27077f.c(d0Var), b10)));
        } catch (IOException e10) {
            this.f27075d.w(this.f27074c, e10);
            s(e10);
            throw e10;
        }
    }

    public final d0.a p(boolean z10) {
        try {
            d0.a d10 = this.f27077f.d(z10);
            if (d10 != null) {
                d10.l(this);
            }
            return d10;
        } catch (IOException e10) {
            this.f27075d.w(this.f27074c, e10);
            s(e10);
            throw e10;
        }
    }

    public final void q(d0 d0Var) {
        k.e(d0Var, "response");
        this.f27075d.x(this.f27074c, d0Var);
    }

    public final void r() {
        this.f27075d.y(this.f27074c);
    }

    public final void s(IOException iOException) {
        this.f27076e.h(iOException);
        this.f27077f.e().G(this.f27074c, iOException);
    }

    public final void t(b0 b0Var) {
        k.e(b0Var, "request");
        try {
            this.f27075d.t(this.f27074c);
            this.f27077f.h(b0Var);
            this.f27075d.s(this.f27074c, b0Var);
        } catch (IOException e10) {
            this.f27075d.r(this.f27074c, e10);
            s(e10);
            throw e10;
        }
    }
}
