package p134j6;

import com.google.android.gms.common.api.Scope;
import p133j5.C5850a;
import p149k6.C6196a;

public final class C5890e {
    public static final C5850a.C5860g<C6196a> f18773a;
    public static final C5850a.C5860g<C6196a> f18774b;
    public static final C5850a.AbstractC5851a<C6196a, C5886a> f18775c;
    public static final C5850a.AbstractC5851a<C6196a, C5889d> f18776d;
    public static final Scope f18777e = new Scope("profile");
    public static final Scope f18778f = new Scope("email");
    public static final C5850a<C5886a> f18779g;
    public static final C5850a<C5889d> f18780h;

    static {
        C5850a.C5860g<C6196a> gVar = new C5850a.C5860g<>();
        f18773a = gVar;
        C5850a.C5860g<C6196a> gVar2 = new C5850a.C5860g<>();
        f18774b = gVar2;
        C5887b bVar = new C5887b();
        f18775c = bVar;
        C5888c cVar = new C5888c();
        f18776d = cVar;
        f18779g = new C5850a<>("SignIn.API", bVar, gVar);
        f18780h = new C5850a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
