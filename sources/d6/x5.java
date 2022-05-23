package d6;

import h7.d;
import h7.e;
import h7.f;

public final class x5 implements e<g9> {
    public static final x5 f7110a = new x5();
    public static final d f7111b;

    static {
        d.b a10 = d.a("errorCode");
        z1 z1Var = new z1();
        z1Var.a(1);
        f7111b = a10.b(z1Var.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        fVar.a(f7111b, ((g9) obj).a());
    }
}
