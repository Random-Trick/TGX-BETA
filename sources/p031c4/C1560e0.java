package p031c4;

import com.google.android.exoplayer2.extractor.AbstractC3457a;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p270t3.AbstractC8959g;

public final class C1560e0 extends AbstractC3457a {

    public static final class C1561a implements AbstractC3457a.AbstractC3463f {
        public final C1205i0 f5558a;
        public final C1189b0 f5559b = new C1189b0();
        public final int f5560c;
        public final int f5561d;

        public C1561a(int i, C1205i0 i0Var, int i2) {
            this.f5560c = i;
            this.f5558a = i0Var;
            this.f5561d = i2;
        }

        @Override
        public AbstractC3457a.C3462e mo6780a(AbstractC8959g gVar, long j) {
            long r = gVar.mo6043r();
            int min = (int) Math.min(this.f5561d, gVar.mo6046a() - r);
            this.f5559b.m38148L(min);
            gVar.mo10806q(this.f5559b.m38139d(), 0, min);
            return m36467c(this.f5559b, j, r);
        }

        @Override
        public void mo6779b() {
            this.f5559b.m38147M(C1216l0.f4531f);
        }

        public final AbstractC3457a.C3462e m36467c(C1189b0 b0Var, long j, long j2) {
            int a;
            int a2;
            int f = b0Var.m38137f();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (b0Var.m38142a() >= 188 && (a2 = (a = C1577j0.m36396a(b0Var.m38139d(), b0Var.m38138e(), f)) + 188) <= f) {
                long c = C1577j0.m36394c(b0Var, a, this.f5560c);
                if (c != -9223372036854775807L) {
                    long b = this.f5558a.m38052b(c);
                    if (b > j) {
                        if (j5 == -9223372036854775807L) {
                            return AbstractC3457a.C3462e.m30468d(b, j2);
                        }
                        return AbstractC3457a.C3462e.m30467e(j2 + j4);
                    } else if (100000 + b > j) {
                        return AbstractC3457a.C3462e.m30467e(j2 + a);
                    } else {
                        j4 = a;
                        j5 = b;
                    }
                }
                b0Var.m38144P(a2);
                j3 = a2;
            }
            if (j5 != -9223372036854775807L) {
                return AbstractC3457a.C3462e.m30466f(j5, j2 + j3);
            }
            return AbstractC3457a.C3462e.f11445d;
        }
    }

    public C1560e0(C1205i0 i0Var, long j, long j2, int i, int i2) {
        super(new AbstractC3457a.C3459b(), new C1561a(i, i0Var, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
