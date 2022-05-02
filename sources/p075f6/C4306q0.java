package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C4306q0 extends AbstractC6749a {
    public static final Parcelable.Creator<C4306q0> CREATOR = new C4308r0();
    public long f14370M;
    public int f14371N;
    public boolean f14372a;
    public long f14373b;
    public float f14374c;

    public C4306q0() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4306q0)) {
            return false;
        }
        C4306q0 q0Var = (C4306q0) obj;
        return this.f14372a == q0Var.f14372a && this.f14373b == q0Var.f14373b && Float.compare(this.f14374c, q0Var.f14374c) == 0 && this.f14370M == q0Var.f14370M && this.f14371N == q0Var.f14371N;
    }

    public final int hashCode() {
        return C6374q.m20523b(Boolean.valueOf(this.f14372a), Long.valueOf(this.f14373b), Float.valueOf(this.f14374c), Long.valueOf(this.f14370M), Integer.valueOf(this.f14371N));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f14372a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f14373b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f14374c);
        long j = this.f14370M;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f14371N != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f14371N);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19122c(parcel, 1, this.f14372a);
        C6752c.m19111n(parcel, 2, this.f14373b);
        C6752c.m19117h(parcel, 3, this.f14374c);
        C6752c.m19111n(parcel, 4, this.f14370M);
        C6752c.m19114k(parcel, 5, this.f14371N);
        C6752c.m19123b(parcel, a);
    }

    public C4306q0(boolean z, long j, float f, long j2, int i) {
        this.f14372a = z;
        this.f14373b = j;
        this.f14374c = f;
        this.f14370M = j2;
        this.f14371N = i;
    }
}
