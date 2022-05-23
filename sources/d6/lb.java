package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class lb extends a {
    public static final Parcelable.Creator<lb> CREATOR = new kd();
    public int f6662a;
    public String f6663b;

    public lb() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6662a);
        c.p(parcel, 3, this.f6663b, false);
        c.b(parcel, a10);
    }

    public lb(int i10, String str) {
        this.f6662a = i10;
        this.f6663b = str;
    }
}
