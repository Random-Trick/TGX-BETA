package p357z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import p075f6.C4306q0;
import p163l5.C6333d;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C11296g0 extends AbstractC6749a {
    public final C4306q0 f36211a;
    public final List<C6333d> f36212b;
    public final String f36213c;
    public static final List<C6333d> f36209M = Collections.emptyList();
    public static final C4306q0 f36210N = new C4306q0();
    public static final Parcelable.Creator<C11296g0> CREATOR = new C11298h0();

    public C11296g0(C4306q0 q0Var, List<C6333d> list, String str) {
        this.f36211a = q0Var;
        this.f36212b = list;
        this.f36213c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11296g0)) {
            return false;
        }
        C11296g0 g0Var = (C11296g0) obj;
        return C6374q.m20525a(this.f36211a, g0Var.f36211a) && C6374q.m20525a(this.f36212b, g0Var.f36212b) && C6374q.m20525a(this.f36213c, g0Var.f36213c);
    }

    public final int hashCode() {
        return this.f36211a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f36211a);
        String valueOf2 = String.valueOf(this.f36212b);
        String str = this.f36213c;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 1, this.f36211a, i, false);
        C6752c.m19106t(parcel, 2, this.f36212b, false);
        C6752c.m19110p(parcel, 3, this.f36213c, false);
        C6752c.m19124b(parcel, a);
    }
}
