package ac;

import ja.n;
import ja.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import ra.g;
import ra.k;
import ub.b0;
import ub.c0;
import ub.d0;
import ub.e0;
import ub.f0;
import ub.w;
import ub.x;
import ub.z;
import vb.b;
import zb.c;
import zb.e;
import zb.f;

public final class j implements x {
    public static final a f737b = new a(null);
    public final z f738a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public j(z zVar) {
        k.e(zVar, "client");
        this.f738a = zVar;
    }

    @Override
    public d0 a(x.a aVar) {
        c o10;
        b0 c10;
        k.e(aVar, "chain");
        g gVar = (g) aVar;
        b0 i10 = gVar.i();
        e e10 = gVar.e();
        List f10 = n.f();
        boolean z10 = true;
        z10 = false;
        d0 d0Var = null;
        boolean z11 = true;
        int i11 = 0;
        while (true) {
            e10.h(i10, z11);
            try {
                if (!e10.m()) {
                    try {
                        d0 a10 = gVar.a(i10);
                        if (d0Var != null) {
                            a10 = a10.J0().o(d0Var.J0().b(null).c()).c();
                        }
                        d0Var = a10;
                        o10 = e10.o();
                        c10 = c(d0Var, o10);
                    } catch (IOException e11) {
                        if (e(e11, e10, i10, !(e11 instanceof cc.a))) {
                            f10 = v.K(f10, e11);
                            e10.i(z10);
                            z11 = false;
                        } else {
                            throw b.T(e11, f10);
                        }
                    } catch (zb.j e12) {
                        if (e(e12.c(), e10, i10, z10)) {
                            f10 = v.K(f10, e12.b());
                            e10.i(z10);
                            z11 = false;
                        } else {
                            throw b.T(e12.b(), f10);
                        }
                    }
                    if (c10 == null) {
                        if (o10 != null && o10.l()) {
                            e10.z();
                        }
                        return d0Var;
                    }
                    c0 a11 = c10.a();
                    if (a11 != null && a11.d()) {
                        return d0Var;
                    }
                    e0 m10 = d0Var.m();
                    if (m10 != null) {
                        b.j(m10);
                    }
                    i11++;
                    if (i11 <= 20) {
                        e10.i(z10);
                        i10 = c10;
                        z11 = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i11);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
                e10.i(z10);
            }
        }
    }

    public final b0 b(d0 d0Var, String str) {
        String E0;
        w o10;
        c0 c0Var = null;
        if (!this.f738a.o() || (E0 = d0.E0(d0Var, "Location", null, 2, null)) == null || (o10 = d0Var.N0().i().o(E0)) == null) {
            return null;
        }
        if (!k.b(o10.p(), d0Var.N0().i().p()) && !this.f738a.p()) {
            return null;
        }
        b0.a h10 = d0Var.N0().h();
        if (f.a(str)) {
            int A0 = d0Var.A0();
            f fVar = f.f724a;
            boolean z10 = fVar.c(str) || A0 == 308 || A0 == 307;
            if (!fVar.b(str) || A0 == 308 || A0 == 307) {
                if (z10) {
                    c0Var = d0Var.N0().a();
                }
                h10.d(str, c0Var);
            } else {
                h10.d("GET", null);
            }
            if (!z10) {
                h10.e("Transfer-Encoding");
                h10.e("Content-Length");
                h10.e("Content-Type");
            }
        }
        if (!b.g(d0Var.N0().i(), o10)) {
            h10.e("Authorization");
        }
        return h10.g(o10).a();
    }

    public final b0 c(d0 d0Var, c cVar) {
        f h10;
        f0 z10 = (cVar == null || (h10 = cVar.h()) == null) ? null : h10.z();
        int A0 = d0Var.A0();
        String g10 = d0Var.N0().g();
        if (!(A0 == 307 || A0 == 308)) {
            if (A0 == 401) {
                return this.f738a.c().a(z10, d0Var);
            }
            if (A0 == 421) {
                c0 a10 = d0Var.N0().a();
                if ((a10 != null && a10.d()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().x();
                return d0Var.N0();
            } else if (A0 == 503) {
                d0 K0 = d0Var.K0();
                if ((K0 == null || K0.A0() != 503) && g(d0Var, Integer.MAX_VALUE) == 0) {
                    return d0Var.N0();
                }
                return null;
            } else if (A0 == 407) {
                k.c(z10);
                if (z10.b().type() == Proxy.Type.HTTP) {
                    return this.f738a.z().a(z10, d0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (A0 != 408) {
                switch (A0) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            } else if (!this.f738a.C()) {
                return null;
            } else {
                c0 a11 = d0Var.N0().a();
                if (a11 != null && a11.d()) {
                    return null;
                }
                d0 K02 = d0Var.K0();
                if ((K02 == null || K02.A0() != 408) && g(d0Var, 0) <= 0) {
                    return d0Var.N0();
                }
                return null;
            }
        }
        return b(d0Var, g10);
    }

    public final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    public final boolean e(IOException iOException, e eVar, b0 b0Var, boolean z10) {
        if (!this.f738a.C()) {
            return false;
        }
        return (!z10 || !f(iOException, b0Var)) && d(iOException, z10) && eVar.x();
    }

    public final boolean f(IOException iOException, b0 b0Var) {
        c0 a10 = b0Var.a();
        return (a10 != null && a10.d()) || (iOException instanceof FileNotFoundException);
    }

    public final int g(d0 d0Var, int i10) {
        String E0 = d0.E0(d0Var, "Retry-After", null, 2, null);
        if (E0 == null) {
            return i10;
        }
        if (!new ab.e("\\d+").a(E0)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(E0);
        k.d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
