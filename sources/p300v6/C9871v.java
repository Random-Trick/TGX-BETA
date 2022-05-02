package p300v6;

import java.util.concurrent.CountDownLatch;

public final class C9871v implements AbstractC9872w {
    public final CountDownLatch f32157a = new CountDownLatch(1);

    public C9871v(C9870u uVar) {
    }

    @Override
    public final void mo6713a(Object obj) {
        this.f32157a.countDown();
    }

    public final void m6712b() {
        this.f32157a.await();
    }

    @Override
    public final void mo6711c(Exception exc) {
        this.f32157a.countDown();
    }
}
