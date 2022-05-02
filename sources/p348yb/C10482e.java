package p348yb;

import cc.C2083h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p095gc.C4544d;
import p107ha.C5040a;
import p107ha.C5060q;
import p278tb.AbstractC9080e;
import p278tb.AbstractC9084f;
import p278tb.AbstractC9114t;
import p278tb.C9063a;
import p278tb.C9069b0;
import p278tb.C9086g;
import p278tb.C9110r;
import p278tb.C9125w;
import p278tb.C9132z;
import p290ub.C9489b;
import p362zb.C11466g;
import qa.C8298k;

public final class C10482e implements AbstractC9080e {
    public Object f33594N;
    public C10481d f33595O;
    public C10486f f33596P;
    public boolean f33597Q;
    public C10478c f33598R;
    public boolean f33599S;
    public boolean f33600T;
    public volatile boolean f33602V;
    public volatile C10478c f33603W;
    public volatile C10486f f33604X;
    public final C9132z f33605Y;
    public final C9069b0 f33606Z;
    public final C10491h f33607a;
    public final boolean f33608a0;
    public final AbstractC9114t f33609b;
    public final C10485c f33610c;
    public final AtomicBoolean f33593M = new AtomicBoolean();
    public boolean f33601U = true;

    public final class RunnableC10483a implements Runnable {
        public volatile AtomicInteger f33611a = new AtomicInteger(0);
        public final AbstractC9084f f33612b;
        public final C10482e f33613c;

        public RunnableC10483a(C10482e eVar, AbstractC9084f fVar) {
            C8298k.m12933e(fVar, "responseCallback");
            this.f33613c = eVar;
            this.f33612b = fVar;
        }

        public final void m4990a(ExecutorService executorService) {
            C8298k.m12933e(executorService, "executorService");
            C9110r k = this.f33613c.m5007j().m10276k();
            if (!C9489b.f30729h || !Thread.holdsLock(k)) {
                try {
                    try {
                        executorService.execute(this);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        this.f33613c.m4996u(interruptedIOException);
                        this.f33612b.mo10485b(this.f33613c, interruptedIOException);
                        this.f33613c.m5007j().m10276k().m10413e(this);
                    }
                } catch (Throwable th) {
                    this.f33613c.m5007j().m10276k().m10413e(this);
                    throw th;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C8298k.m12934d(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(k);
                throw new AssertionError(sb2.toString());
            }
        }

        public final C10482e m4989b() {
            return this.f33613c;
        }

        public final AtomicInteger m4988c() {
            return this.f33611a;
        }

        public final String m4987d() {
            return this.f33613c.m5001p().m10558i().m10346h();
        }

        public final void m4986e(RunnableC10483a aVar) {
            C8298k.m12933e(aVar, "other");
            this.f33611a = aVar.f33611a;
        }

        @Override
        public void run() {
            boolean z;
            IOException e;
            C9110r k;
            Throwable th;
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.f33613c.m4995v());
            try {
                this.f33613c.f33610c.m27461r();
                try {
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
                try {
                    this.f33612b.mo10486a(this.f33613c, this.f33613c.m5000q());
                    k = this.f33613c.m5007j().m10276k();
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                        C2083h.f7326c.m35677g().m35689j("Callback failure for " + this.f33613c.m5017B(), 4, e);
                    } else {
                        this.f33612b.mo10485b(this.f33613c, e);
                    }
                    k = this.f33613c.m5007j().m10276k();
                    k.m10413e(this);
                } catch (Throwable th3) {
                    th = th3;
                    this.f33613c.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        C5040a.m24202a(iOException, th);
                        this.f33612b.mo10485b(this.f33613c, iOException);
                    }
                    throw th;
                }
                k.m10413e(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public static final class C10484b extends WeakReference<C10482e> {
        public final Object f33614a;

        public C10484b(C10482e eVar, Object obj) {
            super(eVar);
            C8298k.m12933e(eVar, "referent");
            this.f33614a = obj;
        }

        public final Object m4985a() {
            return this.f33614a;
        }
    }

    public static final class C10485c extends C4544d {
        public C10485c() {
        }

        @Override
        public void mo4984x() {
            C10482e.this.cancel();
        }
    }

    public C10482e(C9132z zVar, C9069b0 b0Var, boolean z) {
        C8298k.m12933e(zVar, "client");
        C8298k.m12933e(b0Var, "originalRequest");
        this.f33605Y = zVar;
        this.f33606Z = b0Var;
        this.f33608a0 = z;
        this.f33607a = zVar.m10279h().m10453a();
        this.f33609b = zVar.m10274n().mo8497a(this);
        C10485c cVar = new C10485c();
        cVar.mo27391g(zVar.m10282e(), TimeUnit.MILLISECONDS);
        C5060q qVar = C5060q.f17066a;
        this.f33610c = cVar;
    }

    public final <E extends IOException> E m5018A(E e) {
        if (this.f33597Q || !this.f33610c.m27460s()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    public final String m5017B() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo5004m() ? "canceled " : "");
        sb2.append(this.f33608a0 ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(m4995v());
        return sb2.toString();
    }

    public final void m5014c(C10486f fVar) {
        C8298k.m12933e(fVar, "connection");
        if (!C9489b.f30729h || Thread.holdsLock(fVar)) {
            if (this.f33596P == null) {
                this.f33596P = fVar;
                fVar.m4963n().add(new C10484b(this, this.f33594N));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    @Override
    public void cancel() {
        if (!this.f33602V) {
            this.f33602V = true;
            C10478c cVar = this.f33603W;
            if (cVar != null) {
                cVar.m5049b();
            }
            C10486f fVar = this.f33604X;
            if (fVar != null) {
                fVar.m4973d();
            }
            this.f33609b.m10402f(this);
        }
    }

    public final <E extends IOException> E m5013d(E e) {
        Socket w;
        boolean z = C9489b.f30729h;
        if (!z || !Thread.holdsLock(this)) {
            C10486f fVar = this.f33596P;
            if (fVar != null) {
                if (!z || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        w = m4994w();
                    }
                    if (this.f33596P == null) {
                        if (w != null) {
                            C9489b.m8513k(w);
                        }
                        this.f33609b.m10397k(this, fVar);
                    } else {
                        if (!(w == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    C8298k.m12934d(currentThread, "Thread.currentThread()");
                    sb2.append(currentThread.getName());
                    sb2.append(" MUST NOT hold lock on ");
                    sb2.append(fVar);
                    throw new AssertionError(sb2.toString());
                }
            }
            E e2 = (E) m5018A(e);
            if (e != null) {
                AbstractC9114t tVar = this.f33609b;
                C8298k.m12935c(e2);
                tVar.m10404d(this, e2);
            } else {
                this.f33609b.m10405c(this);
            }
            return e2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        C8298k.m12934d(currentThread2, "Thread.currentThread()");
        sb3.append(currentThread2.getName());
        sb3.append(" MUST NOT hold lock on ");
        sb3.append(this);
        throw new AssertionError(sb3.toString());
    }

    public final void m5012e() {
        this.f33594N = C2083h.f7326c.m35677g().mo35691h("response.body().close()");
        this.f33609b.m10403e(this);
    }

    public C10482e clone() {
        return new C10482e(this.f33605Y, this.f33606Z, this.f33608a0);
    }

    public final C9063a m5010g(C9125w wVar) {
        C9086g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory = null;
        if (wVar.m10345i()) {
            sSLSocketFactory = this.f33605Y.m10289E();
            hostnameVerifier = this.f33605Y.m10270r();
            gVar = this.f33605Y.m10281f();
        } else {
            hostnameVerifier = null;
            gVar = null;
        }
        return new C9063a(wVar.m10346h(), wVar.m10342l(), this.f33605Y.m10275l(), this.f33605Y.m10290D(), sSLSocketFactory, hostnameVerifier, gVar, this.f33605Y.m10263z(), this.f33605Y.m10264y(), this.f33605Y.m10265x(), this.f33605Y.m10278i(), this.f33605Y.m10293A());
    }

    public final void m5009h(C9069b0 b0Var, boolean z) {
        C8298k.m12933e(b0Var, "request");
        if (this.f33598R == null) {
            synchronized (this) {
                if (!(!this.f33600T)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f33599S) {
                    C5060q qVar = C5060q.f17066a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.f33595O = new C10481d(this.f33607a, m5010g(b0Var.m10558i()), this, this.f33609b);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void m5008i(boolean z) {
        C10478c cVar;
        synchronized (this) {
            if (this.f33601U) {
                C5060q qVar = C5060q.f17066a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f33603W) != null) {
            cVar.m5047d();
        }
        this.f33598R = null;
    }

    public final C9132z m5007j() {
        return this.f33605Y;
    }

    public final C10486f m5006k() {
        return this.f33596P;
    }

    public final AbstractC9114t m5005l() {
        return this.f33609b;
    }

    @Override
    public boolean mo5004m() {
        return this.f33602V;
    }

    public final boolean m5003n() {
        return this.f33608a0;
    }

    public final C10478c m5002o() {
        return this.f33598R;
    }

    public final C9069b0 m5001p() {
        return this.f33606Z;
    }

    public final p278tb.C9078d0 m5000q() {
        throw new UnsupportedOperationException("Method not decompiled: p348yb.C10482e.m5000q():tb.d0");
    }

    public final C10478c m4999r(C11466g gVar) {
        C8298k.m12933e(gVar, "chain");
        synchronized (this) {
            if (!this.f33601U) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f33600T)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f33599S) {
                C5060q qVar = C5060q.f17066a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C10481d dVar = this.f33595O;
        C8298k.m12935c(dVar);
        C10478c cVar = new C10478c(this, this.f33609b, dVar, dVar.m5026a(this.f33605Y, gVar));
        this.f33598R = cVar;
        this.f33603W = cVar;
        synchronized (this) {
            this.f33599S = true;
            this.f33600T = true;
        }
        if (!this.f33602V) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    public final <E extends java.io.IOException> E m4998s(p348yb.C10478c r3, boolean r4, boolean r5, E r6) {
        throw new UnsupportedOperationException("Method not decompiled: p348yb.C10482e.m4998s(yb.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @Override
    public void mo4997t(AbstractC9084f fVar) {
        C8298k.m12933e(fVar, "responseCallback");
        if (this.f33593M.compareAndSet(false, true)) {
            m5012e();
            this.f33605Y.m10276k().m10417a(new RunnableC10483a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final IOException m4996u(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f33601U) {
                this.f33601U = false;
                if (!this.f33599S && !this.f33600T) {
                    z = true;
                }
            }
            C5060q qVar = C5060q.f17066a;
        }
        return z ? m5013d(iOException) : iOException;
    }

    public final String m4995v() {
        return this.f33606Z.m10558i().m10340n();
    }

    public final Socket m4994w() {
        C10486f fVar = this.f33596P;
        C8298k.m12935c(fVar);
        if (!C9489b.f30729h || Thread.holdsLock(fVar)) {
            List<Reference<C10482e>> n = fVar.m4963n();
            Iterator<Reference<C10482e>> it = n.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C8298k.m12936b(it.next().get(), this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                n.remove(i);
                this.f33596P = null;
                if (n.isEmpty()) {
                    fVar.m4982B(System.nanoTime());
                    if (this.f33607a.m4946c(fVar)) {
                        return fVar.m4980D();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    public final boolean m4993x() {
        C10481d dVar = this.f33595O;
        C8298k.m12935c(dVar);
        return dVar.m5022e();
    }

    public final void m4992y(C10486f fVar) {
        this.f33604X = fVar;
    }

    public final void m4991z() {
        if (!this.f33597Q) {
            this.f33597Q = true;
            this.f33610c.m27460s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
