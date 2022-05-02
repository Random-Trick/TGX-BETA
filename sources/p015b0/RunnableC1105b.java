package p015b0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001a0.C0003a;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;

public class RunnableC1105b<I, O> extends C1108d<O> implements Runnable {
    public final BlockingQueue<Boolean> f4298M = new LinkedBlockingQueue(1);
    public final CountDownLatch f4299N = new CountDownLatch(1);
    public AbstractFutureC1291a<? extends I> f4300O;
    public volatile AbstractFutureC1291a<? extends O> f4301P;
    public AbstractC1104a<? super I, ? extends O> f4302c;

    public class RunnableC1106a implements Runnable {
        public final AbstractFutureC1291a f4303a;

        public RunnableC1106a(AbstractFutureC1291a aVar) {
            this.f4303a = aVar;
        }

        @Override
        public void run() {
            try {
                try {
                    RunnableC1105b.this.m38365c(C1111f.m38357e(this.f4303a));
                } catch (CancellationException unused) {
                    RunnableC1105b.this.cancel(false);
                    RunnableC1105b.this.f4301P = null;
                    return;
                } catch (ExecutionException e) {
                    RunnableC1105b.this.m38364d(e.getCause());
                }
                RunnableC1105b.this.f4301P = null;
            } catch (Throwable th) {
                RunnableC1105b.this.f4301P = null;
                throw th;
            }
        }
    }

    public RunnableC1105b(AbstractC1104a<? super I, ? extends O> aVar, AbstractFutureC1291a<? extends I> aVar2) {
        this.f4302c = (AbstractC1104a) C1132h.m38325e(aVar);
        this.f4300O = (AbstractFutureC1291a) C1132h.m38325e(aVar2);
    }

    @Override
    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        m38368h(this.f4298M, Boolean.valueOf(z));
        m38369g(this.f4300O, z);
        m38369g(this.f4301P, z);
        return true;
    }

    public final void m38369g(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override
    public O get() {
        if (!isDone()) {
            AbstractFutureC1291a<? extends I> aVar = this.f4300O;
            if (aVar != null) {
                aVar.get();
            }
            this.f4299N.await();
            AbstractFutureC1291a<? extends O> aVar2 = this.f4301P;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    public final <E> void m38368h(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final <E> E m38367i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override
    public void run() {
        AbstractFutureC1291a<? extends O> apply;
        try {
            try {
                try {
                    try {
                        apply = this.f4302c.apply(C1111f.m38357e(this.f4300O));
                        this.f4301P = apply;
                    } catch (Error e) {
                        m38364d(e);
                    } catch (UndeclaredThrowableException e2) {
                        m38364d(e2.getCause());
                    }
                } catch (Throwable th) {
                    this.f4302c = null;
                    this.f4300O = null;
                    this.f4299N.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                m38364d(e3.getCause());
            }
        } catch (Exception e4) {
            m38364d(e4);
        }
        if (isCancelled()) {
            apply.cancel(((Boolean) m38367i(this.f4298M)).booleanValue());
            this.f4301P = null;
            this.f4302c = null;
            this.f4300O = null;
            this.f4299N.countDown();
            return;
        }
        apply.mo13371a(new RunnableC1106a(apply), C0003a.m42614a());
        this.f4302c = null;
        this.f4300O = null;
        this.f4299N.countDown();
    }

    @Override
    public O get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            AbstractFutureC1291a<? extends I> aVar = this.f4300O;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f4299N.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                AbstractFutureC1291a<? extends O> aVar2 = this.f4301P;
                if (aVar2 != null) {
                    aVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
