package x9;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class k {
    public static final k f26185b = new k();
    public static final ThreadPoolExecutor f26184a = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1, Runtime.getRuntime().availableProcessors() + 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    public static final class a implements ThreadFactory {
        public final AtomicInteger f26186a = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable runnable) {
            ra.k.e(runnable, "r");
            return new Thread(runnable, "TranscoderThread #" + this.f26186a.getAndIncrement());
        }
    }

    public static final ThreadPoolExecutor a() {
        return f26184a;
    }
}
