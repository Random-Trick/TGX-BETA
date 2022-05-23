package d6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class bd extends a {
    public static final Parcelable.Creator<bd> CREATOR = new cd();
    public int M;
    public Point[] N;
    public i8 O;
    public lb P;
    public lc Q;
    public ad R;
    public zc S;
    public j9 T;
    public f5 U;
    public g6 V;
    public h7 W;
    public byte[] X;
    public boolean Y;
    public double Z;
    public int f6391a;
    public String f6392b;
    public String f6393c;

    public bd() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6391a);
        c.p(parcel, 3, this.f6392b, false);
        c.p(parcel, 4, this.f6393c, false);
        c.k(parcel, 5, this.M);
        c.s(parcel, 6, this.N, i10, false);
        c.o(parcel, 7, this.O, i10, false);
        c.o(parcel, 8, this.P, i10, false);
        c.o(parcel, 9, this.Q, i10, false);
        c.o(parcel, 10, this.R, i10, false);
        c.o(parcel, 11, this.S, i10, false);
        c.o(parcel, 12, this.T, i10, false);
        c.o(parcel, 13, this.U, i10, false);
        c.o(parcel, 14, this.V, i10, false);
        c.o(parcel, 15, this.W, i10, false);
        c.f(parcel, 16, this.X, false);
        c.c(parcel, 17, this.Y);
        c.g(parcel, 18, this.Z);
        c.b(parcel, a10);
    }

    public bd(int i10, String str, String str2, int i11, Point[] pointArr, i8 i8Var, lb lbVar, lc lcVar, ad adVar, zc zcVar, j9 j9Var, f5 f5Var, g6 g6Var, h7 h7Var, byte[] bArr, boolean z10, double d10) {
        this.f6391a = i10;
        this.f6392b = str;
        this.X = bArr;
        this.f6393c = str2;
        this.M = i11;
        this.N = pointArr;
        this.Y = z10;
        this.Z = d10;
        this.O = i8Var;
        this.P = lbVar;
        this.Q = lcVar;
        this.R = adVar;
        this.S = zcVar;
        this.T = j9Var;
        this.U = f5Var;
        this.V = g6Var;
        this.W = h7Var;
    }
}
