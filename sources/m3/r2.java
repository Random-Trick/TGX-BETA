package m3;

import android.os.Bundle;
import c5.a;
import c5.l0;
import m3.h;

public final class r2 implements h {
    public static final r2 M = new r2(1.0f);
    public static final h.a<r2> N = q2.f16942a;
    public final float f16948a;
    public final float f16949b;
    public final int f16950c;

    public r2(float f10) {
        this(f10, 1.0f);
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static r2 d(Bundle bundle) {
        return new r2(bundle.getFloat(c(0), 1.0f), bundle.getFloat(c(1), 1.0f));
    }

    public long b(long j10) {
        return j10 * this.f16950c;
    }

    public r2 e(float f10) {
        return new r2(f10, this.f16949b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2.class != obj.getClass()) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.f16948a == r2Var.f16948a && this.f16949b == r2Var.f16949b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f16948a)) * 31) + Float.floatToRawIntBits(this.f16949b);
    }

    public String toString() {
        return l0.z("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f16948a), Float.valueOf(this.f16949b));
    }

    public r2(float f10, float f11) {
        boolean z10 = true;
        a.a(f10 > 0.0f);
        a.a(f11 <= 0.0f ? false : z10);
        this.f16948a = f10;
        this.f16949b = f11;
        this.f16950c = Math.round(f10 * 1000.0f);
    }
}
