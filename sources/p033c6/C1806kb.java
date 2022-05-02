package p033c6;

import android.content.Context;
import p018b3.C1165r;
import p047d7.C3896w;
import p178m7.AbstractC6794b;
import p339y2.AbstractC10353c;
import p339y2.AbstractC10356f;
import p339y2.AbstractC10357g;
import p339y2.C10352b;
import p354z2.C11229a;

public final class C1806kb implements AbstractC1671bb {
    public AbstractC6794b<AbstractC10356f<byte[]>> f6448a;
    public final AbstractC6794b<AbstractC10356f<byte[]>> f6449b;
    public final AbstractC1960va f6450c;

    public C1806kb(Context context, AbstractC1960va vaVar) {
        this.f6450c = vaVar;
        C11229a aVar = C11229a.f35947g;
        C1165r.m38247f(context);
        final AbstractC10357g g = C1165r.m38250c().m38246g(aVar);
        if (aVar.mo1185a().contains(C10352b.m5368b("json"))) {
            this.f6448a = new C3896w(new AbstractC6794b() {
                @Override
                public final Object get() {
                    return AbstractC10357g.this.mo5361a("FIREBASE_ML_SDK", byte[].class, C10352b.m5368b("json"), C1746gb.f6315a);
                }
            });
        }
        this.f6449b = new C3896w(new AbstractC6794b() {
            @Override
            public final Object get() {
                return AbstractC10357g.this.mo5361a("FIREBASE_ML_SDK", byte[].class, C10352b.m5368b("proto"), C1761hb.f6353a);
            }
        });
    }

    public static AbstractC10353c<byte[]> m35976b(AbstractC1960va vaVar, C1731fb fbVar) {
        int a = vaVar.mo35846a();
        if (fbVar.m36051a() != 0) {
            return AbstractC10353c.m5364d(fbVar.m36049c(a, false));
        }
        return AbstractC10353c.m5363e(fbVar.m36049c(a, false));
    }

    @Override
    public final void mo35840a(C1731fb fbVar) {
        if (this.f6450c.mo35846a() == 0) {
            AbstractC6794b<AbstractC10356f<byte[]>> bVar = this.f6448a;
            if (bVar != null) {
                bVar.get().mo5362a(m35976b(this.f6450c, fbVar));
                return;
            }
            return;
        }
        this.f6449b.get().mo5362a(m35976b(this.f6450c, fbVar));
    }
}
