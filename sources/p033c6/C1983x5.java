package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1983x5 implements AbstractC4514e<C1744g9> {
    public static final C1983x5 f7074a = new C1983x5();
    public static final C4511d f7075b;

    static {
        C4511d.C4513b a = C4511d.m27510a("errorCode");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35827a(1);
        f7075b = a.m27505b(z1Var.m35826b()).m27506a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        fVar.mo5192a(f7075b, ((C1744g9) obj).m36021a());
    }
}
