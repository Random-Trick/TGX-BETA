package n6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class q implements r {
    public final CountDownLatch f17736a = new CountDownLatch(1);

    public q(n0 n0Var) {
    }

    @Override
    public final void a(Object obj) {
        this.f17736a.countDown();
    }

    @Override
    public final void b() {
        this.f17736a.countDown();
    }

    @Override
    public final void c(Exception exc) {
        this.f17736a.countDown();
    }

    public final void d() {
        this.f17736a.await();
    }

    public final boolean e(long j10, TimeUnit timeUnit) {
        return this.f17736a.await(j10, timeUnit);
    }
}
