package b8;

import androidx.annotation.RecentlyNonNull;
import c6.n;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m5.r;

public class j extends n {
    public static final ThreadLocal<Deque<Runnable>> f4038b = new ThreadLocal<>();
    public final ThreadPoolExecutor f4039a;

    public j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            @Override
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() {
                    @Override
                    public final void run() {
                        j.d(runnable);
                    }
                });
            }
        });
        this.f4039a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void d(Runnable runnable) {
        f4038b.set(new ArrayDeque());
        runnable.run();
    }

    public static void e(Deque<Runnable> deque, Runnable runnable) {
        r.k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override
    @RecentlyNonNull
    public final Object a() {
        return this.f4039a;
    }

    @Override
    @RecentlyNonNull
    public final ExecutorService b() {
        return this.f4039a;
    }

    @Override
    public final void execute(@RecentlyNonNull final Runnable runnable) {
        Deque<Runnable> deque = f4038b.get();
        if (deque == null || deque.size() > 1) {
            this.f4039a.execute(new Runnable() {
                @Override
                public final void run() {
                    j.e(j.f4038b.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }
}
