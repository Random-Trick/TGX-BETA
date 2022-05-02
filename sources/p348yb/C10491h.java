package p348yb;

import cc.C2083h;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p107ha.C5060q;
import p278tb.C9063a;
import p278tb.C9085f0;
import p290ub.C9489b;
import p333xb.AbstractC10176a;
import p333xb.C10179d;
import p333xb.C10180e;
import p348yb.C10482e;
import qa.C8294g;
import qa.C8298k;

public final class C10491h {
    public static final C10492a f33639f = new C10492a(null);
    public final long f33640a;
    public final C10179d f33641b;
    public final C10493b f33642c = new C10493b(C9489b.f30730i + " ConnectionPool");
    public final ConcurrentLinkedQueue<C10486f> f33643d = new ConcurrentLinkedQueue<>();
    public final int f33644e;

    public static final class C10492a {
        public C10492a() {
        }

        public C10492a(C8294g gVar) {
            this();
        }
    }

    public static final class C10493b extends AbstractC10176a {
        public C10493b(String str) {
            super(str, false, 2, null);
        }

        @Override
        public long mo4943f() {
            return C10491h.this.m4947b(System.nanoTime());
        }
    }

    public C10491h(C10180e eVar, int i, long j, TimeUnit timeUnit) {
        C8298k.m12933e(eVar, "taskRunner");
        C8298k.m12933e(timeUnit, "timeUnit");
        this.f33644e = i;
        this.f33640a = timeUnit.toNanos(j);
        this.f33641b = eVar.m5818i();
        if (!(j > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
        }
    }

    public final boolean m4948a(C9063a aVar, C10482e eVar, List<C9085f0> list, boolean z) {
        C8298k.m12933e(aVar, "address");
        C8298k.m12933e(eVar, "call");
        Iterator<C10486f> it = this.f33643d.iterator();
        while (it.hasNext()) {
            C10486f next = it.next();
            C8298k.m12934d(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.m4955v()) {
                        C5060q qVar = C5060q.f17066a;
                    }
                }
                if (next.m4957t(aVar, list)) {
                    eVar.m5014c(next);
                    return true;
                }
                C5060q qVar2 = C5060q.f17066a;
            }
        }
        return false;
    }

    public final long m4947b(long j) {
        Iterator<C10486f> it = this.f33643d.iterator();
        int i = 0;
        C10486f fVar = null;
        long j2 = Long.MIN_VALUE;
        int i2 = 0;
        while (it.hasNext()) {
            C10486f next = it.next();
            C8298k.m12934d(next, "connection");
            synchronized (next) {
                if (m4945d(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long o = j - next.m4962o();
                    if (o > j2) {
                        C5060q qVar = C5060q.f17066a;
                        fVar = next;
                        j2 = o;
                    } else {
                        C5060q qVar2 = C5060q.f17066a;
                    }
                }
            }
        }
        long j3 = this.f33640a;
        if (j2 >= j3 || i > this.f33644e) {
            C8298k.m12935c(fVar);
            synchronized (fVar) {
                if (!fVar.m4963n().isEmpty()) {
                    return 0L;
                }
                if (fVar.m4962o() + j2 != j) {
                    return 0L;
                }
                fVar.m4981C(true);
                this.f33643d.remove(fVar);
                C9489b.m8513k(fVar.m4980D());
                if (this.f33643d.isEmpty()) {
                    this.f33641b.m5840a();
                }
                return 0L;
            }
        } else if (i > 0) {
            return j3 - j2;
        } else {
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
    }

    public final boolean m4946c(C10486f fVar) {
        C8298k.m12933e(fVar, "connection");
        if (C9489b.f30729h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        } else if (fVar.m4961p() || this.f33644e == 0) {
            fVar.m4981C(true);
            this.f33643d.remove(fVar);
            if (!this.f33643d.isEmpty()) {
                return true;
            }
            this.f33641b.m5840a();
            return true;
        } else {
            C10179d.m5831j(this.f33641b, this.f33642c, 0L, 2, null);
            return false;
        }
    }

    public final int m4945d(C10486f fVar, long j) {
        if (!C9489b.f30729h || Thread.holdsLock(fVar)) {
            List<Reference<C10482e>> n = fVar.m4963n();
            int i = 0;
            while (i < n.size()) {
                Reference<C10482e> reference = n.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    C2083h.f7326c.m35677g().mo35687l("A connection to " + fVar.m4951z().m10484a().m10569l() + " was leaked. Did you forget to close a response body?", ((C10482e.C10484b) reference).m4985a());
                    n.remove(i);
                    fVar.m4981C(true);
                    if (n.isEmpty()) {
                        fVar.m4982B(j - this.f33640a);
                        return 0;
                    }
                }
            }
            return n.size();
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

    public final void m4944e(C10486f fVar) {
        C8298k.m12933e(fVar, "connection");
        if (!C9489b.f30729h || Thread.holdsLock(fVar)) {
            this.f33643d.add(fVar);
            C10179d.m5831j(this.f33641b, this.f33642c, 0L, 2, null);
            return;
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
}
