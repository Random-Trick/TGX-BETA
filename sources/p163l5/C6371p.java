package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public class C6371p extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C6371p> CREATOR = new C6366n0();
    public final long f19995M;
    public final long f19996N;
    public final String f19997O;
    public final String f19998P;
    public final int f19999Q;
    public final int f20000a;
    public final int f20001b;
    public final int f20002c;

    public C6371p(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this.f20000a = i;
        this.f20001b = i2;
        this.f20002c = i3;
        this.f19995M = j;
        this.f19996N = j2;
        this.f19997O = str;
        this.f19998P = str2;
        this.f19999Q = i4;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f20000a);
        C6752c.m19115k(parcel, 2, this.f20001b);
        C6752c.m19115k(parcel, 3, this.f20002c);
        C6752c.m19112n(parcel, 4, this.f19995M);
        C6752c.m19112n(parcel, 5, this.f19996N);
        C6752c.m19110p(parcel, 6, this.f19997O, false);
        C6752c.m19110p(parcel, 7, this.f19998P, false);
        C6752c.m19115k(parcel, 8, this.f19999Q);
        C6752c.m19124b(parcel, a);
    }
}
