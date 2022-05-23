package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class tb extends a {
    public static final Parcelable.Creator<tb> CREATOR = new ic();
    public final String M;
    public final String N;
    public final sb O;
    public final sb P;
    public final String f7013a;
    public final String f7014b;
    public final String f7015c;

    public tb(String str, String str2, String str3, String str4, String str5, sb sbVar, sb sbVar2) {
        this.f7013a = str;
        this.f7014b = str2;
        this.f7015c = str3;
        this.M = str4;
        this.N = str5;
        this.O = sbVar;
        this.P = sbVar2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f7013a, false);
        c.p(parcel, 2, this.f7014b, false);
        c.p(parcel, 3, this.f7015c, false);
        c.p(parcel, 4, this.M, false);
        c.p(parcel, 5, this.N, false);
        c.o(parcel, 6, this.O, i10, false);
        c.o(parcel, 7, this.P, i10, false);
        c.b(parcel, a10);
    }
}
