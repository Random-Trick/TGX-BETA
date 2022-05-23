package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class zc extends a {
    public static final Parcelable.Creator<zc> CREATOR = new c();
    public String f7198a;
    public String f7199b;

    public zc() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f7198a, false);
        c.p(parcel, 3, this.f7199b, false);
        c.b(parcel, a10);
    }

    public zc(String str, String str2) {
        this.f7198a = str;
        this.f7199b = str2;
    }
}
