package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1794k extends AbstractC6749a {
    public static final Parcelable.Creator<C1794k> CREATOR = new C1809l();
    public long f6413M;
    public int f6414N;
    public int f6415a;
    public int f6416b;
    public int f6417c;

    public C1794k(int i, int i2, int i3, long j, int i4) {
        this.f6415a = i;
        this.f6416b = i2;
        this.f6417c = i3;
        this.f6413M = j;
        this.f6414N = i4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 2, this.f6415a);
        C6752c.m19115k(parcel, 3, this.f6416b);
        C6752c.m19115k(parcel, 4, this.f6417c);
        C6752c.m19112n(parcel, 5, this.f6413M);
        C6752c.m19115k(parcel, 6, this.f6414N);
        C6752c.m19124b(parcel, a);
    }
}
