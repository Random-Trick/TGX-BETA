package p001a0;

import java.util.concurrent.Executor;

public final class ExecutorC0004b implements Executor {
    public static volatile ExecutorC0004b f2a;

    public static Executor m42608a() {
        if (f2a != null) {
            return f2a;
        }
        synchronized (ExecutorC0004b.class) {
            if (f2a == null) {
                f2a = new ExecutorC0004b();
            }
        }
        return f2a;
    }

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
