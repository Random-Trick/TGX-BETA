package d6;

import h7.d;
import h7.e;
import h7.f;

public final class s3 implements e<t2> {
    public static final s3 f6956a = new s3();
    public static final d f6957b;
    public static final d f6958c;
    public static final d f6959d;
    public static final d f6960e;
    public static final d f6961f;
    public static final d f6962g;
    public static final d f6963h;

    static {
        d.b a10 = d.a("errorCode");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6957b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("hasResult");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6958c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("isColdCall");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f6959d = a12.b(z1Var3.b()).a();
        d.b a13 = d.a("imageInfo");
        z1 z1Var4 = new z1();
        z1Var4.a(4);
        f6960e = a13.b(z1Var4.b()).a();
        d.b a14 = d.a("options");
        z1 z1Var5 = new z1();
        z1Var5.a(5);
        f6961f = a14.b(z1Var5.b()).a();
        d.b a15 = d.a("detectedBarcodeFormats");
        z1 z1Var6 = new z1();
        z1Var6.a(6);
        f6962g = a15.b(z1Var6.b()).a();
        d.b a16 = d.a("detectedBarcodeValueTypes");
        z1 z1Var7 = new z1();
        z1Var7.a(7);
        f6963h = a16.b(z1Var7.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        t2 t2Var = (t2) obj;
        f fVar2 = fVar;
        fVar2.a(f6957b, t2Var.c());
        fVar2.a(f6958c, null);
        fVar2.a(f6959d, t2Var.e());
        fVar2.a(f6960e, null);
        fVar2.a(f6961f, t2Var.d());
        fVar2.a(f6962g, t2Var.a());
        fVar2.a(f6963h, t2Var.b());
    }
}
