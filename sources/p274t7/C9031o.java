package p274t7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p246r5.ThreadFactoryC8371a;
import p342y5.C10407o;

public class C9031o {
    public static Executor m10651a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8371a("Firebase-Messaging-Trigger-Topics-Io"));
    }

    public static ScheduledExecutorService m10650b() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC8371a("Firebase-Messaging-Init"));
    }

    public static ExecutorService m10649c() {
        C10407o.m5161a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8371a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService m10648d() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC8371a("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService m10647e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC8371a("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService m10646f() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC8371a("Firebase-Messaging-Topics-Io"));
    }

    public static Executor m10645g() {
        return m10651a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
