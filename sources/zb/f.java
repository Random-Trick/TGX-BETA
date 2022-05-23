package zb;

import cc.f;
import cc.i;
import cc.m;
import cc.n;
import dc.h;
import gc.d;
import hc.g;
import ja.o;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ra.k;
import ra.l;
import ub.a0;
import ub.b0;
import ub.d0;
import ub.f0;
import ub.j;
import ub.t;
import ub.u;
import ub.w;
import ub.z;
import yb.e;

public final class f extends f.d implements j {
    public static final a f27101t = new a(null);
    public Socket f27102c;
    public Socket f27103d;
    public u f27104e;
    public a0 f27105f;
    public cc.f f27106g;
    public g f27107h;
    public hc.f f27108i;
    public boolean f27109j;
    public boolean f27110k;
    public int f27111l;
    public int f27112m;
    public int f27113n;
    public int f27114o = 1;
    public final List<Reference<e>> f27115p = new ArrayList();
    public long f27116q = Long.MAX_VALUE;
    public final h f27117r;
    public final f0 f27118s;

    public static final class a {
        public a() {
        }

        public a(ra.g gVar) {
            this();
        }
    }

    public static final class b extends l implements qa.a<List<? extends Certificate>> {
        public final ub.a M;
        public final ub.g f27119b;
        public final u f27120c;

        public b(ub.g gVar, u uVar, ub.a aVar) {
            super(0);
            this.f27119b = gVar;
            this.f27120c = uVar;
            this.M = aVar;
        }

        public final List<Certificate> b() {
            gc.c d10 = this.f27119b.d();
            k.c(d10);
            return d10.a(this.f27120c.d(), this.M.l().h());
        }
    }

    public static final class c extends l implements qa.a<List<? extends X509Certificate>> {
        public c() {
            super(0);
        }

        public final List<X509Certificate> b() {
            u uVar = f.this.f27104e;
            k.c(uVar);
            List<Certificate> d10 = uVar.d();
            ArrayList arrayList = new ArrayList(o.o(d10, 10));
            for (Certificate certificate : d10) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public f(h hVar, f0 f0Var) {
        k.e(hVar, "connectionPool");
        k.e(f0Var, "route");
        this.f27117r = hVar;
        this.f27118s = f0Var;
    }

    public final boolean A(List<f0> list) {
        boolean z10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (f0 f0Var : list) {
                if (f0Var.b().type() == Proxy.Type.DIRECT && this.f27118s.b().type() == Proxy.Type.DIRECT && k.b(this.f27118s.d(), f0Var.d())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void B(long j10) {
        this.f27116q = j10;
    }

    public final void C(boolean z10) {
        this.f27109j = z10;
    }

    public Socket D() {
        Socket socket = this.f27103d;
        k.c(socket);
        return socket;
    }

    public final void E(int i10) {
        Socket socket = this.f27103d;
        k.c(socket);
        g gVar = this.f27107h;
        k.c(gVar);
        hc.f fVar = this.f27108i;
        k.c(fVar);
        socket.setSoTimeout(0);
        cc.f a10 = new f.b(true, e.f26691h).m(socket, this.f27118s.a().l().h(), gVar, fVar).k(this).l(i10).a();
        this.f27106g = a10;
        this.f27114o = cc.f.f5068m0.a().d();
        cc.f.p1(a10, false, null, 3, null);
    }

    public final boolean F(w wVar) {
        u uVar;
        if (!vb.b.f24816h || Thread.holdsLock(this)) {
            w l10 = this.f27118s.a().l();
            if (wVar.l() != l10.l()) {
                return false;
            }
            if (k.b(wVar.h(), l10.h())) {
                return true;
            }
            if (this.f27110k || (uVar = this.f27104e) == null) {
                return false;
            }
            k.c(uVar);
            return e(wVar, uVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final synchronized void G(e eVar, IOException iOException) {
        k.e(eVar, "call");
        if (iOException instanceof n) {
            if (((n) iOException).f5213a == cc.b.REFUSED_STREAM) {
                int i10 = this.f27113n + 1;
                this.f27113n = i10;
                if (i10 > 1) {
                    this.f27109j = true;
                    this.f27111l++;
                }
            } else if (((n) iOException).f5213a != cc.b.CANCEL || !eVar.m()) {
                this.f27109j = true;
                this.f27111l++;
            }
        } else if (!v() || (iOException instanceof cc.a)) {
            this.f27109j = true;
            if (this.f27112m == 0) {
                if (iOException != null) {
                    g(eVar.j(), this.f27118s, iOException);
                }
                this.f27111l++;
            }
        }
    }

    @Override
    public synchronized void a(cc.f fVar, m mVar) {
        k.e(fVar, "connection");
        k.e(mVar, "settings");
        this.f27114o = mVar.d();
    }

    @Override
    public void b(i iVar) {
        k.e(iVar, "stream");
        iVar.d(cc.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f27102c;
        if (socket != null) {
            vb.b.k(socket);
        }
    }

    public final boolean e(w wVar, u uVar) {
        List<Certificate> d10 = uVar.d();
        if (!d10.isEmpty()) {
            d dVar = d.f12196a;
            String h10 = wVar.h();
            Certificate certificate = d10.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(h10, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int r17, int r18, int r19, int r20, boolean r21, ub.e r22, ub.t r23) {
        throw new UnsupportedOperationException("Method not decompiled: zb.f.f(int, int, int, int, boolean, ub.e, ub.t):void");
    }

    public final void g(z zVar, f0 f0Var, IOException iOException) {
        k.e(zVar, "client");
        k.e(f0Var, "failedRoute");
        k.e(iOException, "failure");
        if (f0Var.b().type() != Proxy.Type.DIRECT) {
            ub.a a10 = f0Var.a();
            a10.i().connectFailed(a10.l().q(), f0Var.b().address(), iOException);
        }
        zVar.q().b(f0Var);
    }

    public final void h(int i10, int i11, ub.e eVar, t tVar) {
        Socket socket;
        int i12;
        Proxy b10 = this.f27118s.b();
        ub.a a10 = this.f27118s.a();
        Proxy.Type type = b10.type();
        if (type != null && ((i12 = g.f27122a[type.ordinal()]) == 1 || i12 == 2)) {
            socket = a10.j().createSocket();
            k.c(socket);
        } else {
            socket = new Socket(b10);
        }
        this.f27102c = socket;
        tVar.i(eVar, this.f27118s.d(), b10);
        socket.setSoTimeout(i11);
        try {
            h.f7333c.g().f(socket, this.f27118s.d(), i10);
            try {
                this.f27107h = hc.o.b(hc.o.k(socket));
                this.f27108i = hc.o.a(hc.o.g(socket));
            } catch (NullPointerException e10) {
                if (k.b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f27118s.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void i(zb.b bVar) {
        Throwable th;
        ub.a a10 = this.f27118s.a();
        SSLSocketFactory k10 = a10.k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            k.c(k10);
            Socket createSocket = k10.createSocket(this.f27102c, a10.l().h(), a10.l().l(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    ub.l a11 = bVar.a(sSLSocket2);
                    if (a11.h()) {
                        h.f7333c.g().e(sSLSocket2, a10.l().h(), a10.f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    u.a aVar = u.f23929e;
                    k.d(session, "sslSocketSession");
                    u a12 = aVar.a(session);
                    HostnameVerifier e10 = a10.e();
                    k.c(e10);
                    if (!e10.verify(a10.l().h(), session)) {
                        List<Certificate> d10 = a12.d();
                        if (!d10.isEmpty()) {
                            Certificate certificate = d10.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(a10.l().h());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(ub.g.f23800d.a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            k.d(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(d.f12196a.a(x509Certificate));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(ab.g.e(sb2.toString(), null, 1, null));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + a10.l().h() + " not verified (no certificates)");
                    }
                    ub.g a13 = a10.a();
                    k.c(a13);
                    this.f27104e = new u(a12.e(), a12.a(), a12.c(), new b(a13, a12, a10));
                    a13.b(a10.l().h(), new c());
                    if (a11.h()) {
                        str = h.f7333c.g().g(sSLSocket2);
                    }
                    this.f27103d = sSLSocket2;
                    this.f27107h = hc.o.b(hc.o.k(sSLSocket2));
                    this.f27108i = hc.o.a(hc.o.g(sSLSocket2));
                    this.f27105f = str != null ? a0.R.a(str) : a0.HTTP_1_1;
                    h.f7333c.g().b(sSLSocket2);
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        h.f7333c.g().b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        vb.b.k(sSLSocket);
                    }
                    throw th;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void j(int i10, int i11, int i12, ub.e eVar, t tVar) {
        b0 l10 = l();
        w i13 = l10.i();
        for (int i14 = 0; i14 < 21; i14++) {
            h(i10, i11, eVar, tVar);
            l10 = k(i11, i12, l10, i13);
            if (l10 != null) {
                Socket socket = this.f27102c;
                if (socket != null) {
                    vb.b.k(socket);
                }
                this.f27102c = null;
                this.f27108i = null;
                this.f27107h = null;
                tVar.g(eVar, this.f27118s.d(), this.f27118s.b(), null);
            } else {
                return;
            }
        }
    }

    public final b0 k(int i10, int i11, b0 b0Var, w wVar) {
        String str = "CONNECT " + vb.b.L(wVar, true) + " HTTP/1.1";
        while (true) {
            g gVar = this.f27107h;
            k.c(gVar);
            hc.f fVar = this.f27108i;
            k.c(fVar);
            bc.b bVar = new bc.b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.c().g(i10, timeUnit);
            fVar.c().g(i11, timeUnit);
            bVar.A(b0Var.e(), str);
            bVar.a();
            d0.a d10 = bVar.d(false);
            k.c(d10);
            d0 c10 = d10.r(b0Var).c();
            bVar.z(c10);
            int A0 = c10.A0();
            if (A0 != 200) {
                if (A0 == 407) {
                    b0 a10 = this.f27118s.a().h().a(this.f27118s, c10);
                    if (a10 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (ab.n.l("close", d0.E0(c10, "Connection", null, 2, null), true)) {
                        return a10;
                    } else {
                        b0Var = a10;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c10.A0());
                }
            } else if (gVar.a().C() && fVar.a().C()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    public final b0 l() {
        b0 a10 = new b0.a().g(this.f27118s.a().l()).d("CONNECT", null).b("Host", vb.b.L(this.f27118s.a().l(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", "okhttp/4.9.3").a();
        b0 a11 = this.f27118s.a().h().a(this.f27118s, new d0.a().r(a10).p(a0.HTTP_1_1).g(407).m("Preemptive Authenticate").b(vb.b.f24811c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a11 != null ? a11 : a10;
    }

    public final void m(zb.b bVar, int i10, ub.e eVar, t tVar) {
        if (this.f27118s.a().k() == null) {
            List<a0> f10 = this.f27118s.a().f();
            a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(a0Var)) {
                this.f27103d = this.f27102c;
                this.f27105f = a0Var;
                E(i10);
                return;
            }
            this.f27103d = this.f27102c;
            this.f27105f = a0.HTTP_1_1;
            return;
        }
        tVar.B(eVar);
        i(bVar);
        tVar.A(eVar, this.f27104e);
        if (this.f27105f == a0.HTTP_2) {
            E(i10);
        }
    }

    public final List<Reference<e>> n() {
        return this.f27115p;
    }

    public final long o() {
        return this.f27116q;
    }

    public final boolean p() {
        return this.f27109j;
    }

    public final int q() {
        return this.f27111l;
    }

    public u r() {
        return this.f27104e;
    }

    public final synchronized void s() {
        this.f27112m++;
    }

    public final boolean t(ub.a aVar, List<f0> list) {
        k.e(aVar, "address");
        if (vb.b.f24816h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f27115p.size() >= this.f27114o || this.f27109j || !this.f27118s.a().d(aVar)) {
            return false;
        } else {
            if (k.b(aVar.l().h(), z().a().l().h())) {
                return true;
            }
            if (this.f27106g == null || list == null || !A(list) || aVar.e() != d.f12196a || !F(aVar.l())) {
                return false;
            }
            try {
                ub.g a10 = aVar.a();
                k.c(a10);
                String h10 = aVar.l().h();
                u r10 = r();
                k.c(r10);
                a10.a(h10, r10.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f27118s.a().l().h());
        sb2.append(':');
        sb2.append(this.f27118s.a().l().l());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f27118s.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f27118s.d());
        sb2.append(" cipherSuite=");
        u uVar = this.f27104e;
        if (uVar == null || (obj = uVar.a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f27105f);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
        if (!vb.b.f24816h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f27102c;
            k.c(socket);
            Socket socket2 = this.f27103d;
            k.c(socket2);
            g gVar = this.f27107h;
            k.c(gVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            cc.f fVar = this.f27106g;
            if (fVar != null) {
                return fVar.b1(nanoTime);
            }
            synchronized (this) {
                j10 = nanoTime - this.f27116q;
            }
            if (j10 < 10000000000L || !z10) {
                return true;
            }
            return vb.b.C(socket2, gVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final boolean v() {
        return this.f27106g != null;
    }

    public final ac.d w(z zVar, ac.g gVar) {
        k.e(zVar, "client");
        k.e(gVar, "chain");
        Socket socket = this.f27103d;
        k.c(socket);
        g gVar2 = this.f27107h;
        k.c(gVar2);
        hc.f fVar = this.f27108i;
        k.c(fVar);
        cc.f fVar2 = this.f27106g;
        if (fVar2 != null) {
            return new cc.g(zVar, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.c().g(gVar.h(), timeUnit);
        fVar.c().g(gVar.j(), timeUnit);
        return new bc.b(zVar, this, gVar2, fVar);
    }

    public final synchronized void x() {
        this.f27110k = true;
    }

    public final synchronized void y() {
        this.f27109j = true;
    }

    public f0 z() {
        return this.f27118s;
    }
}
