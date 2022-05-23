package t6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class l0 extends d0 implements n0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override
    public final void A1(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.b(q10, bundle2);
        f0.c(q10, p0Var);
        r(9, q10);
    }

    @Override
    public final void V(String str, Bundle bundle, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.c(q10, p0Var);
        r(10, q10);
    }

    @Override
    public final void a0(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.b(q10, bundle2);
        f0.c(q10, p0Var);
        r(6, q10);
    }

    @Override
    public final void k0(String str, Bundle bundle, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.c(q10, p0Var);
        r(5, q10);
    }

    @Override
    public final void k1(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.b(q10, bundle2);
        f0.c(q10, p0Var);
        r(7, q10);
    }

    @Override
    public final void o0(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        f0.b(q10, bundle);
        f0.b(q10, bundle2);
        f0.c(q10, p0Var);
        r(11, q10);
    }

    @Override
    public final void x(String str, List list, Bundle bundle, p0 p0Var) {
        Parcel q10 = q();
        q10.writeString(str);
        q10.writeTypedList(list);
        f0.b(q10, bundle);
        f0.c(q10, p0Var);
        r(14, q10);
    }
}
