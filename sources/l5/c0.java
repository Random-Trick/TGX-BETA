package l5;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import k5.a;
import m5.c;
import m5.r;

public final class c0 implements c.AbstractC0154c {
    public final WeakReference<l0> f16038a;
    public final a<?> f16039b;
    public final boolean f16040c;

    public c0(l0 l0Var, a<?> aVar, boolean z10) {
        this.f16038a = new WeakReference<>(l0Var);
        this.f16039b = aVar;
        this.f16040c = z10;
    }

    @Override
    public final void c(j5.a aVar) {
        u0 u0Var;
        Lock lock;
        Lock lock2;
        boolean q10;
        boolean J;
        Lock lock3;
        l0 l0Var = this.f16038a.get();
        if (l0Var != null) {
            Looper myLooper = Looper.myLooper();
            u0Var = l0Var.f16128a;
            r.n(myLooper == u0Var.f16252n.j(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            lock = l0Var.f16129b;
            lock.lock();
            try {
                q10 = l0Var.q(0);
                if (!q10) {
                    lock3 = l0Var.f16129b;
                } else {
                    if (!aVar.f()) {
                        l0Var.k(aVar, this.f16039b, this.f16040c);
                    }
                    J = l0Var.J();
                    if (J) {
                        l0Var.i();
                    }
                    lock3 = l0Var.f16129b;
                }
                lock3.unlock();
            } catch (Throwable th) {
                lock2 = l0Var.f16129b;
                lock2.unlock();
                throw th;
            }
        }
    }
}
