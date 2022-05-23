package a0;

import java.util.concurrent.Executor;

public final class b implements Executor {
    public static volatile b f2a;

    public static Executor a() {
        if (f2a != null) {
            return f2a;
        }
        synchronized (b.class) {
            if (f2a == null) {
                f2a = new b();
            }
        }
        return f2a;
    }

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
