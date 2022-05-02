package p001a0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class ExecutorC0011d implements Executor {
    public static volatile Executor f15b;
    public final ExecutorService f16a = Executors.newSingleThreadExecutor(new ThreadFactoryC0012a());

    public class ThreadFactoryC0012a implements ThreadFactory {
        public ThreadFactoryC0012a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor m42603a() {
        if (f15b != null) {
            return f15b;
        }
        synchronized (ExecutorC0011d.class) {
            if (f15b == null) {
                f15b = new ExecutorC0011d();
            }
        }
        return f15b;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f16a.execute(runnable);
    }
}
