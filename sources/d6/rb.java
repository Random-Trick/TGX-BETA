package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class rb extends a {
    public static final Parcelable.Creator<rb> CREATOR = new qb();
    public final int f6951a;
    public final String[] f6952b;

    public rb(int i10, String[] strArr) {
        this.f6951a = i10;
        this.f6952b = strArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f6951a);
        c.q(parcel, 2, this.f6952b, false);
        c.b(parcel, a10);
    }
}
