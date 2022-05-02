package p281u1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class ExecutorC9434l implements Executor {
    public final Executor f30555a;
    public final ArrayDeque<Runnable> f30556b = new ArrayDeque<>();
    public Runnable f30557c;

    public class RunnableC9435a implements Runnable {
        public final Runnable f30558a;

        public RunnableC9435a(Runnable runnable) {
            this.f30558a = runnable;
        }

        @Override
        public void run() {
            try {
                this.f30558a.run();
            } finally {
                ExecutorC9434l.this.m8671a();
            }
        }
    }

    public ExecutorC9434l(Executor executor) {
        this.f30555a = executor;
    }

    public synchronized void m8671a() {
        Runnable poll = this.f30556b.poll();
        this.f30557c = poll;
        if (poll != null) {
            this.f30555a.execute(poll);
        }
    }

    @Override
    public synchronized void execute(Runnable runnable) {
        this.f30556b.offer(new RunnableC9435a(runnable));
        if (this.f30557c == null) {
            m8671a();
        }
    }
}
