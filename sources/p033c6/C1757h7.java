package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1757h7 extends AbstractC6749a {
    public static final Parcelable.Creator<C1757h7> CREATOR = new C1748gd();
    public String f6329M;
    public String f6330N;
    public String f6331O;
    public String f6332P;
    public String f6333Q;
    public String f6334R;
    public String f6335S;
    public String f6336T;
    public String f6337U;
    public String f6338V;
    public String f6339W;
    public String f6340a;
    public String f6341b;
    public String f6342c;

    public C1757h7() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 2, this.f6340a, false);
        C6752c.m19109p(parcel, 3, this.f6341b, false);
        C6752c.m19109p(parcel, 4, this.f6342c, false);
        C6752c.m19109p(parcel, 5, this.f6329M, false);
        C6752c.m19109p(parcel, 6, this.f6330N, false);
        C6752c.m19109p(parcel, 7, this.f6331O, false);
        C6752c.m19109p(parcel, 8, this.f6332P, false);
        C6752c.m19109p(parcel, 9, this.f6333Q, false);
        C6752c.m19109p(parcel, 10, this.f6334R, false);
        C6752c.m19109p(parcel, 11, this.f6335S, false);
        C6752c.m19109p(parcel, 12, this.f6336T, false);
        C6752c.m19109p(parcel, 13, this.f6337U, false);
        C6752c.m19109p(parcel, 14, this.f6338V, false);
        C6752c.m19109p(parcel, 15, this.f6339W, false);
        C6752c.m19123b(parcel, a);
    }

    public C1757h7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f6340a = str;
        this.f6341b = str2;
        this.f6342c = str3;
        this.f6329M = str4;
        this.f6330N = str5;
        this.f6331O = str6;
        this.f6332P = str7;
        this.f6333Q = str8;
        this.f6334R = str9;
        this.f6335S = str10;
        this.f6336T = str11;
        this.f6337U = str12;
        this.f6338V = str13;
        this.f6339W = str14;
    }
}
