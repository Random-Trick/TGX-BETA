package g6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import m5.q;
import n5.a;
import n5.c;

public final class q0 extends a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();
    public long M;
    public int N;
    public boolean f12141a;
    public long f12142b;
    public float f12143c;

    public q0() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f12141a == q0Var.f12141a && this.f12142b == q0Var.f12142b && Float.compare(this.f12143c, q0Var.f12143c) == 0 && this.M == q0Var.M && this.N == q0Var.N;
    }

    public final int hashCode() {
        return q.b(Boolean.valueOf(this.f12141a), Long.valueOf(this.f12142b), Float.valueOf(this.f12143c), Long.valueOf(this.M), Integer.valueOf(this.N));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f12141a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f12142b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f12143c);
        long j10 = this.M;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.N != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.N);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f12141a);
        c.n(parcel, 2, this.f12142b);
        c.h(parcel, 3, this.f12143c);
        c.n(parcel, 4, this.M);
        c.k(parcel, 5, this.N);
        c.b(parcel, a10);
    }

    public q0(boolean z10, long j10, float f10, long j11, int i10) {
        this.f12141a = z10;
        this.f12142b = j10;
        this.f12143c = f10;
        this.M = j11;
        this.N = i10;
    }
}
