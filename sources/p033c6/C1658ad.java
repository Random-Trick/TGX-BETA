package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1658ad extends AbstractC6749a {
    public static final Parcelable.Creator<C1658ad> CREATOR = new C1689d();
    public String f6098a;
    public String f6099b;
    public int f6100c;

    public C1658ad() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 2, this.f6098a, false);
        C6752c.m19109p(parcel, 3, this.f6099b, false);
        C6752c.m19114k(parcel, 4, this.f6100c);
        C6752c.m19123b(parcel, a);
    }

    public C1658ad(String str, String str2, int i) {
        this.f6098a = str;
        this.f6099b = str2;
        this.f6100c = i;
    }
}
