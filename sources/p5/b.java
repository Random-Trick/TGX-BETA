package p5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p5.a;
import y5.g;

public final class b implements a.AbstractC0183a {
    @Override
    public final ScheduledExecutorService a() {
        g.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
