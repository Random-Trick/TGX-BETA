package p032c5;

import android.os.Bundle;
import p174m3.AbstractC6609h;

public final class C1607b0 implements AbstractC6609h {
    public static final C1607b0 f5883N = new C1607b0(0, 0);
    public static final AbstractC6609h.AbstractC6610a<C1607b0> f5884O = C1605a0.f5881a;
    public final float f5885M;
    public final int f5886a;
    public final int f5887b;
    public final int f5888c;

    public C1607b0(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public static String m36291b(int i) {
        return Integer.toString(i, 36);
    }

    public static C1607b0 m36290c(Bundle bundle) {
        return new C1607b0(bundle.getInt(m36291b(0), 0), bundle.getInt(m36291b(1), 0), bundle.getInt(m36291b(2), 0), bundle.getFloat(m36291b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1607b0)) {
            return false;
        }
        C1607b0 b0Var = (C1607b0) obj;
        return this.f5886a == b0Var.f5886a && this.f5887b == b0Var.f5887b && this.f5888c == b0Var.f5888c && this.f5885M == b0Var.f5885M;
    }

    public int hashCode() {
        return ((((((217 + this.f5886a) * 31) + this.f5887b) * 31) + this.f5888c) * 31) + Float.floatToRawIntBits(this.f5885M);
    }

    public C1607b0(int i, int i2, int i3, float f) {
        this.f5886a = i;
        this.f5887b = i2;
        this.f5888c = i3;
        this.f5885M = f;
    }
}
