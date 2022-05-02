package p174m3;

import android.os.Bundle;
import p174m3.AbstractC6609h;

public final class C6658o implements AbstractC6609h {
    public static final C6658o f20803M = new C6658o(0, 0, 0);
    public static final AbstractC6609h.AbstractC6610a<C6658o> f20804N = C6651n.f20782a;
    public final int f20805a;
    public final int f20806b;
    public final int f20807c;

    public C6658o(int i, int i2, int i3) {
        this.f20805a = i;
        this.f20806b = i2;
        this.f20807c = i3;
    }

    public static String m19644b(int i) {
        return Integer.toString(i, 36);
    }

    public static C6658o m19643c(Bundle bundle) {
        return new C6658o(bundle.getInt(m19644b(0), 0), bundle.getInt(m19644b(1), 0), bundle.getInt(m19644b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6658o)) {
            return false;
        }
        C6658o oVar = (C6658o) obj;
        return this.f20805a == oVar.f20805a && this.f20806b == oVar.f20806b && this.f20807c == oVar.f20807c;
    }

    public int hashCode() {
        return ((((527 + this.f20805a) * 31) + this.f20806b) * 31) + this.f20807c;
    }
}
