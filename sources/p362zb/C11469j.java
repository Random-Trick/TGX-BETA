package p362zb;

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
import p025bc.C1306a;
import p123ia.C5304n;
import p123ia.C5312v;
import p278tb.AbstractC9072c0;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9129x;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9085f0;
import p278tb.C9125w;
import p278tb.C9132z;
import p290ub.C9489b;
import p348yb.C10478c;
import p348yb.C10482e;
import p348yb.C10486f;
import p348yb.C10495j;
import qa.C8294g;
import qa.C8298k;
import za.C11439e;

public final class C11469j implements AbstractC9129x {
    public static final C11470a f36442b = new C11470a(null);
    public final C9132z f36443a;

    public static final class C11470a {
        public C11470a() {
        }

        public C11470a(C8294g gVar) {
            this();
        }
    }

    public C11469j(C9132z zVar) {
        C8298k.m12934e(zVar, "client");
        this.f36443a = zVar;
    }

    @Override
    public C9078d0 mo523a(AbstractC9129x.AbstractC9130a aVar) {
        C10478c o;
        C9069b0 c;
        C8298k.m12934e(aVar, "chain");
        C11466g gVar = (C11466g) aVar;
        C9069b0 i = gVar.m531i();
        C10482e e = gVar.m535e();
        List f = C5304n.m23366f();
        boolean z = true;
        z = false;
        C9078d0 d0Var = null;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            e.m5009h(i, z2);
            try {
                if (!e.mo5004m()) {
                    try {
                        C9078d0 a = gVar.mo539a(i);
                        if (d0Var != null) {
                            a = a.m10519J0().m10495o(d0Var.m10519J0().m10508b(null).m10507c()).m10507c();
                        }
                        d0Var = a;
                        o = e.m5002o();
                        c = m521c(d0Var, o);
                    } catch (IOException e2) {
                        if (m519e(e2, e, i, !(e2 instanceof C1306a))) {
                            f = C5312v.m23337K(f, e2);
                            e.m5008i(z);
                            z2 = false;
                        } else {
                            throw C9489b.m8525T(e2, f);
                        }
                    } catch (C10495j e3) {
                        if (m519e(e3.m4937c(), e, i, z)) {
                            f = C5312v.m23337K(f, e3.m4938b());
                            e.m5008i(z);
                            z2 = false;
                        } else {
                            throw C9489b.m8525T(e3.m4938b(), f);
                        }
                    }
                    if (c == null) {
                        if (o != null && o.m5039l()) {
                            e.m4991z();
                        }
                        return d0Var;
                    }
                    AbstractC9072c0 a2 = c.m10567a();
                    if (a2 != null && a2.m10550d()) {
                        return d0Var;
                    }
                    AbstractC9081e0 m = d0Var.m10513m();
                    if (m != null) {
                        C9489b.m8514j(m);
                    }
                    i2++;
                    if (i2 <= 20) {
                        e.m5008i(z);
                        i = c;
                        z2 = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i2);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
                e.m5008i(z);
            }
        }
    }

    public final C9069b0 m522b(C9078d0 d0Var, String str) {
        String E0;
        C9125w o;
        AbstractC9072c0 c0Var = null;
        if (!this.f36443a.m10274o() || (E0 = C9078d0.m10524E0(d0Var, "Location", null, 2, null)) == null || (o = d0Var.m10515N0().m10559i().m10340o(E0)) == null) {
            return null;
        }
        if (!C8298k.m12937b(o.m10339p(), d0Var.m10515N0().m10559i().m10339p()) && !this.f36443a.m10273p()) {
            return null;
        }
        C9069b0.C9070a h = d0Var.m10515N0().m10560h();
        if (C11465f.m543a(str)) {
            int A0 = d0Var.m10528A0();
            C11465f fVar = C11465f.f36428a;
            boolean z = fVar.m541c(str) || A0 == 308 || A0 == 307;
            if (!fVar.m542b(str) || A0 == 308 || A0 == 307) {
                if (z) {
                    c0Var = d0Var.m10515N0().m10567a();
                }
                h.m10555d(str, c0Var);
            } else {
                h.m10555d("GET", null);
            }
            if (!z) {
                h.m10554e("Transfer-Encoding");
                h.m10554e("Content-Length");
                h.m10554e("Content-Type");
            }
        }
        if (!C9489b.m8517g(d0Var.m10515N0().m10559i(), o)) {
            h.m10554e("Authorization");
        }
        return h.m10552g(o).m10558a();
    }

    public final C9069b0 m521c(C9078d0 d0Var, C10478c cVar) {
        C10486f h;
        C9085f0 z = (cVar == null || (h = cVar.m5043h()) == null) ? null : h.m4951z();
        int A0 = d0Var.m10528A0();
        String g = d0Var.m10515N0().m10561g();
        if (!(A0 == 307 || A0 == 308)) {
            if (A0 == 401) {
                return this.f36443a.m10285c().mo6668a(z, d0Var);
            }
            if (A0 == 421) {
                AbstractC9072c0 a = d0Var.m10515N0().m10567a();
                if ((a != null && a.m10550d()) || cVar == null || !cVar.m5040k()) {
                    return null;
                }
                cVar.m5043h().m4953x();
                return d0Var.m10515N0();
            } else if (A0 == 503) {
                C9078d0 K0 = d0Var.m10518K0();
                if ((K0 == null || K0.m10528A0() != 503) && m517g(d0Var, Integer.MAX_VALUE) == 0) {
                    return d0Var.m10515N0();
                }
                return null;
            } else if (A0 == 407) {
                C8298k.m12936c(z);
                if (z.m10484b().type() == Proxy.Type.HTTP) {
                    return this.f36443a.m10264z().mo6668a(z, d0Var);
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
            } else if (!this.f36443a.m10292C()) {
                return null;
            } else {
                AbstractC9072c0 a2 = d0Var.m10515N0().m10567a();
                if (a2 != null && a2.m10550d()) {
                    return null;
                }
                C9078d0 K02 = d0Var.m10518K0();
                if ((K02 == null || K02.m10528A0() != 408) && m517g(d0Var, 0) <= 0) {
                    return d0Var.m10515N0();
                }
                return null;
            }
        }
        return m522b(d0Var, g);
    }

    public final boolean m520d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    public final boolean m519e(IOException iOException, C10482e eVar, C9069b0 b0Var, boolean z) {
        if (!this.f36443a.m10292C()) {
            return false;
        }
        return (!z || !m518f(iOException, b0Var)) && m520d(iOException, z) && eVar.m4993x();
    }

    public final boolean m518f(IOException iOException, C9069b0 b0Var) {
        AbstractC9072c0 a = b0Var.m10567a();
        return (a != null && a.m10550d()) || (iOException instanceof FileNotFoundException);
    }

    public final int m517g(C9078d0 d0Var, int i) {
        String E0 = C9078d0.m10524E0(d0Var, "Retry-After", null, 2, null);
        if (E0 == null) {
            return i;
        }
        if (!new C11439e("\\d+").m648a(E0)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(E0);
        C8298k.m12935d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
