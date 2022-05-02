package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1911s3 implements AbstractC4514e<C1924t2> {
    public static final C1911s3 f6887a = new C1911s3();
    public static final C4511d f6888b;
    public static final C4511d f6889c;
    public static final C4511d f6890d;
    public static final C4511d f6891e;
    public static final C4511d f6892f;
    public static final C4511d f6893g;
    public static final C4511d f6894h;

    static {
        C4511d.C4513b a = C4511d.m27510a("errorCode");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35827a(1);
        f6888b = a.m27505b(z1Var.m35826b()).m27506a();
        C4511d.C4513b a2 = C4511d.m27510a("hasResult");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35827a(2);
        f6889c = a2.m27505b(z1Var2.m35826b()).m27506a();
        C4511d.C4513b a3 = C4511d.m27510a("isColdCall");
        C2007z1 z1Var3 = new C2007z1();
        z1Var3.m35827a(3);
        f6890d = a3.m27505b(z1Var3.m35826b()).m27506a();
        C4511d.C4513b a4 = C4511d.m27510a("imageInfo");
        C2007z1 z1Var4 = new C2007z1();
        z1Var4.m35827a(4);
        f6891e = a4.m27505b(z1Var4.m35826b()).m27506a();
        C4511d.C4513b a5 = C4511d.m27510a("options");
        C2007z1 z1Var5 = new C2007z1();
        z1Var5.m35827a(5);
        f6892f = a5.m27505b(z1Var5.m35826b()).m27506a();
        C4511d.C4513b a6 = C4511d.m27510a("detectedBarcodeFormats");
        C2007z1 z1Var6 = new C2007z1();
        z1Var6.m35827a(6);
        f6893g = a6.m27505b(z1Var6.m35826b()).m27506a();
        C4511d.C4513b a7 = C4511d.m27510a("detectedBarcodeValueTypes");
        C2007z1 z1Var7 = new C2007z1();
        z1Var7.m35827a(7);
        f6894h = a7.m27505b(z1Var7.m35826b()).m27506a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C1924t2 t2Var = (C1924t2) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f6888b, t2Var.m35905c());
        fVar2.mo5192a(f6889c, null);
        fVar2.mo5192a(f6890d, t2Var.m35903e());
        fVar2.mo5192a(f6891e, null);
        fVar2.mo5192a(f6892f, t2Var.m35904d());
        fVar2.mo5192a(f6893g, t2Var.m35907a());
        fVar2.mo5192a(f6894h, t2Var.m35906b());
    }
}
