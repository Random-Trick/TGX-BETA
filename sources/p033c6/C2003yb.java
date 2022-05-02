package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C2003yb extends AbstractC6749a {
    public static final Parcelable.Creator<C2003yb> CREATOR = new C1920sc();
    public final String f7134M;
    public final String f7135N;
    public final String f7136O;
    public final String f7137P;
    public final String f7138a;
    public final String f7139b;
    public final String f7140c;

    public C2003yb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7138a = str;
        this.f7139b = str2;
        this.f7140c = str3;
        this.f7134M = str4;
        this.f7135N = str5;
        this.f7136O = str6;
        this.f7137P = str7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 1, this.f7138a, false);
        C6752c.m19109p(parcel, 2, this.f7139b, false);
        C6752c.m19109p(parcel, 3, this.f7140c, false);
        C6752c.m19109p(parcel, 4, this.f7134M, false);
        C6752c.m19109p(parcel, 5, this.f7135N, false);
        C6752c.m19109p(parcel, 6, this.f7136O, false);
        C6752c.m19109p(parcel, 7, this.f7137P, false);
        C6752c.m19123b(parcel, a);
    }
}
