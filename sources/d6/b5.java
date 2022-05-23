package d6;

import h7.d;
import h7.e;
import h7.f;

public final class b5 implements e<v7> {
    public static final b5 f6367a = new b5();
    public static final d f6368b;
    public static final d f6369c;
    public static final d f6370d;
    public static final d f6371e;
    public static final d f6372f;
    public static final d f6373g;

    static {
        d.b a10 = d.a("maxMs");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6368b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("minMs");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6369c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("avgMs");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f6370d = a12.b(z1Var3.b()).a();
        d.b a13 = d.a("firstQuartileMs");
        z1 z1Var4 = new z1();
        z1Var4.a(4);
        f6371e = a13.b(z1Var4.b()).a();
        d.b a14 = d.a("medianMs");
        z1 z1Var5 = new z1();
        z1Var5.a(5);
        f6372f = a14.b(z1Var5.b()).a();
        d.b a15 = d.a("thirdQuartileMs");
        z1 z1Var6 = new z1();
        z1Var6.a(6);
        f6373g = a15.b(z1Var6.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        v7 v7Var = (v7) obj;
        f fVar2 = fVar;
        fVar2.a(f6368b, v7Var.c());
        fVar2.a(f6369c, v7Var.e());
        fVar2.a(f6370d, v7Var.a());
        fVar2.a(f6371e, v7Var.b());
        fVar2.a(f6372f, v7Var.d());
        fVar2.a(f6373g, v7Var.f());
    }
}
