package d9;

import java.nio.ByteBuffer;
import s2.e;
import s2.g;
import t8.b;

public class d extends b {
    public int f7253a;
    public int f7254b;
    public boolean f7255c;
    public int f7256d;
    public long f7257e;
    public long f7258f;
    public int f7259g;
    public int f7260h;
    public int f7261i;
    public int f7262j;
    public int f7263k;

    @Override
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        g.j(allocate, this.f7253a);
        g.j(allocate, (this.f7254b << 6) + (this.f7255c ? 32 : 0) + this.f7256d);
        g.g(allocate, this.f7257e);
        g.h(allocate, this.f7258f);
        g.j(allocate, this.f7259g);
        g.e(allocate, this.f7260h);
        g.e(allocate, this.f7261i);
        g.j(allocate, this.f7262j);
        g.e(allocate, this.f7263k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override
    public String b() {
        return "tscl";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        this.f7253a = e.n(byteBuffer);
        int n10 = e.n(byteBuffer);
        this.f7254b = (n10 & 192) >> 6;
        this.f7255c = (n10 & 32) > 0;
        this.f7256d = n10 & 31;
        this.f7257e = e.k(byteBuffer);
        this.f7258f = e.l(byteBuffer);
        this.f7259g = e.n(byteBuffer);
        this.f7260h = e.i(byteBuffer);
        this.f7261i = e.i(byteBuffer);
        this.f7262j = e.n(byteBuffer);
        this.f7263k = e.i(byteBuffer);
    }

    @Override
    public int d() {
        return 20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7253a == dVar.f7253a && this.f7261i == dVar.f7261i && this.f7263k == dVar.f7263k && this.f7262j == dVar.f7262j && this.f7260h == dVar.f7260h && this.f7258f == dVar.f7258f && this.f7259g == dVar.f7259g && this.f7257e == dVar.f7257e && this.f7256d == dVar.f7256d && this.f7254b == dVar.f7254b && this.f7255c == dVar.f7255c;
    }

    public int hashCode() {
        long j10 = this.f7257e;
        long j11 = this.f7258f;
        return (((((((((((((((((((this.f7253a * 31) + this.f7254b) * 31) + (this.f7255c ? 1 : 0)) * 31) + this.f7256d) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f7259g) * 31) + this.f7260h) * 31) + this.f7261i) * 31) + this.f7262j) * 31) + this.f7263k;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.f7253a + ", tlprofile_space=" + this.f7254b + ", tltier_flag=" + this.f7255c + ", tlprofile_idc=" + this.f7256d + ", tlprofile_compatibility_flags=" + this.f7257e + ", tlconstraint_indicator_flags=" + this.f7258f + ", tllevel_idc=" + this.f7259g + ", tlMaxBitRate=" + this.f7260h + ", tlAvgBitRate=" + this.f7261i + ", tlConstantFrameRate=" + this.f7262j + ", tlAvgFrameRate=" + this.f7263k + '}';
    }
}
