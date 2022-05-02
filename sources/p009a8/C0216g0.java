package p009a8;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import p163l5.C6378r;

public final class C0216g0 implements Closeable {
    public final C0224o f691a;

    public C0216g0(C0224o oVar, C0214f0 f0Var) {
        AtomicReference atomicReference;
        this.f691a = oVar;
        atomicReference = oVar.f711d;
        C6378r.m20504m(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f691a.f711d;
        atomicReference.set(null);
        this.f691a.m42059d();
    }
}
