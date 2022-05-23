package p6;

import java.util.concurrent.ThreadFactory;

public final class s3 implements ThreadFactory {
    public static final s3 f20794a = new s3();

    @Override
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
