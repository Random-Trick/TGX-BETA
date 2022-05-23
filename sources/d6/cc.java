package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class cc extends a {
    public static final Parcelable.Creator<cc> CREATOR = new wc();
    public final String f6423a;
    public final String f6424b;
    public final int f6425c;

    public cc(String str, String str2, int i10) {
        this.f6423a = str;
        this.f6424b = str2;
        this.f6425c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f6423a, false);
        c.p(parcel, 2, this.f6424b, false);
        c.k(parcel, 3, this.f6425c);
        c.b(parcel, a10);
    }
}
