package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;

public final class C5616M implements AbstractC5625N3 {
    private final int f18185a;
    final boolean f18186b;
    final Object f18187c;
    final AbstractC5541w f18188d;
    final AbstractC5542x f18189e;

    public C5616M(boolean z, int i, Object obj, AbstractC5541w wVar, AbstractC5542x xVar) {
        this.f18186b = z;
        this.f18185a = i;
        this.f18187c = obj;
        this.f18188d = wVar;
        this.f18189e = xVar;
    }

    @Override
    public int mo22322a() {
        return EnumC5705f3.f18371u | (this.f18186b ? 0 : EnumC5705f3.f18368r);
    }

    @Override
    public Object mo22320f(AbstractC5572D0 d0, AbstractC5468G g) {
        return new C5648T(this, d0, g).invoke();
    }

    @Override
    public Object mo22319g(AbstractC5572D0 d0, AbstractC5468G g) {
        AbstractC5630O3 o3 = (AbstractC5630O3) this.f18189e.get();
        AbstractC5686c cVar = (AbstractC5686c) d0;
        Objects.requireNonNull(o3);
        cVar.mo22307M(cVar.mo22300r0(o3), g);
        Object obj = o3.get();
        return obj != null ? obj : this.f18187c;
    }
}
