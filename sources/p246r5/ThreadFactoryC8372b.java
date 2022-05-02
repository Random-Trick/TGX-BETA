package p246r5;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p163l5.C6378r;

public class ThreadFactoryC8372b implements ThreadFactory {
    public final String f27137a;
    public final AtomicInteger f27138b = new AtomicInteger();
    public final ThreadFactory f27139c = Executors.defaultThreadFactory();

    public ThreadFactoryC8372b(@RecentlyNonNull String str) {
        C6378r.m20505l(str, "Name must not be null");
        this.f27137a = str;
    }

    @Override
    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread newThread = this.f27139c.newThread(new RunnableC8373c(runnable, 0));
        String str = this.f27137a;
        int andIncrement = this.f27138b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(str.length() + 13);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
