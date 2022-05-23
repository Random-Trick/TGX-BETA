package b5;

import c5.a;
import c5.l0;
import java.util.ArrayList;
import java.util.Map;

public abstract class f implements k {
    public final boolean f3860a;
    public final ArrayList<i0> f3861b = new ArrayList<>(1);
    public int f3862c;
    public o f3863d;

    public f(boolean z10) {
        this.f3860a = z10;
    }

    @Override
    public final void i(i0 i0Var) {
        a.e(i0Var);
        if (!this.f3861b.contains(i0Var)) {
            this.f3861b.add(i0Var);
            this.f3862c++;
        }
    }

    @Override
    public Map l() {
        return j.a(this);
    }

    public final void s(int i10) {
        o oVar = (o) l0.j(this.f3863d);
        for (int i11 = 0; i11 < this.f3862c; i11++) {
            this.f3861b.get(i11).e(this, oVar, this.f3860a, i10);
        }
    }

    public final void t() {
        o oVar = (o) l0.j(this.f3863d);
        for (int i10 = 0; i10 < this.f3862c; i10++) {
            this.f3861b.get(i10).c(this, oVar, this.f3860a);
        }
        this.f3863d = null;
    }

    public final void u(o oVar) {
        for (int i10 = 0; i10 < this.f3862c; i10++) {
            this.f3861b.get(i10).g(this, oVar, this.f3860a);
        }
    }

    public final void v(o oVar) {
        this.f3863d = oVar;
        for (int i10 = 0; i10 < this.f3862c; i10++) {
            this.f3861b.get(i10).d(this, oVar, this.f3860a);
        }
    }
}
