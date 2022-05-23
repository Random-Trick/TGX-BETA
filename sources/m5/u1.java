package m5;

import android.os.Parcel;
import y5.b;
import y5.c;

public abstract class u1 extends b implements v1 {
    public u1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            u5.b p10 = p();
            parcel2.writeNoException();
            c.c(parcel2, p10);
        } else if (i10 != 2) {
            return false;
        } else {
            int Z0 = Z0();
            parcel2.writeNoException();
            parcel2.writeInt(Z0);
        }
        return true;
    }
}
