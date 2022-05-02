package p201o5;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class C7654a {
    public static AbstractC7655a f24544a;

    public interface AbstractC7655a {
        @RecentlyNonNull
        @Deprecated
        ScheduledExecutorService mo15282a();
    }

    @RecentlyNonNull
    @Deprecated
    public static synchronized AbstractC7655a m15283a() {
        AbstractC7655a aVar;
        synchronized (C7654a.class) {
            if (f24544a == null) {
                f24544a = new C7656b();
            }
            aVar = f24544a;
        }
        return aVar;
    }
}
