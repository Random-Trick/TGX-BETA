package l5;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class p2 {
    public final int f16184a;

    public p2(int i10) {
        this.f16184a = i10;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(u uVar, boolean z10);

    public abstract void d(c1<?> c1Var);
}
