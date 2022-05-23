package m5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import m5.k;
import n5.a;
import n5.c;

public final class q0 extends a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();
    public final boolean M;
    public final boolean N;
    public final int f17251a;
    public final IBinder f17252b;
    public final j5.a f17253c;

    public q0(int i10, IBinder iBinder, j5.a aVar, boolean z10, boolean z11) {
        this.f17251a = i10;
        this.f17252b = iBinder;
        this.f17253c = aVar;
        this.M = z10;
        this.N = z11;
    }

    public final k b() {
        IBinder iBinder = this.f17252b;
        if (iBinder == null) {
            return null;
        }
        return k.a.r(iBinder);
    }

    public final j5.a c() {
        return this.f17253c;
    }

    public final boolean d() {
        return this.M;
    }

    public final boolean e() {
        return this.N;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f17253c.equals(q0Var.f17253c) && q.a(b(), q0Var.b());
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f17251a);
        c.j(parcel, 2, this.f17252b, false);
        c.o(parcel, 3, this.f17253c, i10, false);
        c.c(parcel, 4, this.M);
        c.c(parcel, 5, this.N);
        c.b(parcel, a10);
    }
}
