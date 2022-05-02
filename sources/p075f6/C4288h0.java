package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

@Deprecated
public final class C4288h0 extends AbstractC6749a {
    public static final Parcelable.Creator<C4288h0> CREATOR = new C4290i0();
    public final String f14343a;
    public final String f14344b;
    public final String f14345c;

    public C4288h0(String str, String str2, String str3) {
        this.f14345c = str;
        this.f14343a = str2;
        this.f14344b = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19110p(parcel, 1, this.f14343a, false);
        C6752c.m19110p(parcel, 2, this.f14344b, false);
        C6752c.m19110p(parcel, 5, this.f14345c, false);
        C6752c.m19124b(parcel, a);
    }
}
