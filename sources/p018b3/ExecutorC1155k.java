package p018b3;

import java.util.concurrent.Executor;
import p058e3.C4118a;

public class ExecutorC1155k implements Executor {
    public final Executor f4381a;

    public static class RunnableC1156a implements Runnable {
        public final Runnable f4382a;

        public RunnableC1156a(Runnable runnable) {
            this.f4382a = runnable;
        }

        @Override
        public void run() {
            try {
                this.f4382a.run();
            } catch (Exception e) {
                C4118a.m28884c("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC1155k(Executor executor) {
        this.f4381a = executor;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f4381a.execute(new RunnableC1156a(runnable));
    }
}
