package bc;

import ab.n;
import ab.o;
import ac.i;
import hc.a0;
import hc.b0;
import hc.k;
import hc.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import ub.d0;
import ub.p;
import ub.v;
import ub.w;
import ub.z;

public final class b implements ac.d {
    public static final d f4091h = new d(null);
    public int f4092a;
    public final bc.a f4093b;
    public v f4094c;
    public final z f4095d;
    public final zb.f f4096e;
    public final hc.g f4097f;
    public final hc.f f4098g;

    public abstract class a implements a0 {
        public final k f4099a;
        public boolean f4100b;

        public a() {
            this.f4099a = new k(b.this.f4097f.c());
        }

        @Override
        public long A(hc.e eVar, long j10) {
            ra.k.e(eVar, "sink");
            try {
                return b.this.f4097f.A(eVar, j10);
            } catch (IOException e10) {
                b.this.e().y();
                s();
                throw e10;
            }
        }

        @Override
        public b0 c() {
            return this.f4099a;
        }

        public final boolean m() {
            return this.f4100b;
        }

        public final void s() {
            if (b.this.f4092a != 6) {
                if (b.this.f4092a == 5) {
                    b.this.r(this.f4099a);
                    b.this.f4092a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + b.this.f4092a);
            }
        }

        public final void y0(boolean z10) {
            this.f4100b = z10;
        }
    }

    public final class C0059b implements y {
        public final k f4102a;
        public boolean f4103b;

        public C0059b() {
            this.f4102a = new k(b.this.f4098g.c());
        }

        @Override
        public b0 c() {
            return this.f4102a;
        }

        @Override
        public void c0(hc.e eVar, long j10) {
            ra.k.e(eVar, "source");
            if (!(!this.f4103b)) {
                throw new IllegalStateException("closed".toString());
            } else if (j10 != 0) {
                b.this.f4098g.X(j10);
                b.this.f4098g.P("\r\n");
                b.this.f4098g.c0(eVar, j10);
                b.this.f4098g.P("\r\n");
            }
        }

        @Override
        public synchronized void close() {
            if (!this.f4103b) {
                this.f4103b = true;
                b.this.f4098g.P("0\r\n\r\n");
                b.this.r(this.f4102a);
                b.this.f4092a = 3;
            }
        }

        @Override
        public synchronized void flush() {
            if (!this.f4103b) {
                b.this.f4098g.flush();
            }
        }
    }

    public final class c extends a {
        public long M = -1;
        public boolean N = true;
        public final w O;
        public final b P;

        public c(b bVar, w wVar) {
            super();
            ra.k.e(wVar, "url");
            this.P = bVar;
            this.O = wVar;
        }

        @Override
        public long A(hc.e eVar, long j10) {
            ra.k.e(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!(true ^ m())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.N) {
                return -1L;
            } else {
                long j11 = this.M;
                if (j11 == 0 || j11 == -1) {
                    z0();
                    if (!this.N) {
                        return -1L;
                    }
                }
                long A = super.A(eVar, Math.min(j10, this.M));
                if (A != -1) {
                    this.M -= A;
                    return A;
                }
                this.P.e().y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                s();
                throw protocolException;
            }
        }

        @Override
        public void close() {
            if (!m()) {
                if (this.N && !vb.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.P.e().y();
                    s();
                }
                y0(true);
            }
        }

        public final void z0() {
            if (this.M != -1) {
                this.P.f4097f.g0();
            }
            try {
                this.M = this.P.f4097f.v0();
                String g02 = this.P.f4097f.g0();
                if (g02 != null) {
                    String obj = o.u0(g02).toString();
                    if (this.M >= 0) {
                        if (!(obj.length() > 0) || n.x(obj, ";", false, 2, null)) {
                            if (this.M == 0) {
                                this.N = false;
                                b bVar = this.P;
                                bVar.f4094c = bVar.f4093b.a();
                                z zVar = this.P.f4095d;
                                ra.k.c(zVar);
                                p j10 = zVar.j();
                                w wVar = this.O;
                                v vVar = this.P.f4094c;
                                ra.k.c(vVar);
                                ac.e.f(j10, wVar, vVar);
                                s();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.M + obj + '\"');
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }
    }

    public static final class d {
        public d() {
        }

        public d(ra.g gVar) {
            this();
        }
    }

    public final class e extends a {
        public long M;

        public e(long j10) {
            super();
            this.M = j10;
            if (j10 == 0) {
                s();
            }
        }

        @Override
        public long A(hc.e eVar, long j10) {
            ra.k.e(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (true ^ m()) {
                long j11 = this.M;
                if (j11 == 0) {
                    return -1L;
                }
                long A = super.A(eVar, Math.min(j11, j10));
                if (A != -1) {
                    long j12 = this.M - A;
                    this.M = j12;
                    if (j12 == 0) {
                        s();
                    }
                    return A;
                }
                b.this.e().y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                s();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override
        public void close() {
            if (!m()) {
                if (this.M != 0 && !vb.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                    b.this.e().y();
                    s();
                }
                y0(true);
            }
        }
    }

    public final class f implements y {
        public final k f4105a;
        public boolean f4106b;

        public f() {
            this.f4105a = new k(b.this.f4098g.c());
        }

        @Override
        public b0 c() {
            return this.f4105a;
        }

        @Override
        public void c0(hc.e eVar, long j10) {
            ra.k.e(eVar, "source");
            if (!this.f4106b) {
                vb.b.i(eVar.size(), 0L, j10);
                b.this.f4098g.c0(eVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override
        public void close() {
            if (!this.f4106b) {
                this.f4106b = true;
                b.this.r(this.f4105a);
                b.this.f4092a = 3;
            }
        }

        @Override
        public void flush() {
            if (!this.f4106b) {
                b.this.f4098g.flush();
            }
        }
    }

    public final class g extends a {
        public boolean M;

        public g() {
            super();
        }

        @Override
        public long A(hc.e eVar, long j10) {
            ra.k.e(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!(!m())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.M) {
                return -1L;
            } else {
                long A = super.A(eVar, j10);
                if (A != -1) {
                    return A;
                }
                this.M = true;
                s();
                return -1L;
            }
        }

        @Override
        public void close() {
            if (!m()) {
                if (!this.M) {
                    s();
                }
                y0(true);
            }
        }
    }

    public b(z zVar, zb.f fVar, hc.g gVar, hc.f fVar2) {
        ra.k.e(fVar, "connection");
        ra.k.e(gVar, "source");
        ra.k.e(fVar2, "sink");
        this.f4095d = zVar;
        this.f4096e = fVar;
        this.f4097f = gVar;
        this.f4098g = fVar2;
        this.f4093b = new bc.a(gVar);
    }

    public final void A(v vVar, String str) {
        ra.k.e(vVar, "headers");
        ra.k.e(str, "requestLine");
        if (this.f4092a == 0) {
            this.f4098g.P(str).P("\r\n");
            int size = vVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4098g.P(vVar.g(i10)).P(": ").P(vVar.r(i10)).P("\r\n");
            }
            this.f4098g.P("\r\n");
            this.f4092a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f4092a).toString());
    }

    @Override
    public void a() {
        this.f4098g.flush();
    }

    @Override
    public long b(d0 d0Var) {
        ra.k.e(d0Var, "response");
        if (!ac.e.b(d0Var)) {
            return 0L;
        }
        if (t(d0Var)) {
            return -1L;
        }
        return vb.b.s(d0Var);
    }

    @Override
    public a0 c(d0 d0Var) {
        ra.k.e(d0Var, "response");
        if (!ac.e.b(d0Var)) {
            return w(0L);
        }
        if (t(d0Var)) {
            return v(d0Var.N0().i());
        }
        long s10 = vb.b.s(d0Var);
        if (s10 != -1) {
            return w(s10);
        }
        return y();
    }

    @Override
    public void cancel() {
        e().d();
    }

    @Override
    public d0.a d(boolean z10) {
        int i10 = this.f4092a;
        boolean z11 = true;
        if (!(i10 == 1 || i10 == 3)) {
            z11 = false;
        }
        if (z11) {
            try {
                ac.k a10 = ac.k.f739d.a(this.f4093b.b());
                d0.a k10 = new d0.a().p(a10.f740a).g(a10.f741b).m(a10.f742c).k(this.f4093b.a());
                if (z10 && a10.f741b == 100) {
                    return null;
                }
                if (a10.f741b == 100) {
                    this.f4092a = 3;
                    return k10;
                }
                this.f4092a = 4;
                return k10;
            } catch (EOFException e10) {
                String n10 = e().z().a().l().n();
                throw new IOException("unexpected end of stream on " + n10, e10);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f4092a).toString());
        }
    }

    @Override
    public zb.f e() {
        return this.f4096e;
    }

    @Override
    public void f() {
        this.f4098g.flush();
    }

    @Override
    public y g(ub.b0 b0Var, long j10) {
        ra.k.e(b0Var, "request");
        if (b0Var.a() != null && b0Var.a().c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(b0Var)) {
            return u();
        } else {
            if (j10 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override
    public void h(ub.b0 b0Var) {
        ra.k.e(b0Var, "request");
        i iVar = i.f736a;
        Proxy.Type type = e().z().b().type();
        ra.k.d(type, "connection.route().proxy.type()");
        A(b0Var.e(), iVar.a(b0Var, type));
    }

    public final void r(k kVar) {
        b0 i10 = kVar.i();
        kVar.j(b0.f12628d);
        i10.a();
        i10.b();
    }

    public final boolean s(ub.b0 b0Var) {
        return n.l("chunked", b0Var.d("Transfer-Encoding"), true);
    }

    public final boolean t(d0 d0Var) {
        return n.l("chunked", d0.E0(d0Var, "Transfer-Encoding", null, 2, null), true);
    }

    public final y u() {
        boolean z10 = true;
        if (this.f4092a != 1) {
            z10 = false;
        }
        if (z10) {
            this.f4092a = 2;
            return new C0059b();
        }
        throw new IllegalStateException(("state: " + this.f4092a).toString());
    }

    public final a0 v(w wVar) {
        if (this.f4092a == 4) {
            this.f4092a = 5;
            return new c(this, wVar);
        }
        throw new IllegalStateException(("state: " + this.f4092a).toString());
    }

    public final a0 w(long j10) {
        if (this.f4092a == 4) {
            this.f4092a = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f4092a).toString());
    }

    public final y x() {
        boolean z10 = true;
        if (this.f4092a != 1) {
            z10 = false;
        }
        if (z10) {
            this.f4092a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f4092a).toString());
    }

    public final a0 y() {
        if (this.f4092a == 4) {
            this.f4092a = 5;
            e().y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f4092a).toString());
    }

    public final void z(d0 d0Var) {
        ra.k.e(d0Var, "response");
        long s10 = vb.b.s(d0Var);
        if (s10 != -1) {
            a0 w10 = w(s10);
            vb.b.H(w10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w10.close();
        }
    }
}
