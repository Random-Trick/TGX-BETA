package p215p2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p071f2.AbstractC4234j;

public class C8014o {
    public static final String f26094f = AbstractC4234j.m28362f("WorkTimer");
    public final ThreadFactory f26095a;
    public final ScheduledExecutorService f26096b;
    public final Map<String, RunnableC8017c> f26097c = new HashMap();
    public final Map<String, AbstractC8016b> f26098d = new HashMap();
    public final Object f26099e = new Object();

    public class ThreadFactoryC8015a implements ThreadFactory {
        public int f26100a = 0;

        public ThreadFactoryC8015a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f26100a);
            this.f26100a = this.f26100a + 1;
            return newThread;
        }
    }

    public interface AbstractC8016b {
        void mo13788a(String str);
    }

    public static class RunnableC8017c implements Runnable {
        public final C8014o f26102a;
        public final String f26103b;

        public RunnableC8017c(C8014o oVar, String str) {
            this.f26102a = oVar;
            this.f26103b = str;
        }

        @Override
        public void run() {
            synchronized (this.f26102a.f26099e) {
                if (this.f26102a.f26097c.remove(this.f26103b) != null) {
                    AbstractC8016b remove = this.f26102a.f26098d.remove(this.f26103b);
                    if (remove != null) {
                        remove.mo13788a(this.f26103b);
                    }
                } else {
                    AbstractC4234j.m28364c().mo28361a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f26103b), new Throwable[0]);
                }
            }
        }
    }

    public C8014o() {
        ThreadFactoryC8015a aVar = new ThreadFactoryC8015a();
        this.f26095a = aVar;
        this.f26096b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void m13791a() {
        if (!this.f26096b.isShutdown()) {
            this.f26096b.shutdownNow();
        }
    }

    public void m13790b(String str, long j, AbstractC8016b bVar) {
        synchronized (this.f26099e) {
            AbstractC4234j.m28364c().mo28361a(f26094f, String.format("Starting timer for %s", str), new Throwable[0]);
            m13789c(str);
            RunnableC8017c cVar = new RunnableC8017c(this, str);
            this.f26097c.put(str, cVar);
            this.f26098d.put(str, bVar);
            this.f26096b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void m13789c(String str) {
        synchronized (this.f26099e) {
            if (this.f26097c.remove(str) != null) {
                AbstractC4234j.m28364c().mo28361a(f26094f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f26098d.remove(str);
            }
        }
    }
}
