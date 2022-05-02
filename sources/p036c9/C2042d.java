package p036c9;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;
import p264s8.AbstractC8693b;

public class C2042d extends AbstractC8693b {
    public int f7246a;
    public int f7247b;
    public boolean f7248c;
    public int f7249d;
    public long f7250e;
    public long f7251f;
    public int f7252g;
    public int f7253h;
    public int f7254i;
    public int f7255j;
    public int f7256k;

    @Override
    public ByteBuffer mo11723a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        C8634g.m11851j(allocate, this.f7246a);
        C8634g.m11851j(allocate, (this.f7247b << 6) + (this.f7248c ? 32 : 0) + this.f7249d);
        C8634g.m11854g(allocate, this.f7250e);
        C8634g.m11853h(allocate, this.f7251f);
        C8634g.m11851j(allocate, this.f7252g);
        C8634g.m11856e(allocate, this.f7253h);
        C8634g.m11856e(allocate, this.f7254i);
        C8634g.m11851j(allocate, this.f7255j);
        C8634g.m11856e(allocate, this.f7256k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override
    public String mo11722b() {
        return "tscl";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        this.f7246a = C8632e.m11862n(byteBuffer);
        int n = C8632e.m11862n(byteBuffer);
        this.f7247b = (n & 192) >> 6;
        this.f7248c = (n & 32) > 0;
        this.f7249d = n & 31;
        this.f7250e = C8632e.m11865k(byteBuffer);
        this.f7251f = C8632e.m11864l(byteBuffer);
        this.f7252g = C8632e.m11862n(byteBuffer);
        this.f7253h = C8632e.m11867i(byteBuffer);
        this.f7254i = C8632e.m11867i(byteBuffer);
        this.f7255j = C8632e.m11862n(byteBuffer);
        this.f7256k = C8632e.m11867i(byteBuffer);
    }

    @Override
    public int mo11726d() {
        return 20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2042d dVar = (C2042d) obj;
        return this.f7246a == dVar.f7246a && this.f7254i == dVar.f7254i && this.f7256k == dVar.f7256k && this.f7255j == dVar.f7255j && this.f7253h == dVar.f7253h && this.f7251f == dVar.f7251f && this.f7252g == dVar.f7252g && this.f7250e == dVar.f7250e && this.f7249d == dVar.f7249d && this.f7247b == dVar.f7247b && this.f7248c == dVar.f7248c;
    }

    public int hashCode() {
        long j = this.f7250e;
        long j2 = this.f7251f;
        return (((((((((((((((((((this.f7246a * 31) + this.f7247b) * 31) + (this.f7248c ? 1 : 0)) * 31) + this.f7249d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f7252g) * 31) + this.f7253h) * 31) + this.f7254i) * 31) + this.f7255j) * 31) + this.f7256k;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.f7246a + ", tlprofile_space=" + this.f7247b + ", tltier_flag=" + this.f7248c + ", tlprofile_idc=" + this.f7249d + ", tlprofile_compatibility_flags=" + this.f7250e + ", tlconstraint_indicator_flags=" + this.f7251f + ", tllevel_idc=" + this.f7252g + ", tlMaxBitRate=" + this.f7253h + ", tlAvgBitRate=" + this.f7254i + ", tlConstantFrameRate=" + this.f7255j + ", tlAvgFrameRate=" + this.f7256k + '}';
    }
}
