package c4;

import c5.b0;
import c5.i0;
import c5.l0;
import com.google.android.exoplayer2.extractor.a;
import t3.g;

public final class x extends com.google.android.exoplayer2.extractor.a {

    public static final class b implements a.f {
        public final i0 f4781a;
        public final b0 f4782b;

        public static void d(b0 b0Var) {
            int k10;
            int f10 = b0Var.f();
            if (b0Var.a() < 10) {
                b0Var.P(f10);
                return;
            }
            b0Var.Q(9);
            int D = b0Var.D() & 7;
            if (b0Var.a() < D) {
                b0Var.P(f10);
                return;
            }
            b0Var.Q(D);
            if (b0Var.a() < 4) {
                b0Var.P(f10);
                return;
            }
            if (x.k(b0Var.d(), b0Var.e()) == 443) {
                b0Var.Q(4);
                int J = b0Var.J();
                if (b0Var.a() < J) {
                    b0Var.P(f10);
                    return;
                }
                b0Var.Q(J);
            }
            while (b0Var.a() >= 4 && (k10 = x.k(b0Var.d(), b0Var.e())) != 442 && k10 != 441 && (k10 >>> 8) == 1) {
                b0Var.Q(4);
                if (b0Var.a() < 2) {
                    b0Var.P(f10);
                    return;
                }
                b0Var.P(Math.min(b0Var.f(), b0Var.e() + b0Var.J()));
            }
        }

        @Override
        public a.e a(g gVar, long j10) {
            long r10 = gVar.r();
            int min = (int) Math.min(20000L, gVar.a() - r10);
            this.f4782b.L(min);
            gVar.q(this.f4782b.d(), 0, min);
            return c(this.f4782b, j10, r10);
        }

        @Override
        public void b() {
            this.f4782b.M(l0.f4846f);
        }

        public final a.e c(b0 b0Var, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (b0Var.a() >= 4) {
                if (x.k(b0Var.d(), b0Var.e()) != 442) {
                    b0Var.Q(1);
                } else {
                    b0Var.Q(4);
                    long l10 = y.l(b0Var);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f4781a.b(l10);
                        if (b10 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return a.e.d(b10, j11);
                            }
                            return a.e.e(j11 + i11);
                        } else if (100000 + b10 > j10) {
                            return a.e.e(j11 + b0Var.e());
                        } else {
                            i11 = b0Var.e();
                            j12 = b10;
                        }
                    }
                    d(b0Var);
                    i10 = b0Var.e();
                }
            }
            if (j12 != -9223372036854775807L) {
                return a.e.f(j12, j11 + i10);
            }
            return a.e.f5556d;
        }

        public b(i0 i0Var) {
            this.f4781a = i0Var;
            this.f4782b = new b0();
        }
    }

    public x(i0 i0Var, long j10, long j11) {
        super(new a.b(), new b(i0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
