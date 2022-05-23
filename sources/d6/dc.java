package d6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class dc extends a {
    public static final Parcelable.Creator<dc> CREATOR = new ec();
    public final byte[] M;
    public final Point[] N;
    public final int O;
    public final wb P;
    public final zb Q;
    public final ac R;
    public final cc S;
    public final bc T;
    public final xb U;
    public final tb V;
    public final ub W;
    public final vb X;
    public final int f6462a;
    public final String f6463b;
    public final String f6464c;

    public dc(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, wb wbVar, zb zbVar, ac acVar, cc ccVar, bc bcVar, xb xbVar, tb tbVar, ub ubVar, vb vbVar) {
        this.f6462a = i10;
        this.f6463b = str;
        this.f6464c = str2;
        this.M = bArr;
        this.N = pointArr;
        this.O = i11;
        this.P = wbVar;
        this.Q = zbVar;
        this.R = acVar;
        this.S = ccVar;
        this.T = bcVar;
        this.U = xbVar;
        this.V = tbVar;
        this.W = ubVar;
        this.X = vbVar;
    }

    public final int b() {
        return this.f6462a;
    }

    public final int c() {
        return this.O;
    }

    public final String d() {
        return this.f6464c;
    }

    public final Point[] e() {
        return this.N;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f6462a);
        c.p(parcel, 2, this.f6463b, false);
        c.p(parcel, 3, this.f6464c, false);
        c.f(parcel, 4, this.M, false);
        c.s(parcel, 5, this.N, i10, false);
        c.k(parcel, 6, this.O);
        c.o(parcel, 7, this.P, i10, false);
        c.o(parcel, 8, this.Q, i10, false);
        c.o(parcel, 9, this.R, i10, false);
        c.o(parcel, 10, this.S, i10, false);
        c.o(parcel, 11, this.T, i10, false);
        c.o(parcel, 12, this.U, i10, false);
        c.o(parcel, 13, this.V, i10, false);
        c.o(parcel, 14, this.W, i10, false);
        c.o(parcel, 15, this.X, i10, false);
        c.b(parcel, a10);
    }
}
