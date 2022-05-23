package ub;

import ia.q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ra.k;
import vb.b;
import zb.e;

public final class r {
    public Runnable f23920c;
    public ExecutorService f23921d;
    public int f23918a = 64;
    public int f23919b = 5;
    public final ArrayDeque<e.a> f23922e = new ArrayDeque<>();
    public final ArrayDeque<e.a> f23923f = new ArrayDeque<>();
    public final ArrayDeque<e> f23924g = new ArrayDeque<>();

    public final void a(e.a aVar) {
        e.a c10;
        k.e(aVar, "call");
        synchronized (this) {
            this.f23922e.add(aVar);
            if (!aVar.b().n() && (c10 = c(aVar.d())) != null) {
                aVar.e(c10);
            }
            q qVar = q.f14159a;
        }
        f();
    }

    public final synchronized ExecutorService b() {
        ExecutorService executorService;
        if (this.f23921d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f23921d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, b.I(b.f24817i + " Dispatcher", false));
        }
        executorService = this.f23921d;
        k.c(executorService);
        return executorService;
    }

    public final e.a c(String str) {
        Iterator<e.a> it = this.f23923f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (k.b(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f23922e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (k.b(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    public final <T> void d(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f23920c;
                q qVar = q.f14159a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!f() && runnable != null) {
            runnable.run();
        }
    }

    public final void e(e.a aVar) {
        k.e(aVar, "call");
        aVar.c().decrementAndGet();
        d(this.f23923f, aVar);
    }

    public final boolean f() {
        int i10;
        boolean z10;
        if (!b.f24816h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<e.a> it = this.f23922e.iterator();
                k.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a next = it.next();
                    if (this.f23923f.size() >= this.f23918a) {
                        break;
                    } else if (next.c().get() < this.f23919b) {
                        it.remove();
                        next.c().incrementAndGet();
                        k.d(next, "asyncCall");
                        arrayList.add(next);
                        this.f23923f.add(next);
                    }
                }
                z10 = g() > 0;
                q qVar = q.f14159a;
            }
            int size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                ((e.a) arrayList.get(i10)).a(b());
            }
            return z10;
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

    public final synchronized int g() {
        return this.f23923f.size() + this.f23924g.size();
    }
}
