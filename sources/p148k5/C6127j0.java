package p148k5;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p118i5.C5217a;
import p133j5.AbstractC5867f;
import p134j6.AbstractC5891f;
import p163l5.C6336e;
import p163l5.C6378r;

public final class C6127j0 implements AbstractC5867f.AbstractC5869b, AbstractC5867f.AbstractC5870c {
    public final C6135l0 f19423a;

    public C6127j0(C6135l0 l0Var, RunnableC6086b0 b0Var) {
        this.f19423a = l0Var;
    }

    @Override
    public final void mo21081q(int i) {
    }

    @Override
    public final void mo11483s(C5217a aVar) {
        Lock lock;
        Lock lock2;
        boolean m;
        lock = this.f19423a.f19442b;
        lock.lock();
        try {
            m = this.f19423a.m21218m(aVar);
            if (m) {
                this.f19423a.m21219l();
                this.f19423a.m21222i();
            } else {
                this.f19423a.m21217n(aVar);
            }
        } finally {
            lock2 = this.f19423a.f19442b;
            lock2.unlock();
        }
    }

    @Override
    public final void mo21080t(Bundle bundle) {
        C6336e eVar;
        AbstractC5891f fVar;
        eVar = this.f19423a.f19458r;
        C6336e eVar2 = (C6336e) C6378r.m20507k(eVar);
        fVar = this.f19423a.f19451k;
        ((AbstractC5891f) C6378r.m20507k(fVar)).mo21078f(new BinderC6123i0(this.f19423a));
    }
}
