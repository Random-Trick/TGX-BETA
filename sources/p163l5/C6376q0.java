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

    public final AbstractC6355k m20520b() {
        IBinder iBinder = this.f20014b;
        if (iBinder == null) {
            return null;
        }
        return AbstractC6355k.AbstractBinderC6356a.m20564s(iBinder);
    }

    public final C5217a m20519c() {
        return this.f20015c;
    }

    public final boolean m20518d() {
        return this.f20011M;
    }

    public final boolean m20517e() {
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
        return this.f20015c.equals(q0Var.f20015c) && C6374q.m20524a(m20520b(), q0Var.m20520b());
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f20013a);
        C6752c.m19115j(parcel, 2, this.f20014b, false);
        C6752c.m19110o(parcel, 3, this.f20015c, i, false);
        C6752c.m19122c(parcel, 4, this.f20011M);
        C6752c.m19122c(parcel, 5, this.f20012N);
        C6752c.m19123b(parcel, a);
    }
}
