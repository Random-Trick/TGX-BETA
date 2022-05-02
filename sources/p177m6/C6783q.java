package p177m6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class C6783q implements AbstractC6784r {
    public final CountDownLatch f21261a = new CountDownLatch(1);

    public C6783q(RunnableC6780n0 n0Var) {
    }

    @Override
    public final void mo3951a(Object obj) {
        this.f21261a.countDown();
    }

    @Override
    public final void mo19039b() {
        this.f21261a.countDown();
    }

    @Override
    public final void mo4157c(Exception exc) {
        this.f21261a.countDown();
    }

    public final void m19046d() {
        this.f21261a.await();
    }

    public final boolean m19045e(long j, TimeUnit timeUnit) {
        return this.f21261a.await(j, timeUnit);
    }
}
