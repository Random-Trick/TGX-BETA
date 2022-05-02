package p163l5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p118i5.C5219c;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6348h1 extends AbstractC6749a {
    public static final Parcelable.Creator<C6348h1> CREATOR = new C6351i1();
    public C6340f f19953M;
    public Bundle f19954a;
    public C5219c[] f19955b;
    public int f19956c;

    public C6348h1() {
    }

    public C6348h1(Bundle bundle, C5219c[] cVarArr, int i, C6340f fVar) {
        this.f19954a = bundle;
        this.f19955b = cVarArr;
        this.f19956c = i;
        this.f19953M = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19121d(parcel, 1, this.f19954a, false);
        C6752c.m19106s(parcel, 2, this.f19955b, i, false);
        C6752c.m19114k(parcel, 3, this.f19956c);
        C6752c.m19110o(parcel, 4, this.f19953M, i, false);
        C6752c.m19123b(parcel, a);
    }
}
