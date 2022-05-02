package p126j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5536r;

public class C5657V0 extends AbstractC5701f {
    protected final AbstractC5572D0 f18252h;
    protected final AbstractC5536r f18253i;
    protected final AbstractC5521c f18254j;

    public C5657V0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5536r rVar, AbstractC5521c cVar) {
        super(d0, g);
        this.f18252h = d0;
        this.f18253i = rVar;
        this.f18254j = cVar;
    }

    C5657V0(C5657V0 v0, AbstractC5468G g) {
        super(v0, g);
        this.f18252h = v0.f18252h;
        this.f18253i = v0.f18253i;
        this.f18254j = v0.f18254j;
    }

    @Override
    public Object mo22279a() {
        AbstractC5592H0 h0 = (AbstractC5592H0) this.f18253i.mo22210x(this.f18252h.mo22304S(this.f18351b));
        this.f18252h.mo22301q0(h0, this.f18351b);
        return h0.mo42633b();
    }

    @Override
    public AbstractC5701f mo22274f(AbstractC5468G g) {
        return new C5657V0(this, g);
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        if (!m22276d()) {
            mo22273g((AbstractC5632P0) this.f18254j.mo22173u((AbstractC5632P0) ((C5657V0) this.f18353d).mo22278b(), (AbstractC5632P0) ((C5657V0) this.f18354e).mo22278b()));
        }
        this.f18351b = null;
        this.f18354e = null;
        this.f18353d = null;
    }
}
