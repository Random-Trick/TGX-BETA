package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1821lb extends AbstractC6749a {
    public static final Parcelable.Creator<C1821lb> CREATOR = new C1808kd();
    public int f6466a;
    public String f6467b;

    public C1821lb() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 2, this.f6466a);
        C6752c.m19109p(parcel, 3, this.f6467b, false);
        C6752c.m19123b(parcel, a);
    }

    public C1821lb(int i, String str) {
        this.f6466a = i;
        this.f6467b = str;
    }
}
