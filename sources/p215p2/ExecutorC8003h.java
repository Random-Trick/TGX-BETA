package p215p2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class ExecutorC8003h implements Executor {
    public volatile Runnable f26056M;
    public final Executor f26058b;
    public final ArrayDeque<RunnableC8004a> f26057a = new ArrayDeque<>();
    public final Object f26059c = new Object();

    public static class RunnableC8004a implements Runnable {
        public final ExecutorC8003h f26060a;
        public final Runnable f26061b;

        public RunnableC8004a(ExecutorC8003h hVar, Runnable runnable) {
            this.f26060a = hVar;
            this.f26061b = runnable;
        }

        @Override
        public void run() {
            try {
                this.f26061b.run();
            } finally {
                this.f26060a.m13796b();
            }
        }
    }

    public ExecutorC8003h(Executor executor) {
        this.f26058b = executor;
    }

    public boolean m13797a() {
        boolean z;
        synchronized (this.f26059c) {
            z = !this.f26057a.isEmpty();
        }
        return z;
    }

    public void m13796b() {
        synchronized (this.f26059c) {
            RunnableC8004a poll = this.f26057a.poll();
            this.f26056M = poll;
            if (poll != null) {
                this.f26058b.execute(this.f26056M);
            }
        }
    }

    @Override
    public void execute(Runnable runnable) {
        synchronized (this.f26059c) {
            this.f26057a.add(new RunnableC8004a(this, runnable));
            if (this.f26056M == null) {
                m13796b();
            }
        }
    }
}
