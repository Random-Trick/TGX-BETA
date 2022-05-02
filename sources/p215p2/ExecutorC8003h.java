package p215p2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class ExecutorC8003h implements Executor {
    public volatile Runnable f26053M;
    public final Executor f26055b;
    public final ArrayDeque<RunnableC8004a> f26054a = new ArrayDeque<>();
    public final Object f26056c = new Object();

    public static class RunnableC8004a implements Runnable {
        public final ExecutorC8003h f26057a;
        public final Runnable f26058b;

        public RunnableC8004a(ExecutorC8003h hVar, Runnable runnable) {
            this.f26057a = hVar;
            this.f26058b = runnable;
        }

        @Override
        public void run() {
            try {
                this.f26058b.run();
            } finally {
                this.f26057a.m13797b();
            }
        }
    }

    public ExecutorC8003h(Executor executor) {
        this.f26055b = executor;
    }

    public boolean m13798a() {
        boolean z;
        synchronized (this.f26056c) {
            z = !this.f26054a.isEmpty();
        }
        return z;
    }

    public void m13797b() {
        synchronized (this.f26056c) {
            RunnableC8004a poll = this.f26054a.poll();
            this.f26053M = poll;
            if (poll != null) {
                this.f26055b.execute(this.f26053M);
            }
        }
    }

    @Override
    public void execute(Runnable runnable) {
        synchronized (this.f26056c) {
            this.f26054a.add(new RunnableC8004a(this, runnable));
            if (this.f26053M == null) {
                m13797b();
            }
        }
    }
}
