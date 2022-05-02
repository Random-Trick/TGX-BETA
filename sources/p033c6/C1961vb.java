package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1961vb extends AbstractC6749a {
    public static final Parcelable.Creator<C1961vb> CREATOR = new C1807kc();
    public final String f7023M;
    public final String f7024N;
    public final String f7025O;
    public final String f7026P;
    public final String f7027Q;
    public final String f7028R;
    public final String f7029S;
    public final String f7030T;
    public final String f7031U;
    public final String f7032V;
    public final String f7033W;
    public final String f7034a;
    public final String f7035b;
    public final String f7036c;

    public C1961vb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7034a = str;
        this.f7035b = str2;
        this.f7036c = str3;
        this.f7023M = str4;
        this.f7024N = str5;
        this.f7025O = str6;
        this.f7026P = str7;
        this.f7027Q = str8;
        this.f7028R = str9;
        this.f7029S = str10;
        this.f7030T = str11;
        this.f7031U = str12;
        this.f7032V = str13;
        this.f7033W = str14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 1, this.f7034a, false);
        C6752c.m19109p(parcel, 2, this.f7035b, false);
        C6752c.m19109p(parcel, 3, this.f7036c, false);
        C6752c.m19109p(parcel, 4, this.f7023M, false);
        C6752c.m19109p(parcel, 5, this.f7024N, false);
        C6752c.m19109p(parcel, 6, this.f7025O, false);
        C6752c.m19109p(parcel, 7, this.f7026P, false);
        C6752c.m19109p(parcel, 8, this.f7027Q, false);
        C6752c.m19109p(parcel, 9, this.f7028R, false);
        C6752c.m19109p(parcel, 10, this.f7029S, false);
        C6752c.m19109p(parcel, 11, this.f7030T, false);
        C6752c.m19109p(parcel, 12, this.f7031U, false);
        C6752c.m19109p(parcel, 13, this.f7032V, false);
        C6752c.m19109p(parcel, 14, this.f7033W, false);
        C6752c.m19123b(parcel, a);
    }
}
