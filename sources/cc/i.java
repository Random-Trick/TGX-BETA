package cc;

import hc.a0;
import hc.b0;
import hc.e;
import hc.y;
import ia.q;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import ra.g;
import ra.k;
import ub.v;

public final class i {
    public static final a f5176o = new a(null);
    public long f5177a;
    public long f5178b;
    public long f5179c;
    public long f5180d;
    public final ArrayDeque<v> f5181e;
    public boolean f5182f;
    public final c f5183g;
    public final b f5184h;
    public final d f5185i = new d();
    public final d f5186j = new d();
    public cc.b f5187k;
    public IOException f5188l;
    public final int f5189m;
    public final f f5190n;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public final class b implements y {
        public boolean M;
        public final e f5191a = new e();
        public v f5192b;
        public boolean f5193c;

        public b(boolean z10) {
            this.M = z10;
        }

        @Override
        public b0 c() {
            return i.this.s();
        }

        @Override
        public void c0(e eVar, long j10) {
            k.e(eVar, "source");
            i iVar = i.this;
            if (!vb.b.f24816h || !Thread.holdsLock(iVar)) {
                this.f5191a.c0(eVar, j10);
                while (this.f5191a.size() >= 16384) {
                    m(false);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override
        public void close() {
            i iVar = i.this;
            if (!vb.b.f24816h || !Thread.holdsLock(iVar)) {
                synchronized (i.this) {
                    if (!this.f5193c) {
                        boolean z10 = i.this.h() == null;
                        q qVar = q.f14159a;
                        if (!i.this.o().M) {
                            boolean z11 = this.f5191a.size() > 0;
                            if (this.f5192b != null) {
                                while (this.f5191a.size() > 0) {
                                    m(false);
                                }
                                f g10 = i.this.g();
                                int j10 = i.this.j();
                                v vVar = this.f5192b;
                                k.c(vVar);
                                g10.s1(j10, z10, vb.b.J(vVar));
                            } else if (z11) {
                                while (this.f5191a.size() > 0) {
                                    m(true);
                                }
                            } else if (z10) {
                                i.this.g().r1(i.this.j(), true, null, 0L);
                            }
                        }
                        synchronized (i.this) {
                            this.f5193c = true;
                            q qVar2 = q.f14159a;
                        }
                        i.this.g().flush();
                        i.this.b();
                        return;
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override
        public void flush() {
            i iVar = i.this;
            if (!vb.b.f24816h || !Thread.holdsLock(iVar)) {
                synchronized (i.this) {
                    i.this.c();
                    q qVar = q.f14159a;
                }
                while (this.f5191a.size() > 0) {
                    m(false);
                    i.this.g().flush();
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public final void m(boolean z10) {
            long min;
            boolean z11;
            synchronized (i.this) {
                i.this.s().r();
                while (i.this.r() >= i.this.q() && !this.M && !this.f5193c && i.this.h() == null) {
                    i.this.D();
                }
                i.this.s().y();
                i.this.c();
                min = Math.min(i.this.q() - i.this.r(), this.f5191a.size());
                i iVar = i.this;
                iVar.B(iVar.r() + min);
                z11 = z10 && min == this.f5191a.size();
                q qVar = q.f14159a;
            }
            i.this.s().r();
            try {
                i.this.g().r1(i.this.j(), z11, this.f5191a, min);
            } finally {
                i.this.s().y();
            }
        }

        public final boolean s() {
            return this.f5193c;
        }

        public final boolean y0() {
            return this.M;
        }
    }

    public final class c implements a0 {
        public boolean M;
        public final long N;
        public boolean O;
        public final e f5194a = new e();
        public final e f5195b = new e();
        public v f5196c;

        public c(long j10, boolean z10) {
            this.N = j10;
            this.O = z10;
        }

        @Override
        public long A(e eVar, long j10) {
            IOException iOException;
            long j11;
            boolean z10;
            k.e(eVar, "sink");
            if (j10 >= 0) {
                do {
                    iOException = null;
                    synchronized (i.this) {
                        i.this.m().r();
                        if (i.this.h() != null && (iOException = i.this.i()) == null) {
                            cc.b h10 = i.this.h();
                            k.c(h10);
                            iOException = new n(h10);
                        }
                        if (!this.M) {
                            if (this.f5195b.size() > 0) {
                                e eVar2 = this.f5195b;
                                j11 = eVar2.A(eVar, Math.min(j10, eVar2.size()));
                                i iVar = i.this;
                                iVar.A(iVar.l() + j11);
                                long l10 = i.this.l() - i.this.k();
                                if (iOException == null && l10 >= i.this.g().V0().c() / 2) {
                                    i.this.g().w1(i.this.j(), l10);
                                    i iVar2 = i.this;
                                    iVar2.z(iVar2.l());
                                }
                            } else if (this.O || iOException != null) {
                                j11 = -1;
                            } else {
                                i.this.D();
                                j11 = -1;
                                z10 = true;
                                i.this.m().y();
                                q qVar = q.f14159a;
                            }
                            z10 = false;
                            i.this.m().y();
                            q qVar2 = q.f14159a;
                        } else {
                            throw new IOException("stream closed");
                        }
                    }
                } while (z10);
                if (j11 != -1) {
                    B0(j11);
                    return j11;
                } else if (iOException == null) {
                    return -1L;
                } else {
                    k.c(iOException);
                    throw iOException;
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
        }

        public final void A0(v vVar) {
            this.f5196c = vVar;
        }

        public final void B0(long j10) {
            i iVar = i.this;
            if (!vb.b.f24816h || !Thread.holdsLock(iVar)) {
                i.this.g().q1(j10);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override
        public b0 c() {
            return i.this.m();
        }

        @Override
        public void close() {
            long size;
            synchronized (i.this) {
                this.M = true;
                size = this.f5195b.size();
                this.f5195b.y0();
                i iVar = i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    q qVar = q.f14159a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (size > 0) {
                B0(size);
            }
            i.this.b();
        }

        public final boolean m() {
            return this.M;
        }

        public final boolean s() {
            return this.O;
        }

        public final void y0(hc.g gVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            k.e(gVar, "source");
            i iVar = i.this;
            if (!vb.b.f24816h || !Thread.holdsLock(iVar)) {
                while (j10 > 0) {
                    synchronized (i.this) {
                        z10 = this.O;
                        z11 = true;
                        z12 = this.f5195b.size() + j10 > this.N;
                        q qVar = q.f14159a;
                    }
                    if (z12) {
                        gVar.b0(j10);
                        i.this.f(cc.b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z10) {
                        gVar.b0(j10);
                        return;
                    } else {
                        long A = gVar.A(this.f5194a, j10);
                        if (A != -1) {
                            j10 -= A;
                            synchronized (i.this) {
                                if (this.M) {
                                    j11 = this.f5194a.size();
                                    this.f5194a.y0();
                                } else {
                                    if (this.f5195b.size() != 0) {
                                        z11 = false;
                                    }
                                    this.f5195b.X0(this.f5194a);
                                    if (z11) {
                                        i iVar2 = i.this;
                                        if (iVar2 != null) {
                                            iVar2.notifyAll();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j11 = 0;
                                }
                            }
                            if (j11 > 0) {
                                B0(j11);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public final void z0(boolean z10) {
            this.O = z10;
        }
    }

    public final class d extends hc.d {
        public d() {
        }

        @Override
        public IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override
        public void x() {
            i.this.f(cc.b.CANCEL);
            i.this.g().k1();
        }

        public final void y() {
            if (s()) {
                throw t(null);
            }
        }
    }

    public i(int i10, f fVar, boolean z10, boolean z11, v vVar) {
        k.e(fVar, "connection");
        this.f5189m = i10;
        this.f5190n = fVar;
        this.f5180d = fVar.W0().c();
        ArrayDeque<v> arrayDeque = new ArrayDeque<>();
        this.f5181e = arrayDeque;
        this.f5183g = new c(fVar.V0().c(), z11);
        this.f5184h = new b(z10);
        if (vVar != null) {
            if (!t()) {
                arrayDeque.add(vVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void A(long j10) {
        this.f5177a = j10;
    }

    public final void B(long j10) {
        this.f5179c = j10;
    }

    public final synchronized v C() {
        v removeFirst;
        this.f5185i.r();
        while (this.f5181e.isEmpty() && this.f5187k == null) {
            D();
        }
        this.f5185i.y();
        if (!this.f5181e.isEmpty()) {
            removeFirst = this.f5181e.removeFirst();
            k.d(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f5188l;
            if (iOException != null) {
                throw iOException;
            }
            cc.b bVar = this.f5187k;
            k.c(bVar);
            throw new n(bVar);
        }
        return removeFirst;
    }

    public final void D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final b0 E() {
        return this.f5186j;
    }

    public final void a(long j10) {
        this.f5180d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean u10;
        if (!vb.b.f24816h || !Thread.holdsLock(this)) {
            synchronized (this) {
                z10 = !this.f5183g.s() && this.f5183g.m() && (this.f5184h.y0() || this.f5184h.s());
                u10 = u();
                q qVar = q.f14159a;
            }
            if (z10) {
                d(cc.b.CANCEL, null);
            } else if (!u10) {
                this.f5190n.j1(this.f5189m);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    public final void c() {
        if (this.f5184h.s()) {
            throw new IOException("stream closed");
        } else if (this.f5184h.y0()) {
            throw new IOException("stream finished");
        } else if (this.f5187k != null) {
            IOException iOException = this.f5188l;
            if (iOException == null) {
                cc.b bVar = this.f5187k;
                k.c(bVar);
                throw new n(bVar);
            }
        }
    }

    public final void d(cc.b bVar, IOException iOException) {
        k.e(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f5190n.u1(this.f5189m, bVar);
        }
    }

    public final boolean e(cc.b bVar, IOException iOException) {
        if (!vb.b.f24816h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f5187k != null) {
                    return false;
                }
                if (this.f5183g.s() && this.f5184h.y0()) {
                    return false;
                }
                this.f5187k = bVar;
                this.f5188l = iOException;
                notifyAll();
                q qVar = q.f14159a;
                this.f5190n.j1(this.f5189m);
                return true;
            }
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

    public final void f(cc.b bVar) {
        k.e(bVar, "errorCode");
        if (e(bVar, null)) {
            this.f5190n.v1(this.f5189m, bVar);
        }
    }

    public final f g() {
        return this.f5190n;
    }

    public final synchronized cc.b h() {
        return this.f5187k;
    }

    public final IOException i() {
        return this.f5188l;
    }

    public final int j() {
        return this.f5189m;
    }

    public final long k() {
        return this.f5178b;
    }

    public final long l() {
        return this.f5177a;
    }

    public final d m() {
        return this.f5185i;
    }

    public final hc.y n() {
        throw new UnsupportedOperationException("Method not decompiled: cc.i.n():hc.y");
    }

    public final b o() {
        return this.f5184h;
    }

    public final c p() {
        return this.f5183g;
    }

    public final long q() {
        return this.f5180d;
    }

    public final long r() {
        return this.f5179c;
    }

    public final d s() {
        return this.f5186j;
    }

    public final boolean t() {
        return this.f5190n.Q0() == ((this.f5189m & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f5187k != null) {
            return false;
        }
        if ((this.f5183g.s() || this.f5183g.m()) && (this.f5184h.y0() || this.f5184h.s())) {
            if (this.f5182f) {
                return false;
            }
        }
        return true;
    }

    public final b0 v() {
        return this.f5185i;
    }

    public final void w(hc.g gVar, int i10) {
        k.e(gVar, "source");
        if (!vb.b.f24816h || !Thread.holdsLock(this)) {
            this.f5183g.y0(gVar, i10);
            return;
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

    public final void x(ub.v r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: cc.i.x(ub.v, boolean):void");
    }

    public final synchronized void y(cc.b bVar) {
        k.e(bVar, "errorCode");
        if (this.f5187k == null) {
            this.f5187k = bVar;
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f5178b = j10;
    }
}
