package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import n5.a;
import n5.c;

public final class s0 extends a {
    public static final Parcelable.Creator<s0> CREATOR = new t0();
    @Deprecated
    public final Scope[] M;
    public final int f17259a;
    public final int f17260b;
    public final int f17261c;

    public s0(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f17259a = i10;
        this.f17260b = i11;
        this.f17261c = i12;
        this.M = scopeArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f17259a);
        c.k(parcel, 2, this.f17260b);
        c.k(parcel, 3, this.f17261c);
        c.s(parcel, 4, this.M, i10, false);
        c.b(parcel, a10);
    }
}
