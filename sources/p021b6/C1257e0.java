package p021b6;

import android.content.Context;
import p018b3.C1165r;
import p047d7.C3896w;
import p178m7.AbstractC6794b;
import p339y2.AbstractC10356f;
import p339y2.AbstractC10357g;
import p339y2.C10352b;
import p354z2.C11229a;

public final class C1257e0 implements AbstractC1289y {
    public AbstractC6794b<AbstractC10356f<byte[]>> f4618a;
    public final AbstractC6794b<AbstractC10356f<byte[]>> f4619b;
    public final AbstractC1285u f4620c;

    public C1257e0(Context context, AbstractC1285u uVar) {
        this.f4620c = uVar;
        C11229a aVar = C11229a.f35947g;
        C1165r.m38247f(context);
        final AbstractC10357g g = C1165r.m38250c().m38246g(aVar);
        if (aVar.mo1185a().contains(C10352b.m5368b("json"))) {
            this.f4618a = new C3896w(new AbstractC6794b() {
                @Override
                public final Object get() {
                    return AbstractC10357g.this.mo5361a("FIREBASE_ML_SDK", byte[].class, C10352b.m5368b("json"), C1249a0.f4612a);
                }
            });
        }
        this.f4619b = new C3896w(new AbstractC6794b() {
            @Override
            public final Object get() {
                return AbstractC10357g.this.mo5361a("FIREBASE_ML_SDK", byte[].class, C10352b.m5368b("proto"), C1251b0.f4613a);
            }
        });
    }
}
