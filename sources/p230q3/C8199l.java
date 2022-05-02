package p230q3;

import android.net.Uri;
import java.util.Map;
import p006a5.AbstractC0180y;
import p006a5.C0169t;
import p008a7.C0199c;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6660o1;
import p230q3.C8182h;
import p358z6.AbstractC11403r0;

public final class C8199l implements AbstractC8158b0 {
    public final Object f26552a = new Object();
    public C6660o1.C6667f f26553b;
    public AbstractC8223y f26554c;
    public AbstractC0180y.AbstractC0182b f26555d;
    public String f26556e;

    @Override
    public AbstractC8223y mo13221a(C6660o1 o1Var) {
        AbstractC8223y yVar;
        C1186a.m38185e(o1Var.f20816b);
        C6660o1.C6667f fVar = o1Var.f20816b.f20876c;
        if (fVar == null || C1216l0.f4526a < 18) {
            return AbstractC8223y.f26591a;
        }
        synchronized (this.f26552a) {
            if (!C1216l0.m37982c(fVar, this.f26553b)) {
                this.f26553b = fVar;
                this.f26554c = m13220b(fVar);
            }
            yVar = (AbstractC8223y) C1186a.m38185e(this.f26554c);
        }
        return yVar;
    }

    public final AbstractC8223y m13220b(C6660o1.C6667f fVar) {
        AbstractC0180y.AbstractC0182b bVar = this.f26555d;
        if (bVar == null) {
            bVar = new C0169t.C0171b().m42146c(this.f26556e);
        }
        Uri uri = fVar.f20845c;
        C8198k0 k0Var = new C8198k0(uri == null ? null : uri.toString(), fVar.f20850h, bVar);
        AbstractC11403r0<Map.Entry<String, String>> u = fVar.f20847e.entrySet().iterator();
        while (u.hasNext()) {
            Map.Entry<String, String> next = u.next();
            k0Var.m13222e(next.getKey(), next.getValue());
        }
        C8182h a = new C8182h.C8184b().m13269e(fVar.f20843a, C8195j0.f26543d).m13272b(fVar.f20848f).m13271c(fVar.f20849g).m13270d(C0199c.m42097i(fVar.f20852j)).m13273a(k0Var);
        a.m13296F(0, fVar.m19614c());
        return a;
    }
}
