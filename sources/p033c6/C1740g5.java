package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1740g5 implements AbstractC4514e<C1668b8> {
    public static final C1740g5 f6302a = new C1740g5();
    public static final C4511d f6303b;
    public static final C4511d f6304c;
    public static final C4511d f6305d;
    public static final C4511d f6306e;

    static {
        C4511d.C4513b a = C4511d.m27508a("imageFormat");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35824a(1);
        f6303b = a.m27503b(z1Var.m35823b()).m27504a();
        C4511d.C4513b a2 = C4511d.m27508a("originalImageSize");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35824a(2);
        f6304c = a2.m27503b(z1Var2.m35823b()).m27504a();
        C4511d.C4513b a3 = C4511d.m27508a("compressedImageSize");
        C2007z1 z1Var3 = new C2007z1();
        z1Var3.m35824a(3);
        f6305d = a3.m27503b(z1Var3.m35823b()).m27504a();
        C4511d.C4513b a4 = C4511d.m27508a("isOdmlImage");
        C2007z1 z1Var4 = new C2007z1();
        z1Var4.m35824a(4);
        f6306e = a4.m27503b(z1Var4.m35823b()).m27504a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C1668b8 b8Var = (C1668b8) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f6303b, b8Var.m36114a());
        fVar2.mo5192a(f6304c, b8Var.m36113b());
        fVar2.mo5192a(f6305d, null);
        fVar2.mo5192a(f6306e, null);
    }
}
