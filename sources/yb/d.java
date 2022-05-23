package yb;

import ia.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import ra.k;
import vb.b;

public final class d {
    public boolean f26685a;
    public a f26686b;
    public final List<a> f26687c = new ArrayList();
    public boolean f26688d;
    public final e f26689e;
    public final String f26690f;

    public d(e eVar, String str) {
        k.e(eVar, "taskRunner");
        k.e(str, "name");
        this.f26689e = eVar;
        this.f26690f = str;
    }

    public static void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (!b.f24816h || !Thread.holdsLock(this)) {
            synchronized (this.f26689e) {
                if (b()) {
                    this.f26689e.h(this);
                }
                q qVar = q.f14159a;
            }
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

    public final boolean b() {
        a aVar = this.f26686b;
        if (aVar != null) {
            k.c(aVar);
            if (aVar.a()) {
                this.f26688d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f26687c.size() - 1; size >= 0; size--) {
            if (this.f26687c.get(size).a()) {
                a aVar2 = this.f26687c.get(size);
                if (e.f26693j.a().isLoggable(Level.FINE)) {
                    b.a(aVar2, this, "canceled");
                }
                this.f26687c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f26686b;
    }

    public final boolean d() {
        return this.f26688d;
    }

    public final List<a> e() {
        return this.f26687c;
    }

    public final String f() {
        return this.f26690f;
    }

    public final boolean g() {
        return this.f26685a;
    }

    public final e h() {
        return this.f26689e;
    }

    public final void i(a aVar, long j10) {
        k.e(aVar, "task");
        synchronized (this.f26689e) {
            if (!this.f26685a) {
                if (k(aVar, j10, false)) {
                    this.f26689e.h(this);
                }
                q qVar = q.f14159a;
            } else if (aVar.a()) {
                if (e.f26693j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f26693j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a aVar, long j10, boolean z10) {
        String str;
        k.e(aVar, "task");
        aVar.e(this);
        long c10 = this.f26689e.g().c();
        long j11 = c10 + j10;
        int indexOf = this.f26687c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (e.f26693j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f26687c.remove(indexOf);
        }
        aVar.g(j11);
        if (e.f26693j.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + b.b(j11 - c10);
            } else {
                str = "scheduled after " + b.b(j11 - c10);
            }
            b.a(aVar, this, str);
        }
        Iterator<a> it = this.f26687c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().c() - c10 > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f26687c.size();
        }
        this.f26687c.add(i10, aVar);
        return i10 == 0;
    }

    public final void l(a aVar) {
        this.f26686b = aVar;
    }

    public final void m(boolean z10) {
        this.f26688d = z10;
    }

    public final void n() {
        if (!b.f24816h || !Thread.holdsLock(this)) {
            synchronized (this.f26689e) {
                this.f26685a = true;
                if (b()) {
                    this.f26689e.h(this);
                }
                q qVar = q.f14159a;
            }
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

    public String toString() {
        return this.f26690f;
    }
}
