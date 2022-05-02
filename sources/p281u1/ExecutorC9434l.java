package p281u1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class ExecutorC9434l implements Executor {
    public final Executor f30558a;
    public final ArrayDeque<Runnable> f30559b = new ArrayDeque<>();
    public Runnable f30560c;

    public class RunnableC9435a implements Runnable {
        public final Runnable f30561a;

        public RunnableC9435a(Runnable runnable) {
            this.f30561a = runnable;
        }

        @Override
        public void run() {
            try {
                this.f30561a.run();
            } finally {
                ExecutorC9434l.this.m8671a();
            }
        }
    }

    public ExecutorC9434l(Executor executor) {
        this.f30558a = executor;
    }

    public synchronized void m8671a() {
        Runnable poll = this.f30559b.poll();
        this.f30560c = poll;
        if (poll != null) {
            this.f30558a.execute(poll);
        }
    }

    @Override
    public synchronized void execute(Runnable runnable) {
        this.f30559b.offer(new RunnableC9435a(runnable));
        if (this.f30560c == null) {
            m8671a();
        }
    }
}
