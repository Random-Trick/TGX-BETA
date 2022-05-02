package p031c4;

import com.google.android.exoplayer2.extractor.AbstractC3457a;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p270t3.AbstractC8959g;

public final class C1599x extends AbstractC3457a {

    public static final class C1601b implements AbstractC3457a.AbstractC3463f {
        public final C1205i0 f5864a;
        public final C1189b0 f5865b;

        public static void m36308d(C1189b0 b0Var) {
            int k;
            int f = b0Var.m38137f();
            if (b0Var.m38142a() < 10) {
                b0Var.m38144P(f);
                return;
            }
            b0Var.m38143Q(9);
            int D = b0Var.m38156D() & 7;
            if (b0Var.m38142a() < D) {
                b0Var.m38144P(f);
                return;
            }
            b0Var.m38143Q(D);
            if (b0Var.m38142a() < 4) {
                b0Var.m38144P(f);
                return;
            }
            if (C1599x.m36310k(b0Var.m38139d(), b0Var.m38138e()) == 443) {
                b0Var.m38143Q(4);
                int J = b0Var.m38150J();
                if (b0Var.m38142a() < J) {
                    b0Var.m38144P(f);
                    return;
                }
                b0Var.m38143Q(J);
            }
            while (b0Var.m38142a() >= 4 && (k = C1599x.m36310k(b0Var.m38139d(), b0Var.m38138e())) != 442 && k != 441 && (k >>> 8) == 1) {
                b0Var.m38143Q(4);
                if (b0Var.m38142a() < 2) {
                    b0Var.m38144P(f);
                    return;
                }
                b0Var.m38144P(Math.min(b0Var.m38137f(), b0Var.m38138e() + b0Var.m38150J()));
            }
        }

        @Override
        public AbstractC3457a.C3462e mo6780a(AbstractC8959g gVar, long j) {
            long r = gVar.mo6043r();
            int min = (int) Math.min(20000L, gVar.mo6046a() - r);
            this.f5865b.m38148L(min);
            gVar.mo10806q(this.f5865b.m38139d(), 0, min);
            return m36309c(this.f5865b, j, r);
        }

        @Override
        public void mo6779b() {
            this.f5865b.m38147M(C1216l0.f4531f);
        }

        public final AbstractC3457a.C3462e m36309c(C1189b0 b0Var, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (b0Var.m38142a() >= 4) {
                if (C1599x.m36310k(b0Var.m38139d(), b0Var.m38138e()) != 442) {
                    b0Var.m38143Q(1);
                } else {
                    b0Var.m38143Q(4);
                    long l = C1602y.m36296l(b0Var);
                    if (l != -9223372036854775807L) {
                        long b = this.f5864a.m38052b(l);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return AbstractC3457a.C3462e.m30468d(b, j2);
                            }
                            return AbstractC3457a.C3462e.m30467e(j2 + i2);
                        } else if (100000 + b > j) {
                            return AbstractC3457a.C3462e.m30467e(j2 + b0Var.m38138e());
                        } else {
                            i2 = b0Var.m38138e();
                            j3 = b;
                        }
                    }
                    m36308d(b0Var);
                    i = b0Var.m38138e();
                }
            }
            if (j3 != -9223372036854775807L) {
                return AbstractC3457a.C3462e.m30466f(j3, j2 + i);
            }
            return AbstractC3457a.C3462e.f11445d;
        }

        public C1601b(C1205i0 i0Var) {
            this.f5864a = i0Var;
            this.f5865b = new C1189b0();
        }
    }

    public C1599x(C1205i0 i0Var, long j, long j2) {
        super(new AbstractC3457a.C3459b(), new C1601b(i0Var), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int m36310k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
