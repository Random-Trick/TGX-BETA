package a0;

import b1.h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class g implements Executor {
    public final Executor f23b;
    public final Deque<Runnable> f22a = new ArrayDeque();
    public final b f24c = new b();
    public c M = c.IDLE;
    public long N = 0;

    public class a implements Runnable {
        public final Runnable f25a;

        public a(Runnable runnable) {
            this.f25a = runnable;
        }

        @Override
        public void run() {
            this.f25a.run();
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        public final void a() {
            throw new UnsupportedOperationException("Method not decompiled: a0.g.b.a():void");
        }

        @Override
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (g.this.f22a) {
                    g.this.M = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public g(Executor executor) {
        this.f23b = (Executor) h.e(executor);
    }

    @Override
    public void execute(Runnable runnable) {
        c cVar;
        h.e(runnable);
        synchronized (this.f22a) {
            c cVar2 = this.M;
            if (!(cVar2 == c.RUNNING || cVar2 == (cVar = c.QUEUED))) {
                long j10 = this.N;
                a aVar = new a(runnable);
                this.f22a.add(aVar);
                c cVar3 = c.QUEUING;
                this.M = cVar3;
                boolean z10 = true;
                try {
                    this.f23b.execute(this.f24c);
                    if (this.M == cVar3) {
                        z10 = false;
                    }
                    if (!z10) {
                        synchronized (this.f22a) {
                            if (this.N == j10 && this.M == cVar3) {
                                this.M = cVar;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f22a) {
                        c cVar4 = this.M;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f22a.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f22a.add(runnable);
        }
    }
}
