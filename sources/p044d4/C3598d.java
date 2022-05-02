package p044d4;

import android.util.Pair;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p174m3.C6556a2;
import p270t3.AbstractC8959g;

public final class C3598d {

    public static final class C3599a {
        public final int f12271a;
        public final long f12272b;

        public C3599a(int i, long j) {
            this.f12271a = i;
            this.f12272b = j;
        }

        public static C3599a m29894a(AbstractC8959g gVar, C1189b0 b0Var) {
            gVar.mo10805q(b0Var.m38142d(), 0, 8);
            b0Var.m38147P(0);
            return new C3599a(b0Var.m38132n(), b0Var.m38126t());
        }
    }

    public static boolean m29899a(AbstractC8959g gVar) {
        C1189b0 b0Var = new C1189b0(8);
        int i = C3599a.m29894a(gVar, b0Var).f12271a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        gVar.mo10805q(b0Var.m38142d(), 0, 4);
        b0Var.m38147P(0);
        int n = b0Var.m38132n();
        if (n == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Unsupported form type: ");
        sb2.append(n);
        C1230s.m37890c("WavHeaderReader", sb2.toString());
        return false;
    }

    public static C3597c m29898b(AbstractC8959g gVar) {
        byte[] bArr;
        C1189b0 b0Var = new C1189b0(16);
        C3599a d = m29896d(1718449184, gVar, b0Var);
        C1186a.m38187f(d.f12272b >= 16);
        gVar.mo10805q(b0Var.m38142d(), 0, 16);
        b0Var.m38147P(0);
        int v = b0Var.m38124v();
        int v2 = b0Var.m38124v();
        int u = b0Var.m38125u();
        int u2 = b0Var.m38125u();
        int v3 = b0Var.m38124v();
        int v4 = b0Var.m38124v();
        int i = ((int) d.f12272b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            gVar.mo10805q(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = C1216l0.f4531f;
        }
        gVar.mo10807n((int) (gVar.mo6045f() - gVar.mo6043r()));
        return new C3597c(v, v2, u, u2, v3, v4, bArr);
    }

    public static long m29897c(AbstractC8959g gVar) {
        C1189b0 b0Var = new C1189b0(8);
        C3599a a = C3599a.m29894a(gVar, b0Var);
        if (a.f12271a != 1685272116) {
            gVar.mo10808m();
            return -1L;
        }
        gVar.mo10811h(8);
        b0Var.m38147P(0);
        gVar.mo10805q(b0Var.m38142d(), 0, 8);
        long r = b0Var.m38128r();
        gVar.mo10807n(((int) a.f12272b) + 8);
        return r;
    }

    public static C3599a m29896d(int i, AbstractC8959g gVar, C1189b0 b0Var) {
        C3599a a = C3599a.m29894a(gVar, b0Var);
        while (true) {
            int i2 = a.f12271a;
            if (i2 == i) {
                return a;
            }
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Ignoring unknown WAV chunk: ");
            sb2.append(i2);
            C1230s.m37884i("WavHeaderReader", sb2.toString());
            long j = a.f12272b + 8;
            if (j <= 2147483647L) {
                gVar.mo10807n((int) j);
                a = C3599a.m29894a(gVar, b0Var);
            } else {
                int i3 = a.f12271a;
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i3);
                throw C6556a2.m20111c(sb3.toString());
            }
        }
    }

    public static Pair<Long, Long> m29895e(AbstractC8959g gVar) {
        gVar.mo10808m();
        C3599a d = m29896d(1684108385, gVar, new C1189b0(8));
        gVar.mo10807n(8);
        return Pair.create(Long.valueOf(gVar.mo6043r()), Long.valueOf(d.f12272b));
    }
}
