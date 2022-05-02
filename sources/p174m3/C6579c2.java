package p174m3;

import android.os.Bundle;
import p020b5.C1186a;
import p174m3.AbstractC6609h;
import p343y6.C10432h;

public final class C6579c2 extends AbstractC6684q2 {
    public static final AbstractC6609h.AbstractC6610a<C6579c2> f20500c = C6563b2.f20416a;
    public final float f20501b;

    public C6579c2() {
        this.f20501b = -1.0f;
    }

    public static String m19968c(int i) {
        return Integer.toString(i, 36);
    }

    public static C6579c2 m19966e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m19968c(0), -1) == 1) {
            z = true;
        }
        C1186a.m38192a(z);
        float f = bundle.getFloat(m19968c(1), -1.0f);
        return f == -1.0f ? new C6579c2() : new C6579c2(f);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6579c2) && this.f20501b == ((C6579c2) obj).f20501b;
    }

    public int hashCode() {
        return C10432h.m5138b(Float.valueOf(this.f20501b));
    }

    public C6579c2(float f) {
        C1186a.m38191b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f20501b = f;
    }
}
