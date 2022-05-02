package p174m3;

import android.os.Bundle;
import p020b5.C1186a;
import p174m3.AbstractC6609h;
import p343y6.C10432h;

public final class C6557a3 extends AbstractC6684q2 {
    public static final AbstractC6609h.AbstractC6610a<C6557a3> f20405M = C6733z2.f21186a;
    public final int f20406b;
    public final float f20407c;

    public C6557a3(int i) {
        C1186a.m38188b(i > 0, "maxStars must be a positive integer");
        this.f20406b = i;
        this.f20407c = -1.0f;
    }

    public static String m20109c(int i) {
        return Integer.toString(i, 36);
    }

    public static C6557a3 m20107e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m20109c(0), -1) == 2) {
            z = true;
        }
        C1186a.m38189a(z);
        int i = bundle.getInt(m20109c(1), 5);
        float f = bundle.getFloat(m20109c(2), -1.0f);
        if (f == -1.0f) {
            return new C6557a3(i);
        }
        return new C6557a3(i, f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6557a3)) {
            return false;
        }
        C6557a3 a3Var = (C6557a3) obj;
        return this.f20406b == a3Var.f20406b && this.f20407c == a3Var.f20407c;
    }

    public int hashCode() {
        return C10432h.m5138b(Integer.valueOf(this.f20406b), Float.valueOf(this.f20407c));
    }

    public C6557a3(int i, float f) {
        boolean z = true;
        C1186a.m38188b(i > 0, "maxStars must be a positive integer");
        C1186a.m38188b((f < 0.0f || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.f20406b = i;
        this.f20407c = f;
    }
}
