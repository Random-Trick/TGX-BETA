package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1919sb extends AbstractC6749a {
    public static final Parcelable.Creator<C1919sb> CREATOR = new C1762hc();
    public final int f6906M;
    public final int f6907N;
    public final int f6908O;
    public final boolean f6909P;
    public final String f6910Q;
    public final int f6911a;
    public final int f6912b;
    public final int f6913c;

    public C1919sb(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f6911a = i;
        this.f6912b = i2;
        this.f6913c = i3;
        this.f6906M = i4;
        this.f6907N = i5;
        this.f6908O = i6;
        this.f6909P = z;
        this.f6910Q = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f6911a);
        C6752c.m19115k(parcel, 2, this.f6912b);
        C6752c.m19115k(parcel, 3, this.f6913c);
        C6752c.m19115k(parcel, 4, this.f6906M);
        C6752c.m19115k(parcel, 5, this.f6907N);
        C6752c.m19115k(parcel, 6, this.f6908O);
        C6752c.m19123c(parcel, 7, this.f6909P);
        C6752c.m19110p(parcel, 8, this.f6910Q, false);
        C6752c.m19124b(parcel, a);
    }
}
