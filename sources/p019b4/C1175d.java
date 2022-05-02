package p019b4;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p020b5.C1186a;
import p020b5.C1189b0;
import p174m3.C6556a2;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8971q;

public class C1175d implements AbstractC8958f {
    public static final AbstractC8965l f4422d = C1174c.f4421b;
    public AbstractC8960h f4423a;
    public AbstractC1180i f4424b;
    public boolean f4425c;

    public static AbstractC8958f[] m38225d() {
        return new AbstractC8958f[]{new C1175d()};
    }

    public static C1189b0 m38224g(C1189b0 b0Var) {
        b0Var.m38144P(0);
        return b0Var;
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        AbstractC1180i iVar = this.f4424b;
        if (iVar != null) {
            iVar.m38202m(j, j2);
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        C1186a.m38182h(this.f4423a);
        if (this.f4424b == null) {
            if (m38223h(gVar)) {
                gVar.mo10809m();
            } else {
                throw C6556a2.m20112a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f4425c) {
            AbstractC8974t r = this.f4423a.mo6039r(0, 1);
            this.f4423a.mo6040m();
            this.f4424b.m38207d(this.f4423a, r);
            this.f4425c = true;
        }
        return this.f4424b.m38206g(gVar, qVar);
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f4423a = hVar;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean m38223h(AbstractC8959g gVar) {
        C1177f fVar = new C1177f();
        if (fVar.m38216a(gVar, true) && (fVar.f4432b & 2) == 2) {
            int min = Math.min(fVar.f4439i, 8);
            C1189b0 b0Var = new C1189b0(min);
            gVar.mo10806q(b0Var.m38139d(), 0, min);
            if (C1172b.m38228p(m38224g(b0Var))) {
                this.f4424b = new C1172b();
            } else if (C1184j.m38190r(m38224g(b0Var))) {
                this.f4424b = new C1184j();
            } else if (C1179h.m38211o(m38224g(b0Var))) {
                this.f4424b = new C1179h();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        try {
            return m38223h(gVar);
        } catch (C6556a2 unused) {
            return false;
        }
    }
}
