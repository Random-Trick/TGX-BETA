package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1687cc extends AbstractC6749a {
    public static final Parcelable.Creator<C1687cc> CREATOR = new C1976wc();
    public final String f6175a;
    public final String f6176b;
    public final int f6177c;

    public C1687cc(String str, String str2, int i) {
        this.f6175a = str;
        this.f6176b = str2;
        this.f6177c = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19110p(parcel, 1, this.f6175a, false);
        C6752c.m19110p(parcel, 2, this.f6176b, false);
        C6752c.m19115k(parcel, 3, this.f6177c);
        C6752c.m19124b(parcel, a);
    }
}
