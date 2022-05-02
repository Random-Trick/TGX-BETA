package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1805ka extends AbstractC6749a {
    public static final Parcelable.Creator<C1805ka> CREATOR = new C1793jd();
    public String f6441M;
    public String f6442N;
    public String f6443O;
    public String f6444P;
    public String f6445a;
    public String f6446b;
    public String f6447c;

    public C1805ka() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 2, this.f6445a, false);
        C6752c.m19109p(parcel, 3, this.f6446b, false);
        C6752c.m19109p(parcel, 4, this.f6447c, false);
        C6752c.m19109p(parcel, 5, this.f6441M, false);
        C6752c.m19109p(parcel, 6, this.f6442N, false);
        C6752c.m19109p(parcel, 7, this.f6443O, false);
        C6752c.m19109p(parcel, 8, this.f6444P, false);
        C6752c.m19123b(parcel, a);
    }

    public C1805ka(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f6445a = str;
        this.f6446b = str2;
        this.f6447c = str3;
        this.f6441M = str4;
        this.f6442N = str5;
        this.f6443O = str6;
        this.f6444P = str7;
    }
}
