package p246r5;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p163l5.C6378r;

public class ThreadFactoryC8371a implements ThreadFactory {
    public final String f27138a;
    public final ThreadFactory f27139b = Executors.defaultThreadFactory();

    public ThreadFactoryC8371a(@RecentlyNonNull String str) {
        C6378r.m20506l(str, "Name must not be null");
        this.f27138a = str;
    }

    @Override
    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread newThread = this.f27139b.newThread(new RunnableC8373c(runnable, 0));
        newThread.setName(this.f27138a);
        return newThread;
    }
}
