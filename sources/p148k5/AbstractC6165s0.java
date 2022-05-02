package p148k5;

import java.util.concurrent.locks.Lock;

public abstract class AbstractC6165s0 {
    public final AbstractC6161r0 f19538a;

    public AbstractC6165s0(AbstractC6161r0 r0Var) {
        this.f19538a = r0Var;
    }

    public abstract void mo21084a();

    public final void m21134b(C6173u0 u0Var) {
        Lock lock;
        Lock lock2;
        AbstractC6161r0 r0Var;
        Lock lock3;
        lock = u0Var.f19553a;
        lock.lock();
        try {
            r0Var = u0Var.f19563k;
            if (r0Var != this.f19538a) {
                lock3 = u0Var.f19553a;
            } else {
                mo21084a();
                lock3 = u0Var.f19553a;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = u0Var.f19553a;
            lock2.unlock();
            throw th;
        }
    }
}
