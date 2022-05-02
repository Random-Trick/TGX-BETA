package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1897r3 implements AbstractC4514e<C1952v2> {
    public static final C1897r3 f6854a = new C1897r3();
    public static final C4511d f6855b;
    public static final C4511d f6856c;
    public static final C4511d f6857d;

    static {
        C4511d.C4513b a = C4511d.m27508a("logEventKey");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35824a(1);
        f6855b = a.m27503b(z1Var.m35823b()).m27504a();
        C4511d.C4513b a2 = C4511d.m27508a("eventCount");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35824a(2);
        f6856c = a2.m27503b(z1Var2.m35823b()).m27504a();
        C4511d.C4513b a3 = C4511d.m27508a("inferenceDurationStats");
        C2007z1 z1Var3 = new C2007z1();
        z1Var3.m35824a(3);
        f6857d = a3.m27503b(z1Var3.m35823b()).m27504a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C1952v2 v2Var = (C1952v2) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f6855b, v2Var.m35855a());
        fVar2.mo5192a(f6856c, v2Var.m35853c());
        fVar2.mo5192a(f6857d, v2Var.m35854b());
    }
}
