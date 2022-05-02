package p031c4;

import java.util.List;
import p020b5.C1186a;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;
import p270t3.C8953b;

public final class C1558d0 {
    public final List<C6600g1> f5552a;
    public final AbstractC8974t[] f5553b;

    public C1558d0(List<C6600g1> list) {
        this.f5552a = list;
        this.f5553b = new AbstractC8974t[list.size()];
    }

    public void m36474a(long j, C1189b0 b0Var) {
        C8953b.m10845a(j, b0Var, this.f5553b);
    }

    public void m36473b(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        for (int i = 0; i < this.f5553b.length; i++) {
            dVar.m36409a();
            AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 3);
            C6600g1 g1Var = this.f5552a.get(i);
            String str = g1Var.f20575U;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            C1186a.m38191b(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = g1Var.f20581a;
            if (str2 == null) {
                str2 = dVar.m36408b();
            }
            r.mo10797a(new C6600g1.C6602b().m19876S(str2).m19859e0(str).m19855g0(g1Var.f20567M).m19873V(g1Var.f20585c).m19889F(g1Var.f20596m0).m19875T(g1Var.f20577W).m19890E());
            this.f5553b[i] = r;
        }
    }
}
