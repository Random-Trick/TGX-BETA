package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1989xb extends AbstractC6749a {
    public static final Parcelable.Creator<C1989xb> CREATOR = new C1850nc();
    public final double f7086a;
    public final double f7087b;

    public C1989xb(double d, double d2) {
        this.f7086a = d;
        this.f7087b = d2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19119g(parcel, 1, this.f7086a);
        C6752c.m19119g(parcel, 2, this.f7087b);
        C6752c.m19124b(parcel, a);
    }
}
