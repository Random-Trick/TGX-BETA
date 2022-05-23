package m3;

import c5.a;
import c5.l0;
import o4.s;

public final class e2 {
    public final s.b f16631a;
    public final long f16632b;
    public final long f16633c;
    public final long f16634d;
    public final long f16635e;
    public final boolean f16636f;
    public final boolean f16637g;
    public final boolean f16638h;
    public final boolean f16639i;

    public e2(s.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        a.a(!z13 || z11);
        a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        a.a(z14);
        this.f16631a = bVar;
        this.f16632b = j10;
        this.f16633c = j11;
        this.f16634d = j12;
        this.f16635e = j13;
        this.f16636f = z10;
        this.f16637g = z11;
        this.f16638h = z12;
        this.f16639i = z13;
    }

    public e2 a(long j10) {
        if (j10 == this.f16633c) {
            return this;
        }
        return new e2(this.f16631a, this.f16632b, j10, this.f16634d, this.f16635e, this.f16636f, this.f16637g, this.f16638h, this.f16639i);
    }

    public e2 b(long j10) {
        if (j10 == this.f16632b) {
            return this;
        }
        return new e2(this.f16631a, j10, this.f16633c, this.f16634d, this.f16635e, this.f16636f, this.f16637g, this.f16638h, this.f16639i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2.class != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f16632b == e2Var.f16632b && this.f16633c == e2Var.f16633c && this.f16634d == e2Var.f16634d && this.f16635e == e2Var.f16635e && this.f16636f == e2Var.f16636f && this.f16637g == e2Var.f16637g && this.f16638h == e2Var.f16638h && this.f16639i == e2Var.f16639i && l0.c(this.f16631a, e2Var.f16631a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f16631a.hashCode()) * 31) + ((int) this.f16632b)) * 31) + ((int) this.f16633c)) * 31) + ((int) this.f16634d)) * 31) + ((int) this.f16635e)) * 31) + (this.f16636f ? 1 : 0)) * 31) + (this.f16637g ? 1 : 0)) * 31) + (this.f16638h ? 1 : 0)) * 31) + (this.f16639i ? 1 : 0);
    }
}
