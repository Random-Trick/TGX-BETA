package m3;

import android.os.Bundle;
import c5.a;
import m3.h;
import z6.i;

public final class t1 extends z2 {
    public static final h.a<t1> M = s1.f16979a;
    public final boolean f16993b;
    public final boolean f16994c;

    public t1() {
        this.f16993b = false;
        this.f16994c = false;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static t1 e(Bundle bundle) {
        a.a(bundle.getInt(c(0), -1) == 0);
        if (bundle.getBoolean(c(1), false)) {
            return new t1(bundle.getBoolean(c(2), false));
        }
        return new t1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f16994c == t1Var.f16994c && this.f16993b == t1Var.f16993b;
    }

    public int hashCode() {
        return i.b(Boolean.valueOf(this.f16993b), Boolean.valueOf(this.f16994c));
    }

    public t1(boolean z10) {
        this.f16993b = true;
        this.f16994c = z10;
    }
}
