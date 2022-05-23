package zb;

import dc.h;
import hc.d;
import ia.q;
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
import ra.k;
import ub.b0;
import ub.f;
import ub.g;
import ub.r;
import ub.t;
import ub.w;
import ub.z;

public final class e implements ub.e {
    public Object N;
    public d O;
    public f P;
    public boolean Q;
    public zb.c R;
    public boolean S;
    public boolean T;
    public volatile boolean V;
    public volatile zb.c W;
    public volatile f X;
    public final z Y;
    public final b0 Z;
    public final h f27092a;
    public final boolean f27093a0;
    public final t f27094b;
    public final c f27095c;
    public final AtomicBoolean M = new AtomicBoolean();
    public boolean U = true;

    public final class a implements Runnable {
        public volatile AtomicInteger f27096a = new AtomicInteger(0);
        public final f f27097b;
        public final e f27098c;

        public a(e eVar, f fVar) {
            k.e(fVar, "responseCallback");
            this.f27098c = eVar;
            this.f27097b = fVar;
        }

        public final void a(ExecutorService executorService) {
            k.e(executorService, "executorService");
            r k10 = this.f27098c.j().k();
            if (!vb.b.f24816h || !Thread.holdsLock(k10)) {
                try {
                    try {
                        executorService.execute(this);
                    } catch (RejectedExecutionException e10) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e10);
                        this.f27098c.u(interruptedIOException);
                        this.f27097b.a(this.f27098c, interruptedIOException);
                        this.f27098c.j().k().e(this);
                    }
                } catch (Throwable th) {
                    this.f27098c.j().k().e(this);
                    throw th;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                k.d(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(k10);
                throw new AssertionError(sb2.toString());
            }
        }

        public final e b() {
            return this.f27098c;
        }

        public final AtomicInteger c() {
            return this.f27096a;
        }

        public final String d() {
            return this.f27098c.p().i().h();
        }

        public final void e(a aVar) {
            k.e(aVar, "other");
            this.f27096a = aVar.f27096a;
        }

        @Override
        public void run() {
            boolean z10;
            IOException e10;
            r k10;
            Throwable th;
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.f27098c.v());
            try {
                this.f27098c.f27095c.r();
                try {
                    z10 = true;
                } catch (IOException e11) {
                    e10 = e11;
                    z10 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                }
                try {
                    this.f27097b.b(this.f27098c, this.f27098c.q());
                    k10 = this.f27098c.j().k();
                } catch (IOException e12) {
                    e10 = e12;
                    if (z10) {
                        h.f7333c.g().j("Callback failure for " + this.f27098c.B(), 4, e10);
                    } else {
                        this.f27097b.a(this.f27098c, e10);
                    }
                    k10 = this.f27098c.j().k();
                    k10.e(this);
                } catch (Throwable th3) {
                    th = th3;
                    this.f27098c.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        ia.a.a(iOException, th);
                        this.f27097b.a(this.f27098c, iOException);
                    }
                    throw th;
                }
                k10.e(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference<e> {
        public final Object f27099a;

        public b(e eVar, Object obj) {
            super(eVar);
            k.e(eVar, "referent");
            this.f27099a = obj;
        }

        public final Object a() {
            return this.f27099a;
        }
    }

    public static final class c extends d {
        public c() {
        }

        @Override
        public void x() {
            e.this.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z10) {
        k.e(zVar, "client");
        k.e(b0Var, "originalRequest");
        this.Y = zVar;
        this.Z = b0Var;
        this.f27093a0 = z10;
        this.f27092a = zVar.h().a();
        this.f27094b = zVar.n().a(this);
        c cVar = new c();
        cVar.g(zVar.e(), TimeUnit.MILLISECONDS);
        q qVar = q.f14159a;
        this.f27095c = cVar;
    }

    public final <E extends IOException> E A(E e10) {
        if (this.Q || !this.f27095c.s()) {
            return e10;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    public final String B() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m() ? "canceled " : "");
        sb2.append(this.f27093a0 ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(v());
        return sb2.toString();
    }

    public final void c(f fVar) {
        k.e(fVar, "connection");
        if (!vb.b.f24816h || Thread.holdsLock(fVar)) {
            if (this.P == null) {
                this.P = fVar;
                fVar.n().add(new b(this, this.N));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    @Override
    public void cancel() {
        if (!this.V) {
            this.V = true;
            zb.c cVar = this.W;
            if (cVar != null) {
                cVar.b();
            }
            f fVar = this.X;
            if (fVar != null) {
                fVar.d();
            }
            this.f27094b.f(this);
        }
    }

    public final <E extends IOException> E d(E e10) {
        Socket w10;
        boolean z10 = vb.b.f24816h;
        if (!z10 || !Thread.holdsLock(this)) {
            f fVar = this.P;
            if (fVar != null) {
                if (!z10 || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        w10 = w();
                    }
                    if (this.P == null) {
                        if (w10 != null) {
                            vb.b.k(w10);
                        }
                        this.f27094b.k(this, fVar);
                    } else {
                        if (!(w10 == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    k.d(currentThread, "Thread.currentThread()");
                    sb2.append(currentThread.getName());
                    sb2.append(" MUST NOT hold lock on ");
                    sb2.append(fVar);
                    throw new AssertionError(sb2.toString());
                }
            }
            E e11 = (E) A(e10);
            if (e10 != null) {
                t tVar = this.f27094b;
                k.c(e11);
                tVar.d(this, e11);
            } else {
                this.f27094b.c(this);
            }
            return e11;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        k.d(currentThread2, "Thread.currentThread()");
        sb3.append(currentThread2.getName());
        sb3.append(" MUST NOT hold lock on ");
        sb3.append(this);
        throw new AssertionError(sb3.toString());
    }

    public final void e() {
        this.N = h.f7333c.g().h("response.body().close()");
        this.f27094b.e(this);
    }

    public e clone() {
        return new e(this.Y, this.Z, this.f27093a0);
    }

    public final ub.a g(w wVar) {
        g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory = null;
        if (wVar.i()) {
            sSLSocketFactory = this.Y.E();
            hostnameVerifier = this.Y.r();
            gVar = this.Y.f();
        } else {
            hostnameVerifier = null;
            gVar = null;
        }
        return new ub.a(wVar.h(), wVar.l(), this.Y.l(), this.Y.D(), sSLSocketFactory, hostnameVerifier, gVar, this.Y.z(), this.Y.y(), this.Y.x(), this.Y.i(), this.Y.A());
    }

    public final void h(b0 b0Var, boolean z10) {
        k.e(b0Var, "request");
        if (this.R == null) {
            synchronized (this) {
                if (!(!this.T)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.S) {
                    q qVar = q.f14159a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z10) {
                this.O = new d(this.f27092a, g(b0Var.i()), this, this.f27094b);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void i(boolean z10) {
        zb.c cVar;
        synchronized (this) {
            if (this.U) {
                q qVar = q.f14159a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.W) != null) {
            cVar.d();
        }
        this.R = null;
    }

    public final z j() {
        return this.Y;
    }

    public final f k() {
        return this.P;
    }

    public final t l() {
        return this.f27094b;
    }

    @Override
    public boolean m() {
        return this.V;
    }

    public final boolean n() {
        return this.f27093a0;
    }

    public final zb.c o() {
        return this.R;
    }

    public final b0 p() {
        return this.Z;
    }

    public final ub.d0 q() {
        throw new UnsupportedOperationException("Method not decompiled: zb.e.q():ub.d0");
    }

    public final zb.c r(ac.g gVar) {
        k.e(gVar, "chain");
        synchronized (this) {
            if (!this.U) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.T)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.S) {
                q qVar = q.f14159a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = this.O;
        k.c(dVar);
        zb.c cVar = new zb.c(this, this.f27094b, dVar, dVar.a(this.Y, gVar));
        this.R = cVar;
        this.W = cVar;
        synchronized (this) {
            this.S = true;
            this.T = true;
        }
        if (!this.V) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    @Override
    public void s(f fVar) {
        k.e(fVar, "responseCallback");
        if (this.M.compareAndSet(false, true)) {
            e();
            this.Y.k().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final <E extends java.io.IOException> E t(zb.c r3, boolean r4, boolean r5, E r6) {
        throw new UnsupportedOperationException("Method not decompiled: zb.e.t(zb.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException u(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.U) {
                this.U = false;
                if (!this.S && !this.T) {
                    z10 = true;
                }
            }
            q qVar = q.f14159a;
        }
        return z10 ? d(iOException) : iOException;
    }

    public final String v() {
        return this.Z.i().n();
    }

    public final Socket w() {
        f fVar = this.P;
        k.c(fVar);
        if (!vb.b.f24816h || Thread.holdsLock(fVar)) {
            List<Reference<e>> n10 = fVar.n();
            Iterator<Reference<e>> it = n10.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (k.b(it.next().get(), this)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                z10 = true;
            }
            if (z10) {
                n10.remove(i10);
                this.P = null;
                if (n10.isEmpty()) {
                    fVar.B(System.nanoTime());
                    if (this.f27092a.c(fVar)) {
                        return fVar.D();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    public final boolean x() {
        d dVar = this.O;
        k.c(dVar);
        return dVar.e();
    }

    public final void y(f fVar) {
        this.X = fVar;
    }

    public final void z() {
        if (!this.Q) {
            this.Q = true;
            this.f27095c.s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
