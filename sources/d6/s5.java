package d6;

import h7.d;
import h7.e;
import h7.f;

public final class s5 implements e<u8> {
    public static final s5 f6968a = new s5();
    public static final d f6969b;
    public static final d f6970c;
    public static final d f6971d;
    public static final d f6972e;

    static {
        d.b a10 = d.a("isChargingRequired");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6969b = a10.b(z1Var.b()).a();
        d.b a11 = d.a("isWifiRequired");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6970c = a11.b(z1Var2.b()).a();
        d.b a12 = d.a("isDeviceIdleRequired");
        z1 z1Var3 = new z1();
        z1Var3.a(3);
        f6971d = a12.b(z1Var3.b()).a();
        d.b a13 = d.a("canDownloadInBackground");
        z1 z1Var4 = new z1();
        z1Var4.a(4);
        f6972e = a13.b(z1Var4.b()).a();
    }

    @Override
    public final void a(Object obj, f fVar) {
        u8 u8Var = (u8) obj;
        throw null;
    }
}
