package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1693d3 extends AbstractC6749a {
    public static final Parcelable.Creator<C1693d3> CREATOR = new C1677c2();
    public int f6188a;
    public String[] f6189b;

    public C1693d3() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 2, this.f6188a);
        C6752c.m19108q(parcel, 3, this.f6189b, false);
        C6752c.m19123b(parcel, a);
    }

    public C1693d3(int i, String[] strArr) {
        this.f6188a = i;
        this.f6189b = strArr;
    }
}
