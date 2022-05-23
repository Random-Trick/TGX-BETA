package d6;

import h7.d;
import h7.e;
import h7.f;

public final class w5 implements e<d9> {
    public static final w5 f7086a = new w5();
    public static final d f7087b;
    public static final d f7088c;
    public static final d f7089d;
    public static final d f7090e;
    public static final d f7091f;

    static {
        d.b a10 = d.a("inferenceCommonLogEvent");
        z1 z1Var = new z1();
        z1Var.a(1);
        f7087b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("options");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f7088c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("detectedBarcodeFormats");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f7089d = a12.b(z1Var3.b()).a();
        d.b a13 = d.a("detectedBarcodeValueTypes");
        z1 z1Var4 = new z1();
        z1Var4.a(4);
        f7090e = a13.b(z1Var4.b()).a();
        d.b a14 = d.a("imageInfo");
        z1 z1Var5 = new z1();
        z1Var5.a(5);
        f7091f = a14.b(z1Var5.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        d9 d9Var = (d9) obj;
        f fVar2 = fVar;
        fVar2.a(f7087b, d9Var.d());
        fVar2.a(f7088c, d9Var.e());
        fVar2.a(f7089d, d9Var.a());
        fVar2.a(f7090e, d9Var.b());
        fVar2.a(f7091f, d9Var.c());
    }
}
