package u1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class l implements Executor {
    public final Executor f23532a;
    public final ArrayDeque<Runnable> f23533b = new ArrayDeque<>();
    public Runnable f23534c;

    public class a implements Runnable {
        public final Runnable f23535a;

        public a(Runnable runnable) {
            this.f23535a = runnable;
        }

        @Override
        public void run() {
            try {
                this.f23535a.run();
            } finally {
                l.this.a();
            }
        }
    }

    public l(Executor executor) {
        this.f23532a = executor;
    }

    public synchronized void a() {
        Runnable poll = this.f23533b.poll();
        this.f23534c = poll;
        if (poll != null) {
            this.f23532a.execute(poll);
        }
    }

    @Override
    public synchronized void execute(Runnable runnable) {
        this.f23533b.offer(new a(runnable));
        if (this.f23534c == null) {
            a();
        }
    }
}
