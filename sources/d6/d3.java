package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class d3 extends a {
    public static final Parcelable.Creator<d3> CREATOR = new c2();
    public int f6433a;
    public String[] f6434b;

    public d3() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6433a);
        c.q(parcel, 3, this.f6434b, false);
        c.b(parcel, a10);
    }

    public d3(int i10, String[] strArr) {
        this.f6433a = i10;
        this.f6434b = strArr;
    }
}
