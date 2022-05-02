package p009a8;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public class C0224o {
    public boolean f709b;
    public final Object f708a = new Object();
    public final Queue<C0212e0> f710c = new ArrayDeque();
    public final AtomicReference<Thread> f711d = new AtomicReference<>();

    public void m42062a(@RecentlyNonNull Executor executor, @RecentlyNonNull Runnable runnable) {
        synchronized (this.f708a) {
            if (this.f709b) {
                this.f710c.add(new C0212e0(executor, runnable, null));
                return;
            }
            this.f709b = true;
            m42058e(executor, runnable);
        }
    }

    public final void m42059d() {
        synchronized (this.f708a) {
            if (this.f710c.isEmpty()) {
                this.f709b = false;
                return;
            }
            C0212e0 remove = this.f710c.remove();
            m42058e(remove.f686a, remove.f687b);
        }
    }

    public final void m42058e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    C0224o oVar = C0224o.this;
                    Runnable runnable2 = runnable;
                    C0216g0 g0Var = new C0216g0(oVar, null);
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
            m42059d();
        }
    }
}
