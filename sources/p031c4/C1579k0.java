package p031c4;

import java.util.List;
import p020b5.C1186a;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;
import p270t3.C8953b;

public final class C1579k0 {
    public final List<C6600g1> f5673a;
    public final AbstractC8974t[] f5674b;

    public C1579k0(List<C6600g1> list) {
        this.f5673a = list;
        this.f5674b = new AbstractC8974t[list.size()];
    }

    public void m36392a(long j, C1189b0 b0Var) {
        if (b0Var.m38145a() >= 9) {
            int n = b0Var.m38132n();
            int n2 = b0Var.m38132n();
            int D = b0Var.m38159D();
            if (n == 434 && n2 == 1195456820 && D == 3) {
                C8953b.m10844b(j, b0Var, this.f5674b);
            }
        }
    }

    public void m36391b(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        for (int i = 0; i < this.f5674b.length; i++) {
            dVar.m36409a();
            AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 3);
            C6600g1 g1Var = this.f5673a.get(i);
            String str = g1Var.f20575U;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            C1186a.m38191b(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            r.mo10797a(new C6600g1.C6602b().m19876S(dVar.m36408b()).m19859e0(str).m19855g0(g1Var.f20567M).m19873V(g1Var.f20585c).m19889F(g1Var.f20596m0).m19875T(g1Var.f20577W).m19890E());
            this.f5674b[i] = r;
        }
    }
}
