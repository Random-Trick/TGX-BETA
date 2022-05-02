package p215p2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p071f2.AbstractC4234j;

public class C8014o {
    public static final String f26091f = AbstractC4234j.m28360f("WorkTimer");
    public final ThreadFactory f26092a;
    public final ScheduledExecutorService f26093b;
    public final Map<String, RunnableC8017c> f26094c = new HashMap();
    public final Map<String, AbstractC8016b> f26095d = new HashMap();
    public final Object f26096e = new Object();

    public class ThreadFactoryC8015a implements ThreadFactory {
        public int f26097a = 0;

        public ThreadFactoryC8015a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f26097a);
            this.f26097a = this.f26097a + 1;
            return newThread;
        }
    }

    public interface AbstractC8016b {
        void mo13789a(String str);
    }

    public static class RunnableC8017c implements Runnable {
        public final C8014o f26099a;
        public final String f26100b;

        public RunnableC8017c(C8014o oVar, String str) {
            this.f26099a = oVar;
            this.f26100b = str;
        }

        @Override
        public void run() {
            synchronized (this.f26099a.f26096e) {
                if (this.f26099a.f26094c.remove(this.f26100b) != null) {
                    AbstractC8016b remove = this.f26099a.f26095d.remove(this.f26100b);
                    if (remove != null) {
                        remove.mo13789a(this.f26100b);
                    }
                } else {
                    AbstractC4234j.m28362c().mo28359a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f26100b), new Throwable[0]);
                }
            }
        }
    }

    public C8014o() {
        ThreadFactoryC8015a aVar = new ThreadFactoryC8015a();
        this.f26092a = aVar;
        this.f26093b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void m13792a() {
        if (!this.f26093b.isShutdown()) {
            this.f26093b.shutdownNow();
        }
    }

    public void m13791b(String str, long j, AbstractC8016b bVar) {
        synchronized (this.f26096e) {
            AbstractC4234j.m28362c().mo28359a(f26091f, String.format("Starting timer for %s", str), new Throwable[0]);
            m13790c(str);
            RunnableC8017c cVar = new RunnableC8017c(this, str);
            this.f26094c.put(str, cVar);
            this.f26095d.put(str, bVar);
            this.f26093b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void m13790c(String str) {
        synchronized (this.f26096e) {
            if (this.f26094c.remove(str) != null) {
                AbstractC4234j.m28362c().mo28359a(f26091f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f26095d.remove(str);
            }
        }
    }
}
