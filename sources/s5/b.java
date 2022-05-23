package s5;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m5.r;

public class b implements ThreadFactory {
    public final String f22530a;
    public final AtomicInteger f22531b = new AtomicInteger();
    public final ThreadFactory f22532c = Executors.defaultThreadFactory();

    public b(@RecentlyNonNull String str) {
        r.l(str, "Name must not be null");
        this.f22530a = str;
    }

    @Override
    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread newThread = this.f22532c.newThread(new c(runnable, 0));
        String str = this.f22530a;
        int andIncrement = this.f22531b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(str.length() + 13);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
