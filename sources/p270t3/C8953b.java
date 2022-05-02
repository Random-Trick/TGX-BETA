package p270t3;

import p020b5.C1189b0;
import p020b5.C1230s;

public final class C8953b {
    public static void m10846a(long j, C1189b0 b0Var, AbstractC8974t[] tVarArr) {
        while (true) {
            boolean z = true;
            if (b0Var.m38142a() > 1) {
                int c = m10844c(b0Var);
                int c2 = m10844c(b0Var);
                int e = b0Var.m38138e() + c2;
                if (c2 == -1 || c2 > b0Var.m38142a()) {
                    C1230s.m37881i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e = b0Var.m38137f();
                } else if (c == 4 && c2 >= 8) {
                    int D = b0Var.m38156D();
                    int J = b0Var.m38150J();
                    int n = J == 49 ? b0Var.m38129n() : 0;
                    int D2 = b0Var.m38156D();
                    if (J == 47) {
                        b0Var.m38143Q(1);
                    }
                    boolean z2 = D == 181 && (J == 49 || J == 47) && D2 == 3;
                    if (J == 49) {
                        if (n != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m10845b(j, b0Var, tVarArr);
                    }
                }
                b0Var.m38144P(e);
            } else {
                return;
            }
        }
    }

    public static void m10845b(long j, C1189b0 b0Var, AbstractC8974t[] tVarArr) {
        int D = b0Var.m38156D();
        if ((D & 64) != 0) {
            b0Var.m38143Q(1);
            int i = (D & 31) * 3;
            int e = b0Var.m38138e();
            for (AbstractC8974t tVar : tVarArr) {
                b0Var.m38144P(e);
                tVar.mo10796c(b0Var, i);
                if (j != -9223372036854775807L) {
                    tVar.mo10794e(j, 1, i, 0, null);
                }
            }
        }
    }

    public static int m10844c(C1189b0 b0Var) {
        int i = 0;
        while (b0Var.m38142a() != 0) {
            int D = b0Var.m38156D();
            i += D;
            if (D != 255) {
                return i;
            }
        }
        return -1;
    }
}
