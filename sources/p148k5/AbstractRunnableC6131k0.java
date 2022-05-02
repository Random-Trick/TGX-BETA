package p148k5;

import java.util.concurrent.locks.Lock;

public abstract class AbstractRunnableC6131k0 implements Runnable {
    public final C6135l0 f19439a;

    public abstract void mo21233a();

    @Override
    public final void run() {
        Lock lock;
        C6173u0 u0Var;
        Lock lock2;
        Lock lock3;
        lock = this.f19439a.f19442b;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock2 = this.f19439a.f19442b;
                } else {
                    mo21233a();
                    lock2 = this.f19439a.f19442b;
                }
            } catch (RuntimeException e) {
                u0Var = this.f19439a.f19441a;
                u0Var.m21108l(e);
                lock2 = this.f19439a.f19442b;
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock3 = this.f19439a.f19442b;
            lock3.unlock();
            throw th;
        }
    }
}
