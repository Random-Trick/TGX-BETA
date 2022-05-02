package p021b6;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class AbstractExecutorServiceC1274n extends AbstractC1256e implements ExecutorService {
    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return mo37804b().awaitTermination(j, timeUnit);
    }

    public abstract ExecutorService mo37804b();

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return mo37804b().invokeAll(collection);
    }

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) mo37804b().invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return mo37804b().isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return mo37804b().isTerminated();
    }

    @Override
    public final void shutdown() {
        mo37804b().shutdown();
    }

    @Override
    public final List<Runnable> shutdownNow() {
        return mo37804b().shutdownNow();
    }

    @Override
    public final Future<?> submit(Runnable runnable) {
        return mo37804b().submit(runnable);
    }

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return mo37804b().invokeAll(collection, j, timeUnit);
    }

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) mo37804b().invokeAny(collection, j, timeUnit);
    }

    @Override
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return mo37804b().submit(runnable, t);
    }

    @Override
    public final <T> Future<T> submit(Callable<T> callable) {
        return mo37804b().submit(callable);
    }
}
