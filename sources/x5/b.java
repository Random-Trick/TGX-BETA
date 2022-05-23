package x5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface b {
    ScheduledExecutorService a(int i10, ThreadFactory threadFactory, int i11);

    ExecutorService b(ThreadFactory threadFactory, int i10);
}
