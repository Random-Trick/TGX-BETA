package sb;

import ra.g;

public final class a {
    public boolean f22689a;
    public long f22690b;
    public boolean f22691c;
    public boolean f22692d;
    public long f22693e;

    public a() {
        this(false, 0L, false, false, 0L, 31, null);
    }

    public a(boolean z10, long j10, boolean z11, boolean z12, long j11) {
        this.f22689a = z10;
        this.f22690b = j10;
        this.f22691c = z11;
        this.f22692d = z12;
        this.f22693e = j11;
    }

    public final boolean a() {
        return this.f22692d;
    }

    public final long b() {
        return this.f22693e;
    }

    public final boolean c() {
        return this.f22689a;
    }

    public final boolean d() {
        return this.f22691c;
    }

    public final long e() {
        return this.f22690b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22689a == aVar.f22689a && this.f22690b == aVar.f22690b && this.f22691c == aVar.f22691c && this.f22692d == aVar.f22692d && this.f22693e == aVar.f22693e;
    }

    public final void f(boolean z10) {
        this.f22689a = z10;
    }

    public final void g(long j10) {
        this.f22690b = j10;
    }

    public int hashCode() {
        boolean z10 = this.f22689a;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        long j10 = this.f22690b;
        int i13 = ((i11 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z11 = this.f22691c;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f22692d;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        long j11 = this.f22693e;
        return ((i16 + i10) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "ConfettiConfig(fadeOut=" + this.f22689a + ", timeToLive=" + this.f22690b + ", rotate=" + this.f22691c + ", accelerate=" + this.f22692d + ", delay=" + this.f22693e + ")";
    }

    public a(boolean z10, long j10, boolean z11, boolean z12, long j11, int i10, g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 2000L : j10, (i10 & 4) != 0 ? true : z11, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? 0L : j11);
    }
}
