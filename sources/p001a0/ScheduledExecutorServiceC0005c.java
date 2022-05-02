package p001a0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
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
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;

public final class ScheduledExecutorServiceC0005c extends AbstractExecutorService implements ScheduledExecutorService {
    public static ThreadLocal<ScheduledExecutorService> f3b = new C0006a();
    public final Handler f4a;

    public class C0006a extends ThreadLocal<ScheduledExecutorService> {
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C0003a.m42608d();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC0005c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public class CallableC0007b implements Callable<Void> {
        public final Runnable f5a;

        public CallableC0007b(Runnable runnable) {
            this.f5a = runnable;
        }

        public Void call() {
            this.f5a.run();
            return null;
        }
    }

    public static class RunnableScheduledFutureC0008c<V> implements RunnableScheduledFuture<V> {
        public final AbstractFutureC1291a<V> f7M;
        public final AtomicReference<C6287c.C6288a<V>> f8a = new AtomicReference<>(null);
        public final long f9b;
        public final Callable<V> f10c;

        public class C0009a implements C6287c.AbstractC6290c<V> {
            public final Handler f11a;
            public final Callable f12b;

            public class RunnableC0010a implements Runnable {
                public RunnableC0010a() {
                }

                @Override
                public void run() {
                    if (RunnableScheduledFutureC0008c.this.f8a.getAndSet(null) != null) {
                        C0009a aVar = C0009a.this;
                        aVar.f11a.removeCallbacks(RunnableScheduledFutureC0008c.this);
                    }
                }
            }

            public C0009a(Handler handler, Callable callable) {
                this.f11a = handler;
                this.f12b = callable;
            }

            @Override
            public Object mo5520a(C6287c.C6288a<V> aVar) {
                aVar.m20718a(new RunnableC0010a(), C0003a.m42611a());
                RunnableScheduledFutureC0008c.this.f8a.set(aVar);
                return "HandlerScheduledFuture-" + this.f12b.toString();
            }
        }

        public RunnableScheduledFutureC0008c(Handler handler, long j, Callable<V> callable) {
            this.f9b = j;
            this.f10c = callable;
            this.f7M = C6287c.m20719a(new C0009a(handler, callable));
        }

        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override
        public boolean cancel(boolean z) {
            return this.f7M.cancel(z);
        }

        @Override
        public V get() {
            return this.f7M.get();
        }

        @Override
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f9b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public boolean isCancelled() {
            return this.f7M.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.f7M.isDone();
        }

        @Override
        public boolean isPeriodic() {
            return false;
        }

        @Override
        public void run() {
            C6287c.C6288a<V> andSet = this.f8a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m20716c(this.f10c.call());
                } catch (Exception e) {
                    andSet.m20713f(e);
                }
            }
        }

        @Override
        public V get(long j, TimeUnit timeUnit) {
            return this.f7M.get(j, timeUnit);
        }
    }

    public ScheduledExecutorServiceC0005c(Handler handler) {
        this.f4a = handler;
    }

    public final RejectedExecutionException m42604a() {
        return new RejectedExecutionException(this.f4a + " is shutting down");
    }

    @Override
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0005c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public void execute(Runnable runnable) {
        if (!this.f4a.post(runnable)) {
            throw m42604a();
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
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC0007b(runnable), j, timeUnit);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0005c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0005c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0005c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0005c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        RunnableScheduledFutureC0008c cVar = new RunnableScheduledFutureC0008c(this.f4a, uptimeMillis, callable);
        return this.f4a.postAtTime(cVar, uptimeMillis) ? cVar : C1111f.m38352g(m42604a());
    }
}
