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
    public static final C10487a f33616t = new C10487a(null);
    public Socket f33617c;
    public Socket f33618d;
    public C9118u f33619e;
    public EnumC9064a0 f33620f;
    public C1315f f33621g;
    public AbstractC4551g f33622h;
    public AbstractC4550f f33623i;
    public boolean f33624j;
    public boolean f33625k;
    public int f33626l;
    public int f33627m;
    public int f33628n;
    public int f33629o = 1;
    public final List<Reference<C10482e>> f33630p = new ArrayList();
    public long f33631q = Long.MAX_VALUE;
    public final C10491h f33632r;
    public final C9085f0 f33633s;

    public static final class C10487a {
        public C10487a() {
        }

        public C10487a(C8294g gVar) {
            this();
        }
    }

    public static final class C10488b extends AbstractC8299l implements AbstractC8077a<List<? extends Certificate>> {
        public final C9063a f33634M;
        public final C9086g f33635b;
        public final C9118u f33636c;

        public C10488b(C9086g gVar, C9118u uVar, C9063a aVar) {
            super(0);
            this.f33635b = gVar;
            this.f33636c = uVar;
            this.f33634M = aVar;
        }

        public final List<Certificate> mo4925b() {
            AbstractC4349c d = this.f33635b.m10477d();
            C8298k.m12935c(d);
            return d.mo28224a(this.f33636c.m10378d(), this.f33634M.m10569l().m10346h());
        }
    }

    public static final class C10489c extends AbstractC8299l implements AbstractC8077a<List<? extends X509Certificate>> {
        public C10489c() {
            super(0);
        }

        public final List<X509Certificate> mo4925b() {
            C9118u uVar = C10486f.this.f33619e;
            C8298k.m12935c(uVar);
            List<Certificate> d = uVar.m10378d();
            ArrayList arrayList = new ArrayList(C5305o.m23358o(d, 10));
            for (Certificate certificate : d) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C10486f(C10491h hVar, C9085f0 f0Var) {
        C8298k.m12933e(hVar, "connectionPool");
        C8298k.m12933e(f0Var, "route");
        this.f33632r = hVar;
        this.f33633s = f0Var;
    }

    public final boolean m4983A(List<C9085f0> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C9085f0 f0Var : list) {
                if (f0Var.m10483b().type() == Proxy.Type.DIRECT && this.f33633s.m10483b().type() == Proxy.Type.DIRECT && C8298k.m12936b(this.f33633s.m10481d(), f0Var.m10481d())) {
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
        this.f33631q = j;
    }

    public final void m4981C(boolean z) {
        this.f33624j = z;
    }

    public Socket m4980D() {
        Socket socket = this.f33618d;
        C8298k.m12935c(socket);
        return socket;
    }

    public final void m4979E(int i) {
        Socket socket = this.f33618d;
        C8298k.m12935c(socket);
        AbstractC4551g gVar = this.f33622h;
        C8298k.m12935c(gVar);
        AbstractC4550f fVar = this.f33623i;
        C8298k.m12935c(fVar);
        socket.setSoTimeout(0);
        C1315f a = new C1315f.C1317b(true, C10180e.f32910h).m37682m(socket, this.f33633s.m10484a().m10569l().m10346h(), gVar, fVar).m37684k(this).m37683l(i).m37694a();
        this.f33621g = a;
        this.f33629o = C1315f.f4759m0.m37681a().m37572d();
        C1315f.m37705p1(a, false, null, 3, null);
    }

    public final boolean m4978F(C9125w wVar) {
        C9118u uVar;
        if (!C9489b.f30729h || Thread.holdsLock(this)) {
            C9125w l = this.f33633s.m10484a().m10569l();
            if (wVar.m10342l() != l.m10342l()) {
                return false;
            }
            if (C8298k.m12936b(wVar.m10346h(), l.m10346h())) {
                return true;
            }
            if (this.f33625k || (uVar = this.f33619e) == null) {
                return false;
            }
            C8298k.m12935c(uVar);
            return m4972e(wVar, uVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final synchronized void m4977G(C10482e eVar, IOException iOException) {
        C8298k.m12933e(eVar, "call");
        if (iOException instanceof C1354n) {
            if (((C1354n) iOException).f4935a == EnumC1307b.REFUSED_STREAM) {
                int i = this.f33628n + 1;
                this.f33628n = i;
                if (i > 1) {
                    this.f33624j = true;
                    this.f33626l++;
                }
            } else if (((C1354n) iOException).f4935a != EnumC1307b.CANCEL || !eVar.mo5004m()) {
                this.f33624j = true;
                this.f33626l++;
            }
        } else if (!m4955v() || (iOException instanceof C1306a)) {
            this.f33624j = true;
            if (this.f33627m == 0) {
                if (iOException != null) {
                    m4970g(eVar.m5007j(), this.f33633s, iOException);
                }
                this.f33626l++;
            }
        }
    }

    @Override
    public synchronized void mo4976a(C1315f fVar, C1352m mVar) {
        C8298k.m12933e(fVar, "connection");
        C8298k.m12933e(mVar, "settings");
        this.f33629o = mVar.m37572d();
    }

    @Override
    public void mo4975b(C1340i iVar) {
        C8298k.m12933e(iVar, "stream");
        iVar.m37633d(EnumC1307b.REFUSED_STREAM, null);
    }

    public final void m4973d() {
        Socket socket = this.f33617c;
        if (socket != null) {
            C9489b.m8513k(socket);
        }
    }

    public final boolean m4972e(C9125w wVar, C9118u uVar) {
        List<Certificate> d = uVar.m10378d();
        if (!d.isEmpty()) {
            C4351d dVar = C4351d.f14427a;
            String h = wVar.m10346h();
            Certificate certificate = d.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.m28218e(h, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    public final void m4971f(int r17, int r18, int r19, int r20, boolean r21, p278tb.AbstractC9080e r22, p278tb.AbstractC9114t r23) {
        throw new UnsupportedOperationException("Method not decompiled: p348yb.C10486f.m4971f(int, int, int, int, boolean, tb.e, tb.t):void");
    }

    public final void m4970g(C9132z zVar, C9085f0 f0Var, IOException iOException) {
        C8298k.m12933e(zVar, "client");
        C8298k.m12933e(f0Var, "failedRoute");
        C8298k.m12933e(iOException, "failure");
        if (f0Var.m10483b().type() != Proxy.Type.DIRECT) {
            C9063a a = f0Var.m10484a();
            a.m10572i().connectFailed(a.m10569l().m10337q(), f0Var.m10483b().address(), iOException);
        }
        zVar.m10271q().m4941b(f0Var);
    }

    public final void m4969h(int i, int i2, AbstractC9080e eVar, AbstractC9114t tVar) {
        Socket socket;
        int i3;
        Proxy b = this.f33633s.m10483b();
        C9063a a = this.f33633s.m10484a();
        Proxy.Type type = b.type();
        if (type != null && ((i3 = C10490g.f33638a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = a.m10571j().createSocket();
            C8298k.m12935c(socket);
        } else {
            socket = new Socket(b);
        }
        this.f33617c = socket;
        tVar.m10399i(eVar, this.f33633s.m10481d(), b);
        socket.setSoTimeout(i2);
        try {
            C2083h.f7326c.m35677g().mo35693f(socket, this.f33633s.m10481d(), i);
            try {
                this.f33622h = C4560o.m27380b(C4560o.m27371k(socket));
                this.f33623i = C4560o.m27381a(C4560o.m27375g(socket));
            } catch (NullPointerException e) {
                if (C8298k.m12936b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f33633s.m10481d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void m4968i(C10477b bVar) {
        Throwable th;
        C9063a a = this.f33633s.m10484a();
        SSLSocketFactory k = a.m10570k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            C8298k.m12935c(k);
            Socket createSocket = k.createSocket(this.f33617c, a.m10569l().m10346h(), a.m10569l().m10342l(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    C9099l a2 = bVar.m5053a(sSLSocket2);
                    if (a2.m10445h()) {
                        C2083h.f7326c.m35677g().mo35694e(sSLSocket2, a.m10569l().m10346h(), a.m10575f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C9118u.C9119a aVar = C9118u.f29328e;
                    C8298k.m12934d(session, "sslSocketSession");
                    C9118u a3 = aVar.m10376a(session);
                    HostnameVerifier e = a.m10576e();
                    C8298k.m12935c(e);
                    if (!e.verify(a.m10569l().m10346h(), session)) {
                        List<Certificate> d = a3.m10378d();
                        if (!d.isEmpty()) {
                            Certificate certificate = d.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(a.m10569l().m10346h());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(C9086g.f29141d.m10474a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            C8298k.m12934d(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(C4351d.f14427a.m28222a(x509Certificate));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(C11442g.m642e(sb2.toString(), null, 1, null));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + a.m10569l().m10346h() + " not verified (no certificates)");
                    }
                    C9086g a4 = a.m10580a();
                    C8298k.m12935c(a4);
                    this.f33619e = new C9118u(a3.m10377e(), a3.m10381a(), a3.m10379c(), new C10488b(a4, a3, a));
                    a4.m10479b(a.m10569l().m10346h(), new C10489c());
                    if (a2.m10445h()) {
                        str = C2083h.f7326c.m35677g().mo35692g(sSLSocket2);
                    }
                    this.f33618d = sSLSocket2;
                    this.f33622h = C4560o.m27380b(C4560o.m27371k(sSLSocket2));
                    this.f33623i = C4560o.m27381a(C4560o.m27375g(sSLSocket2));
                    this.f33620f = str != null ? EnumC9064a0.f29059R.m10567a(str) : EnumC9064a0.HTTP_1_1;
                    C2083h.f7326c.m35677g().mo35697b(sSLSocket2);
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C2083h.f7326c.m35677g().mo35697b(sSLSocket);
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
        C9125w i4 = l.m10558i();
        for (int i5 = 0; i5 < 21; i5++) {
            m4969h(i, i2, eVar, tVar);
            l = m4966k(i2, i3, l, i4);
            if (l != null) {
                Socket socket = this.f33617c;
                if (socket != null) {
                    C9489b.m8513k(socket);
                }
                this.f33617c = null;
                this.f33623i = null;
                this.f33622h = null;
                tVar.m10401g(eVar, this.f33633s.m10481d(), this.f33633s.m10483b(), null);
            } else {
                return;
            }
        }
    }

    public final C9069b0 m4966k(int i, int i2, C9069b0 b0Var, C9125w wVar) {
        String str = "CONNECT " + C9489b.m8533L(wVar, true) + " HTTP/1.1";
        while (true) {
            AbstractC4551g gVar = this.f33622h;
            C8298k.m12935c(gVar);
            AbstractC4550f fVar = this.f33623i;
            C8298k.m12935c(fVar);
            C0248b bVar = new C0248b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.mo27336c().mo27391g(i, timeUnit);
            fVar.mo27303c().mo27391g(i2, timeUnit);
            bVar.m42020A(b0Var.m10562e(), str);
            bVar.mo556d();
            C9078d0.C9079a f = bVar.mo554f(false);
            C8298k.m12935c(f);
            C9078d0 c = f.m10491r(b0Var).m10506c();
            bVar.m42002z(c);
            int A0 = c.m10527A0();
            if (A0 != 200) {
                if (A0 == 407) {
                    C9069b0 a = this.f33633s.m10484a().m10573h().mo6668a(this.f33633s, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (C11451n.m633l("close", C9078d0.m10523E0(c, "Connection", null, 2, null), true)) {
                        return a;
                    } else {
                        b0Var = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.m10527A0());
                }
            } else if (gVar.mo27338a().mo27341B() && fVar.mo27338a().mo27341B()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    public final C9069b0 m4965l() {
        C9069b0 a = new C9069b0.C9070a().m10551g(this.f33633s.m10484a().m10569l()).m10554d("CONNECT", null).m10556b("Host", C9489b.m8533L(this.f33633s.m10484a().m10569l(), true)).m10556b("Proxy-Connection", "Keep-Alive").m10556b("User-Agent", "okhttp/4.9.3").m10557a();
        C9069b0 a2 = this.f33633s.m10484a().m10573h().mo6668a(this.f33633s, new C9078d0.C9079a().m10491r(a).m10493p(EnumC9064a0.HTTP_1_1).m10502g(407).m10496m("Preemptive Authenticate").m10507b(C9489b.f30724c).m10490s(-1L).m10492q(-1L).m10499j("Proxy-Authenticate", "OkHttp-Preemptive").m10506c());
        return a2 != null ? a2 : a;
    }

    public final void m4964m(C10477b bVar, int i, AbstractC9080e eVar, AbstractC9114t tVar) {
        if (this.f33633s.m10484a().m10570k() == null) {
            List<EnumC9064a0> f = this.f33633s.m10484a().m10575f();
            EnumC9064a0 a0Var = EnumC9064a0.H2_PRIOR_KNOWLEDGE;
            if (f.contains(a0Var)) {
                this.f33618d = this.f33617c;
                this.f33620f = a0Var;
                m4979E(i);
                return;
            }
            this.f33618d = this.f33617c;
            this.f33620f = EnumC9064a0.HTTP_1_1;
            return;
        }
        tVar.m10408B(eVar);
        m4968i(bVar);
        tVar.m10409A(eVar, this.f33619e);
        if (this.f33620f == EnumC9064a0.HTTP_2) {
            m4979E(i);
        }
    }

    public final List<Reference<C10482e>> m4963n() {
        return this.f33630p;
    }

    public final long m4962o() {
        return this.f33631q;
    }

    public final boolean m4961p() {
        return this.f33624j;
    }

    public final int m4960q() {
        return this.f33626l;
    }

    public C9118u m4959r() {
        return this.f33619e;
    }

    public final synchronized void m4958s() {
        this.f33627m++;
    }

    public final boolean m4957t(C9063a aVar, List<C9085f0> list) {
        C8298k.m12933e(aVar, "address");
        if (C9489b.f30729h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f33630p.size() >= this.f33629o || this.f33624j || !this.f33633s.m10484a().m10577d(aVar)) {
            return false;
        } else {
            if (C8298k.m12936b(aVar.m10569l().m10346h(), m4951z().m10484a().m10569l().m10346h())) {
                return true;
            }
            if (this.f33621g == null || list == null || !m4983A(list) || aVar.m10576e() != C4351d.f14427a || !m4978F(aVar.m10569l())) {
                return false;
            }
            try {
                C9086g a = aVar.m10580a();
                C8298k.m12935c(a);
                String h = aVar.m10569l().m10346h();
                C9118u r = m4959r();
                C8298k.m12935c(r);
                a.m10480a(h, r.m10378d());
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
        sb2.append(this.f33633s.m10484a().m10569l().m10346h());
        sb2.append(':');
        sb2.append(this.f33633s.m10484a().m10569l().m10342l());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f33633s.m10483b());
        sb2.append(" hostAddress=");
        sb2.append(this.f33633s.m10481d());
        sb2.append(" cipherSuite=");
        C9118u uVar = this.f33619e;
        if (uVar == null || (obj = uVar.m10381a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f33620f);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean m4956u(boolean z) {
        long j;
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f33617c;
            C8298k.m12935c(socket);
            Socket socket2 = this.f33618d;
            C8298k.m12935c(socket2);
            AbstractC4551g gVar = this.f33622h;
            C8298k.m12935c(gVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            C1315f fVar = this.f33621g;
            if (fVar != null) {
                return fVar.m37720b1(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f33631q;
            }
            if (j < 10000000000L || !z) {
                return true;
            }
            return C9489b.m8542C(socket2, gVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final boolean m4955v() {
        return this.f33621g != null;
    }

    public final AbstractC11463d m4954w(C9132z zVar, C11466g gVar) {
        C8298k.m12933e(zVar, "client");
        C8298k.m12933e(gVar, "chain");
        Socket socket = this.f33618d;
        C8298k.m12935c(socket);
        AbstractC4551g gVar2 = this.f33622h;
        C8298k.m12935c(gVar2);
        AbstractC4550f fVar = this.f33623i;
        C8298k.m12935c(fVar);
        C1315f fVar2 = this.f33621g;
        if (fVar2 != null) {
            return new C1334g(zVar, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.m529k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.mo27336c().mo27391g(gVar.m532h(), timeUnit);
        fVar.mo27303c().mo27391g(gVar.m530j(), timeUnit);
        return new C0248b(zVar, this, gVar2, fVar);
    }

    public final synchronized void m4953x() {
        this.f33625k = true;
    }

    public final synchronized void m4952y() {
        this.f33624j = true;
    }

    public C9085f0 m4951z() {
        return this.f33633s;
    }
}
