package p2;

import f2.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class o {
    public static final String f20451f = j.f("WorkTimer");
    public final ThreadFactory f20452a;
    public final ScheduledExecutorService f20453b;
    public final Map<String, c> f20454c = new HashMap();
    public final Map<String, b> f20455d = new HashMap();
    public final Object f20456e = new Object();

    public class a implements ThreadFactory {
        public int f20457a = 0;

        public a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f20457a);
            this.f20457a = this.f20457a + 1;
            return newThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {
        public final o f20459a;
        public final String f20460b;

        public c(o oVar, String str) {
            this.f20459a = oVar;
            this.f20460b = str;
        }

        @Override
        public void run() {
            synchronized (this.f20459a.f20456e) {
                if (this.f20459a.f20454c.remove(this.f20460b) != null) {
                    b remove = this.f20459a.f20455d.remove(this.f20460b);
                    if (remove != null) {
                        remove.a(this.f20460b);
                    }
                } else {
                    j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f20460b), new Throwable[0]);
                }
            }
        }
    }

    public o() {
        a aVar = new a();
        this.f20452a = aVar;
        this.f20453b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.f20453b.isShutdown()) {
            this.f20453b.shutdownNow();
        }
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f20456e) {
            j.c().a(f20451f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f20454c.put(str, cVar);
            this.f20455d.put(str, bVar);
            this.f20453b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f20456e) {
            if (this.f20454c.remove(str) != null) {
                j.c().a(f20451f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f20455d.remove(str);
            }
        }
    }
}
