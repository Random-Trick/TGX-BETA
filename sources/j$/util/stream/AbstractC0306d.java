package j$.util.stream;

import j$.util.H;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractC0306d extends AbstractC0316f {
    protected final AtomicReference f14726h;
    protected volatile boolean f14727i;

    public AbstractC0306d(E0 e02, H h10) {
        super(e02, h10);
        this.f14726h = new AtomicReference(null);
    }

    public AbstractC0306d(AbstractC0306d dVar, H h10) {
        super(dVar, h10);
        this.f14726h = dVar.f14726h;
    }

    @Override
    public final Object b() {
        if (!e()) {
            return super.b();
        }
        Object obj = this.f14726h.get();
        return obj == null ? k() : obj;
    }

    @Override
    public final void compute() {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC0306d.compute():void");
    }

    @Override
    public final void g(Object obj) {
        if (!e()) {
            super.g(obj);
        } else if (obj != null) {
            this.f14726h.compareAndSet(null, obj);
        }
    }

    @Override
    public final Object getRawResult() {
        return b();
    }

    protected void i() {
        this.f14727i = true;
    }

    public final void j() {
        AbstractC0306d dVar = (AbstractC0306d) c();
        AbstractC0306d dVar2 = this;
        while (dVar != null) {
            if (dVar.f14743d == dVar2) {
                AbstractC0306d dVar3 = (AbstractC0306d) dVar.f14744e;
                if (!dVar3.f14727i) {
                    dVar3.i();
                }
            }
            dVar = (AbstractC0306d) dVar.c();
            dVar2 = dVar;
        }
    }

    protected abstract Object k();

    public final void l(Object obj) {
        if (obj != null) {
            this.f14726h.compareAndSet(null, obj);
        }
    }
}
