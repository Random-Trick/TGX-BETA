package b8;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import m5.r;

public final class g0 implements Closeable {
    public final o f4035a;

    public g0(o oVar, f0 f0Var) {
        AtomicReference atomicReference;
        this.f4035a = oVar;
        atomicReference = oVar.f4051d;
        r.m(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f4035a.f4051d;
        atomicReference.set(null);
        this.f4035a.d();
    }
}
