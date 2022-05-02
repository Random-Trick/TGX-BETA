package p174m3;

import android.os.Bundle;
import p020b5.C1186a;
import p174m3.AbstractC6609h;
import p343y6.C10432h;

public final class C6631j1 extends AbstractC6684q2 {
    public static final AbstractC6609h.AbstractC6610a<C6631j1> f20729M = C6617i1.f20682a;
    public final boolean f20730b;
    public final boolean f20731c;

    public C6631j1() {
        this.f20730b = false;
        this.f20731c = false;
    }

    public static String m19757c(int i) {
        return Integer.toString(i, 36);
    }

    public static C6631j1 m19755e(Bundle bundle) {
        C1186a.m38192a(bundle.getInt(m19757c(0), -1) == 0);
        if (bundle.getBoolean(m19757c(1), false)) {
            return new C6631j1(bundle.getBoolean(m19757c(2), false));
        }
        return new C6631j1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6631j1)) {
            return false;
        }
        C6631j1 j1Var = (C6631j1) obj;
        return this.f20731c == j1Var.f20731c && this.f20730b == j1Var.f20730b;
    }

    public int hashCode() {
        return C10432h.m5138b(Boolean.valueOf(this.f20730b), Boolean.valueOf(this.f20731c));
    }

    public C6631j1(boolean z) {
        this.f20730b = true;
        this.f20731c = z;
    }
}
