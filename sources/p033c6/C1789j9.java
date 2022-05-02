package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1789j9 extends AbstractC6749a {
    public static final Parcelable.Creator<C1789j9> CREATOR = new C1778id();
    public double f6400a;
    public double f6401b;

    public C1789j9() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19119g(parcel, 2, this.f6400a);
        C6752c.m19119g(parcel, 3, this.f6401b);
        C6752c.m19124b(parcel, a);
    }

    public C1789j9(double d, double d2) {
        this.f6400a = d;
        this.f6401b = d2;
    }
}
