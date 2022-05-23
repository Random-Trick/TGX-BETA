package l7;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public static final b f16298a = new b();

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread h10;
        h10 = d.h(runnable);
        return h10;
    }
}
