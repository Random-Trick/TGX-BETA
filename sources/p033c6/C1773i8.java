package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1773i8 extends AbstractC6749a {
    public static final Parcelable.Creator<C1773i8> CREATOR = new C1763hd();
    public String f6379M;
    public int f6380a;
    public String f6381b;
    public String f6382c;

    public C1773i8() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 2, this.f6380a);
        C6752c.m19109p(parcel, 3, this.f6381b, false);
        C6752c.m19109p(parcel, 4, this.f6382c, false);
        C6752c.m19109p(parcel, 5, this.f6379M, false);
        C6752c.m19123b(parcel, a);
    }

    public C1773i8(int i, String str, String str2, String str3) {
        this.f6380a = i;
        this.f6381b = str;
        this.f6382c = str2;
        this.f6379M = str3;
    }
}
