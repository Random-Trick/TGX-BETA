package a6;

import android.os.Parcel;
import android.os.Parcelable;
import g6.q0;
import java.util.Collections;
import java.util.List;
import m5.d;
import m5.q;
import n5.a;
import n5.c;

public final class g0 extends a {
    public final q0 f561a;
    public final List<d> f562b;
    public final String f563c;
    public static final List<d> M = Collections.emptyList();
    public static final q0 N = new q0();
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    public g0(q0 q0Var, List<d> list, String str) {
        this.f561a = q0Var;
        this.f562b = list;
        this.f563c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return q.a(this.f561a, g0Var.f561a) && q.a(this.f562b, g0Var.f562b) && q.a(this.f563c, g0Var.f563c);
    }

    public final int hashCode() {
        return this.f561a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f561a);
        String valueOf2 = String.valueOf(this.f562b);
        String str = this.f563c;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, this.f561a, i10, false);
        c.t(parcel, 2, this.f562b, false);
        c.p(parcel, 3, this.f563c, false);
        c.b(parcel, a10);
    }
}
