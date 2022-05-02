package p001a0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

public final class C0015f {
    public static volatile ScheduledExecutorService f22a;

    public static ScheduledExecutorService m42598a() {
        if (f22a != null) {
            return f22a;
        }
        synchronized (C0015f.class) {
            if (f22a == null) {
                f22a = new ScheduledExecutorServiceC0005c(new Handler(Looper.getMainLooper()));
            }
        }
        return f22a;
    }
}
