package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class sb extends a {
    public static final Parcelable.Creator<sb> CREATOR = new hc();
    public final int M;
    public final int N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final int f6975a;
    public final int f6976b;
    public final int f6977c;

    public sb(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f6975a = i10;
        this.f6976b = i11;
        this.f6977c = i12;
        this.M = i13;
        this.N = i14;
        this.O = i15;
        this.P = z10;
        this.Q = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f6975a);
        c.k(parcel, 2, this.f6976b);
        c.k(parcel, 3, this.f6977c);
        c.k(parcel, 4, this.M);
        c.k(parcel, 5, this.N);
        c.k(parcel, 6, this.O);
        c.c(parcel, 7, this.P);
        c.p(parcel, 8, this.Q, false);
        c.b(parcel, a10);
    }
}
