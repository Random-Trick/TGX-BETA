package p5;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class a {
    public static AbstractC0183a f20518a;

    public interface AbstractC0183a {
        @RecentlyNonNull
        @Deprecated
        ScheduledExecutorService a();
    }

    @RecentlyNonNull
    @Deprecated
    public static synchronized AbstractC0183a a() {
        AbstractC0183a aVar;
        synchronized (a.class) {
            if (f20518a == null) {
                f20518a = new b();
            }
            aVar = f20518a;
        }
        return aVar;
    }
}
