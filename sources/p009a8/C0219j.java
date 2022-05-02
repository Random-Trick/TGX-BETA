package p009a8;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p021b6.AbstractExecutorServiceC1274n;
import p163l5.C6378r;

public class C0219j extends AbstractExecutorServiceC1274n {
    public static final ThreadLocal<Deque<Runnable>> f694b = new ThreadLocal<>();
    public final ThreadPoolExecutor f695a;

    public C0219j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            @Override
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() {
                    @Override
                    public final void run() {
                        C0219j.m42076d(runnable);
                    }
                });
            }
        });
        this.f695a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void m42076d(Runnable runnable) {
        f694b.set(new ArrayDeque());
        runnable.run();
    }

    public static void m42075e(Deque<Runnable> deque, Runnable runnable) {
        C6378r.m20507k(deque);
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
    public final Object mo37823a() {
        return this.f695a;
    }

    @Override
    @RecentlyNonNull
    public final ExecutorService mo37807b() {
        return this.f695a;
    }

    @Override
    public final void execute(@RecentlyNonNull final Runnable runnable) {
        Deque<Runnable> deque = f694b.get();
        if (deque == null || deque.size() > 1) {
            this.f695a.execute(new Runnable() {
                @Override
                public final void run() {
                    C0219j.m42075e(C0219j.f694b.get(), runnable);
                }
            });
        } else {
            m42075e(deque, runnable);
        }
    }
}
