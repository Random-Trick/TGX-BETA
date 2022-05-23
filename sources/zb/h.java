package zb;

import ia.q;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import ra.g;
import ra.k;
import ub.f0;
import yb.d;
import yb.e;
import zb.e;

public final class h {
    public static final a f27123f = new a(null);
    public final long f27124a;
    public final d f27125b;
    public final b f27126c = new b(vb.b.f24817i + " ConnectionPool");
    public final ConcurrentLinkedQueue<f> f27127d = new ConcurrentLinkedQueue<>();
    public final int f27128e;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public static final class b extends yb.a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(e eVar, int i10, long j10, TimeUnit timeUnit) {
        k.e(eVar, "taskRunner");
        k.e(timeUnit, "timeUnit");
        this.f27128e = i10;
        this.f27124a = timeUnit.toNanos(j10);
        this.f27125b = eVar.i();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
        }
    }

    public final boolean a(ub.a aVar, e eVar, List<f0> list, boolean z10) {
        k.e(aVar, "address");
        k.e(eVar, "call");
        Iterator<f> it = this.f27127d.iterator();
        while (it.hasNext()) {
            f next = it.next();
            k.d(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (!next.v()) {
                        q qVar = q.f14159a;
                    }
                }
                if (next.t(aVar, list)) {
                    eVar.c(next);
                    return true;
                }
                q qVar2 = q.f14159a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        Iterator<f> it = this.f27127d.iterator();
        int i10 = 0;
        f fVar = null;
        long j11 = Long.MIN_VALUE;
        int i11 = 0;
        while (it.hasNext()) {
            f next = it.next();
            k.d(next, "connection");
            synchronized (next) {
                if (d(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long o10 = j10 - next.o();
                    if (o10 > j11) {
                        q qVar = q.f14159a;
                        fVar = next;
                        j11 = o10;
                    } else {
                        q qVar2 = q.f14159a;
                    }
                }
            }
        }
        long j12 = this.f27124a;
        if (j11 >= j12 || i10 > this.f27128e) {
            k.c(fVar);
            synchronized (fVar) {
                if (!fVar.n().isEmpty()) {
                    return 0L;
                }
                if (fVar.o() + j11 != j10) {
                    return 0L;
                }
                fVar.C(true);
                this.f27127d.remove(fVar);
                vb.b.k(fVar.D());
                if (this.f27127d.isEmpty()) {
                    this.f27125b.a();
                }
                return 0L;
            }
        } else if (i10 > 0) {
            return j12 - j11;
        } else {
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
    }

    public final boolean c(f fVar) {
        k.e(fVar, "connection");
        if (vb.b.f24816h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        } else if (fVar.p() || this.f27128e == 0) {
            fVar.C(true);
            this.f27127d.remove(fVar);
            if (!this.f27127d.isEmpty()) {
                return true;
            }
            this.f27125b.a();
            return true;
        } else {
            d.j(this.f27125b, this.f27126c, 0L, 2, null);
            return false;
        }
    }

    public final int d(f fVar, long j10) {
        if (!vb.b.f24816h || Thread.holdsLock(fVar)) {
            List<Reference<e>> n10 = fVar.n();
            int i10 = 0;
            while (i10 < n10.size()) {
                Reference<e> reference = n10.get(i10);
                if (reference.get() != null) {
                    i10++;
                } else {
                    dc.h.f7333c.g().l("A connection to " + fVar.z().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                    n10.remove(i10);
                    fVar.C(true);
                    if (n10.isEmpty()) {
                        fVar.B(j10 - this.f27124a);
                        return 0;
                    }
                }
            }
            return n10.size();
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

    public final void e(f fVar) {
        k.e(fVar, "connection");
        if (!vb.b.f24816h || Thread.holdsLock(fVar)) {
            this.f27127d.add(fVar);
            d.j(this.f27125b, this.f27126c, 0L, 2, null);
            return;
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
}
