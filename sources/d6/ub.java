package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class ub extends a {
    public static final Parcelable.Creator<ub> CREATOR = new jc();
    public final zb[] M;
    public final wb[] N;
    public final String[] O;
    public final rb[] P;
    public final yb f7037a;
    public final String f7038b;
    public final String f7039c;

    public ub(yb ybVar, String str, String str2, zb[] zbVarArr, wb[] wbVarArr, String[] strArr, rb[] rbVarArr) {
        this.f7037a = ybVar;
        this.f7038b = str;
        this.f7039c = str2;
        this.M = zbVarArr;
        this.N = wbVarArr;
        this.O = strArr;
        this.P = rbVarArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, this.f7037a, i10, false);
        c.p(parcel, 2, this.f7038b, false);
        c.p(parcel, 3, this.f7039c, false);
        c.s(parcel, 4, this.M, i10, false);
        c.s(parcel, 5, this.N, i10, false);
        c.q(parcel, 6, this.O, false);
        c.s(parcel, 7, this.P, i10, false);
        c.b(parcel, a10);
    }
}
