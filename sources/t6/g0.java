package t6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class g0 extends d0 implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override
    public final void N(String str, Bundle bundle, k0 k0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.c(q10, k0Var);
        r(3, q10);
    }

    @Override
    public final void v(String str, Bundle bundle, k0 k0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.c(q10, k0Var);
        r(2, q10);
    }
}
