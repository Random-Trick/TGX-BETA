package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C4298m0 extends AbstractC6749a {
    public static final Parcelable.Creator<C4298m0> CREATOR = new C4300n0();
    public final long f14360M;
    public final int f14361a;
    public final int f14362b;
    public final long f14363c;

    public C4298m0(int i, int i2, long j, long j2) {
        this.f14361a = i;
        this.f14362b = i2;
        this.f14363c = j;
        this.f14360M = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4298m0) {
            C4298m0 m0Var = (C4298m0) obj;
            if (this.f14361a == m0Var.f14361a && this.f14362b == m0Var.f14362b && this.f14363c == m0Var.f14363c && this.f14360M == m0Var.f14360M) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6374q.m20523b(Integer.valueOf(this.f14362b), Integer.valueOf(this.f14361a), Long.valueOf(this.f14360M), Long.valueOf(this.f14363c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f14361a + " Cell status: " + this.f14362b + " elapsed time NS: " + this.f14360M + " system time ms: " + this.f14363c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f14361a);
        C6752c.m19114k(parcel, 2, this.f14362b);
        C6752c.m19111n(parcel, 3, this.f14363c);
        C6752c.m19111n(parcel, 4, this.f14360M);
        C6752c.m19123b(parcel, a);
    }
}
