package p046d6;

import android.content.Context;
import p018b3.C1165r;
import p047d7.C3896w;
import p178m7.AbstractC6794b;
import p339y2.AbstractC10353c;
import p339y2.AbstractC10356f;
import p339y2.AbstractC10357g;
import p339y2.C10352b;
import p354z2.C11229a;

public final class C3741m7 implements AbstractC3662e7 {
    public AbstractC6794b<AbstractC10356f<byte[]>> f12688a;
    public final AbstractC6794b<AbstractC10356f<byte[]>> f12689b;
    public final AbstractC3857z6 f12690c;

    public C3741m7(Context context, AbstractC3857z6 z6Var) {
        this.f12690c = z6Var;
        C11229a aVar = C11229a.f35947g;
        C1165r.m38247f(context);
        final AbstractC10357g g = C1165r.m38250c().m38246g(aVar);
        if (aVar.mo1185a().contains(C10352b.m5368b("json"))) {
            this.f12688a = new C3896w(new AbstractC6794b() {
                @Override
                public final Object get() {
                    return AbstractC10357g.this.mo5361a("FIREBASE_ML_SDK", byte[].class, C10352b.m5368b("json"), C3692h7.f12565a);
                }
            });
        }
        this.f12689b = new C3896w(new AbstractC6794b() {
            @Override
            public final Object get() {
                return AbstractC10357g.this.mo5361a("FIREBASE_ML_SDK", byte[].class, C10352b.m5368b("proto"), C3712j7.f12607a);
            }
        });
    }

    public static AbstractC10353c<byte[]> m29806b(AbstractC3857z6 z6Var, C3682g7 g7Var) {
        return AbstractC10353c.m5363e(g7Var.m29828b(z6Var.mo29728a(), false));
    }

    @Override
    public final void mo29807a(C3682g7 g7Var) {
        if (this.f12690c.mo29728a() == 0) {
            AbstractC6794b<AbstractC10356f<byte[]>> bVar = this.f12688a;
            if (bVar != null) {
                bVar.get().mo5362a(m29806b(this.f12690c, g7Var));
                return;
            }
            return;
        }
        this.f12689b.get().mo5362a(m29806b(this.f12690c, g7Var));
    }
}
