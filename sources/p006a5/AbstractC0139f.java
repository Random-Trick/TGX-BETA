package p006a5;

import java.util.ArrayList;
import java.util.Map;
import p020b5.C1186a;
import p020b5.C1216l0;

public abstract class AbstractC0139f implements AbstractC0154k {
    public final boolean f506a;
    public final ArrayList<AbstractC0150i0> f507b = new ArrayList<>(1);
    public int f508c;
    public C0159o f509d;

    public AbstractC0139f(boolean z) {
        this.f506a = z;
    }

    @Override
    public final void mo17399g(AbstractC0150i0 i0Var) {
        C1186a.m38185e(i0Var);
        if (!this.f507b.contains(i0Var)) {
            this.f507b.add(i0Var);
            this.f508c++;
        }
    }

    @Override
    public Map mo17398l() {
        return C0151j.m42208a(this);
    }

    public final void m42225s(int i) {
        C0159o oVar = (C0159o) C1216l0.m37968j(this.f509d);
        for (int i2 = 0; i2 < this.f508c; i2++) {
            this.f507b.get(i2).mo42182b(this, oVar, this.f506a, i);
        }
    }

    public final void m42224t() {
        C0159o oVar = (C0159o) C1216l0.m37968j(this.f509d);
        for (int i = 0; i < this.f508c; i++) {
            this.f507b.get(i).mo42180d(this, oVar, this.f506a);
        }
        this.f509d = null;
    }

    public final void m42223u(C0159o oVar) {
        for (int i = 0; i < this.f508c; i++) {
            this.f507b.get(i).mo42178f(this, oVar, this.f506a);
        }
    }

    public final void m42222v(C0159o oVar) {
        this.f509d = oVar;
        for (int i = 0; i < this.f508c; i++) {
            this.f507b.get(i).mo42181c(this, oVar, this.f506a);
        }
    }
}
