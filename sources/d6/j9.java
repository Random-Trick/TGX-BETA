package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class j9 extends a {
    public static final Parcelable.Creator<j9> CREATOR = new id();
    public double f6603a;
    public double f6604b;

    public j9() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 2, this.f6603a);
        c.g(parcel, 3, this.f6604b);
        c.b(parcel, a10);
    }

    public j9(double d10, double d11) {
        this.f6603a = d10;
        this.f6604b = d11;
    }
}
