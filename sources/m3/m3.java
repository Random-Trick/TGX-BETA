package m3;

import android.os.Bundle;
import c5.a;
import m3.h;
import z6.i;

public final class m3 extends z2 {
    public static final h.a<m3> M = l3.f16772a;
    public final boolean f16842b;
    public final boolean f16843c;

    public m3() {
        this.f16842b = false;
        this.f16843c = false;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static m3 e(Bundle bundle) {
        a.a(bundle.getInt(c(0), -1) == 3);
        if (bundle.getBoolean(c(1), false)) {
            return new m3(bundle.getBoolean(c(2), false));
        }
        return new m3();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return this.f16843c == m3Var.f16843c && this.f16842b == m3Var.f16842b;
    }

    public int hashCode() {
        return i.b(Boolean.valueOf(this.f16842b), Boolean.valueOf(this.f16843c));
    }

    public m3(boolean z10) {
        this.f16842b = true;
        this.f16843c = z10;
    }
}
