package p163l5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p118i5.C5217a;
import p163l5.AbstractC6355k;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6376q0 extends AbstractC6749a {
    public static final Parcelable.Creator<C6376q0> CREATOR = new C6379r0();
    public final boolean f20011M;
    public final boolean f20012N;
    public final int f20013a;
    public final IBinder f20014b;
    public final C5217a f20015c;

    public C6376q0(int i, IBinder iBinder, C5217a aVar, boolean z, boolean z2) {
        this.f20013a = i;
        this.f20014b = iBinder;
        this.f20015c = aVar;
        this.f20011M = z;
        this.f20012N = z2;
    }

    public final AbstractC6355k m20521b() {
        IBinder iBinder = this.f20014b;
        if (iBinder == null) {
            return null;
        }
        return AbstractC6355k.AbstractBinderC6356a.m20565s(iBinder);
    }

    public final C5217a m20520c() {
        return this.f20015c;
    }

    public final boolean m20519d() {
        return this.f20011M;
    }

    public final boolean m20518e() {
        return this.f20012N;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6376q0)) {
            return false;
        }
        C6376q0 q0Var = (C6376q0) obj;
        return this.f20015c.equals(q0Var.f20015c) && C6374q.m20525a(m20521b(), q0Var.m20521b());
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f20013a);
        C6752c.m19116j(parcel, 2, this.f20014b, false);
        C6752c.m19111o(parcel, 3, this.f20015c, i, false);
        C6752c.m19123c(parcel, 4, this.f20011M);
        C6752c.m19123c(parcel, 5, this.f20012N);
        C6752c.m19124b(parcel, a);
    }
}
