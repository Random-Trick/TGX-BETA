package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new l();
    public long M;
    public int N;
    public int f6616a;
    public int f6617b;
    public int f6618c;

    public k(int i10, int i11, int i12, long j10, int i13) {
        this.f6616a = i10;
        this.f6617b = i11;
        this.f6618c = i12;
        this.M = j10;
        this.N = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6616a);
        c.k(parcel, 3, this.f6617b);
        c.k(parcel, 4, this.f6618c);
        c.n(parcel, 5, this.M);
        c.k(parcel, 6, this.N);
        c.b(parcel, a10);
    }
}
