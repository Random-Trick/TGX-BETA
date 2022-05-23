package m3;

import android.os.SystemClock;
import b7.f;
import c5.l0;
import m3.y1;

public final class j implements v1 {
    public final float f16687a;
    public final float f16688b;
    public final long f16689c;
    public final float f16690d;
    public final long f16691e;
    public final long f16692f;
    public final float f16693g;
    public long f16694h;
    public long f16695i;
    public long f16696j;
    public long f16697k;
    public long f16698l;
    public long f16699m;
    public float f16700n;
    public float f16701o;
    public float f16702p;
    public long f16703q;
    public long f16704r;
    public long f16705s;

    public static final class b {
        public float f16706a = 0.97f;
        public float f16707b = 1.03f;
        public long f16708c = 1000;
        public float f16709d = 1.0E-7f;
        public long f16710e = l0.r0(20);
        public long f16711f = l0.r0(500);
        public float f16712g = 0.999f;

        public j a() {
            return new j(this.f16706a, this.f16707b, this.f16708c, this.f16709d, this.f16710e, this.f16711f, this.f16712g);
        }
    }

    public static long h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    @Override
    public void a(y1.g gVar) {
        this.f16694h = l0.r0(gVar.f17083a);
        this.f16697k = l0.r0(gVar.f17084b);
        this.f16698l = l0.r0(gVar.f17085c);
        float f10 = gVar.M;
        if (f10 == -3.4028235E38f) {
            f10 = this.f16687a;
        }
        this.f16701o = f10;
        float f11 = gVar.N;
        if (f11 == -3.4028235E38f) {
            f11 = this.f16688b;
        }
        this.f16700n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f16694h = -9223372036854775807L;
        }
        g();
    }

    @Override
    public float b(long j10, long j11) {
        if (this.f16694h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f16703q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f16703q < this.f16689c) {
            return this.f16702p;
        }
        this.f16703q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f16699m;
        if (Math.abs(j12) < this.f16691e) {
            this.f16702p = 1.0f;
        } else {
            this.f16702p = l0.o((this.f16690d * ((float) j12)) + 1.0f, this.f16701o, this.f16700n);
        }
        return this.f16702p;
    }

    @Override
    public long c() {
        return this.f16699m;
    }

    @Override
    public void d() {
        long j10 = this.f16699m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f16692f;
            this.f16699m = j11;
            long j12 = this.f16698l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f16699m = j12;
            }
            this.f16703q = -9223372036854775807L;
        }
    }

    @Override
    public void e(long j10) {
        this.f16695i = j10;
        g();
    }

    public final void f(long j10) {
        long j11 = this.f16704r + (this.f16705s * 3);
        if (this.f16699m > j11) {
            float r02 = (float) l0.r0(this.f16689c);
            this.f16699m = f.c(j11, this.f16696j, this.f16699m - (((this.f16702p - 1.0f) * r02) + ((this.f16700n - 1.0f) * r02)));
            return;
        }
        long q10 = l0.q(j10 - (Math.max(0.0f, this.f16702p - 1.0f) / this.f16690d), this.f16699m, j11);
        this.f16699m = q10;
        long j12 = this.f16698l;
        if (j12 != -9223372036854775807L && q10 > j12) {
            this.f16699m = j12;
        }
    }

    public final void g() {
        long j10 = this.f16694h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f16695i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f16697k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f16698l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f16696j != j10) {
            this.f16696j = j10;
            this.f16699m = j10;
            this.f16704r = -9223372036854775807L;
            this.f16705s = -9223372036854775807L;
            this.f16703q = -9223372036854775807L;
        }
    }

    public final void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f16704r;
        if (j13 == -9223372036854775807L) {
            this.f16704r = j12;
            this.f16705s = 0L;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f16693g));
        this.f16704r = max;
        this.f16705s = h(this.f16705s, Math.abs(j12 - max), this.f16693g);
    }

    public j(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f16687a = f10;
        this.f16688b = f11;
        this.f16689c = j10;
        this.f16690d = f12;
        this.f16691e = j11;
        this.f16692f = j12;
        this.f16693g = f13;
        this.f16694h = -9223372036854775807L;
        this.f16695i = -9223372036854775807L;
        this.f16697k = -9223372036854775807L;
        this.f16698l = -9223372036854775807L;
        this.f16701o = f10;
        this.f16700n = f11;
        this.f16702p = 1.0f;
        this.f16703q = -9223372036854775807L;
        this.f16696j = -9223372036854775807L;
        this.f16699m = -9223372036854775807L;
        this.f16704r = -9223372036854775807L;
        this.f16705s = -9223372036854775807L;
    }
}
