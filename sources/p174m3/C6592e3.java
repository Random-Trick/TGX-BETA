package p174m3;

import android.os.Bundle;
import p020b5.C1186a;
import p174m3.AbstractC6609h;
import p343y6.C10432h;

public final class C6592e3 extends AbstractC6684q2 {
    public static final AbstractC6609h.AbstractC6610a<C6592e3> f20525M = C6587d3.f20518a;
    public final boolean f20526b;
    public final boolean f20527c;

    public C6592e3() {
        this.f20526b = false;
        this.f20527c = false;
    }

    public static String m19927c(int i) {
        return Integer.toString(i, 36);
    }

    public static C6592e3 m19925e(Bundle bundle) {
        C1186a.m38189a(bundle.getInt(m19927c(0), -1) == 3);
        if (bundle.getBoolean(m19927c(1), false)) {
            return new C6592e3(bundle.getBoolean(m19927c(2), false));
        }
        return new C6592e3();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6592e3)) {
            return false;
        }
        C6592e3 e3Var = (C6592e3) obj;
        return this.f20527c == e3Var.f20527c && this.f20526b == e3Var.f20526b;
    }

    public int hashCode() {
        return C10432h.m5138b(Boolean.valueOf(this.f20526b), Boolean.valueOf(this.f20527c));
    }

    public C6592e3(boolean z) {
        this.f20526b = true;
        this.f20527c = z;
    }
}
