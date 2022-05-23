package m5;

import android.os.IBinder;
import android.os.Parcel;
import u5.b;
import w5.a;
import w5.c;

public final class m0 extends a {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final b E1(b bVar, s0 s0Var) {
        Parcel q10 = q();
        c.d(q10, bVar);
        c.c(q10, s0Var);
        Parcel r10 = r(2, q10);
        b r11 = b.a.r(r10.readStrongBinder());
        r10.recycle();
        return r11;
    }
}
