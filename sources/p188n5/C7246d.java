package p188n5;

import android.content.Context;
import p133j5.AbstractC5864e;
import p133j5.C5850a;
import p148k5.AbstractC6147o;
import p148k5.AbstractC6159r;
import p163l5.AbstractC6395x;
import p163l5.C6390v;
import p163l5.C6397y;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p299v5.C9844d;

public final class C7246d extends AbstractC5864e<C6397y> implements AbstractC6395x {
    public static final C5850a.C5860g<C7247e> f23061k;
    public static final C5850a.AbstractC5851a<C7247e, C6397y> f23062l;
    public static final C5850a<C6397y> f23063m;
    public static final int f23064n = 0;

    static {
        C5850a.C5860g<C7247e> gVar = new C5850a.C5860g<>();
        f23061k = gVar;
        C7245c cVar = new C7245c();
        f23062l = cVar;
        f23063m = new C5850a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C7246d(Context context, C6397y yVar) {
        super(context, f23063m, yVar, AbstractC5864e.C5865a.f18737c);
    }

    @Override
    public final AbstractC6775l<Void> mo17209a(final C6390v vVar) {
        AbstractC6159r.C6160a a = AbstractC6159r.m21159a();
        a.m21151d(C9844d.f32123a);
        a.m21152c(false);
        a.m21153b(new AbstractC6147o(vVar) {
            public final C6390v f23060a;

            {
                this.f23060a = vVar;
            }

            @Override
            public final void mo17211a(Object obj, Object obj2) {
                C6390v vVar2 = this.f23060a;
                int i = C7246d.f23064n;
                ((C7243a) ((C7247e) obj).m20665G()).m17212G1(vVar2);
                ((C6777m) obj2).m19084c(null);
            }
        });
        return m21925c(a.m21154a());
    }
}
