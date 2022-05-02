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
        this.f5849a = new C6600g1.C6602b().m19858e0(str).m19889E();
    }

    @Override
    public void mo36321a(C1205i0 i0Var, AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        this.f5850b = i0Var;
        dVar.m36406a();
        AbstractC8974t r = hVar.mo6039r(dVar.m36404c(), 5);
        this.f5851c = r;
        r.mo10798a(this.f5849a);
    }

    @Override
    public void mo36320b(C1189b0 b0Var) {
        m36319c();
        long d = this.f5850b.m38050d();
        long e = this.f5850b.m38049e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C6600g1 g1Var = this.f5849a;
            if (e != g1Var.f20579Y) {
                C6600g1 E = g1Var.m19901b().m19850i0(e).m19889E();
                this.f5849a = E;
                this.f5851c.mo10798a(E);
            }
            int a = b0Var.m38142a();
            this.f5851c.mo10796c(b0Var, a);
            this.f5851c.mo10794e(d, 1, a, 0, null);
        }
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    public final void m36319c() {
        C1186a.m38182h(this.f5850b);
        C1216l0.m37968j(this.f5851c);
    }
}
