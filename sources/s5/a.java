package s5;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import m5.r;

public class a implements ThreadFactory {
    public final String f22528a;
    public final ThreadFactory f22529b = Executors.defaultThreadFactory();

    public a(@RecentlyNonNull String str) {
        r.l(str, "Name must not be null");
        this.f22528a = str;
    }

    @Override
    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread newThread = this.f22529b.newThread(new c(runnable, 0));
        newThread.setName(this.f22528a);
        return newThread;
    }
}
