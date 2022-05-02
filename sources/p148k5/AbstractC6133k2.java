package p148k5;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p133j5.C5861b;
import p177m6.C6777m;

public abstract class AbstractC6133k2<T> extends AbstractC6153p1 {
    public final C6777m<T> f19440b;

    public AbstractC6133k2(int i, C6777m<T> mVar) {
        super(i);
        this.f19440b = mVar;
    }

    @Override
    public final void mo21184a(Status status) {
        this.f19440b.m19083d(new C5861b(status));
    }

    @Override
    public final void mo21183b(Exception exc) {
        this.f19440b.m19083d(exc);
    }

    @Override
    public final void mo21181d(C6093c1<?> c1Var) {
        try {
            mo21188h(c1Var);
        } catch (DeadObjectException e) {
            mo21184a(AbstractC6154p2.m21180e(e));
            throw e;
        } catch (RemoteException e2) {
            mo21184a(AbstractC6154p2.m21180e(e2));
        } catch (RuntimeException e3) {
            this.f19440b.m19083d(e3);
        }
    }

    public abstract void mo21188h(C6093c1<?> c1Var);
}
