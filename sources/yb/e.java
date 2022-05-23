package yb;

import ia.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ra.g;
import ra.k;

public final class e {
    public static final Logger f26692i;
    public boolean f26695b;
    public long f26696c;
    public final a f26700g;
    public static final b f26693j = new b(null);
    public static final e f26691h = new e(new c(vb.b.I(vb.b.f24817i + " TaskRunner", true)));
    public int f26694a = 10000;
    public final List<yb.d> f26697d = new ArrayList();
    public final List<yb.d> f26698e = new ArrayList();
    public final Runnable f26699f = new d();

    public interface a {
        void a(e eVar);

        void b(e eVar, long j10);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final Logger a() {
            return e.f26692i;
        }
    }

    public static final class c implements a {
        public final ThreadPoolExecutor f26701a;

        public c(ThreadFactory threadFactory) {
            k.e(threadFactory, "threadFactory");
            this.f26701a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override
        public void a(e eVar) {
            k.e(eVar, "taskRunner");
            eVar.notify();
        }

        @Override
        public void b(e eVar, long j10) {
            k.e(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        @Override
        public long c() {
            return System.nanoTime();
        }

        @Override
        public void execute(Runnable runnable) {
            k.e(runnable, "runnable");
            this.f26701a.execute(runnable);
        }
    }

    public static final class d implements Runnable {
        public d() {
        }

        @Override
        public void run() {
            yb.a d10;
            while (true) {
                synchronized (e.this) {
                    d10 = e.this.d();
                }
                if (d10 != null) {
                    yb.d d11 = d10.d();
                    k.c(d11);
                    long j10 = -1;
                    boolean isLoggable = e.f26693j.a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j10 = d11.h().g().c();
                        yb.b.c(d10, d11, "starting");
                    }
                    try {
                        e.this.j(d10);
                        q qVar = q.f14159a;
                        if (isLoggable) {
                            long c10 = d11.h().g().c() - j10;
                            yb.b.c(d10, d11, "finished run in " + yb.b.b(c10));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long c11 = d11.h().g().c() - j10;
                            yb.b.c(d10, d11, "failed a run in " + yb.b.b(c11));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        k.d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f26692i = logger;
    }

    public e(a aVar) {
        k.e(aVar, "backend");
        this.f26700g = aVar;
    }

    public final void c(yb.a aVar, long j10) {
        if (!vb.b.f24816h || Thread.holdsLock(this)) {
            yb.d d10 = aVar.d();
            k.c(d10);
            if (d10.c() == aVar) {
                boolean d11 = d10.d();
                d10.m(false);
                d10.l(null);
                this.f26697d.remove(d10);
                if (j10 != -1 && !d11 && !d10.g()) {
                    d10.k(aVar, j10, true);
                }
                if (!d10.e().isEmpty()) {
                    this.f26698e.add(d10);
                    return;
                }
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
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final yb.a d() {
        boolean z10;
        if (!vb.b.f24816h || Thread.holdsLock(this)) {
            while (!this.f26698e.isEmpty()) {
                long c10 = this.f26700g.c();
                long j10 = Long.MAX_VALUE;
                Iterator<yb.d> it = this.f26698e.iterator();
                yb.a aVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    yb.a aVar2 = it.next().e().get(0);
                    long max = Math.max(0L, aVar2.c() - c10);
                    if (max > 0) {
                        j10 = Math.min(max, j10);
                    } else if (aVar != null) {
                        z10 = true;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                }
                if (aVar != null) {
                    e(aVar);
                    if (z10 || (!this.f26695b && (!this.f26698e.isEmpty()))) {
                        this.f26700g.execute(this.f26699f);
                    }
                    return aVar;
                } else if (this.f26695b) {
                    if (j10 < this.f26696c - c10) {
                        this.f26700g.a(this);
                    }
                    return null;
                } else {
                    this.f26695b = true;
                    this.f26696c = c10 + j10;
                    try {
                        try {
                            this.f26700g.b(this, j10);
                        } catch (InterruptedException unused) {
                            f();
                        }
                    } finally {
                        this.f26695b = false;
                    }
                }
            }
            return null;
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

    public final void e(yb.a aVar) {
        if (!vb.b.f24816h || Thread.holdsLock(this)) {
            aVar.g(-1L);
            yb.d d10 = aVar.d();
            k.c(d10);
            d10.e().remove(aVar);
            this.f26698e.remove(d10);
            d10.l(aVar);
            this.f26697d.add(d10);
            return;
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

    public final void f() {
        for (int size = this.f26697d.size() - 1; size >= 0; size--) {
            this.f26697d.get(size).b();
        }
        for (int size2 = this.f26698e.size() - 1; size2 >= 0; size2--) {
            yb.d dVar = this.f26698e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f26698e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f26700g;
    }

    public final void h(yb.d dVar) {
        k.e(dVar, "taskQueue");
        if (!vb.b.f24816h || Thread.holdsLock(this)) {
            if (dVar.c() == null) {
                if (!dVar.e().isEmpty()) {
                    vb.b.a(this.f26698e, dVar);
                } else {
                    this.f26698e.remove(dVar);
                }
            }
            if (this.f26695b) {
                this.f26700g.a(this);
            } else {
                this.f26700g.execute(this.f26699f);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    public final yb.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f26694a;
            this.f26694a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new yb.d(this, sb2.toString());
    }

    public final void j(yb.a aVar) {
        if (!vb.b.f24816h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            k.d(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.b());
            try {
                long f10 = aVar.f();
                synchronized (this) {
                    c(aVar, f10);
                    q qVar = q.f14159a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    c(aVar, -1L);
                    q qVar2 = q.f14159a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            k.d(currentThread2, "Thread.currentThread()");
            sb2.append(currentThread2.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }
}
