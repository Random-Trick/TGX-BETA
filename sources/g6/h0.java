package g6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

@Deprecated
public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();
    public final String f12118a;
    public final String f12119b;
    public final String f12120c;

    public h0(String str, String str2, String str3) {
        this.f12120c = str;
        this.f12118a = str2;
        this.f12119b = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f12118a, false);
        c.p(parcel, 2, this.f12119b, false);
        c.p(parcel, 5, this.f12120c, false);
        c.b(parcel, a10);
    }
}
