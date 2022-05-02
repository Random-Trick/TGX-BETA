package p278tb;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p107ha.C5060q;
import p290ub.C9489b;
import p348yb.C10482e;
import qa.C8298k;

public final class C9110r {
    public Runnable f29316c;
    public ExecutorService f29317d;
    public int f29314a = 64;
    public int f29315b = 5;
    public final ArrayDeque<C10482e.RunnableC10483a> f29318e = new ArrayDeque<>();
    public final ArrayDeque<C10482e.RunnableC10483a> f29319f = new ArrayDeque<>();
    public final ArrayDeque<C10482e> f29320g = new ArrayDeque<>();

    public final void m10418a(C10482e.RunnableC10483a aVar) {
        C10482e.RunnableC10483a c;
        C8298k.m12934e(aVar, "call");
        synchronized (this) {
            this.f29318e.add(aVar);
            if (!aVar.m4989b().m5003n() && (c = m10416c(aVar.m4987d())) != null) {
                aVar.m4986e(c);
            }
            C5060q qVar = C5060q.f17066a;
        }
        m10413f();
    }

    public final synchronized ExecutorService m10417b() {
        ExecutorService executorService;
        if (this.f29317d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f29317d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, C9489b.m8536I(C9489b.f30727i + " Dispatcher", false));
        }
        executorService = this.f29317d;
        C8298k.m12936c(executorService);
        return executorService;
    }

    public final C10482e.RunnableC10483a m10416c(String str) {
        Iterator<C10482e.RunnableC10483a> it = this.f29319f.iterator();
        while (it.hasNext()) {
            C10482e.RunnableC10483a next = it.next();
            if (C8298k.m12937b(next.m4987d(), str)) {
                return next;
            }
        }
        Iterator<C10482e.RunnableC10483a> it2 = this.f29318e.iterator();
        while (it2.hasNext()) {
            C10482e.RunnableC10483a next2 = it2.next();
            if (C8298k.m12937b(next2.m4987d(), str)) {
                return next2;
            }
        }
        return null;
    }

    public final <T> void m10415d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f29316c;
                C5060q qVar = C5060q.f17066a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m10413f() && runnable != null) {
            runnable.run();
        }
    }

    public final void m10414e(C10482e.RunnableC10483a aVar) {
        C8298k.m12934e(aVar, "call");
        aVar.m4988c().decrementAndGet();
        m10415d(this.f29319f, aVar);
    }

    public final boolean m10413f() {
        int i;
        boolean z;
        if (!C9489b.f30726h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<C10482e.RunnableC10483a> it = this.f29318e.iterator();
                C8298k.m12935d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C10482e.RunnableC10483a next = it.next();
                    if (this.f29319f.size() >= this.f29314a) {
                        break;
                    } else if (next.m4988c().get() < this.f29315b) {
                        it.remove();
                        next.m4988c().incrementAndGet();
                        C8298k.m12935d(next, "asyncCall");
                        arrayList.add(next);
                        this.f29319f.add(next);
                    }
                }
                z = m10412g() > 0;
                C5060q qVar = C5060q.f17066a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((C10482e.RunnableC10483a) arrayList.get(i)).m4990a(m10417b());
            }
            return z;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final synchronized int m10412g() {
        return this.f29319f.size() + this.f29320g.size();
    }
}
