package p274t7;

import java.util.concurrent.Executor;

public final class ExecutorC9007d implements Executor {
    public static final Executor f28924a = new ExecutorC9007d();

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
