package m5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j5.c;
import n5.a;

public final class h1 extends a {
    public static final Parcelable.Creator<h1> CREATOR = new i1();
    public f M;
    public Bundle f17210a;
    public c[] f17211b;
    public int f17212c;

    public h1() {
    }

    public h1(Bundle bundle, c[] cVarArr, int i10, f fVar) {
        this.f17210a = bundle;
        this.f17211b = cVarArr;
        this.f17212c = i10;
        this.M = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = n5.c.a(parcel);
        n5.c.d(parcel, 1, this.f17210a, false);
        n5.c.s(parcel, 2, this.f17211b, i10, false);
        n5.c.k(parcel, 3, this.f17212c);
        n5.c.o(parcel, 4, this.M, i10, false);
        n5.c.b(parcel, a10);
    }
}
