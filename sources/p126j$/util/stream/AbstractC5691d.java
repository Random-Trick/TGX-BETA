package p126j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p126j$.util.AbstractC5468G;

public abstract class AbstractC5691d extends AbstractC5701f {
    protected final AtomicReference f18335h;
    protected volatile boolean f18336i;

    public AbstractC5691d(AbstractC5572D0 d0, AbstractC5468G g) {
        super(d0, g);
        this.f18335h = new AtomicReference(null);
    }

    public AbstractC5691d(AbstractC5691d dVar, AbstractC5468G g) {
        super(dVar, g);
        this.f18335h = dVar.f18335h;
    }

    @Override
    public Object mo22277b() {
        if (!m22274e()) {
            return super.mo22277b();
        }
        Object obj = this.f18335h.get();
        return obj == null ? mo22290k() : obj;
    }

    @Override
    public void compute() {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.stream.AbstractC5691d.compute():void");
    }

    @Override
    public void mo22272g(Object obj) {
        if (!m22274e()) {
            super.mo22272g(obj);
        } else if (obj != null) {
            this.f18335h.compareAndSet(null, obj);
        }
    }

    @Override
    public Object getRawResult() {
        return mo22277b();
    }

    protected void mo22292i() {
        this.f18336i = true;
    }

    public void m22291j() {
        AbstractC5691d dVar = (AbstractC5691d) m22276c();
        AbstractC5691d dVar2 = this;
        while (dVar != null) {
            if (dVar.f18353d == dVar2) {
                AbstractC5691d dVar3 = (AbstractC5691d) dVar.f18354e;
                if (!dVar3.f18336i) {
                    dVar3.mo22292i();
                }
            }
            dVar = (AbstractC5691d) dVar.m22276c();
            dVar2 = dVar;
        }
    }

    protected abstract Object mo22290k();

    public void m22289l(Object obj) {
        if (obj != null) {
            this.f18335h.compareAndSet(null, obj);
        }
    }
}
