package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1905rb extends AbstractC6749a {
    public static final Parcelable.Creator<C1905rb> CREATOR = new C1891qb();
    public final int f6882a;
    public final String[] f6883b;

    public C1905rb(int i, String[] strArr) {
        this.f6882a = i;
        this.f6883b = strArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f6882a);
        C6752c.m19108q(parcel, 2, this.f6883b, false);
        C6752c.m19123b(parcel, a);
    }
}
