package p149k6;

import android.os.Parcel;
import android.os.Parcelable;
import p118i5.C5217a;
import p163l5.C6376q0;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6207l extends AbstractC6749a {
    public static final Parcelable.Creator<C6207l> CREATOR = new C6208m();
    public final int f19610a;
    public final C5217a f19611b;
    public final C6376q0 f19612c;

    public C6207l(int i, C5217a aVar, C6376q0 q0Var) {
        this.f19610a = i;
        this.f19611b = aVar;
        this.f19612c = q0Var;
    }

    public final C5217a m21069b() {
        return this.f19611b;
    }

    public final C6376q0 m21068c() {
        return this.f19612c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f19610a);
        C6752c.m19110o(parcel, 2, this.f19611b, i, false);
        C6752c.m19110o(parcel, 3, this.f19612c, i, false);
        C6752c.m19123b(parcel, a);
    }
}
