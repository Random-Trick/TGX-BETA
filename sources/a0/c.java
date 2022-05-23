package a0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b0.f;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l0.c;

public final class c extends AbstractExecutorService implements ScheduledExecutorService {
    public static ThreadLocal<ScheduledExecutorService> f3b = new a();
    public final Handler f4a;

    public class a extends ThreadLocal<ScheduledExecutorService> {
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return a0.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public class b implements Callable<Void> {
        public final Runnable f5a;

        public b(Runnable runnable) {
            this.f5a = runnable;
        }

        public Void call() {
            this.f5a.run();
            return null;
        }
    }

    public static class RunnableScheduledFutureC0002c<V> implements RunnableScheduledFuture<V> {
        public final c7.a<V> M;
        public final AtomicReference<c.a<V>> f7a = new AtomicReference<>(null);
        public final long f8b;
        public final Callable<V> f9c;

        public class a implements c.AbstractC0147c<V> {
            public final Handler f10a;
            public final Callable f11b;

            public class RunnableC0003a implements Runnable {
                public RunnableC0003a() {
                }

                @Override
                public void run() {
                    if (RunnableScheduledFutureC0002c.this.f7a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f10a.removeCallbacks(RunnableScheduledFutureC0002c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f10a = handler;
                this.f11b = callable;
            }

            @Override
            public Object a(c.a<V> aVar) {
                aVar.a(new RunnableC0003a(), a0.a.a());
                RunnableScheduledFutureC0002c.this.f7a.set(aVar);
                return "HandlerScheduledFuture-" + this.f11b.toString();
            }
        }

        public RunnableScheduledFutureC0002c(Handler handler, long j10, Callable<V> callable) {
            this.f8b = j10;
            this.f9c = callable;
            this.M = l0.c.a(new a(handler, callable));
        }

        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override
        public boolean cancel(boolean z10) {
            return this.M.cancel(z10);
        }

        @Override
        public V get() {
            return this.M.get();
        }

        @Override
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f8b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public boolean isCancelled() {
            return this.M.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.M.isDone();
        }

        @Override
        public boolean isPeriodic() {
            return false;
        }

        @Override
        public void run() {
            c.a<V> andSet = this.f7a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f9c.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }

        @Override
        public V get(long j10, TimeUnit timeUnit) {
            return this.M.get(j10, timeUnit);
        }
    }

    public c(Handler handler) {
        this.f4a = handler;
    }

    public final RejectedExecutionException a() {
        return new RejectedExecutionException(this.f4a + " is shutting down");
    }

    @Override
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public void execute(Runnable runnable) {
        if (!this.f4a.post(runnable)) {
            throw a();
        }
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        RunnableScheduledFutureC0002c cVar = new RunnableScheduledFutureC0002c(this.f4a, uptimeMillis, callable);
        return this.f4a.postAtTime(cVar, uptimeMillis) ? cVar : f.g(a());
    }
}
