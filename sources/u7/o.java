package u7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s5.a;

public class o {
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-Trigger-Topics-Io"));
    }

    public static ScheduledExecutorService b() {
        return new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
    }

    public static ExecutorService c() {
        z5.o.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService f() {
        return new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
    }

    public static Executor g() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
