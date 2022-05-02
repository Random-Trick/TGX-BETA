package p342y5;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;
import p287u7.C9457b;

public final class C10400h implements AbstractC4514e<C9457b> {
    public static final C10400h f33468a = new C10400h();
    public static final C4511d f33469b;

    static {
        C4511d.C4513b a = C4511d.m27508a("messagingClientEvent");
        C10390b0 b0Var = new C10390b0();
        b0Var.m5194a(1);
        f33469b = a.m27503b(b0Var.m5193b()).m27504a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        fVar.mo5192a(f33469b, ((C9457b) obj).m8587a());
    }
}
