package l5;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import k5.b;
import n6.m;

public abstract class k2<T> extends p1 {
    public final m<T> f16127b;

    public k2(int i10, m<T> mVar) {
        super(i10);
        this.f16127b = mVar;
    }

    @Override
    public final void a(Status status) {
        this.f16127b.d(new b(status));
    }

    @Override
    public final void b(Exception exc) {
        this.f16127b.d(exc);
    }

    @Override
    public final void d(c1<?> c1Var) {
        try {
            h(c1Var);
        } catch (DeadObjectException e10) {
            a(p2.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(p2.e(e11));
        } catch (RuntimeException e12) {
            this.f16127b.d(e12);
        }
    }

    public abstract void h(c1<?> c1Var);
}
