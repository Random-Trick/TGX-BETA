package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class i8 extends a {
    public static final Parcelable.Creator<i8> CREATOR = new hd();
    public String M;
    public int f6583a;
    public String f6584b;
    public String f6585c;

    public i8() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6583a);
        c.p(parcel, 3, this.f6584b, false);
        c.p(parcel, 4, this.f6585c, false);
        c.p(parcel, 5, this.M, false);
        c.b(parcel, a10);
    }

    public i8(int i10, String str, String str2, String str3) {
        this.f6583a = i10;
        this.f6584b = str;
        this.f6585c = str2;
        this.M = str3;
    }
}
