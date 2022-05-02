package p316w9;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import qa.C8298k;

public final class C10010k {
    public static final C10010k f32617b = new C10010k();
    public static final ThreadPoolExecutor f32616a = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1, Runtime.getRuntime().availableProcessors() + 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC10011a());

    public static final class ThreadFactoryC10011a implements ThreadFactory {
        public final AtomicInteger f32618a = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable runnable) {
            C8298k.m12934e(runnable, "r");
            return new Thread(runnable, "TranscoderThread #" + this.f32618a.getAndIncrement());
        }
    }

    public static final ThreadPoolExecutor m6242a() {
        return f32616a;
    }
}
