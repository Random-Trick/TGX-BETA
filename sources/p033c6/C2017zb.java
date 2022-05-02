package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C2017zb extends AbstractC6749a {
    public static final Parcelable.Creator<C2017zb> CREATOR = new C1934tc();
    public final int f7189a;
    public final String f7190b;

    public C2017zb(int i, String str) {
        this.f7189a = i;
        this.f7190b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f7189a);
        C6752c.m19110p(parcel, 2, this.f7190b, false);
        C6752c.m19124b(parcel, a);
    }
}
