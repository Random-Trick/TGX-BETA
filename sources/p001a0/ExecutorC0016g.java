package p001a0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p016b1.C1132h;

public final class ExecutorC0016g implements Executor {
    public final Executor f26b;
    public final Deque<Runnable> f25a = new ArrayDeque();
    public final RunnableC0018b f27c = new RunnableC0018b();
    public EnumC0019c f23M = EnumC0019c.IDLE;
    public long f24N = 0;

    public class RunnableC0017a implements Runnable {
        public final Runnable f28a;

        public RunnableC0017a(Runnable runnable) {
            this.f28a = runnable;
        }

        @Override
        public void run() {
            this.f28a.run();
        }
    }

    public final class RunnableC0018b implements Runnable {
        public RunnableC0018b() {
        }

        public final void m42597a() {
            throw new UnsupportedOperationException("Method not decompiled: p001a0.ExecutorC0016g.RunnableC0018b.m42597a():void");
        }

        @Override
        public void run() {
            try {
                m42597a();
            } catch (Error e) {
                synchronized (ExecutorC0016g.this.f25a) {
                    ExecutorC0016g.this.f23M = EnumC0019c.IDLE;
                    throw e;
                }
            }
        }
    }

    public enum EnumC0019c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC0016g(Executor executor) {
        this.f26b = (Executor) C1132h.m38322e(executor);
    }

    @Override
    public void execute(Runnable runnable) {
        EnumC0019c cVar;
        C1132h.m38322e(runnable);
        synchronized (this.f25a) {
            EnumC0019c cVar2 = this.f23M;
            if (!(cVar2 == EnumC0019c.RUNNING || cVar2 == (cVar = EnumC0019c.QUEUED))) {
                long j = this.f24N;
                RunnableC0017a aVar = new RunnableC0017a(runnable);
                this.f25a.add(aVar);
                EnumC0019c cVar3 = EnumC0019c.QUEUING;
                this.f23M = cVar3;
                boolean z = true;
                try {
                    this.f26b.execute(this.f27c);
                    if (this.f23M == cVar3) {
                        z = false;
                    }
                    if (!z) {
                        synchronized (this.f25a) {
                            if (this.f24N == j && this.f23M == cVar3) {
                                this.f23M = cVar;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f25a) {
                        EnumC0019c cVar4 = this.f23M;
                        if ((cVar4 != EnumC0019c.IDLE && cVar4 != EnumC0019c.QUEUING) || !this.f25a.removeLastOccurrence(aVar)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f25a.add(runnable);
        }
    }
}
