package p148k5;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p118i5.C5217a;

public final class C6100d3 implements AbstractC6128j1 {
    public final C6105e3 f19348a;

    public C6100d3(C6105e3 e3Var, RunnableC6089b3 b3Var) {
        this.f19348a = e3Var;
    }

    @Override
    public final void mo21178a(C5217a aVar) {
        this.f19348a.f19364m.lock();
        try {
            this.f19348a.f19362k = aVar;
            C6105e3.m21325o(this.f19348a);
        } finally {
            this.f19348a.f19364m.unlock();
        }
    }

    @Override
    public final void mo21177b(Bundle bundle) {
        this.f19348a.f19364m.lock();
        try {
            this.f19348a.f19362k = C5217a.f17353N;
            C6105e3.m21325o(this.f19348a);
        } finally {
            this.f19348a.f19364m.unlock();
        }
    }

    @Override
    public final void mo21176c(int i, boolean z) {
        Lock lock;
        this.f19348a.f19364m.lock();
        try {
            if (this.f19348a.f19363l) {
                this.f19348a.f19363l = false;
                C6105e3.m21319u(this.f19348a, i, z);
                lock = this.f19348a.f19364m;
            } else {
                this.f19348a.f19363l = true;
                this.f19348a.f19355d.mo21080q(i);
                lock = this.f19348a.f19364m;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f19348a.f19364m.unlock();
            throw th;
        }
    }
}
