package p033c6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1702dc extends AbstractC6749a {
    public static final Parcelable.Creator<C1702dc> CREATOR = new C1717ec();
    public final byte[] f6217M;
    public final Point[] f6218N;
    public final int f6219O;
    public final C1975wb f6220P;
    public final C2017zb f6221Q;
    public final C1657ac f6222R;
    public final C1687cc f6223S;
    public final C1672bc f6224T;
    public final C1989xb f6225U;
    public final C1933tb f6226V;
    public final C1947ub f6227W;
    public final C1961vb f6228X;
    public final int f6229a;
    public final String f6230b;
    public final String f6231c;

    public C1702dc(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C1975wb wbVar, C2017zb zbVar, C1657ac acVar, C1687cc ccVar, C1672bc bcVar, C1989xb xbVar, C1933tb tbVar, C1947ub ubVar, C1961vb vbVar) {
        this.f6229a = i;
        this.f6230b = str;
        this.f6231c = str2;
        this.f6217M = bArr;
        this.f6218N = pointArr;
        this.f6219O = i2;
        this.f6220P = wbVar;
        this.f6221Q = zbVar;
        this.f6222R = acVar;
        this.f6223S = ccVar;
        this.f6224T = bcVar;
        this.f6225U = xbVar;
        this.f6226V = tbVar;
        this.f6227W = ubVar;
        this.f6228X = vbVar;
    }

    public final int m36070b() {
        return this.f6229a;
    }

    public final int m36069c() {
        return this.f6219O;
    }

    public final String m36068d() {
        return this.f6231c;
    }

    public final Point[] m36067e() {
        return this.f6218N;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f6229a);
        C6752c.m19109p(parcel, 2, this.f6230b, false);
        C6752c.m19109p(parcel, 3, this.f6231c, false);
        C6752c.m19119f(parcel, 4, this.f6217M, false);
        C6752c.m19106s(parcel, 5, this.f6218N, i, false);
        C6752c.m19114k(parcel, 6, this.f6219O);
        C6752c.m19110o(parcel, 7, this.f6220P, i, false);
        C6752c.m19110o(parcel, 8, this.f6221Q, i, false);
        C6752c.m19110o(parcel, 9, this.f6222R, i, false);
        C6752c.m19110o(parcel, 10, this.f6223S, i, false);
        C6752c.m19110o(parcel, 11, this.f6224T, i, false);
        C6752c.m19110o(parcel, 12, this.f6225U, i, false);
        C6752c.m19110o(parcel, 13, this.f6226V, i, false);
        C6752c.m19110o(parcel, 14, this.f6227W, i, false);
        C6752c.m19110o(parcel, 15, this.f6228X, i, false);
        C6752c.m19123b(parcel, a);
    }
}
