package p126j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p126j$.util.AbstractC5468G;

public final class C5684b2 extends AbstractC5701f {
    private final AbstractC5679a2 f18317h;

    public C5684b2(AbstractC5679a2 a2Var, AbstractC5572D0 d0, AbstractC5468G g) {
        super(d0, g);
        this.f18317h = a2Var;
    }

    C5684b2(C5684b2 b2Var, AbstractC5468G g) {
        super(b2Var, g);
        this.f18317h = b2Var.f18317h;
    }

    @Override
    protected Object mo22278a() {
        AbstractC5572D0 d0 = this.f18350a;
        AbstractC5670Y1 b = this.f18317h.mo22320b();
        d0.mo22300q0(b, this.f18351b);
        return b;
    }

    @Override
    protected AbstractC5701f mo22273f(AbstractC5468G g) {
        return new C5684b2(this, g);
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        if (!m22275d()) {
            AbstractC5670Y1 y1 = (AbstractC5670Y1) ((C5684b2) this.f18353d).mo22277b();
            y1.mo22346s((AbstractC5670Y1) ((C5684b2) this.f18354e).mo22277b());
            mo22272g(y1);
        }
        this.f18351b = null;
        this.f18354e = null;
        this.f18353d = null;
    }
}
