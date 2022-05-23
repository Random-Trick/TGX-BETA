package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class h7 extends a {
    public static final Parcelable.Creator<h7> CREATOR = new gd();
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String f6544a;
    public String f6545b;
    public String f6546c;

    public h7() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f6544a, false);
        c.p(parcel, 3, this.f6545b, false);
        c.p(parcel, 4, this.f6546c, false);
        c.p(parcel, 5, this.M, false);
        c.p(parcel, 6, this.N, false);
        c.p(parcel, 7, this.O, false);
        c.p(parcel, 8, this.P, false);
        c.p(parcel, 9, this.Q, false);
        c.p(parcel, 10, this.R, false);
        c.p(parcel, 11, this.S, false);
        c.p(parcel, 12, this.T, false);
        c.p(parcel, 13, this.U, false);
        c.p(parcel, 14, this.V, false);
        c.p(parcel, 15, this.W, false);
        c.b(parcel, a10);
    }

    public h7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f6544a = str;
        this.f6545b = str2;
        this.f6546c = str3;
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
}
