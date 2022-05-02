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

    private void m22367m(Object obj) {
        boolean z;
        C5648T t = this;
        while (true) {
            if (t != null) {
                AbstractC5701f c = t.m22276c();
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
            m22289l(obj);
        } else {
            m22291j();
        }
    }

    @Override
    public Object mo22278a() {
        AbstractC5572D0 d0 = this.f18350a;
        AbstractC5630O3 o3 = (AbstractC5630O3) this.f18240j.f18189e.get();
        d0.mo22300q0(o3, this.f18351b);
        Object obj = o3.get();
        if (!this.f18240j.f18186b) {
            if (obj != null) {
                m22289l(obj);
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            m22367m(obj);
            return obj;
        }
    }

    @Override
    public AbstractC5701f mo22273f(AbstractC5468G g) {
        return new C5648T(this, g);
    }

    @Override
    protected Object mo22290k() {
        return this.f18240j.f18187c;
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        if (this.f18240j.f18186b) {
            C5648T t = (C5648T) this.f18353d;
            C5648T t2 = null;
            while (true) {
                if (t != t2) {
                    Object b = t.mo22277b();
                    if (b != null && this.f18240j.f18188d.mo22210n(b)) {
                        mo22272g(b);
                        m22367m(b);
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
