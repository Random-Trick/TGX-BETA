package p202o6;

import java.util.concurrent.ThreadFactory;

public final class ThreadFactoryC7761t3 implements ThreadFactory {
    public static final ThreadFactoryC7761t3 f24857a = new ThreadFactoryC7761t3();

    @Override
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
