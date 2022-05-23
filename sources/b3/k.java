package b3;

import java.util.concurrent.Executor;

public class k implements Executor {
    public final Executor f3733a;

    public static class a implements Runnable {
        public final Runnable f3734a;

        public a(Runnable runnable) {
            this.f3734a = runnable;
        }

        @Override
        public void run() {
            try {
                this.f3734a.run();
            } catch (Exception e10) {
                e3.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public k(Executor executor) {
        this.f3733a = executor;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f3733a.execute(new a(runnable));
    }
}
