package p252rb;

import qa.C8294g;

public final class C8417a {
    public boolean f27322a;
    public long f27323b;
    public boolean f27324c;
    public boolean f27325d;
    public long f27326e;

    public C8417a() {
        this(false, 0L, false, false, 0L, 31, null);
    }

    public C8417a(boolean z, long j, boolean z2, boolean z3, long j2) {
        this.f27322a = z;
        this.f27323b = j;
        this.f27324c = z2;
        this.f27325d = z3;
        this.f27326e = j2;
    }

    public final boolean m12541a() {
        return this.f27325d;
    }

    public final long m12540b() {
        return this.f27326e;
    }

    public final boolean m12539c() {
        return this.f27322a;
    }

    public final boolean m12538d() {
        return this.f27324c;
    }

    public final long m12537e() {
        return this.f27323b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8417a)) {
            return false;
        }
        C8417a aVar = (C8417a) obj;
        return this.f27322a == aVar.f27322a && this.f27323b == aVar.f27323b && this.f27324c == aVar.f27324c && this.f27325d == aVar.f27325d && this.f27326e == aVar.f27326e;
    }

    public final void m12536f(boolean z) {
        this.f27322a = z;
    }

    public final void m12535g(long j) {
        this.f27323b = j;
    }

    public int hashCode() {
        boolean z = this.f27322a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f27323b;
        int i4 = ((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z2 = this.f27324c;
        if (z2) {
            z2 = true;
        }
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (i4 + i5) * 31;
        boolean z3 = this.f27325d;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        long j2 = this.f27326e;
        return ((i7 + i) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ConfettiConfig(fadeOut=" + this.f27322a + ", timeToLive=" + this.f27323b + ", rotate=" + this.f27324c + ", accelerate=" + this.f27325d + ", delay=" + this.f27326e + ")";
    }

    public C8417a(boolean z, long j, boolean z2, boolean z3, long j2, int i, C8294g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 2000L : j, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? 0L : j2);
    }
}
