package d6;

import h7.d;
import h7.e;
import h7.f;

public final class r3 implements e<v2> {
    public static final r3 f6923a = new r3();
    public static final d f6924b;
    public static final d f6925c;
    public static final d f6926d;

    static {
        d.b a10 = d.a("logEventKey");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6924b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("eventCount");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6925c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("inferenceDurationStats");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f6926d = a12.b(z1Var3.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        v2 v2Var = (v2) obj;
        f fVar2 = fVar;
        fVar2.a(f6924b, v2Var.a());
        fVar2.a(f6925c, v2Var.c());
        fVar2.a(f6926d, v2Var.b());
    }
}
