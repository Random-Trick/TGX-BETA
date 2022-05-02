package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1709e4 extends AbstractC6749a {
    public static final Parcelable.Creator<C1709e4> CREATOR = new C1703dd();
    public int f6238M;
    public int f6239N;
    public int f6240O;
    public boolean f6241P;
    public String f6242Q;
    public int f6243a;
    public int f6244b;
    public int f6245c;

    public C1709e4() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 2, this.f6243a);
        C6752c.m19115k(parcel, 3, this.f6244b);
        C6752c.m19115k(parcel, 4, this.f6245c);
        C6752c.m19115k(parcel, 5, this.f6238M);
        C6752c.m19115k(parcel, 6, this.f6239N);
        C6752c.m19115k(parcel, 7, this.f6240O);
        C6752c.m19123c(parcel, 8, this.f6241P);
        C6752c.m19110p(parcel, 9, this.f6242Q, false);
        C6752c.m19124b(parcel, a);
    }

    public C1709e4(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f6243a = i;
        this.f6244b = i2;
        this.f6245c = i3;
        this.f6238M = i4;
        this.f6239N = i5;
        this.f6240O = i6;
        this.f6241P = z;
        this.f6242Q = str;
    }
}
