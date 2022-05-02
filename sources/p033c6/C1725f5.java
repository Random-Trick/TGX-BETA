package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1725f5 extends AbstractC6749a {
    public static final Parcelable.Creator<C1725f5> CREATOR = new C1718ed();
    public String f6270M;
    public String f6271N;
    public C1709e4 f6272O;
    public C1709e4 f6273P;
    public String f6274a;
    public String f6275b;
    public String f6276c;

    public C1725f5() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 2, this.f6274a, false);
        C6752c.m19109p(parcel, 3, this.f6275b, false);
        C6752c.m19109p(parcel, 4, this.f6276c, false);
        C6752c.m19109p(parcel, 5, this.f6270M, false);
        C6752c.m19109p(parcel, 6, this.f6271N, false);
        C6752c.m19110o(parcel, 7, this.f6272O, i, false);
        C6752c.m19110o(parcel, 8, this.f6273P, i, false);
        C6752c.m19123b(parcel, a);
    }

    public C1725f5(String str, String str2, String str3, String str4, String str5, C1709e4 e4Var, C1709e4 e4Var2) {
        this.f6274a = str;
        this.f6275b = str2;
        this.f6276c = str3;
        this.f6270M = str4;
        this.f6271N = str5;
        this.f6272O = e4Var;
        this.f6273P = e4Var2;
    }
}
