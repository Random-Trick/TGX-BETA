package d6;

import h7.d;
import h7.e;
import h7.f;

public final class i5 implements e<f8> {
    public static final i5 f6570a = new i5();
    public static final d f6571b;
    public static final d f6572c;
    public static final d f6573d;
    public static final d f6574e;
    public static final d f6575f;
    public static final d f6576g;
    public static final d f6577h;
    public static final d f6578i;
    public static final d f6579j;
    public static final d f6580k;

    static {
        d.b a10 = d.a("durationMs");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6571b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("errorCode");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6572c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("isColdCall");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f6573d = a12.b(z1Var3.b()).a();
        d.b a13 = d.a("autoManageModelOnBackground");
        z1 z1Var4 = new z1();
        z1Var4.a(4);
        f6574e = a13.b(z1Var4.b()).a();
        d.b a14 = d.a("autoManageModelOnLowMemory");
        z1 z1Var5 = new z1();
        z1Var5.a(5);
        f6575f = a14.b(z1Var5.b()).a();
        d.b a15 = d.a("isNnApiEnabled");
        z1 z1Var6 = new z1();
        z1Var6.a(6);
        f6576g = a15.b(z1Var6.b()).a();
        d.b a16 = d.a("eventsCount");
        z1 z1Var7 = new z1();
        z1Var7.a(7);
        f6577h = a16.b(z1Var7.b()).a();
        d.b a17 = d.a("otherErrors");
        z1 z1Var8 = new z1();
        z1Var8.a(8);
        f6578i = a17.b(z1Var8.b()).a();
        d.b a18 = d.a("remoteConfigValueForAcceleration");
        z1 z1Var9 = new z1();
        z1Var9.a(9);
        f6579j = a18.b(z1Var9.b()).a();
        d.b a19 = d.a("isAccelerated");
        z1 z1Var10 = new z1();
        z1Var10.a(10);
        f6580k = a19.b(z1Var10.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        f8 f8Var = (f8) obj;
        f fVar2 = fVar;
        fVar2.a(f6571b, f8Var.e());
        fVar2.a(f6572c, f8Var.a());
        fVar2.a(f6573d, f8Var.d());
        fVar2.a(f6574e, f8Var.b());
        fVar2.a(f6575f, f8Var.c());
        fVar2.a(f6576g, null);
        fVar2.a(f6577h, null);
        fVar2.a(f6578i, null);
        fVar2.a(f6579j, null);
        fVar2.a(f6580k, null);
    }
}
