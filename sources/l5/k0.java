package l5;

import java.util.concurrent.locks.Lock;

public abstract class k0 implements Runnable {
    public final l0 f16126a;

    public abstract void a();

    @Override
    public final void run() {
        Lock lock;
        u0 u0Var;
        Lock lock2;
        Lock lock3;
        lock = this.f16126a.f16129b;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock2 = this.f16126a.f16129b;
                } else {
                    a();
                    lock2 = this.f16126a.f16129b;
                }
            } catch (RuntimeException e10) {
                u0Var = this.f16126a.f16128a;
                u0Var.l(e10);
                lock2 = this.f16126a.f16129b;
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock3 = this.f16126a.f16129b;
            lock3.unlock();
            throw th;
        }
    }
}
