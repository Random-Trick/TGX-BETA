package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1990xc extends AbstractC6749a {
    public static final Parcelable.Creator<C1990xc> CREATOR = new C2004yc();
    public final int f7088M;
    public final long f7089N;
    public final int f7090a;
    public final int f7091b;
    public final int f7092c;

    public C1990xc(int i, int i2, int i3, int i4, long j) {
        this.f7090a = i;
        this.f7091b = i2;
        this.f7092c = i3;
        this.f7088M = i4;
        this.f7089N = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f7090a);
        C6752c.m19115k(parcel, 2, this.f7091b);
        C6752c.m19115k(parcel, 3, this.f7092c);
        C6752c.m19115k(parcel, 4, this.f7088M);
        C6752c.m19112n(parcel, 5, this.f7089N);
        C6752c.m19124b(parcel, a);
    }
}
