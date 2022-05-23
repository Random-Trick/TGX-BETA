package c6;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class n extends e implements ExecutorService {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return b().awaitTermination(j10, timeUnit);
    }

    public abstract ExecutorService b();

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return b().invokeAll(collection);
    }

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) b().invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return b().isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return b().isTerminated();
    }

    @Override
    public final void shutdown() {
        b().shutdown();
    }

    @Override
    public final List<Runnable> shutdownNow() {
        return b().shutdownNow();
    }

    @Override
    public final Future<?> submit(Runnable runnable) {
        return b().submit(runnable);
    }

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return b().invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) b().invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return b().submit(runnable, t10);
    }

    @Override
    public final <T> Future<T> submit(Callable<T> callable) {
        return b().submit(callable);
    }
}
