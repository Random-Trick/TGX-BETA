package p148k5;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p118i5.C5217a;

public final class C6095c3 implements AbstractC6128j1 {
    public final C6105e3 f19342a;

    public C6095c3(C6105e3 e3Var, RunnableC6089b3 b3Var) {
        this.f19342a = e3Var;
    }

    @Override
    public final void mo21178a(C5217a aVar) {
        C6105e3.m21326n(this.f19342a).lock();
        try {
            C6105e3.m21323q(this.f19342a, aVar);
            C6105e3.m21325o(this.f19342a);
        } finally {
            C6105e3.m21326n(this.f19342a).unlock();
        }
    }

    @Override
    public final void mo21177b(Bundle bundle) {
        C6105e3.m21326n(this.f19342a).lock();
        try {
            C6105e3.m21324p(this.f19342a, bundle);
            C6105e3.m21323q(this.f19342a, C5217a.f17353N);
            C6105e3.m21325o(this.f19342a);
        } finally {
            C6105e3.m21326n(this.f19342a).unlock();
        }
    }

    @Override
    public final void mo21176c(int i, boolean z) {
        Lock n;
        C6105e3.m21326n(this.f19342a).lock();
        try {
            if (!C6105e3.m21322r(this.f19342a) && C6105e3.m21321s(this.f19342a) != null && C6105e3.m21321s(this.f19342a).m23611f()) {
                C6105e3.m21320t(this.f19342a, true);
                C6105e3.m21318v(this.f19342a).mo21080q(i);
                n = C6105e3.m21326n(this.f19342a);
                n.unlock();
            }
            C6105e3.m21320t(this.f19342a, false);
            C6105e3.m21319u(this.f19342a, i, z);
            n = C6105e3.m21326n(this.f19342a);
            n.unlock();
        } catch (Throwable th) {
            C6105e3.m21326n(this.f19342a).unlock();
            throw th;
        }
    }
}
