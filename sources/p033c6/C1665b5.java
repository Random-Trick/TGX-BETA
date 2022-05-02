package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1665b5 implements AbstractC4514e<C1957v7> {
    public static final C1665b5 f6105a = new C1665b5();
    public static final C4511d f6106b;
    public static final C4511d f6107c;
    public static final C4511d f6108d;
    public static final C4511d f6109e;
    public static final C4511d f6110f;
    public static final C4511d f6111g;

    static {
        C4511d.C4513b a = C4511d.m27510a("maxMs");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35827a(1);
        f6106b = a.m27505b(z1Var.m35826b()).m27506a();
        C4511d.C4513b a2 = C4511d.m27510a("minMs");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35827a(2);
        f6107c = a2.m27505b(z1Var2.m35826b()).m27506a();
        C4511d.C4513b a3 = C4511d.m27510a("avgMs");
        C2007z1 z1Var3 = new C2007z1();
        z1Var3.m35827a(3);
        f6108d = a3.m27505b(z1Var3.m35826b()).m27506a();
        C4511d.C4513b a4 = C4511d.m27510a("firstQuartileMs");
        C2007z1 z1Var4 = new C2007z1();
        z1Var4.m35827a(4);
        f6109e = a4.m27505b(z1Var4.m35826b()).m27506a();
        C4511d.C4513b a5 = C4511d.m27510a("medianMs");
        C2007z1 z1Var5 = new C2007z1();
        z1Var5.m35827a(5);
        f6110f = a5.m27505b(z1Var5.m35826b()).m27506a();
        C4511d.C4513b a6 = C4511d.m27510a("thirdQuartileMs");
        C2007z1 z1Var6 = new C2007z1();
        z1Var6.m35827a(6);
        f6111g = a6.m27505b(z1Var6.m35826b()).m27506a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C1957v7 v7Var = (C1957v7) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f6106b, v7Var.m35853c());
        fVar2.mo5192a(f6107c, v7Var.m35851e());
        fVar2.mo5192a(f6108d, v7Var.m35855a());
        fVar2.mo5192a(f6109e, v7Var.m35854b());
        fVar2.mo5192a(f6110f, v7Var.m35852d());
        fVar2.mo5192a(f6111g, v7Var.m35850f());
    }
}
