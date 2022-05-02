package p202o6;

import java.util.concurrent.ThreadFactory;

public final class ThreadFactoryC7756s3 implements ThreadFactory {
    public static final ThreadFactoryC7756s3 f24842a = new ThreadFactoryC7756s3();

    @Override
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
