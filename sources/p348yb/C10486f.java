package p348yb;

import ac.C0248b;
import cc.C2083h;
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
import p025bc.C1306a;
import p025bc.C1315f;
import p025bc.C1334g;
import p025bc.C1340i;
import p025bc.C1352m;
import p025bc.C1354n;
import p025bc.EnumC1307b;
import p081fc.AbstractC4349c;
import p081fc.C4351d;
import p095gc.AbstractC4550f;
import p095gc.AbstractC4551g;
import p095gc.C4560o;
import p123ia.C5305o;
import p278tb.AbstractC9080e;
import p278tb.AbstractC9097j;
import p278tb.AbstractC9114t;
import p278tb.C9063a;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9085f0;
import p278tb.C9086g;
import p278tb.C9099l;
import p278tb.C9118u;
import p278tb.C9125w;
import p278tb.C9132z;
import p278tb.EnumC9064a0;
import p290ub.C9489b;
import p333xb.C10180e;
import p362zb.AbstractC11463d;
import p362zb.C11466g;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;
import za.C11442g;
import za.C11451n;

public final class C10486f extends C1315f.AbstractC1319d implements AbstractC9097j {
    public static final C10487a f33613t = new C10487a(null);
    public Socket f33614c;
    public Socket f33615d;
    public C9118u f33616e;
    public EnumC9064a0 f33617f;
    public C1315f f33618g;
    public AbstractC4551g f33619h;
    public AbstractC4550f f33620i;
    public boolean f33621j;
    public boolean f33622k;
    public int f33623l;
    public int f33624m;
    public int f33625n;
    public int f33626o = 1;
    public final List<Reference<C10482e>> f33627p = new ArrayList();
    public long f33628q = Long.MAX_VALUE;
    public final C10491h f33629r;
    public final C9085f0 f33630s;

    public static final class C10487a {
        public C10487a() {
        }

        public C10487a(C8294g gVar) {
            this();
        }
    }

    public static final class C10488b extends AbstractC8299l implements AbstractC8077a<List<? extends Certificate>> {
        public final C9063a f33631M;
        public final C9086g f33632b;
        public final C9118u f33633c;

        public C10488b(C9086g gVar, C9118u uVar, C9063a aVar) {
            super(0);
            this.f33632b = gVar;
            this.f33633c = uVar;
            this.f33631M = aVar;
        }

        public final List<Certificate> mo4925b() {
            AbstractC4349c d = this.f33632b.m10478d();
            C8298k.m12936c(d);
            return d.mo28222a(this.f33633c.m10379d(), this.f33631M.m10570l().m10347h());
        }
    }

    public static final class C10489c extends AbstractC8299l implements AbstractC8077a<List<? extends X509Certificate>> {
        public C10489c() {
            super(0);
        }

        public final List<X509Certificate> mo4925b() {
            C9118u uVar = C10486f.this.f33616e;
            C8298k.m12936c(uVar);
            List<Certificate> d = uVar.m10379d();
            ArrayList arrayList = new ArrayList(C5305o.m23357o(d, 10));
            for (Certificate certificate : d) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C10486f(C10491h hVar, C9085f0 f0Var) {
        C8298k.m12934e(hVar, "connectionPool");
        C8298k.m12934e(f0Var, "route");
        this.f33629r = hVar;
        this.f33630s = f0Var;
    }

    public final boolean m4983A(List<C9085f0> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C9085f0 f0Var : list) {
                if (f0Var.m10484b().type() == Proxy.Type.DIRECT && this.f33630s.m10484b().type() == Proxy.Type.DIRECT && C8298k.m12937b(this.f33630s.m10482d(), f0Var.m10482d())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m4982B(long j) {
        this.f33628q = j;
    }

    public final void m4981C(boolean z) {
        this.f33621j = z;
    }

    public Socket m4980D() {
        Socket socket = this.f33615d;
        C8298k.m12936c(socket);
        return socket;
    }

    public final void m4979E(int i) {
        Socket socket = this.f33615d;
        C8298k.m12936c(socket);
        AbstractC4551g gVar = this.f33619h;
        C8298k.m12936c(gVar);
        AbstractC4550f fVar = this.f33620i;
        C8298k.m12936c(fVar);
        socket.setSoTimeout(0);
        C1315f a = new C1315f.C1317b(true, C10180e.f32907h).m37679m(socket, this.f33630s.m10485a().m10570l().m10347h(), gVar, fVar).m37681k(this).m37680l(i).m37691a();
        this.f33618g = a;
        this.f33626o = C1315f.f4759m0.m37678a().m37569d();
        C1315f.m37702p1(a, false, null, 3, null);
    }

    public final boolean m4978F(C9125w wVar) {
        C9118u uVar;
        if (!C9489b.f30726h || Thread.holdsLock(this)) {
            C9125w l = this.f33630s.m10485a().m10570l();
            if (wVar.m10343l() != l.m10343l()) {
                return false;
            }
            if (C8298k.m12937b(wVar.m10347h(), l.m10347h())) {
                return true;
            }
            if (this.f33622k || (uVar = this.f33616e) == null) {
                return false;
            }
            C8298k.m12936c(uVar);
            return m4972e(wVar, uVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final synchronized void m4977G(C10482e eVar, IOException iOException) {
        C8298k.m12934e(eVar, "call");
        if (iOException instanceof C1354n) {
            if (((C1354n) iOException).f4935a == EnumC1307b.REFUSED_STREAM) {
                int i = this.f33625n + 1;
                this.f33625n = i;
                if (i > 1) {
                    this.f33621j = true;
                    this.f33623l++;
                }
            } else if (((C1354n) iOException).f4935a != EnumC1307b.CANCEL || !eVar.mo5004m()) {
                this.f33621j = true;
                this.f33623l++;
            }
        } else if (!m4955v() || (iOException instanceof C1306a)) {
            this.f33621j = true;
            if (this.f33624m == 0) {
                if (iOException != null) {
                    m4970g(eVar.m5007j(), this.f33630s, iOException);
                }
                this.f33623l++;
            }
        }
    }

    @Override
    public synchronized void mo4976a(C1315f fVar, C1352m mVar) {
        C8298k.m12934e(fVar, "connection");
        C8298k.m12934e(mVar, "settings");
        this.f33626o = mVar.m37569d();
    }

    @Override
    public void mo4975b(C1340i iVar) {
        C8298k.m12934e(iVar, "stream");
        iVar.m37630d(EnumC1307b.REFUSED_STREAM, null);
    }

    public final void m4973d() {
        Socket socket = this.f33614c;
        if (socket != null) {
            C9489b.m8513k(socket);
        }
    }

    public final boolean m4972e(C9125w wVar, C9118u uVar) {
        List<Certificate> d = uVar.m10379d();
        if (!d.isEmpty()) {
            C4351d dVar = C4351d.f14427a;
            String h = wVar.m10347h();
            Certificate certificate = d.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.m28216e(h, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    public final void m4971f(int r17, int r18, int r19, int r20, boolean r21, p278tb.AbstractC9080e r22, p278tb.AbstractC9114t r23) {
        throw new UnsupportedOperationException("Method not decompiled: p348yb.C10486f.m4971f(int, int, int, int, boolean, tb.e, tb.t):void");
    }

    public final void m4970g(C9132z zVar, C9085f0 f0Var, IOException iOException) {
        C8298k.m12934e(zVar, "client");
        C8298k.m12934e(f0Var, "failedRoute");
        C8298k.m12934e(iOException, "failure");
        if (f0Var.m10484b().type() != Proxy.Type.DIRECT) {
            C9063a a = f0Var.m10485a();
            a.m10573i().connectFailed(a.m10570l().m10338q(), f0Var.m10484b().address(), iOException);
        }
        zVar.m10272q().m4941b(f0Var);
    }

    public final void m4969h(int i, int i2, AbstractC9080e eVar, AbstractC9114t tVar) {
        Socket socket;
        int i3;
        Proxy b = this.f33630s.m10484b();
        C9063a a = this.f33630s.m10485a();
        Proxy.Type type = b.type();
        if (type != null && ((i3 = C10490g.f33635a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = a.m10572j().createSocket();
            C8298k.m12936c(socket);
        } else {
            socket = new Socket(b);
        }
        this.f33614c = socket;
        tVar.m10400i(eVar, this.f33630s.m10482d(), b);
        socket.setSoTimeout(i2);
        try {
            C2083h.f7326c.m35674g().mo35690f(socket, this.f33630s.m10482d(), i);
            try {
                this.f33619h = C4560o.m27378b(C4560o.m27369k(socket));
                this.f33620i = C4560o.m27379a(C4560o.m27373g(socket));
            } catch (NullPointerException e) {
                if (C8298k.m12937b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f33630s.m10482d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void m4968i(C10477b bVar) {
        Throwable th;
        C9063a a = this.f33630s.m10485a();
        SSLSocketFactory k = a.m10571k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            C8298k.m12936c(k);
            Socket createSocket = k.createSocket(this.f33614c, a.m10570l().m10347h(), a.m10570l().m10343l(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    C9099l a2 = bVar.m5053a(sSLSocket2);
                    if (a2.m10446h()) {
                        C2083h.f7326c.m35674g().mo35691e(sSLSocket2, a.m10570l().m10347h(), a.m10576f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C9118u.C9119a aVar = C9118u.f29325e;
                    C8298k.m12935d(session, "sslSocketSession");
                    C9118u a3 = aVar.m10377a(session);
                    HostnameVerifier e = a.m10577e();
                    C8298k.m12936c(e);
                    if (!e.verify(a.m10570l().m10347h(), session)) {
                        List<Certificate> d = a3.m10379d();
                        if (!d.isEmpty()) {
                            Certificate certificate = d.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(a.m10570l().m10347h());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(C9086g.f29138d.m10475a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            C8298k.m12935d(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(C4351d.f14427a.m28220a(x509Certificate));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(C11442g.m642e(sb2.toString(), null, 1, null));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + a.m10570l().m10347h() + " not verified (no certificates)");
                    }
                    C9086g a4 = a.m10581a();
                    C8298k.m12936c(a4);
                    this.f33616e = new C9118u(a3.m10378e(), a3.m10382a(), a3.m10380c(), new C10488b(a4, a3, a));
                    a4.m10480b(a.m10570l().m10347h(), new C10489c());
                    if (a2.m10446h()) {
                        str = C2083h.f7326c.m35674g().mo35689g(sSLSocket2);
                    }
                    this.f33615d = sSLSocket2;
                    this.f33619h = C4560o.m27378b(C4560o.m27369k(sSLSocket2));
                    this.f33620i = C4560o.m27379a(C4560o.m27373g(sSLSocket2));
                    this.f33617f = str != null ? EnumC9064a0.f29056R.m10568a(str) : EnumC9064a0.HTTP_1_1;
                    C2083h.f7326c.m35674g().mo35694b(sSLSocket2);
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C2083h.f7326c.m35674g().mo35694b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        C9489b.m8513k(sSLSocket);
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

    public final void m4967j(int i, int i2, int i3, AbstractC9080e eVar, AbstractC9114t tVar) {
        C9069b0 l = m4965l();
        C9125w i4 = l.m10559i();
        for (int i5 = 0; i5 < 21; i5++) {
            m4969h(i, i2, eVar, tVar);
            l = m4966k(i2, i3, l, i4);
            if (l != null) {
                Socket socket = this.f33614c;
                if (socket != null) {
                    C9489b.m8513k(socket);
                }
                this.f33614c = null;
                this.f33620i = null;
                this.f33619h = null;
                tVar.m10402g(eVar, this.f33630s.m10482d(), this.f33630s.m10484b(), null);
            } else {
                return;
            }
        }
    }

    public final C9069b0 m4966k(int i, int i2, C9069b0 b0Var, C9125w wVar) {
        String str = "CONNECT " + C9489b.m8533L(wVar, true) + " HTTP/1.1";
        while (true) {
            AbstractC4551g gVar = this.f33619h;
            C8298k.m12936c(gVar);
            AbstractC4550f fVar = this.f33620i;
            C8298k.m12936c(fVar);
            C0248b bVar = new C0248b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.mo27334c().mo27389g(i, timeUnit);
            fVar.mo27301c().mo27389g(i2, timeUnit);
            bVar.m42017A(b0Var.m10563e(), str);
            bVar.mo556d();
            C9078d0.C9079a f = bVar.mo554f(false);
            C8298k.m12936c(f);
            C9078d0 c = f.m10492r(b0Var).m10507c();
            bVar.m41999z(c);
            int A0 = c.m10528A0();
            if (A0 != 200) {
                if (A0 == 407) {
                    C9069b0 a = this.f33630s.m10485a().m10574h().mo6668a(this.f33630s, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (C11451n.m633l("close", C9078d0.m10524E0(c, "Connection", null, 2, null), true)) {
                        return a;
                    } else {
                        b0Var = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.m10528A0());
                }
            } else if (gVar.mo27336a().mo27339B() && fVar.mo27336a().mo27339B()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    public final C9069b0 m4965l() {
        C9069b0 a = new C9069b0.C9070a().m10552g(this.f33630s.m10485a().m10570l()).m10555d("CONNECT", null).m10557b("Host", C9489b.m8533L(this.f33630s.m10485a().m10570l(), true)).m10557b("Proxy-Connection", "Keep-Alive").m10557b("User-Agent", "okhttp/4.9.3").m10558a();
        C9069b0 a2 = this.f33630s.m10485a().m10574h().mo6668a(this.f33630s, new C9078d0.C9079a().m10492r(a).m10494p(EnumC9064a0.HTTP_1_1).m10503g(407).m10497m("Preemptive Authenticate").m10508b(C9489b.f30721c).m10491s(-1L).m10493q(-1L).m10500j("Proxy-Authenticate", "OkHttp-Preemptive").m10507c());
        return a2 != null ? a2 : a;
    }

    public final void m4964m(C10477b bVar, int i, AbstractC9080e eVar, AbstractC9114t tVar) {
        if (this.f33630s.m10485a().m10571k() == null) {
            List<EnumC9064a0> f = this.f33630s.m10485a().m10576f();
            EnumC9064a0 a0Var = EnumC9064a0.H2_PRIOR_KNOWLEDGE;
            if (f.contains(a0Var)) {
                this.f33615d = this.f33614c;
                this.f33617f = a0Var;
                m4979E(i);
                return;
            }
            this.f33615d = this.f33614c;
            this.f33617f = EnumC9064a0.HTTP_1_1;
            return;
        }
        tVar.m10409B(eVar);
        m4968i(bVar);
        tVar.m10410A(eVar, this.f33616e);
        if (this.f33617f == EnumC9064a0.HTTP_2) {
            m4979E(i);
        }
    }

    public final List<Reference<C10482e>> m4963n() {
        return this.f33627p;
    }

    public final long m4962o() {
        return this.f33628q;
    }

    public final boolean m4961p() {
        return this.f33621j;
    }

    public final int m4960q() {
        return this.f33623l;
    }

    public C9118u m4959r() {
        return this.f33616e;
    }

    public final synchronized void m4958s() {
        this.f33624m++;
    }

    public final boolean m4957t(C9063a aVar, List<C9085f0> list) {
        C8298k.m12934e(aVar, "address");
        if (C9489b.f30726h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12935d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f33627p.size() >= this.f33626o || this.f33621j || !this.f33630s.m10485a().m10578d(aVar)) {
            return false;
        } else {
            if (C8298k.m12937b(aVar.m10570l().m10347h(), m4951z().m10485a().m10570l().m10347h())) {
                return true;
            }
            if (this.f33618g == null || list == null || !m4983A(list) || aVar.m10577e() != C4351d.f14427a || !m4978F(aVar.m10570l())) {
                return false;
            }
            try {
                C9086g a = aVar.m10581a();
                C8298k.m12936c(a);
                String h = aVar.m10570l().m10347h();
                C9118u r = m4959r();
                C8298k.m12936c(r);
                a.m10481a(h, r.m10379d());
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
        sb2.append(this.f33630s.m10485a().m10570l().m10347h());
        sb2.append(':');
        sb2.append(this.f33630s.m10485a().m10570l().m10343l());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f33630s.m10484b());
        sb2.append(" hostAddress=");
        sb2.append(this.f33630s.m10482d());
        sb2.append(" cipherSuite=");
        C9118u uVar = this.f33616e;
        if (uVar == null || (obj = uVar.m10382a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f33617f);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean m4956u(boolean z) {
        long j;
        if (!C9489b.f30726h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f33614c;
            C8298k.m12936c(socket);
            Socket socket2 = this.f33615d;
            C8298k.m12936c(socket2);
            AbstractC4551g gVar = this.f33619h;
            C8298k.m12936c(gVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            C1315f fVar = this.f33618g;
            if (fVar != null) {
                return fVar.m37717b1(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f33628q;
            }
            if (j < 10000000000L || !z) {
                return true;
            }
            return C9489b.m8542C(socket2, gVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final boolean m4955v() {
        return this.f33618g != null;
    }

    public final AbstractC11463d m4954w(C9132z zVar, C11466g gVar) {
        C8298k.m12934e(zVar, "client");
        C8298k.m12934e(gVar, "chain");
        Socket socket = this.f33615d;
        C8298k.m12936c(socket);
        AbstractC4551g gVar2 = this.f33619h;
        C8298k.m12936c(gVar2);
        AbstractC4550f fVar = this.f33620i;
        C8298k.m12936c(fVar);
        C1315f fVar2 = this.f33618g;
        if (fVar2 != null) {
            return new C1334g(zVar, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.m529k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.mo27334c().mo27389g(gVar.m532h(), timeUnit);
        fVar.mo27301c().mo27389g(gVar.m530j(), timeUnit);
        return new C0248b(zVar, this, gVar2, fVar);
    }

    public final synchronized void m4953x() {
        this.f33622k = true;
    }

    public final synchronized void m4952y() {
        this.f33621j = true;
    }

    public C9085f0 m4951z() {
        return this.f33630s;
    }
}
