package a0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class e implements Executor {
    public static volatile Executor f17b;
    public final ExecutorService f18a = Executors.newFixedThreadPool(2, new a());

    public class a implements ThreadFactory {
        public final AtomicInteger f19a = new AtomicInteger(0);

        public a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f19a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor a() {
        if (f17b != null) {
            return f17b;
        }
        synchronized (e.class) {
            if (f17b == null) {
                f17b = new e();
            }
        }
        return f17b;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f18a.execute(runnable);
    }
}
