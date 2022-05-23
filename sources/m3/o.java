package m3;

import android.os.Bundle;
import m3.h;

public final class o implements h {
    public static final o M = new o(0, 0, 0);
    public static final h.a<o> N = n.f16844a;
    public final int f16850a;
    public final int f16851b;
    public final int f16852c;

    public o(int i10, int i11, int i12) {
        this.f16850a = i10;
        this.f16851b = i11;
        this.f16852c = i12;
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static o c(Bundle bundle) {
        return new o(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16850a == oVar.f16850a && this.f16851b == oVar.f16851b && this.f16852c == oVar.f16852c;
    }

    public int hashCode() {
        return ((((527 + this.f16850a) * 31) + this.f16851b) * 31) + this.f16852c;
    }
}
