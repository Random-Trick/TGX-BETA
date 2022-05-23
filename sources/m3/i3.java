package m3;

import android.os.Bundle;
import c5.a;
import m3.h;
import z6.i;

public final class i3 extends z2 {
    public static final h.a<i3> M = h3.f16675a;
    public final int f16685b;
    public final float f16686c;

    public i3(int i10) {
        a.b(i10 > 0, "maxStars must be a positive integer");
        this.f16685b = i10;
        this.f16686c = -1.0f;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static i3 e(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(c(0), -1) == 2) {
            z10 = true;
        }
        a.a(z10);
        int i10 = bundle.getInt(c(1), 5);
        float f10 = bundle.getFloat(c(2), -1.0f);
        if (f10 == -1.0f) {
            return new i3(i10);
        }
        return new i3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f16685b == i3Var.f16685b && this.f16686c == i3Var.f16686c;
    }

    public int hashCode() {
        return i.b(Integer.valueOf(this.f16685b), Float.valueOf(this.f16686c));
    }

    public i3(int i10, float f10) {
        boolean z10 = true;
        a.b(i10 > 0, "maxStars must be a positive integer");
        a.b((f10 < 0.0f || f10 > ((float) i10)) ? false : z10, "starRating is out of range [0, maxStars]");
        this.f16685b = i10;
        this.f16686c = f10;
    }
}
