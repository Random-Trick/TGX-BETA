package p148k5;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class AbstractC6154p2 {
    public final int f19497a;

    public AbstractC6154p2(int i) {
        this.f19497a = i;
    }

    public static Status m21180e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void mo21184a(Status status);

    public abstract void mo21183b(Exception exc);

    public abstract void mo21182c(C6172u uVar, boolean z);

    public abstract void mo21181d(C6093c1<?> c1Var);
}
