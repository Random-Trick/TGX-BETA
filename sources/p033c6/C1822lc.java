package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1822lc extends AbstractC6749a {
    public static final Parcelable.Creator<C1822lc> CREATOR = new C1659b();
    public String f6468a;
    public String f6469b;

    public C1822lc() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 2, this.f6468a, false);
        C6752c.m19109p(parcel, 3, this.f6469b, false);
        C6752c.m19123b(parcel, a);
    }

    public C1822lc(String str, String str2) {
        this.f6468a = str;
        this.f6469b = str2;
    }
}
