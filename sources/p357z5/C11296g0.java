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
    public final C4306q0 f36208a;
    public final List<C6333d> f36209b;
    public final String f36210c;
    public static final List<C6333d> f36206M = Collections.emptyList();
    public static final C4306q0 f36207N = new C4306q0();
    public static final Parcelable.Creator<C11296g0> CREATOR = new C11298h0();

    public C11296g0(C4306q0 q0Var, List<C6333d> list, String str) {
        this.f36208a = q0Var;
        this.f36209b = list;
        this.f36210c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11296g0)) {
            return false;
        }
        C11296g0 g0Var = (C11296g0) obj;
        return C6374q.m20524a(this.f36208a, g0Var.f36208a) && C6374q.m20524a(this.f36209b, g0Var.f36209b) && C6374q.m20524a(this.f36210c, g0Var.f36210c);
    }

    public final int hashCode() {
        return this.f36208a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f36208a);
        String valueOf2 = String.valueOf(this.f36209b);
        String str = this.f36210c;
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
        int a = C6752c.m19124a(parcel);
        C6752c.m19110o(parcel, 1, this.f36208a, i, false);
        C6752c.m19105t(parcel, 2, this.f36209b, false);
        C6752c.m19109p(parcel, 3, this.f36210c, false);
        C6752c.m19123b(parcel, a);
    }
}
