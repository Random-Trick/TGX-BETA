package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C1770i5 implements AbstractC4514e<C1728f8> {
    public static final C1770i5 f6366a = new C1770i5();
    public static final C4511d f6367b;
    public static final C4511d f6368c;
    public static final C4511d f6369d;
    public static final C4511d f6370e;
    public static final C4511d f6371f;
    public static final C4511d f6372g;
    public static final C4511d f6373h;
    public static final C4511d f6374i;
    public static final C4511d f6375j;
    public static final C4511d f6376k;

    static {
        C4511d.C4513b a = C4511d.m27508a("durationMs");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35824a(1);
        f6367b = a.m27503b(z1Var.m35823b()).m27504a();
        C4511d.C4513b a2 = C4511d.m27508a("errorCode");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35824a(2);
        f6368c = a2.m27503b(z1Var2.m35823b()).m27504a();
        C4511d.C4513b a3 = C4511d.m27508a("isColdCall");
        C2007z1 z1Var3 = new C2007z1();
        z1Var3.m35824a(3);
        f6369d = a3.m27503b(z1Var3.m35823b()).m27504a();
        C4511d.C4513b a4 = C4511d.m27508a("autoManageModelOnBackground");
        C2007z1 z1Var4 = new C2007z1();
        z1Var4.m35824a(4);
        f6370e = a4.m27503b(z1Var4.m35823b()).m27504a();
        C4511d.C4513b a5 = C4511d.m27508a("autoManageModelOnLowMemory");
        C2007z1 z1Var5 = new C2007z1();
        z1Var5.m35824a(5);
        f6371f = a5.m27503b(z1Var5.m35823b()).m27504a();
        C4511d.C4513b a6 = C4511d.m27508a("isNnApiEnabled");
        C2007z1 z1Var6 = new C2007z1();
        z1Var6.m35824a(6);
        f6372g = a6.m27503b(z1Var6.m35823b()).m27504a();
        C4511d.C4513b a7 = C4511d.m27508a("eventsCount");
        C2007z1 z1Var7 = new C2007z1();
        z1Var7.m35824a(7);
        f6373h = a7.m27503b(z1Var7.m35823b()).m27504a();
        C4511d.C4513b a8 = C4511d.m27508a("otherErrors");
        C2007z1 z1Var8 = new C2007z1();
        z1Var8.m35824a(8);
        f6374i = a8.m27503b(z1Var8.m35823b()).m27504a();
        C4511d.C4513b a9 = C4511d.m27508a("remoteConfigValueForAcceleration");
        C2007z1 z1Var9 = new C2007z1();
        z1Var9.m35824a(9);
        f6375j = a9.m27503b(z1Var9.m35823b()).m27504a();
        C4511d.C4513b a10 = C4511d.m27508a("isAccelerated");
        C2007z1 z1Var10 = new C2007z1();
        z1Var10.m35824a(10);
        f6376k = a10.m27503b(z1Var10.m35823b()).m27504a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C1728f8 f8Var = (C1728f8) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f6367b, f8Var.m36052e());
        fVar2.mo5192a(f6368c, f8Var.m36056a());
        fVar2.mo5192a(f6369d, f8Var.m36053d());
        fVar2.mo5192a(f6370e, f8Var.m36055b());
        fVar2.mo5192a(f6371f, f8Var.m36054c());
        fVar2.mo5192a(f6372g, null);
        fVar2.mo5192a(f6373h, null);
        fVar2.mo5192a(f6374i, null);
        fVar2.mo5192a(f6375j, null);
        fVar2.mo5192a(f6376k, null);
    }
}
