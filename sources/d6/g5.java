package d6;

import h7.d;
import h7.e;
import h7.f;

public final class g5 implements e<b8> {
    public static final g5 f6521a = new g5();
    public static final d f6522b;
    public static final d f6523c;
    public static final d f6524d;
    public static final d f6525e;

    static {
        d.b a10 = d.a("imageFormat");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6522b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("originalImageSize");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6523c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("compressedImageSize");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f6524d = a12.b(z1Var3.b()).a();
        d.b a13 = d.a("isOdmlImage");
        z1 z1Var4 = new z1();
        z1Var4.a(4);
        f6525e = a13.b(z1Var4.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        b8 b8Var = (b8) obj;
        f fVar2 = fVar;
        fVar2.a(f6522b, b8Var.a());
        fVar2.a(f6523c, b8Var.b());
        fVar2.a(f6524d, null);
        fVar2.a(f6525e, null);
    }
}
