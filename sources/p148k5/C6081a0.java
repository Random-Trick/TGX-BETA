package p148k5;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.util.Set;
import p118i5.C5217a;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p163l5.C6378r;

public final class C6081a0 implements AbstractC6161r0 {
    public final C6173u0 f19304a;
    public boolean f19305b = false;

    public C6081a0(C6173u0 u0Var) {
        this.f19304a = u0Var;
    }

    @Override
    public final void mo21148a() {
        if (this.f19305b) {
            this.f19305b = false;
            this.f19304a.m21108k(new C6192z(this, this));
        }
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21147b(T t) {
        try {
            this.f19304a.f19566n.f19520x.m21252a(t);
            C6156q0 q0Var = this.f19304a.f19566n;
            C5850a.AbstractC5859f fVar = q0Var.f19511o.get(t.m30374s());
            C6378r.m20505l(fVar, "Appropriate Api was not requested.");
            if (fVar.mo21250a() || !this.f19304a.f19559g.containsKey(t.m30374s())) {
                t.m30372u(fVar);
            } else {
                t.m30370w(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f19304a.m21108k(new C6188y(this, this));
        }
        return t;
    }

    @Override
    public final boolean mo21146c() {
        if (this.f19305b) {
            return false;
        }
        Set<C6119h2> set = this.f19304a.f19566n.f19519w;
        if (set == null || set.isEmpty()) {
            this.f19304a.m21109j(null);
            return true;
        }
        this.f19305b = true;
        for (C6119h2 h2Var : set) {
            h2Var.m21270b();
        }
        return false;
    }

    @Override
    public final void mo21145d() {
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21144e(T t) {
        mo21147b(t);
        return t;
    }

    @Override
    public final void mo21143f(Bundle bundle) {
    }

    @Override
    public final void mo21142g(int i) {
        this.f19304a.m21109j(null);
        this.f19304a.f19567o.mo21176c(i, this.f19305b);
    }

    @Override
    public final void mo21141h(C5217a aVar, C5850a<?> aVar2, boolean z) {
    }

    public final void m21389i() {
        if (this.f19305b) {
            this.f19305b = false;
            this.f19304a.f19566n.f19520x.m21251b();
            mo21146c();
        }
    }
}
