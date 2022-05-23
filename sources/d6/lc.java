package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class lc extends a {
    public static final Parcelable.Creator<lc> CREATOR = new b();
    public String f6664a;
    public String f6665b;

    public lc() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f6664a, false);
        c.p(parcel, 3, this.f6665b, false);
        c.b(parcel, a10);
    }

    public lc(String str, String str2) {
        this.f6664a = str;
        this.f6665b = str2;
    }
}
