package t3;

import c5.b0;
import c5.s;

public final class b {
    public static void a(long j10, b0 b0Var, t[] tVarArr) {
        while (true) {
            boolean z10 = true;
            if (b0Var.a() > 1) {
                int c10 = c(b0Var);
                int c11 = c(b0Var);
                int e10 = b0Var.e() + c11;
                if (c11 == -1 || c11 > b0Var.a()) {
                    s.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e10 = b0Var.f();
                } else if (c10 == 4 && c11 >= 8) {
                    int D = b0Var.D();
                    int J = b0Var.J();
                    int n10 = J == 49 ? b0Var.n() : 0;
                    int D2 = b0Var.D();
                    if (J == 47) {
                        b0Var.Q(1);
                    }
                    boolean z11 = D == 181 && (J == 49 || J == 47) && D2 == 3;
                    if (J == 49) {
                        if (n10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, b0Var, tVarArr);
                    }
                }
                b0Var.P(e10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, b0 b0Var, t[] tVarArr) {
        int D = b0Var.D();
        if ((D & 64) != 0) {
            b0Var.Q(1);
            int i10 = (D & 31) * 3;
            int e10 = b0Var.e();
            for (t tVar : tVarArr) {
                b0Var.P(e10);
                tVar.d(b0Var, i10);
                if (j10 != -9223372036854775807L) {
                    tVar.f(j10, 1, i10, 0, null);
                }
            }
        }
    }

    public static int c(b0 b0Var) {
        int i10 = 0;
        while (b0Var.a() != 0) {
            int D = b0Var.D();
            i10 += D;
            if (D != 255) {
                return i10;
            }
        }
        return -1;
    }
}
