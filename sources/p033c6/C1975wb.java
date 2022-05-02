package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1975wb extends AbstractC6749a {
    public static final Parcelable.Creator<C1975wb> CREATOR = new C1836mc();
    public final String f7058M;
    public final int f7059a;
    public final String f7060b;
    public final String f7061c;

    public C1975wb(int i, String str, String str2, String str3) {
        this.f7059a = i;
        this.f7060b = str;
        this.f7061c = str2;
        this.f7058M = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f7059a);
        C6752c.m19110p(parcel, 2, this.f7060b, false);
        C6752c.m19110p(parcel, 3, this.f7061c, false);
        C6752c.m19110p(parcel, 4, this.f7058M, false);
        C6752c.m19124b(parcel, a);
    }
}
