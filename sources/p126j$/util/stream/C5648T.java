package p126j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p126j$.util.AbstractC5468G;

final class C5648T extends AbstractC5691d {
    private final C5616M f18240j;

    public C5648T(C5616M m, AbstractC5572D0 d0, AbstractC5468G g) {
        super(d0, g);
        this.f18240j = m;
    }

    C5648T(C5648T t, AbstractC5468G g) {
        super(t, g);
        this.f18240j = t.f18240j;
    }

    private void m22368m(Object obj) {
        boolean z;
        C5648T t = this;
        while (true) {
            if (t != null) {
                AbstractC5701f c = t.m22277c();
                if (c != null && c.f18353d != t) {
                    z = false;
                    break;
                }
                t = c;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            m22290l(obj);
        } else {
            m22292j();
        }
    }

    @Override
    public Object mo22279a() {
        AbstractC5572D0 d0 = this.f18350a;
        AbstractC5630O3 o3 = (AbstractC5630O3) this.f18240j.f18189e.get();
        d0.mo22301q0(o3, this.f18351b);
        Object obj = o3.get();
        if (!this.f18240j.f18186b) {
            if (obj != null) {
                m22290l(obj);
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            m22368m(obj);
            return obj;
        }
    }

    @Override
    public AbstractC5701f mo22274f(AbstractC5468G g) {
        return new C5648T(this, g);
    }

    @Override
    protected Object mo22291k() {
        return this.f18240j.f18187c;
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        if (this.f18240j.f18186b) {
            C5648T t = (C5648T) this.f18353d;
            C5648T t2 = null;
            while (true) {
                if (t != t2) {
                    Object b = t.mo22278b();
                    if (b != null && this.f18240j.f18188d.mo22211n(b)) {
                        mo22273g(b);
                        m22368m(b);
                        break;
                    }
                    t = (C5648T) this.f18354e;
                    t2 = t;
                } else {
                    break;
                }
            }
        }
        this.f18351b = null;
        this.f18354e = null;
        this.f18353d = null;
    }
}
