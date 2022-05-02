package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5542x;

public final class C5562B0 implements AbstractC5625N3 {
    private final int f18110a;
    final EnumC5557A0 f18111b;
    final AbstractC5542x f18112c;

    public C5562B0(int i, EnumC5557A0 a0, AbstractC5542x xVar) {
        this.f18110a = i;
        this.f18111b = a0;
        this.f18112c = xVar;
    }

    @Override
    public int mo22322a() {
        return EnumC5705f3.f18371u | EnumC5705f3.f18368r;
    }

    @Override
    public Object mo22320f(AbstractC5572D0 d0, AbstractC5468G g) {
        return (Boolean) new C5567C0(this, d0, g).invoke();
    }

    @Override
    public Object mo22319g(AbstractC5572D0 d0, AbstractC5468G g) {
        AbstractC5802z0 z0Var = (AbstractC5802z0) this.f18112c.get();
        AbstractC5686c cVar = (AbstractC5686c) d0;
        Objects.requireNonNull(z0Var);
        cVar.mo22307M(cVar.mo22300r0(z0Var), g);
        return Boolean.valueOf(z0Var.f18523b);
    }
}
