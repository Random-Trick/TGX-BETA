package p6;

import java.util.concurrent.ThreadFactory;

public final class t3 implements ThreadFactory {
    public static final t3 f20812a = new t3();

    @Override
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
