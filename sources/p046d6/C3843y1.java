package p046d6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4511d;

public final class C3843y1 implements AbstractC4514e<C3801t4> {
    public static final C3843y1 f12942a = new C3843y1();
    public static final C4511d f12943b;
    public static final C4511d f12944c;
    public static final C4511d f12945d;
    public static final C4511d f12946e;
    public static final C4511d f12947f;
    public static final C4511d f12948g;
    public static final C4511d f12949h;

    static {
        C4511d.C4513b a = C4511d.m27510a("durationMs");
        C3663e8 e8Var = new C3663e8();
        e8Var.m29843a(1);
        f12943b = a.m27505b(e8Var.m29842b()).m27506a();
        C4511d.C4513b a2 = C4511d.m27510a("imageSource");
        C3663e8 e8Var2 = new C3663e8();
        e8Var2.m29843a(2);
        f12944c = a2.m27505b(e8Var2.m29842b()).m27506a();
        C4511d.C4513b a3 = C4511d.m27510a("imageFormat");
        C3663e8 e8Var3 = new C3663e8();
        e8Var3.m29843a(3);
        f12945d = a3.m27505b(e8Var3.m29842b()).m27506a();
        C4511d.C4513b a4 = C4511d.m27510a("imageByteSize");
        C3663e8 e8Var4 = new C3663e8();
        e8Var4.m29843a(4);
        f12946e = a4.m27505b(e8Var4.m29842b()).m27506a();
        C4511d.C4513b a5 = C4511d.m27510a("imageWidth");
        C3663e8 e8Var5 = new C3663e8();
        e8Var5.m29843a(5);
        f12947f = a5.m27505b(e8Var5.m29842b()).m27506a();
        C4511d.C4513b a6 = C4511d.m27510a("imageHeight");
        C3663e8 e8Var6 = new C3663e8();
        e8Var6.m29843a(6);
        f12948g = a6.m27505b(e8Var6.m29842b()).m27506a();
        C4511d.C4513b a7 = C4511d.m27510a("rotationDegrees");
        C3663e8 e8Var7 = new C3663e8();
        e8Var7.m29843a(7);
        f12949h = a7.m27505b(e8Var7.m29842b()).m27506a();
    }

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        C3801t4 t4Var = (C3801t4) obj;
        AbstractC4515f fVar2 = fVar;
        fVar2.mo5192a(f12943b, t4Var.m29750g());
        fVar2.mo5192a(f12944c, t4Var.m29755b());
        fVar2.mo5192a(f12945d, t4Var.m29756a());
        fVar2.mo5192a(f12946e, t4Var.m29754c());
        fVar2.mo5192a(f12947f, t4Var.m29752e());
        fVar2.mo5192a(f12948g, t4Var.m29753d());
        fVar2.mo5192a(f12949h, t4Var.m29751f());
    }
}
