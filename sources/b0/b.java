package b0;

import b1.h;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class b<I, O> extends d<O> implements Runnable {
    public final BlockingQueue<Boolean> M = new LinkedBlockingQueue(1);
    public final CountDownLatch N = new CountDownLatch(1);
    public c7.a<? extends I> O;
    public volatile c7.a<? extends O> P;
    public b0.a<? super I, ? extends O> f3666c;

    public class a implements Runnable {
        public final c7.a f3667a;

        public a(c7.a aVar) {
            this.f3667a = aVar;
        }

        @Override
        public void run() {
            try {
                try {
                    b.this.c(f.e(this.f3667a));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.P = null;
                    return;
                } catch (ExecutionException e10) {
                    b.this.d(e10.getCause());
                }
                b.this.P = null;
            } catch (Throwable th) {
                b.this.P = null;
                throw th;
            }
        }
    }

    public b(b0.a<? super I, ? extends O> aVar, c7.a<? extends I> aVar2) {
        this.f3666c = (b0.a) h.e(aVar);
        this.O = (c7.a) h.e(aVar2);
    }

    @Override
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        h(this.M, Boolean.valueOf(z10));
        g(this.O, z10);
        g(this.P, z10);
        return true;
    }

    public final void g(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    @Override
    public O get() {
        if (!isDone()) {
            c7.a<? extends I> aVar = this.O;
            if (aVar != null) {
                aVar.get();
            }
            this.N.await();
            c7.a<? extends O> aVar2 = this.P;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    public final <E> void h(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final <E> E i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override
    public void run() {
        c7.a<? extends O> apply;
        try {
            try {
                try {
                    try {
                        apply = this.f3666c.apply(f.e(this.O));
                        this.P = apply;
                    } catch (Error e10) {
                        d(e10);
                    } catch (UndeclaredThrowableException e11) {
                        d(e11.getCause());
                    }
                } catch (Throwable th) {
                    this.f3666c = null;
                    this.O = null;
                    this.N.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                d(e12.getCause());
            }
        } catch (Exception e13) {
            d(e13);
        }
        if (isCancelled()) {
            apply.cancel(((Boolean) i(this.M)).booleanValue());
            this.P = null;
            this.f3666c = null;
            this.O = null;
            this.N.countDown();
            return;
        }
        apply.a(new a(apply), a0.a.a());
        this.f3666c = null;
        this.O = null;
        this.N.countDown();
    }

    @Override
    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            c7.a<? extends I> aVar = this.O;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.N.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
                c7.a<? extends O> aVar2 = this.P;
                if (aVar2 != null) {
                    aVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
