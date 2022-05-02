package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1741g6 extends AbstractC6749a {
    public static final Parcelable.Creator<C1741g6> CREATOR = new C1733fd();
    public C1821lb[] f6307M;
    public C1773i8[] f6308N;
    public String[] f6309O;
    public C1693d3[] f6310P;
    public C1805ka f6311a;
    public String f6312b;
    public String f6313c;

    public C1741g6() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 2, this.f6311a, i, false);
        C6752c.m19110p(parcel, 3, this.f6312b, false);
        C6752c.m19110p(parcel, 4, this.f6313c, false);
        C6752c.m19107s(parcel, 5, this.f6307M, i, false);
        C6752c.m19107s(parcel, 6, this.f6308N, i, false);
        C6752c.m19109q(parcel, 7, this.f6309O, false);
        C6752c.m19107s(parcel, 8, this.f6310P, i, false);
        C6752c.m19124b(parcel, a);
    }

    public C1741g6(C1805ka kaVar, String str, String str2, C1821lb[] lbVarArr, C1773i8[] i8VarArr, String[] strArr, C1693d3[] d3VarArr) {
        this.f6311a = kaVar;
        this.f6312b = str;
        this.f6313c = str2;
        this.f6307M = lbVarArr;
        this.f6308N = i8VarArr;
        this.f6309O = strArr;
        this.f6310P = d3VarArr;
    }
}
