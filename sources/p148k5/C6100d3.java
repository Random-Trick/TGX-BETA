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
    public final void mo21179a(C5217a aVar) {
        Lock lock;
        Lock lock2;
        lock = this.f19348a.f19364m;
        lock.lock();
        try {
            this.f19348a.f19362k = aVar;
            C6105e3.m21326o(this.f19348a);
        } finally {
            lock2 = this.f19348a.f19364m;
            lock2.unlock();
        }
    }

    @Override
    public final void mo21178b(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f19348a.f19364m;
        lock.lock();
        try {
            this.f19348a.f19362k = C5217a.f17353N;
            C6105e3.m21326o(this.f19348a);
        } finally {
            lock2 = this.f19348a.f19364m;
            lock2.unlock();
        }
    }

    @Override
    public final void mo21177c(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        C6173u0 u0Var;
        Lock lock3;
        lock = this.f19348a.f19364m;
        lock.lock();
        try {
            z2 = this.f19348a.f19363l;
            if (z2) {
                this.f19348a.f19363l = false;
                C6105e3.m21320u(this.f19348a, i, z);
                lock3 = this.f19348a.f19364m;
            } else {
                this.f19348a.f19363l = true;
                u0Var = this.f19348a.f19355d;
                u0Var.mo21081q(i);
                lock3 = this.f19348a.f19364m;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f19348a.f19364m;
            lock2.unlock();
            throw th;
        }
    }
}
