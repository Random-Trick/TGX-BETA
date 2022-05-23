package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class xb extends a {
    public static final Parcelable.Creator<xb> CREATOR = new nc();
    public final double f7121a;
    public final double f7122b;

    public xb(double d10, double d11) {
        this.f7121a = d10;
        this.f7122b = d11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, this.f7121a);
        c.g(parcel, 2, this.f7122b);
        c.b(parcel, a10);
    }
}
