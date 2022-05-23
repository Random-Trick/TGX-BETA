package c4;

import c5.b0;
import c5.i0;
import c5.l0;
import com.google.android.exoplayer2.extractor.a;
import t3.g;

public final class e0 extends com.google.android.exoplayer2.extractor.a {

    public static final class a implements a.f {
        public final i0 f4475a;
        public final b0 f4476b = new b0();
        public final int f4477c;
        public final int f4478d;

        public a(int i10, i0 i0Var, int i11) {
            this.f4477c = i10;
            this.f4475a = i0Var;
            this.f4478d = i11;
        }

        @Override
        public a.e a(g gVar, long j10) {
            long r10 = gVar.r();
            int min = (int) Math.min(this.f4478d, gVar.a() - r10);
            this.f4476b.L(min);
            gVar.q(this.f4476b.d(), 0, min);
            return c(this.f4476b, j10, r10);
        }

        @Override
        public void b() {
            this.f4476b.M(l0.f4846f);
        }

        public final a.e c(b0 b0Var, long j10, long j11) {
            int a10;
            int a11;
            int f10 = b0Var.f();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (b0Var.a() >= 188 && (a11 = (a10 = j0.a(b0Var.d(), b0Var.e(), f10)) + 188) <= f10) {
                long c10 = j0.c(b0Var, a10, this.f4477c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f4475a.b(c10);
                    if (b10 > j10) {
                        if (j14 == -9223372036854775807L) {
                            return a.e.d(b10, j11);
                        }
                        return a.e.e(j11 + j13);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j11 + a10);
                    } else {
                        j13 = a10;
                        j14 = b10;
                    }
                }
                b0Var.P(a11);
                j12 = a11;
            }
            if (j14 != -9223372036854775807L) {
                return a.e.f(j14, j11 + j12);
            }
            return a.e.f5556d;
        }
    }

    public e0(i0 i0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, i0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
