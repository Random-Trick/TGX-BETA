package p001a0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class C0003a {
    public static Executor m42611a() {
        return ExecutorC0004b.m42605a();
    }

    public static Executor m42610b() {
        return ExecutorC0011d.m42600a();
    }

    public static Executor m42609c() {
        return ExecutorC0013e.m42599a();
    }

    public static ScheduledExecutorService m42608d() {
        return C0015f.m42598a();
    }

    public static ScheduledExecutorService m42607e(Handler handler) {
        return new ScheduledExecutorServiceC0005c(handler);
    }

    public static Executor m42606f(Executor executor) {
        return new ExecutorC0016g(executor);
    }
}
