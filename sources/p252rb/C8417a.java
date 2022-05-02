package p252rb;

import qa.C8294g;

public final class C8417a {
    public boolean f27319a;
    public long f27320b;
    public boolean f27321c;
    public boolean f27322d;
    public long f27323e;

    public C8417a() {
        this(false, 0L, false, false, 0L, 31, null);
    }

    public C8417a(boolean z, long j, boolean z2, boolean z3, long j2) {
        this.f27319a = z;
        this.f27320b = j;
        this.f27321c = z2;
        this.f27322d = z3;
        this.f27323e = j2;
    }

    public final boolean m12542a() {
        return this.f27322d;
    }

    public final long m12541b() {
        return this.f27323e;
    }

    public final boolean m12540c() {
        return this.f27319a;
    }

    public final boolean m12539d() {
        return this.f27321c;
    }

    public final long m12538e() {
        return this.f27320b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8417a)) {
            return false;
        }
        C8417a aVar = (C8417a) obj;
        return this.f27319a == aVar.f27319a && this.f27320b == aVar.f27320b && this.f27321c == aVar.f27321c && this.f27322d == aVar.f27322d && this.f27323e == aVar.f27323e;
    }

    public final void m12537f(boolean z) {
        this.f27319a = z;
    }

    public final void m12536g(long j) {
        this.f27320b = j;
    }

    public int hashCode() {
        boolean z = this.f27319a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f27320b;
        int i4 = ((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z2 = this.f27321c;
        if (z2) {
            z2 = true;
        }
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (i4 + i5) * 31;
        boolean z3 = this.f27322d;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        long j2 = this.f27323e;
        return ((i7 + i) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ConfettiConfig(fadeOut=" + this.f27319a + ", timeToLive=" + this.f27320b + ", rotate=" + this.f27321c + ", accelerate=" + this.f27322d + ", delay=" + this.f27323e + ")";
    }

    public C8417a(boolean z, long j, boolean z2, boolean z3, long j2, int i, C8294g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 2000L : j, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? 0L : j2);
    }
}
