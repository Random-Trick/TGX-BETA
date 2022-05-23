package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class ad extends a {
    public static final Parcelable.Creator<ad> CREATOR = new d();
    public String f6360a;
    public String f6361b;
    public int f6362c;

    public ad() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f6360a, false);
        c.p(parcel, 3, this.f6361b, false);
        c.k(parcel, 4, this.f6362c);
        c.b(parcel, a10);
    }

    public ad(String str, String str2, int i10) {
        this.f6360a = str;
        this.f6361b = str2;
        this.f6362c = i10;
    }
}
