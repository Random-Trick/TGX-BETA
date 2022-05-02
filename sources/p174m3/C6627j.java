package p174m3;

import android.os.SystemClock;
import p008a7.C0201d;
import p020b5.C1216l0;
import p174m3.C6660o1;

public final class C6627j implements AbstractC6642l1 {
    public final float f20701a;
    public final float f20702b;
    public final long f20703c;
    public final float f20704d;
    public final long f20705e;
    public final long f20706f;
    public final float f20707g;
    public long f20708h;
    public long f20709i;
    public long f20710j;
    public long f20711k;
    public long f20712l;
    public long f20713m;
    public float f20714n;
    public float f20715o;
    public float f20716p;
    public long f20717q;
    public long f20718r;
    public long f20719s;

    public static final class C6629b {
        public float f20720a = 0.97f;
        public float f20721b = 1.03f;
        public long f20722c = 1000;
        public float f20723d = 1.0E-7f;
        public long f20724e = C1216l0.m37953q0(20);
        public long f20725f = C1216l0.m37953q0(500);
        public float f20726g = 0.999f;

        public C6627j m19757a() {
            return new C6627j(this.f20720a, this.f20721b, this.f20722c, this.f20723d, this.f20724e, this.f20725f, this.f20726g);
        }
    }

    public static long m19759h(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    @Override
    public void mo19721a(C6660o1.C6669g gVar) {
        this.f20708h = C1216l0.m37953q0(gVar.f20866a);
        this.f20711k = C1216l0.m37953q0(gVar.f20867b);
        this.f20712l = C1216l0.m37953q0(gVar.f20868c);
        float f = gVar.f20864M;
        if (f == -3.4028235E38f) {
            f = this.f20701a;
        }
        this.f20715o = f;
        float f2 = gVar.f20865N;
        if (f2 == -3.4028235E38f) {
            f2 = this.f20702b;
        }
        this.f20714n = f2;
        m19760g();
    }

    @Override
    public float mo19720b(long j, long j2) {
        if (this.f20708h == -9223372036854775807L) {
            return 1.0f;
        }
        m19758i(j, j2);
        if (this.f20717q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f20717q < this.f20703c) {
            return this.f20716p;
        }
        this.f20717q = SystemClock.elapsedRealtime();
        m19761f(j);
        long j3 = j - this.f20713m;
        if (Math.abs(j3) < this.f20705e) {
            this.f20716p = 1.0f;
        } else {
            this.f20716p = C1216l0.m37958o((this.f20704d * ((float) j3)) + 1.0f, this.f20715o, this.f20714n);
        }
        return this.f20716p;
    }

    @Override
    public long mo19719c() {
        return this.f20713m;
    }

    @Override
    public void mo19718d() {
        long j = this.f20713m;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f20706f;
            this.f20713m = j2;
            long j3 = this.f20712l;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f20713m = j3;
            }
            this.f20717q = -9223372036854775807L;
        }
    }

    @Override
    public void mo19717e(long j) {
        this.f20709i = j;
        m19760g();
    }

    public final void m19761f(long j) {
        long j2 = this.f20718r + (this.f20719s * 3);
        if (this.f20713m > j2) {
            float q0 = (float) C1216l0.m37953q0(this.f20703c);
            this.f20713m = C0201d.m42091c(j2, this.f20710j, this.f20713m - (((this.f20716p - 1.0f) * q0) + ((this.f20714n - 1.0f) * q0)));
            return;
        }
        long q = C1216l0.m37954q(j - (Math.max(0.0f, this.f20716p - 1.0f) / this.f20704d), this.f20713m, j2);
        this.f20713m = q;
        long j3 = this.f20712l;
        if (j3 != -9223372036854775807L && q > j3) {
            this.f20713m = j3;
        }
    }

    public final void m19760g() {
        long j = this.f20708h;
        if (j != -9223372036854775807L) {
            long j2 = this.f20709i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f20711k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f20712l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f20710j != j) {
            this.f20710j = j;
            this.f20713m = j;
            this.f20718r = -9223372036854775807L;
            this.f20719s = -9223372036854775807L;
            this.f20717q = -9223372036854775807L;
        }
    }

    public final void m19758i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f20718r;
        if (j4 == -9223372036854775807L) {
            this.f20718r = j3;
            this.f20719s = 0L;
            return;
        }
        long max = Math.max(j3, m19759h(j4, j3, this.f20707g));
        this.f20718r = max;
        this.f20719s = m19759h(this.f20719s, Math.abs(j3 - max), this.f20707g);
    }

    public C6627j(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f20701a = f;
        this.f20702b = f2;
        this.f20703c = j;
        this.f20704d = f3;
        this.f20705e = j2;
        this.f20706f = j3;
        this.f20707g = f4;
        this.f20708h = -9223372036854775807L;
        this.f20709i = -9223372036854775807L;
        this.f20711k = -9223372036854775807L;
        this.f20712l = -9223372036854775807L;
        this.f20715o = f;
        this.f20714n = f2;
        this.f20716p = 1.0f;
        this.f20717q = -9223372036854775807L;
        this.f20710j = -9223372036854775807L;
        this.f20713m = -9223372036854775807L;
        this.f20718r = -9223372036854775807L;
        this.f20719s = -9223372036854775807L;
    }
}
