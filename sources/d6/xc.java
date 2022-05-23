package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class xc extends a {
    public static final Parcelable.Creator<xc> CREATOR = new yc();
    public final int M;
    public final long N;
    public final int f7123a;
    public final int f7124b;
    public final int f7125c;

    public xc(int i10, int i11, int i12, int i13, long j10) {
        this.f7123a = i10;
        this.f7124b = i11;
        this.f7125c = i12;
        this.M = i13;
        this.N = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f7123a);
        c.k(parcel, 2, this.f7124b);
        c.k(parcel, 3, this.f7125c);
        c.k(parcel, 4, this.M);
        c.n(parcel, 5, this.N);
        c.b(parcel, a10);
    }
}
