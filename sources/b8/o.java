package b8;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public class o {
    public boolean f4049b;
    public final Object f4048a = new Object();
    public final Queue<e0> f4050c = new ArrayDeque();
    public final AtomicReference<Thread> f4051d = new AtomicReference<>();

    public void a(@RecentlyNonNull Executor executor, @RecentlyNonNull Runnable runnable) {
        synchronized (this.f4048a) {
            if (this.f4049b) {
                this.f4050c.add(new e0(executor, runnable, null));
                return;
            }
            this.f4049b = true;
            e(executor, runnable);
        }
    }

    public final void d() {
        synchronized (this.f4048a) {
            if (this.f4050c.isEmpty()) {
                this.f4049b = false;
                return;
            }
            e0 remove = this.f4050c.remove();
            e(remove.f4030a, remove.f4031b);
        }
    }

    public final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    o oVar = o.this;
                    Runnable runnable2 = runnable;
                    g0 g0Var = new g0(oVar, null);
                    try {
                        runnable2.run();
                        g0Var.close();
                    } catch (Throwable th) {
                        try {
                            g0Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }
}
