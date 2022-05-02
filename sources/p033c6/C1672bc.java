package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1672bc extends AbstractC6749a {
    public static final Parcelable.Creator<C1672bc> CREATOR = new C1962vc();
    public final String f6127a;
    public final String f6128b;

    public C1672bc(String str, String str2) {
        this.f6127a = str;
        this.f6128b = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19110p(parcel, 1, this.f6127a, false);
        C6752c.m19110p(parcel, 2, this.f6128b, false);
        C6752c.m19124b(parcel, a);
    }
}
