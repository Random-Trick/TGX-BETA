package ie;

import gd.w;

public class p0 {
    public final int f14273a;
    public final int f14274b;
    public final String f14275c;
    public long f14276d;
    public long f14277e;

    public p0(int i10, int i11) {
        this.f14273a = i10;
        this.f14274b = i11;
        this.f14275c = null;
    }

    public long a() {
        return this.f14276d;
    }

    public long b() {
        return this.f14277e;
    }

    public p0 c(long j10) {
        this.f14276d = j10;
        return this;
    }

    public p0 d(long j10, long j11) {
        this.f14276d = j10;
        this.f14277e = j11;
        return this;
    }

    public String toString() {
        int i10 = this.f14274b;
        return i10 != 0 ? w.i1(i10) : this.f14275c;
    }

    public p0(int i10, String str) {
        this.f14273a = i10;
        this.f14274b = 0;
        this.f14275c = str;
    }
}
