package p174m3;

import android.os.Bundle;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;

public final class C6613h2 implements AbstractC6609h {
    public static final C6613h2 f20669M = new C6613h2(1.0f);
    public static final AbstractC6609h.AbstractC6610a<C6613h2> f20670N = C6603g2.f20629a;
    public final float f20671a;
    public final float f20672b;
    public final int f20673c;

    public C6613h2(float f) {
        this(f, 1.0f);
    }

    public static String m19785c(int i) {
        return Integer.toString(i, 36);
    }

    public static C6613h2 m19784d(Bundle bundle) {
        return new C6613h2(bundle.getFloat(m19785c(0), 1.0f), bundle.getFloat(m19785c(1), 1.0f));
    }

    public long m19786b(long j) {
        return j * this.f20673c;
    }

    public C6613h2 m19783e(float f) {
        return new C6613h2(f, this.f20672b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6613h2.class != obj.getClass()) {
            return false;
        }
        C6613h2 h2Var = (C6613h2) obj;
        return this.f20671a == h2Var.f20671a && this.f20672b == h2Var.f20672b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f20671a)) * 31) + Float.floatToRawIntBits(this.f20672b);
    }

    public String toString() {
        return C1216l0.m37939z("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f20671a), Float.valueOf(this.f20672b));
    }

    public C6613h2(float f, float f2) {
        boolean z = true;
        C1186a.m38192a(f > 0.0f);
        C1186a.m38192a(f2 <= 0.0f ? false : z);
        this.f20671a = f;
        this.f20672b = f2;
        this.f20673c = Math.round(f * 1000.0f);
    }
}
