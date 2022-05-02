package p148k5;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p118i5.C5217a;
import p133j5.C5850a;
import p163l5.AbstractC6325c;
import p163l5.C6378r;

public final class C6092c0 implements AbstractC6325c.AbstractC6328c {
    public final WeakReference<C6135l0> f19326a;
    public final C5850a<?> f19327b;
    public final boolean f19328c;

    public C6092c0(C6135l0 l0Var, C5850a<?> aVar, boolean z) {
        this.f19326a = new WeakReference<>(l0Var);
        this.f19327b = aVar;
        this.f19328c = z;
    }

    @Override
    public final void mo20623b(C5217a aVar) {
        C6173u0 u0Var;
        Lock lock;
        Lock lock2;
        boolean q;
        boolean J;
        Lock lock3;
        C6135l0 l0Var = this.f19326a.get();
        if (l0Var != null) {
            Looper myLooper = Looper.myLooper();
            u0Var = l0Var.f19441a;
            C6378r.m20504n(myLooper == u0Var.f19566n.mo21172j(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            lock = l0Var.f19442b;
            lock.lock();
            try {
                q = l0Var.m21214q(0);
                if (!q) {
                    lock3 = l0Var.f19442b;
                } else {
                    if (!aVar.m23612f()) {
                        l0Var.m21220k(aVar, this.f19327b, this.f19328c);
                    }
                    J = l0Var.m21223J();
                    if (J) {
                        l0Var.m21222i();
                    }
                    lock3 = l0Var.f19442b;
                }
                lock3.unlock();
            } catch (Throwable th) {
                lock2 = l0Var.f19442b;
                lock2.unlock();
                throw th;
            }
        }
    }
}
