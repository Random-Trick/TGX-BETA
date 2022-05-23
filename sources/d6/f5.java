package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class f5 extends a {
    public static final Parcelable.Creator<f5> CREATOR = new ed();
    public String M;
    public String N;
    public e4 O;
    public e4 P;
    public String f6494a;
    public String f6495b;
    public String f6496c;

    public f5() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f6494a, false);
        c.p(parcel, 3, this.f6495b, false);
        c.p(parcel, 4, this.f6496c, false);
        c.p(parcel, 5, this.M, false);
        c.p(parcel, 6, this.N, false);
        c.o(parcel, 7, this.O, i10, false);
        c.o(parcel, 8, this.P, i10, false);
        c.b(parcel, a10);
    }

    public f5(String str, String str2, String str3, String str4, String str5, e4 e4Var, e4 e4Var2) {
        this.f6494a = str;
        this.f6495b = str2;
        this.f6496c = str3;
        this.M = str4;
        this.N = str5;
        this.O = e4Var;
        this.P = e4Var2;
    }
}
