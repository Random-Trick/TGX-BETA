package m3;

import android.os.Bundle;
import c5.a;
import m3.h;
import z6.i;

public final class m2 extends z2 {
    public static final h.a<m2> f16840c = l2.f16771a;
    public final float f16841b;

    public m2() {
        this.f16841b = -1.0f;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static m2 e(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(c(0), -1) == 1) {
            z10 = true;
        }
        a.a(z10);
        float f10 = bundle.getFloat(c(1), -1.0f);
        return f10 == -1.0f ? new m2() : new m2(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof m2) && this.f16841b == ((m2) obj).f16841b;
    }

    public int hashCode() {
        return i.b(Float.valueOf(this.f16841b));
    }

    public m2(float f10) {
        a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f16841b = f10;
    }
}
