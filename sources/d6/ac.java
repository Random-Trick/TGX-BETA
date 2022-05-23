package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class ac extends a {
    public static final Parcelable.Creator<ac> CREATOR = new uc();
    public final String f6358a;
    public final String f6359b;

    public ac(String str, String str2) {
        this.f6358a = str;
        this.f6359b = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f6358a, false);
        c.p(parcel, 2, this.f6359b, false);
        c.b(parcel, a10);
    }
}
