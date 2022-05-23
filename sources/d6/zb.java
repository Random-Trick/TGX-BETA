package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class zb extends a {
    public static final Parcelable.Creator<zb> CREATOR = new tc();
    public final int f7196a;
    public final String f7197b;

    public zb(int i10, String str) {
        this.f7196a = i10;
        this.f7197b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f7196a);
        c.p(parcel, 2, this.f7197b, false);
        c.b(parcel, a10);
    }
}
