package w6;

import java.util.concurrent.CountDownLatch;

public final class v implements w {
    public final CountDownLatch f25802a = new CountDownLatch(1);

    public v(u uVar) {
    }

    @Override
    public final void a(Object obj) {
        this.f25802a.countDown();
    }

    public final void b() {
        this.f25802a.await();
    }

    @Override
    public final void c(Exception exc) {
        this.f25802a.countDown();
    }
}
