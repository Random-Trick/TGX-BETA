package l5;

import android.os.Bundle;
import j5.a;
import java.util.concurrent.locks.Lock;

public final class d3 implements j1 {
    public final e3 f16060a;

    public d3(e3 e3Var, b3 b3Var) {
        this.f16060a = e3Var;
    }

    @Override
    public final void a(a aVar) {
        Lock lock;
        Lock lock2;
        lock = this.f16060a.f16076m;
        lock.lock();
        try {
            this.f16060a.f16074k = aVar;
            e3.o(this.f16060a);
        } finally {
            lock2 = this.f16060a.f16076m;
            lock2.unlock();
        }
    }

    @Override
    public final void b(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f16060a.f16076m;
        lock.lock();
        try {
            this.f16060a.f16074k = a.N;
            e3.o(this.f16060a);
        } finally {
            lock2 = this.f16060a.f16076m;
            lock2.unlock();
        }
    }

    @Override
    public final void c(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        u0 u0Var;
        Lock lock3;
        lock = this.f16060a.f16076m;
        lock.lock();
        try {
            z11 = this.f16060a.f16075l;
            if (z11) {
                this.f16060a.f16075l = false;
                e3.u(this.f16060a, i10, z10);
                lock3 = this.f16060a.f16076m;
            } else {
                this.f16060a.f16075l = true;
                u0Var = this.f16060a.f16067d;
                u0Var.q(i10);
                lock3 = this.f16060a.f16076m;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f16060a.f16076m;
            lock2.unlock();
            throw th;
        }
    }
}
