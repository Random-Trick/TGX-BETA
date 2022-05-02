package p031c4;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1597v implements AbstractC1554b0 {
    public C6600g1 f5849a;
    public C1205i0 f5850b;
    public AbstractC8974t f5851c;

    public C1597v(String str) {
        this.f5849a = new C6600g1.C6602b().m19859e0(str).m19890E();
    }

    @Override
    public void mo36324a(C1205i0 i0Var, AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        this.f5850b = i0Var;
        dVar.m36409a();
        AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 5);
        this.f5851c = r;
        r.mo10797a(this.f5849a);
    }

    @Override
    public void mo36323b(C1189b0 b0Var) {
        m36322c();
        long d = this.f5850b.m38053d();
        long e = this.f5850b.m38052e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C6600g1 g1Var = this.f5849a;
            if (e != g1Var.f20579Y) {
                C6600g1 E = g1Var.m19902b().m19851i0(e).m19890E();
                this.f5849a = E;
                this.f5851c.mo10797a(E);
            }
            int a = b0Var.m38145a();
            this.f5851c.mo10795c(b0Var, a);
            this.f5851c.mo10793e(d, 1, a, 0, null);
        }
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    public final void m36322c() {
        C1186a.m38185h(this.f5850b);
        C1216l0.m37971j(this.f5851c);
    }
}
