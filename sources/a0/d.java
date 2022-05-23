package a0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class d implements Executor {
    public static volatile Executor f14b;
    public final ExecutorService f15a = Executors.newSingleThreadExecutor(new a());

    public class a implements ThreadFactory {
        public a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor a() {
        if (f14b != null) {
            return f14b;
        }
        synchronized (d.class) {
            if (f14b == null) {
                f14b = new d();
            }
        }
        return f14b;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f15a.execute(runnable);
    }
}
