package l6;

import android.os.IBinder;
import android.os.Parcel;
import m5.k;
import w5.a;
import w5.c;

public final class g extends a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void E1(int i10) {
        Parcel q10 = q();
        q10.writeInt(i10);
        t(7, q10);
    }

    public final void F1(k kVar, int i10, boolean z10) {
        Parcel q10 = q();
        c.d(q10, kVar);
        q10.writeInt(i10);
        c.a(q10, z10);
        t(9, q10);
    }

    public final void G1(j jVar, f fVar) {
        Parcel q10 = q();
        c.c(q10, jVar);
        c.d(q10, fVar);
        t(12, q10);
    }
}
