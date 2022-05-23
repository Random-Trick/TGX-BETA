package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class yb extends a {
    public static final Parcelable.Creator<yb> CREATOR = new sc();
    public final String M;
    public final String N;
    public final String O;
    public final String P;
    public final String f7167a;
    public final String f7168b;
    public final String f7169c;

    public yb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7167a = str;
        this.f7168b = str2;
        this.f7169c = str3;
        this.M = str4;
        this.N = str5;
        this.O = str6;
        this.P = str7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f7167a, false);
        c.p(parcel, 2, this.f7168b, false);
        c.p(parcel, 3, this.f7169c, false);
        c.p(parcel, 4, this.M, false);
        c.p(parcel, 5, this.N, false);
        c.p(parcel, 6, this.O, false);
        c.p(parcel, 7, this.P, false);
        c.b(parcel, a10);
    }
}
