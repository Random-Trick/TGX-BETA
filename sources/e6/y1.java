package e6;

import h7.d;
import h7.e;
import h7.f;

public final class y1 implements e<t4> {
    public static final y1 f11183a = new y1();
    public static final d f11184b;
    public static final d f11185c;
    public static final d f11186d;
    public static final d f11187e;
    public static final d f11188f;
    public static final d f11189g;
    public static final d f11190h;

    static {
        d.b a10 = d.a("durationMs");
        e8 e8Var = new e8();
        e8Var.a(1);
        f11184b = a10.b(e8Var.b()).a();
        d.b a11 = d.a("imageSource");
        e8 e8Var2 = new e8();
        e8Var2.a(2);
        f11185c = a11.b(e8Var2.b()).a();
        d.b a12 = d.a("imageFormat");
        e8 e8Var3 = new e8();
        e8Var3.a(3);
        f11186d = a12.b(e8Var3.b()).a();
        d.b a13 = d.a("imageByteSize");
        e8 e8Var4 = new e8();
        e8Var4.a(4);
        f11187e = a13.b(e8Var4.b()).a();
        d.b a14 = d.a("imageWidth");
        e8 e8Var5 = new e8();
        e8Var5.a(5);
        f11188f = a14.b(e8Var5.b()).a();
        d.b a15 = d.a("imageHeight");
        e8 e8Var6 = new e8();
        e8Var6.a(6);
        f11189g = a15.b(e8Var6.b()).a();
        d.b a16 = d.a("rotationDegrees");
        e8 e8Var7 = new e8();
        e8Var7.a(7);
        f11190h = a16.b(e8Var7.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        t4 t4Var = (t4) obj;
        f fVar2 = fVar;
        fVar2.a(f11184b, t4Var.g());
        fVar2.a(f11185c, t4Var.b());
        fVar2.a(f11186d, t4Var.a());
        fVar2.a(f11187e, t4Var.c());
        fVar2.a(f11188f, t4Var.e());
        fVar2.a(f11189g, t4Var.d());
        fVar2.a(f11190h, t4Var.f());
    }
}
