package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class e4 extends a {
    public static final Parcelable.Creator<e4> CREATOR = new dd();
    public int M;
    public int N;
    public int O;
    public boolean P;
    public String Q;
    public int f6468a;
    public int f6469b;
    public int f6470c;

    public e4() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6468a);
        c.k(parcel, 3, this.f6469b);
        c.k(parcel, 4, this.f6470c);
        c.k(parcel, 5, this.M);
        c.k(parcel, 6, this.N);
        c.k(parcel, 7, this.O);
        c.c(parcel, 8, this.P);
        c.p(parcel, 9, this.Q, false);
        c.b(parcel, a10);
    }

    public e4(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f6468a = i10;
        this.f6469b = i11;
        this.f6470c = i12;
        this.M = i13;
        this.N = i14;
        this.O = i15;
        this.P = z10;
        this.Q = str;
    }
}
