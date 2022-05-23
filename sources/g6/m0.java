package g6;

import android.os.Parcel;
import android.os.Parcelable;
import m5.q;
import n5.a;
import n5.c;

public final class m0 extends a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();
    public final long M;
    public final int f12132a;
    public final int f12133b;
    public final long f12134c;

    public m0(int i10, int i11, long j10, long j11) {
        this.f12132a = i10;
        this.f12133b = i11;
        this.f12134c = j10;
        this.M = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f12132a == m0Var.f12132a && this.f12133b == m0Var.f12133b && this.f12134c == m0Var.f12134c && this.M == m0Var.M) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q.b(Integer.valueOf(this.f12133b), Integer.valueOf(this.f12132a), Long.valueOf(this.M), Long.valueOf(this.f12134c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f12132a + " Cell status: " + this.f12133b + " elapsed time NS: " + this.M + " system time ms: " + this.f12134c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f12132a);
        c.k(parcel, 2, this.f12133b);
        c.n(parcel, 3, this.f12134c);
        c.n(parcel, 4, this.M);
        c.b(parcel, a10);
    }
}
