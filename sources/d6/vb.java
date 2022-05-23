package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class vb extends a {
    public static final Parcelable.Creator<vb> CREATOR = new kc();
    public final String M;
    public final String N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String f7072a;
    public final String f7073b;
    public final String f7074c;

    public vb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7072a = str;
        this.f7073b = str2;
        this.f7074c = str3;
        this.M = str4;
        this.N = str5;
        this.O = str6;
        this.P = str7;
        this.Q = str8;
        this.R = str9;
        this.S = str10;
        this.T = str11;
        this.U = str12;
        this.V = str13;
        this.W = str14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f7072a, false);
        c.p(parcel, 2, this.f7073b, false);
        c.p(parcel, 3, this.f7074c, false);
        c.p(parcel, 4, this.M, false);
        c.p(parcel, 5, this.N, false);
        c.p(parcel, 6, this.O, false);
        c.p(parcel, 7, this.P, false);
        c.p(parcel, 8, this.Q, false);
        c.p(parcel, 9, this.R, false);
        c.p(parcel, 10, this.S, false);
        c.p(parcel, 11, this.T, false);
        c.p(parcel, 12, this.U, false);
        c.p(parcel, 13, this.V, false);
        c.p(parcel, 14, this.W, false);
        c.b(parcel, a10);
    }
}
