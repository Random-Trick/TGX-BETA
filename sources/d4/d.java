package d4;

import android.util.Pair;
import c5.b0;
import c5.l0;
import c5.s;
import m3.k2;
import t3.g;

public final class d {

    public static final class a {
        public final int f6192a;
        public final long f6193b;

        public a(int i10, long j10) {
            this.f6192a = i10;
            this.f6193b = j10;
        }

        public static a a(g gVar, b0 b0Var) {
            gVar.q(b0Var.d(), 0, 8);
            b0Var.P(0);
            return new a(b0Var.n(), b0Var.t());
        }
    }

    public static boolean a(g gVar) {
        b0 b0Var = new b0(8);
        int i10 = a.a(gVar, b0Var).f6192a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        gVar.q(b0Var.d(), 0, 4);
        b0Var.P(0);
        int n10 = b0Var.n();
        if (n10 == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Unsupported form type: ");
        sb2.append(n10);
        s.c("WavHeaderReader", sb2.toString());
        return false;
    }

    public static c b(g gVar) {
        byte[] bArr;
        b0 b0Var = new b0(16);
        a d10 = d(1718449184, gVar, b0Var);
        c5.a.f(d10.f6193b >= 16);
        gVar.q(b0Var.d(), 0, 16);
        b0Var.P(0);
        int v10 = b0Var.v();
        int v11 = b0Var.v();
        int u10 = b0Var.u();
        int u11 = b0Var.u();
        int v12 = b0Var.v();
        int v13 = b0Var.v();
        int i10 = ((int) d10.f6193b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            gVar.q(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = l0.f4846f;
        }
        gVar.n((int) (gVar.f() - gVar.r()));
        return new c(v10, v11, u10, u11, v12, v13, bArr);
    }

    public static long c(g gVar) {
        b0 b0Var = new b0(8);
        a a10 = a.a(gVar, b0Var);
        if (a10.f6192a != 1685272116) {
            gVar.m();
            return -1L;
        }
        gVar.g(8);
        b0Var.P(0);
        gVar.q(b0Var.d(), 0, 8);
        long r10 = b0Var.r();
        gVar.n(((int) a10.f6193b) + 8);
        return r10;
    }

    public static a d(int i10, g gVar, b0 b0Var) {
        a a10 = a.a(gVar, b0Var);
        while (true) {
            int i11 = a10.f6192a;
            if (i11 == i10) {
                return a10;
            }
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Ignoring unknown WAV chunk: ");
            sb2.append(i11);
            s.i("WavHeaderReader", sb2.toString());
            long j10 = a10.f6193b + 8;
            if (j10 <= 2147483647L) {
                gVar.n((int) j10);
                a10 = a.a(gVar, b0Var);
            } else {
                int i12 = a10.f6192a;
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i12);
                throw k2.c(sb3.toString());
            }
        }
    }

    public static Pair<Long, Long> e(g gVar) {
        gVar.m();
        a d10 = d(1684108385, gVar, new b0(8));
        gVar.n(8);
        return Pair.create(Long.valueOf(gVar.r()), Long.valueOf(d10.f6193b));
    }
}
