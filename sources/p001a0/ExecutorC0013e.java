package p001a0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ExecutorC0013e implements Executor {
    public static volatile Executor f18b;
    public final ExecutorService f19a = Executors.newFixedThreadPool(2, new ThreadFactoryC0014a());

    public class ThreadFactoryC0014a implements ThreadFactory {
        public final AtomicInteger f20a = new AtomicInteger(0);

        public ThreadFactoryC0014a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f20a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor m42602a() {
        if (f18b != null) {
            return f18b;
        }
        synchronized (ExecutorC0013e.class) {
            if (f18b == null) {
                f18b = new ExecutorC0013e();
            }
        }
        return f18b;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f19a.execute(runnable);
    }
}
