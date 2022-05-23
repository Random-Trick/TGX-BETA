package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class bc extends a {
    public static final Parcelable.Creator<bc> CREATOR = new vc();
    public final String f6389a;
    public final String f6390b;

    public bc(String str, String str2) {
        this.f6389a = str;
        this.f6390b = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f6389a, false);
        c.p(parcel, 2, this.f6390b, false);
        c.b(parcel, a10);
    }
}
