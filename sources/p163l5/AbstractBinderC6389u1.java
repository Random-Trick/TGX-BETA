package p163l5;

import android.os.Parcel;
import p272t5.AbstractC8983b;
import p327x5.BinderC10098b;
import p327x5.C10099c;

public abstract class AbstractBinderC6389u1 extends BinderC10098b implements AbstractC6392v1 {
    public AbstractBinderC6389u1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final boolean mo6024q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AbstractC8983b p = mo20477p();
            parcel2.writeNoException();
            C10099c.m6021c(parcel2, p);
        } else if (i != 2) {
            return false;
        } else {
            int Z0 = mo20478Z0();
            parcel2.writeNoException();
            parcel2.writeInt(Z0);
        }
        return true;
    }
}
