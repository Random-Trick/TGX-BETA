package b0;

import androidx.camera.core.t1;
import b1.h;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class g<V> implements c7.a<V> {

    public static class a<V> extends g<V> {
        public final Throwable f3680a;

        public a(Throwable th) {
            this.f3680a = th;
        }

        @Override
        public V get() {
            throw new ExecutionException(this.f3680a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f3680a + "]]";
        }
    }

    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th) {
            super(th);
        }

        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class c<V> extends g<V> {
        public static final g<Object> f3681b = new c(null);
        public final V f3682a;

        public c(V v10) {
            this.f3682a = v10;
        }

        @Override
        public V get() {
            return this.f3682a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f3682a + "]]";
        }
    }

    public static <V> c7.a<V> b() {
        return c.f3681b;
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        h.e(runnable);
        h.e(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            t1.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override
    public abstract V get();

    @Override
    public V get(long j10, TimeUnit timeUnit) {
        h.e(timeUnit);
        return get();
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }
}
