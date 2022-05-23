package m5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import n5.a;
import n5.c;

public class p extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<p> CREATOR = new n0();
    public final long M;
    public final long N;
    public final String O;
    public final String P;
    public final int Q;
    public final int f17240a;
    public final int f17241b;
    public final int f17242c;

    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this.f17240a = i10;
        this.f17241b = i11;
        this.f17242c = i12;
        this.M = j10;
        this.N = j11;
        this.O = str;
        this.P = str2;
        this.Q = i13;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f17240a);
        c.k(parcel, 2, this.f17241b);
        c.k(parcel, 3, this.f17242c);
        c.n(parcel, 4, this.M);
        c.n(parcel, 5, this.N);
        c.p(parcel, 6, this.O, false);
        c.p(parcel, 7, this.P, false);
        c.k(parcel, 8, this.Q);
        c.b(parcel, a10);
    }
}
