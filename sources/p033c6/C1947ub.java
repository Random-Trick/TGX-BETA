package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1947ub extends AbstractC6749a {
    public static final Parcelable.Creator<C1947ub> CREATOR = new C1792jc();
    public final C2017zb[] f6984M;
    public final C1975wb[] f6985N;
    public final String[] f6986O;
    public final C1905rb[] f6987P;
    public final C2003yb f6988a;
    public final String f6989b;
    public final String f6990c;

    public C1947ub(C2003yb ybVar, String str, String str2, C2017zb[] zbVarArr, C1975wb[] wbVarArr, String[] strArr, C1905rb[] rbVarArr) {
        this.f6988a = ybVar;
        this.f6989b = str;
        this.f6990c = str2;
        this.f6984M = zbVarArr;
        this.f6985N = wbVarArr;
        this.f6986O = strArr;
        this.f6987P = rbVarArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19110o(parcel, 1, this.f6988a, i, false);
        C6752c.m19109p(parcel, 2, this.f6989b, false);
        C6752c.m19109p(parcel, 3, this.f6990c, false);
        C6752c.m19106s(parcel, 4, this.f6984M, i, false);
        C6752c.m19106s(parcel, 5, this.f6985N, i, false);
        C6752c.m19108q(parcel, 6, this.f6986O, false);
        C6752c.m19106s(parcel, 7, this.f6987P, i, false);
        C6752c.m19123b(parcel, a);
    }
}
