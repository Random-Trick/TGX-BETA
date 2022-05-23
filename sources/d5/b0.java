package d5;

import android.os.Bundle;
import m3.h;

public final class b0 implements h {
    public static final b0 N = new b0(0, 0);
    public static final h.a<b0> O = a0.f6205a;
    public final float M;
    public final int f6207a;
    public final int f6208b;
    public final int f6209c;

    public b0(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static b0 c(Bundle bundle) {
        return new b0(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f6207a == b0Var.f6207a && this.f6208b == b0Var.f6208b && this.f6209c == b0Var.f6209c && this.M == b0Var.M;
    }

    public int hashCode() {
        return ((((((217 + this.f6207a) * 31) + this.f6208b) * 31) + this.f6209c) * 31) + Float.floatToRawIntBits(this.M);
    }

    public b0(int i10, int i11, int i12, float f10) {
        this.f6207a = i10;
        this.f6208b = i11;
        this.f6209c = i12;
        this.M = f10;
    }
}
