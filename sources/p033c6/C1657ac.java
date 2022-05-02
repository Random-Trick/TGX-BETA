package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1657ac extends AbstractC6749a {
    public static final Parcelable.Creator<C1657ac> CREATOR = new C1948uc();
    public final String f6096a;
    public final String f6097b;

    public C1657ac(String str, String str2) {
        this.f6096a = str;
        this.f6097b = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19110p(parcel, 1, this.f6096a, false);
        C6752c.m19110p(parcel, 2, this.f6097b, false);
        C6752c.m19124b(parcel, a);
    }
}
