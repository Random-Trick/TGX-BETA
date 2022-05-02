package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1704e extends AbstractC6749a {
    public static final Parcelable.Creator<C1704e> CREATOR = new C1719f();
    public int f6232a;
    public boolean f6233b;

    public C1704e() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 2, this.f6232a);
        C6752c.m19123c(parcel, 3, this.f6233b);
        C6752c.m19124b(parcel, a);
    }

    public C1704e(int i, boolean z) {
        this.f6232a = i;
        this.f6233b = z;
    }
}
