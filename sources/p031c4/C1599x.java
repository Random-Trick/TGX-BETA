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

        public static void m36311d(C1189b0 b0Var) {
            int k;
            int f = b0Var.m38140f();
            if (b0Var.m38145a() < 10) {
                b0Var.m38147P(f);
                return;
            }
            b0Var.m38146Q(9);
            int D = b0Var.m38159D() & 7;
            if (b0Var.m38145a() < D) {
                b0Var.m38147P(f);
                return;
            }
            b0Var.m38146Q(D);
            if (b0Var.m38145a() < 4) {
                b0Var.m38147P(f);
                return;
            }
            if (C1599x.m36313k(b0Var.m38142d(), b0Var.m38141e()) == 443) {
                b0Var.m38146Q(4);
                int J = b0Var.m38153J();
                if (b0Var.m38145a() < J) {
                    b0Var.m38147P(f);
                    return;
                }
                b0Var.m38146Q(J);
            }
            while (b0Var.m38145a() >= 4 && (k = C1599x.m36313k(b0Var.m38142d(), b0Var.m38141e())) != 442 && k != 441 && (k >>> 8) == 1) {
                b0Var.m38146Q(4);
                if (b0Var.m38145a() < 2) {
                    b0Var.m38147P(f);
                    return;
                }
                b0Var.m38147P(Math.min(b0Var.m38140f(), b0Var.m38141e() + b0Var.m38153J()));
            }
        }

        @Override
        public AbstractC3457a.C3462e mo6780a(AbstractC8959g gVar, long j) {
            long r = gVar.mo6043r();
            int min = (int) Math.min(20000L, gVar.mo6046a() - r);
            this.f5865b.m38151L(min);
            gVar.mo10805q(this.f5865b.m38142d(), 0, min);
            return m36312c(this.f5865b, j, r);
        }

        @Override
        public void mo6779b() {
            this.f5865b.m38150M(C1216l0.f4531f);
        }

        public final AbstractC3457a.C3462e m36312c(C1189b0 b0Var, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (b0Var.m38145a() >= 4) {
                if (C1599x.m36313k(b0Var.m38142d(), b0Var.m38141e()) != 442) {
                    b0Var.m38146Q(1);
                } else {
                    b0Var.m38146Q(4);
                    long l = C1602y.m36299l(b0Var);
                    if (l != -9223372036854775807L) {
                        long b = this.f5864a.m38055b(l);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return AbstractC3457a.C3462e.m30470d(b, j2);
                            }
                            return AbstractC3457a.C3462e.m30469e(j2 + i2);
                        } else if (100000 + b > j) {
                            return AbstractC3457a.C3462e.m30469e(j2 + b0Var.m38141e());
                        } else {
                            i2 = b0Var.m38141e();
                            j3 = b;
                        }
                    }
                    m36311d(b0Var);
                    i = b0Var.m38141e();
                }
            }
            if (j3 != -9223372036854775807L) {
                return AbstractC3457a.C3462e.m30468f(j3, j2 + i);
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

    public static int m36313k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
