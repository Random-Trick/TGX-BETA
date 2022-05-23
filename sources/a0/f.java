package a0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

public final class f {
    public static volatile ScheduledExecutorService f21a;

    public static ScheduledExecutorService a() {
        if (f21a != null) {
            return f21a;
        }
        synchronized (f.class) {
            if (f21a == null) {
                f21a = new c(new Handler(Looper.getMainLooper()));
            }
        }
        return f21a;
    }
}
