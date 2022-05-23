package l5;

import java.util.concurrent.locks.Lock;

public abstract class s0 {
    public final r0 f16224a;

    public s0(r0 r0Var) {
        this.f16224a = r0Var;
    }

    public abstract void a();

    public final void b(u0 u0Var) {
        Lock lock;
        Lock lock2;
        r0 r0Var;
        Lock lock3;
        lock = u0Var.f16239a;
        lock.lock();
        try {
            r0Var = u0Var.f16249k;
            if (r0Var != this.f16224a) {
                lock3 = u0Var.f16239a;
            } else {
                a();
                lock3 = u0Var.f16239a;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = u0Var.f16239a;
            lock2.unlock();
            throw th;
        }
    }
}
