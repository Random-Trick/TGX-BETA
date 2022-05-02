package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1969w5 implements AbstractC4514e<C1699d9> {
    public static final C1969w5 f7048a = new C1969w5();
    public static final C4511d f7049b;
    public static final C4511d f7050c;
    public static final C4511d f7051d;
    public static final C4511d f7052e;
    public static final C4511d f7053f;

    static {
        C4511d.C4513b a = C4511d.m27508a("inferenceCommonLogEvent");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35824a(1);
        f7049b = a.m27503b(z1Var.m35823b()).m27504a();
        C4511d.C4513b a2 = C4511d.m27508a("options");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35824a(2);
        f7050c = a2.m27503b(z1Var2.m35823b()).m27504a();
        C4511d.C4513b a3 = C4511d.m27508a("detectedBarcodeFormats");
        C2007z1 z1Var3 = new C2007z1();
        z1Var3.m35824a(3);
        f7051d = a3.m27503b(z1Var3.m35823b()).m27504a();
        C4511d.C4513b a4 = C4511d.m27508a("detectedBarcodeValueTypes");
        C2007z1 z1Var4 = new C2007z1();
        z1Var4.m35824a(4);
        f7052e = a4.m27503b(z1Var4.m35823b()).m27504a();
        C4511d.C4513b a5 = C4511d.m27508a("imageInfo");
        C2007z1 z1Var5 = new C2007z1();
        z1Var5.m35824a(5);
        f7053f = a5.m27503b(z1Var5.m35823b()).m27504a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C1699d9 d9Var = (C1699d9) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f7049b, d9Var.m36072d());
        fVar2.mo5192a(f7050c, d9Var.m36071e());
        fVar2.mo5192a(f7051d, d9Var.m36075a());
        fVar2.mo5192a(f7052e, d9Var.m36074b());
        fVar2.mo5192a(f7053f, d9Var.m36073c());
    }
}
