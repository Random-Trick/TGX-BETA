package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class ka extends a {
    public static final Parcelable.Creator<ka> CREATOR = new jd();
    public String M;
    public String N;
    public String O;
    public String P;
    public String f6642a;
    public String f6643b;
    public String f6644c;

    public ka() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f6642a, false);
        c.p(parcel, 3, this.f6643b, false);
        c.p(parcel, 4, this.f6644c, false);
        c.p(parcel, 5, this.M, false);
        c.p(parcel, 6, this.N, false);
        c.p(parcel, 7, this.O, false);
        c.p(parcel, 8, this.P, false);
        c.b(parcel, a10);
    }

    public ka(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f6642a = str;
        this.f6643b = str2;
        this.f6644c = str3;
        this.M = str4;
        this.N = str5;
        this.O = str6;
        this.P = str7;
    }
}
