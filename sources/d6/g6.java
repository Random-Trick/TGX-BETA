package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class g6 extends a {
    public static final Parcelable.Creator<g6> CREATOR = new fd();
    public lb[] M;
    public i8[] N;
    public String[] O;
    public d3[] P;
    public ka f6526a;
    public String f6527b;
    public String f6528c;

    public g6() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 2, this.f6526a, i10, false);
        c.p(parcel, 3, this.f6527b, false);
        c.p(parcel, 4, this.f6528c, false);
        c.s(parcel, 5, this.M, i10, false);
        c.s(parcel, 6, this.N, i10, false);
        c.q(parcel, 7, this.O, false);
        c.s(parcel, 8, this.P, i10, false);
        c.b(parcel, a10);
    }

    public g6(ka kaVar, String str, String str2, lb[] lbVarArr, i8[] i8VarArr, String[] strArr, d3[] d3VarArr) {
        this.f6526a = kaVar;
        this.f6527b = str;
        this.f6528c = str2;
        this.M = lbVarArr;
        this.N = i8VarArr;
        this.O = strArr;
        this.P = d3VarArr;
    }
}
