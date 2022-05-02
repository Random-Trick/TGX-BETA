package p033c6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1673bd extends AbstractC6749a {
    public static final Parcelable.Creator<C1673bd> CREATOR = new C1688cd();
    public int f6129M;
    public Point[] f6130N;
    public C1773i8 f6131O;
    public C1821lb f6132P;
    public C1822lc f6133Q;
    public C1658ad f6134R;
    public C2018zc f6135S;
    public C1789j9 f6136T;
    public C1725f5 f6137U;
    public C1741g6 f6138V;
    public C1757h7 f6139W;
    public byte[] f6140X;
    public boolean f6141Y;
    public double f6142Z;
    public int f6143a;
    public String f6144b;
    public String f6145c;

    public C1673bd() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 2, this.f6143a);
        C6752c.m19110p(parcel, 3, this.f6144b, false);
        C6752c.m19110p(parcel, 4, this.f6145c, false);
        C6752c.m19115k(parcel, 5, this.f6129M);
        C6752c.m19107s(parcel, 6, this.f6130N, i, false);
        C6752c.m19111o(parcel, 7, this.f6131O, i, false);
        C6752c.m19111o(parcel, 8, this.f6132P, i, false);
        C6752c.m19111o(parcel, 9, this.f6133Q, i, false);
        C6752c.m19111o(parcel, 10, this.f6134R, i, false);
        C6752c.m19111o(parcel, 11, this.f6135S, i, false);
        C6752c.m19111o(parcel, 12, this.f6136T, i, false);
        C6752c.m19111o(parcel, 13, this.f6137U, i, false);
        C6752c.m19111o(parcel, 14, this.f6138V, i, false);
        C6752c.m19111o(parcel, 15, this.f6139W, i, false);
        C6752c.m19120f(parcel, 16, this.f6140X, false);
        C6752c.m19123c(parcel, 17, this.f6141Y);
        C6752c.m19119g(parcel, 18, this.f6142Z);
        C6752c.m19124b(parcel, a);
    }

    public C1673bd(int i, String str, String str2, int i2, Point[] pointArr, C1773i8 i8Var, C1821lb lbVar, C1822lc lcVar, C1658ad adVar, C2018zc zcVar, C1789j9 j9Var, C1725f5 f5Var, C1741g6 g6Var, C1757h7 h7Var, byte[] bArr, boolean z, double d) {
        this.f6143a = i;
        this.f6144b = str;
        this.f6140X = bArr;
        this.f6145c = str2;
        this.f6129M = i2;
        this.f6130N = pointArr;
        this.f6141Y = z;
        this.f6142Z = d;
        this.f6131O = i8Var;
        this.f6132P = lbVar;
        this.f6133Q = lcVar;
        this.f6134R = adVar;
        this.f6135S = zcVar;
        this.f6136T = j9Var;
        this.f6137U = f5Var;
        this.f6138V = g6Var;
        this.f6139W = h7Var;
    }
}
