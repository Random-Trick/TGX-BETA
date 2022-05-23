package l6;

import android.os.Parcel;
import android.os.Parcelable;
import m5.q0;
import n5.a;
import n5.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();
    public final int f16294a;
    public final j5.a f16295b;
    public final q0 f16296c;

    public l(int i10, j5.a aVar, q0 q0Var) {
        this.f16294a = i10;
        this.f16295b = aVar;
        this.f16296c = q0Var;
    }

    public final j5.a b() {
        return this.f16295b;
    }

    public final q0 c() {
        return this.f16296c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f16294a);
        c.o(parcel, 2, this.f16295b, i10, false);
        c.o(parcel, 3, this.f16296c, i10, false);
        c.b(parcel, a10);
    }
}
