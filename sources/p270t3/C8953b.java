package p270t3;

import p020b5.C1189b0;
import p020b5.C1230s;

public final class C8953b {
    public static void m10845a(long j, C1189b0 b0Var, AbstractC8974t[] tVarArr) {
        while (true) {
            boolean z = true;
            if (b0Var.m38145a() > 1) {
                int c = m10843c(b0Var);
                int c2 = m10843c(b0Var);
                int e = b0Var.m38141e() + c2;
                if (c2 == -1 || c2 > b0Var.m38145a()) {
                    C1230s.m37884i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e = b0Var.m38140f();
                } else if (c == 4 && c2 >= 8) {
                    int D = b0Var.m38159D();
                    int J = b0Var.m38153J();
                    int n = J == 49 ? b0Var.m38132n() : 0;
                    int D2 = b0Var.m38159D();
                    if (J == 47) {
                        b0Var.m38146Q(1);
                    }
                    boolean z2 = D == 181 && (J == 49 || J == 47) && D2 == 3;
                    if (J == 49) {
                        if (n != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m10844b(j, b0Var, tVarArr);
                    }
                }
                b0Var.m38147P(e);
            } else {
                return;
            }
        }
    }

    public static void m10844b(long j, C1189b0 b0Var, AbstractC8974t[] tVarArr) {
        int D = b0Var.m38159D();
        if ((D & 64) != 0) {
            b0Var.m38146Q(1);
            int i = (D & 31) * 3;
            int e = b0Var.m38141e();
            for (AbstractC8974t tVar : tVarArr) {
                b0Var.m38147P(e);
                tVar.mo10795c(b0Var, i);
                if (j != -9223372036854775807L) {
                    tVar.mo10793e(j, 1, i, 0, null);
                }
            }
        }
    }

    public static int m10843c(C1189b0 b0Var) {
        int i = 0;
        while (b0Var.m38145a() != 0) {
            int D = b0Var.m38159D();
            i += D;
            if (D != 255) {
                return i;
            }
        }
        return -1;
    }
}
