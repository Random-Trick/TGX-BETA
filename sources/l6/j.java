package l6;

import android.os.Parcel;
import android.os.Parcelable;
import m5.o0;
import n5.a;
import n5.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    public final int f16292a;
    public final o0 f16293b;

    public j(int i10, o0 o0Var) {
        this.f16292a = i10;
        this.f16293b = o0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f16292a);
        c.o(parcel, 2, this.f16293b, i10, false);
        c.b(parcel, a10);
    }
}
