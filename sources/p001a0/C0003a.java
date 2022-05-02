package p001a0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class C0003a {
    public static Executor m42614a() {
        return ExecutorC0004b.m42608a();
    }

    public static Executor m42613b() {
        return ExecutorC0011d.m42603a();
    }

    public static Executor m42612c() {
        return ExecutorC0013e.m42602a();
    }

    public static ScheduledExecutorService m42611d() {
        return C0015f.m42601a();
    }

    public static ScheduledExecutorService m42610e(Handler handler) {
        return new ScheduledExecutorServiceC0005c(handler);
    }

    public static Executor m42609f(Executor executor) {
        return new ExecutorC0016g(executor);
    }
}
