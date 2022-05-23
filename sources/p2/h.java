package p2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class h implements Executor {
    public volatile Runnable M;
    public final Executor f20422b;
    public final ArrayDeque<a> f20421a = new ArrayDeque<>();
    public final Object f20423c = new Object();

    public static class a implements Runnable {
        public final h f20424a;
        public final Runnable f20425b;

        public a(h hVar, Runnable runnable) {
            this.f20424a = hVar;
            this.f20425b = runnable;
        }

        @Override
        public void run() {
            try {
                this.f20425b.run();
            } finally {
                this.f20424a.b();
            }
        }
    }

    public h(Executor executor) {
        this.f20422b = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f20423c) {
            z10 = !this.f20421a.isEmpty();
        }
        return z10;
    }

    public void b() {
        synchronized (this.f20423c) {
            a poll = this.f20421a.poll();
            this.M = poll;
            if (poll != null) {
                this.f20422b.execute(this.M);
            }
        }
    }

    @Override
    public void execute(Runnable runnable) {
        synchronized (this.f20423c) {
            this.f20421a.add(new a(this, runnable));
            if (this.M == null) {
                b();
            }
        }
    }
}
