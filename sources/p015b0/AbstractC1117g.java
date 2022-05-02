package p015b0;

import androidx.camera.core.C0662u1;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;

public abstract class AbstractC1117g<V> implements AbstractFutureC1291a<V> {

    public static class C1118a<V> extends AbstractC1117g<V> {
        public final Throwable f4316a;

        public C1118a(Throwable th) {
            this.f4316a = th;
        }

        @Override
        public V get() {
            throw new ExecutionException(this.f4316a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f4316a + "]]";
        }
    }

    public static final class ScheduledFutureC1119b<V> extends C1118a<V> implements ScheduledFuture<V> {
        public ScheduledFutureC1119b(Throwable th) {
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

    public static final class C1120c<V> extends AbstractC1117g<V> {
        public static final AbstractC1117g<Object> f4317b = new C1120c(null);
        public final V f4318a;

        public C1120c(V v) {
            this.f4318a = v;
        }

        @Override
        public V get() {
            return this.f4318a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f4318a + "]]";
        }
    }

    public static <V> AbstractFutureC1291a<V> m38342b() {
        return C1120c.f4317b;
    }

    @Override
    public void mo13372a(Runnable runnable, Executor executor) {
        C1132h.m38322e(runnable);
        C1132h.m38322e(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C0662u1.m40650d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override
    public boolean cancel(boolean z) {
        return false;
    }

    @Override
    public abstract V get();

    @Override
    public V get(long j, TimeUnit timeUnit) {
        C1132h.m38322e(timeUnit);
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
