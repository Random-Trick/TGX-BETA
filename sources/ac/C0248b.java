package ac;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4550f;
import p095gc.AbstractC4551g;
import p095gc.AbstractC4572y;
import p095gc.C4539b0;
import p095gc.C4549e;
import p095gc.C4556k;
import p278tb.AbstractC9106p;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9122v;
import p278tb.C9125w;
import p278tb.C9132z;
import p290ub.C9489b;
import p348yb.C10486f;
import p362zb.AbstractC11463d;
import p362zb.C11464e;
import p362zb.C11468i;
import p362zb.C11471k;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;
import za.C11452o;

public final class C0248b implements AbstractC11463d {
    public static final C0252d f753h = new C0252d(null);
    public int f754a;
    public final C0246a f755b;
    public C9122v f756c;
    public final C9132z f757d;
    public final C10486f f758e;
    public final AbstractC4551g f759f;
    public final AbstractC4550f f760g;

    public abstract class AbstractC0249a implements AbstractC4537a0 {
        public final C4556k f761a;
        public boolean f762b;

        public AbstractC0249a() {
            this.f761a = new C4556k(C0248b.this.f759f.mo27336c());
        }

        @Override
        public C4539b0 mo27336c() {
            return this.f761a;
        }

        public final boolean m42001m() {
            return this.f762b;
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            try {
                return C0248b.this.f759f.mo5028s(eVar, j);
            } catch (IOException e) {
                C0248b.this.mo553g().m4952y();
                m42000t();
                throw e;
            }
        }

        public final void m42000t() {
            if (C0248b.this.f754a != 6) {
                if (C0248b.this.f754a == 5) {
                    C0248b.this.m42010r(this.f761a);
                    C0248b.this.f754a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C0248b.this.f754a);
            }
        }

        public final void m41999y0(boolean z) {
            this.f762b = z;
        }
    }

    public final class C0250b implements AbstractC4572y {
        public final C4556k f764a;
        public boolean f765b;

        public C0250b() {
            this.f764a = new C4556k(C0248b.this.f760g.mo27303c());
        }

        @Override
        public C4539b0 mo27303c() {
            return this.f764a;
        }

        @Override
        public synchronized void close() {
            if (!this.f765b) {
                this.f765b = true;
                C0248b.this.f760g.mo27350O("0\r\n\r\n");
                C0248b.this.m42010r(this.f764a);
                C0248b.this.f754a = 3;
            }
        }

        @Override
        public synchronized void flush() {
            if (!this.f765b) {
                C0248b.this.f760g.flush();
            }
        }

        @Override
        public void mo5030h0(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "source");
            if (!(!this.f765b)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C0248b.this.f760g.mo27348W(j);
                C0248b.this.f760g.mo27350O("\r\n");
                C0248b.this.f760g.mo5030h0(eVar, j);
                C0248b.this.f760g.mo27350O("\r\n");
            }
        }
    }

    public final class C0251c extends AbstractC0249a {
        public long f767M = -1;
        public boolean f768N = true;
        public final C9125w f769O;
        public final C0248b f770P;

        public C0251c(C0248b bVar, C9125w wVar) {
            super();
            C8298k.m12933e(wVar, "url");
            this.f770P = bVar;
            this.f769O = wVar;
        }

        @Override
        public void close() {
            if (!m42001m()) {
                if (this.f768N && !C9489b.m8508p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f770P.mo553g().m4952y();
                    m42000t();
                }
                m41999y0(true);
            }
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(true ^ m42001m())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f768N) {
                return -1L;
            } else {
                long j2 = this.f767M;
                if (j2 == 0 || j2 == -1) {
                    m41998z0();
                    if (!this.f768N) {
                        return -1L;
                    }
                }
                long s = super.mo5028s(eVar, Math.min(j, this.f767M));
                if (s != -1) {
                    this.f767M -= s;
                    return s;
                }
                this.f770P.mo553g().m4952y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m42000t();
                throw protocolException;
            }
        }

        public final void m41998z0() {
            if (this.f767M != -1) {
                this.f770P.f759f.mo27335e0();
            }
            try {
                this.f767M = this.f770P.f759f.mo27329v0();
                String e0 = this.f770P.f759f.mo27335e0();
                if (e0 != null) {
                    String obj = C11452o.m574u0(e0).toString();
                    if (this.f767M >= 0) {
                        if (!(obj.length() > 0) || C11451n.m621x(obj, ";", false, 2, null)) {
                            if (this.f767M == 0) {
                                this.f768N = false;
                                C0248b bVar = this.f770P;
                                bVar.f756c = bVar.f755b.m42022a();
                                C9132z zVar = this.f770P.f757d;
                                C8298k.m12935c(zVar);
                                AbstractC9106p j = zVar.m10277j();
                                C9125w wVar = this.f769O;
                                C9122v vVar = this.f770P.f756c;
                                C8298k.m12935c(vVar);
                                C11464e.m546f(j, wVar, vVar);
                                m42000t();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f767M + obj + '\"');
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
    }

    public static final class C0252d {
        public C0252d() {
        }

        public C0252d(C8294g gVar) {
            this();
        }
    }

    public final class C0253e extends AbstractC0249a {
        public long f771M;

        public C0253e(long j) {
            super();
            this.f771M = j;
            if (j == 0) {
                m42000t();
            }
        }

        @Override
        public void close() {
            if (!m42001m()) {
                if (this.f771M != 0 && !C9489b.m8508p(this, 100, TimeUnit.MILLISECONDS)) {
                    C0248b.this.mo553g().m4952y();
                    m42000t();
                }
                m41999y0(true);
            }
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (true ^ m42001m()) {
                long j2 = this.f771M;
                if (j2 == 0) {
                    return -1L;
                }
                long s = super.mo5028s(eVar, Math.min(j2, j));
                if (s != -1) {
                    long j3 = this.f771M - s;
                    this.f771M = j3;
                    if (j3 == 0) {
                        m42000t();
                    }
                    return s;
                }
                C0248b.this.mo553g().m4952y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m42000t();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public final class C0254f implements AbstractC4572y {
        public final C4556k f773a;
        public boolean f774b;

        public C0254f() {
            this.f773a = new C4556k(C0248b.this.f760g.mo27303c());
        }

        @Override
        public C4539b0 mo27303c() {
            return this.f773a;
        }

        @Override
        public void close() {
            if (!this.f774b) {
                this.f774b = true;
                C0248b.this.m42010r(this.f773a);
                C0248b.this.f754a = 3;
            }
        }

        @Override
        public void flush() {
            if (!this.f774b) {
                C0248b.this.f760g.flush();
            }
        }

        @Override
        public void mo5030h0(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "source");
            if (!this.f774b) {
                C9489b.m8515i(eVar.size(), 0L, j);
                C0248b.this.f760g.mo5030h0(eVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public final class C0255g extends AbstractC0249a {
        public boolean f776M;

        public C0255g() {
            super();
        }

        @Override
        public void close() {
            if (!m42001m()) {
                if (!this.f776M) {
                    m42000t();
                }
                m41999y0(true);
            }
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!m42001m())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f776M) {
                return -1L;
            } else {
                long s = super.mo5028s(eVar, j);
                if (s != -1) {
                    return s;
                }
                this.f776M = true;
                m42000t();
                return -1L;
            }
        }
    }

    public C0248b(C9132z zVar, C10486f fVar, AbstractC4551g gVar, AbstractC4550f fVar2) {
        C8298k.m12933e(fVar, "connection");
        C8298k.m12933e(gVar, "source");
        C8298k.m12933e(fVar2, "sink");
        this.f757d = zVar;
        this.f758e = fVar;
        this.f759f = gVar;
        this.f760g = fVar2;
        this.f755b = new C0246a(gVar);
    }

    public final void m42020A(C9122v vVar, String str) {
        C8298k.m12933e(vVar, "headers");
        C8298k.m12933e(str, "requestLine");
        if (this.f754a == 0) {
            this.f760g.mo27350O(str).mo27350O("\r\n");
            int size = vVar.size();
            for (int i = 0; i < size; i++) {
                this.f760g.mo27350O(vVar.m10371i(i)).mo27350O(": ").mo27350O(vVar.m10369r(i)).mo27350O("\r\n");
            }
            this.f760g.mo27350O("\r\n");
            this.f754a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f754a).toString());
    }

    @Override
    public long mo559a(C9078d0 d0Var) {
        C8298k.m12933e(d0Var, "response");
        if (!C11464e.m550b(d0Var)) {
            return 0L;
        }
        if (m42008t(d0Var)) {
            return -1L;
        }
        return C9489b.m8505s(d0Var);
    }

    @Override
    public AbstractC4572y mo558b(C9069b0 b0Var, long j) {
        C8298k.m12933e(b0Var, "request");
        if (b0Var.m10566a() != null && b0Var.m10566a().m10550c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (m42009s(b0Var)) {
            return m42007u();
        } else {
            if (j != -1) {
                return m42004x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override
    public AbstractC4537a0 mo557c(C9078d0 d0Var) {
        C8298k.m12933e(d0Var, "response");
        if (!C11464e.m550b(d0Var)) {
            return m42005w(0L);
        }
        if (m42008t(d0Var)) {
            return m42006v(d0Var.m10514N0().m10558i());
        }
        long s = C9489b.m8505s(d0Var);
        if (s != -1) {
            return m42005w(s);
        }
        return m42003y();
    }

    @Override
    public void cancel() {
        mo553g().m4973d();
    }

    @Override
    public void mo556d() {
        this.f760g.flush();
    }

    @Override
    public void mo555e(C9069b0 b0Var) {
        C8298k.m12933e(b0Var, "request");
        C11468i iVar = C11468i.f36444a;
        Proxy.Type type = mo553g().m4951z().m10483b().type();
        C8298k.m12934d(type, "connection.route().proxy.type()");
        m42020A(b0Var.m10562e(), iVar.m526a(b0Var, type));
    }

    @Override
    public C9078d0.C9079a mo554f(boolean z) {
        int i = this.f754a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C11471k a = C11471k.f36447d.m516a(this.f755b.m42021b());
                C9078d0.C9079a k = new C9078d0.C9079a().m10493p(a.f36448a).m10502g(a.f36449b).m10496m(a.f36450c).m10498k(this.f755b.m42022a());
                if (z && a.f36449b == 100) {
                    return null;
                }
                if (a.f36449b == 100) {
                    this.f754a = 3;
                    return k;
                }
                this.f754a = 4;
                return k;
            } catch (EOFException e) {
                String n = mo553g().m4951z().m10484a().m10569l().m10340n();
                throw new IOException("unexpected end of stream on " + n, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f754a).toString());
        }
    }

    @Override
    public C10486f mo553g() {
        return this.f758e;
    }

    @Override
    public void mo552h() {
        this.f760g.flush();
    }

    public final void m42010r(C4556k kVar) {
        C4539b0 i = kVar.m27390i();
        kVar.m27389j(C4539b0.f14954d);
        i.mo27397a();
        i.mo27396b();
    }

    public final boolean m42009s(C9069b0 b0Var) {
        return C11451n.m633l("chunked", b0Var.m10563d("Transfer-Encoding"), true);
    }

    public final boolean m42008t(C9078d0 d0Var) {
        return C11451n.m633l("chunked", C9078d0.m10523E0(d0Var, "Transfer-Encoding", null, 2, null), true);
    }

    public final AbstractC4572y m42007u() {
        boolean z = true;
        if (this.f754a != 1) {
            z = false;
        }
        if (z) {
            this.f754a = 2;
            return new C0250b();
        }
        throw new IllegalStateException(("state: " + this.f754a).toString());
    }

    public final AbstractC4537a0 m42006v(C9125w wVar) {
        if (this.f754a == 4) {
            this.f754a = 5;
            return new C0251c(this, wVar);
        }
        throw new IllegalStateException(("state: " + this.f754a).toString());
    }

    public final AbstractC4537a0 m42005w(long j) {
        if (this.f754a == 4) {
            this.f754a = 5;
            return new C0253e(j);
        }
        throw new IllegalStateException(("state: " + this.f754a).toString());
    }

    public final AbstractC4572y m42004x() {
        boolean z = true;
        if (this.f754a != 1) {
            z = false;
        }
        if (z) {
            this.f754a = 2;
            return new C0254f();
        }
        throw new IllegalStateException(("state: " + this.f754a).toString());
    }

    public final AbstractC4537a0 m42003y() {
        if (this.f754a == 4) {
            this.f754a = 5;
            mo553g().m4952y();
            return new C0255g();
        }
        throw new IllegalStateException(("state: " + this.f754a).toString());
    }

    public final void m42002z(C9078d0 d0Var) {
        C8298k.m12933e(d0Var, "response");
        long s = C9489b.m8505s(d0Var);
        if (s != -1) {
            AbstractC4537a0 w = m42005w(s);
            C9489b.m8537H(w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w.close();
        }
    }
}
