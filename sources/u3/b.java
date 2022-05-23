package u3;

import c5.a;
import c5.l0;
import com.google.android.exoplayer2.extractor.c;
import com.google.android.exoplayer2.extractor.g;
import java.io.EOFException;
import java.util.Arrays;
import m3.k2;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.f;
import t3.h;
import t3.l;
import t3.q;
import t3.t;

public final class b implements f {
    public static final int[] f23548r;
    public static final int f23551u;
    public final byte[] f23552a;
    public final int f23553b;
    public boolean f23554c;
    public long f23555d;
    public int f23556e;
    public int f23557f;
    public boolean f23558g;
    public long f23559h;
    public int f23560i;
    public int f23561j;
    public long f23562k;
    public h f23563l;
    public t f23564m;
    public g f23565n;
    public boolean f23566o;
    public static final l f23546p = a.f23545b;
    public static final int[] f23547q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] f23549s = l0.f0("#!AMR\n");
    public static final byte[] f23550t = l0.f0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f23548r = iArr;
        f23551u = iArr[8];
    }

    public b() {
        this(0);
    }

    public static int g(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    public static f[] n() {
        return new f[]{new b()};
    }

    public static boolean q(t3.g gVar, byte[] bArr) {
        gVar.m();
        byte[] bArr2 = new byte[bArr.length];
        gVar.q(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f23555d = 0L;
        this.f23556e = 0;
        this.f23557f = 0;
        if (j10 != 0) {
            g gVar = this.f23565n;
            if (gVar instanceof c) {
                this.f23562k = ((c) gVar).b(j10);
                return;
            }
        }
        this.f23562k = 0L;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void d() {
        a.h(this.f23564m);
        l0.j(this.f23563l);
    }

    @Override
    public int e(t3.g gVar, q qVar) {
        d();
        if (gVar.r() != 0 || s(gVar)) {
            o();
            int t10 = t(gVar);
            p(gVar.a(), t10);
            return t10;
        }
        throw k2.a("Could not find AMR header.", null);
    }

    @Override
    public void f(h hVar) {
        this.f23563l = hVar;
        this.f23564m = hVar.q(0, 1);
        hVar.k();
    }

    public final g h(long j10, boolean z10) {
        return new c(j10, this.f23559h, g(this.f23560i, 20000L), this.f23560i, z10);
    }

    public final int i(int i10) {
        if (l(i10)) {
            return this.f23554c ? f23548r[i10] : f23547q[i10];
        }
        String str = this.f23554c ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i10);
        throw k2.a(sb2.toString(), null);
    }

    @Override
    public boolean j(t3.g gVar) {
        return s(gVar);
    }

    public final boolean k(int i10) {
        return !this.f23554c && (i10 < 12 || i10 > 14);
    }

    public final boolean l(int i10) {
        return i10 >= 0 && i10 <= 15 && (m(i10) || k(i10));
    }

    public final boolean m(int i10) {
        return this.f23554c && (i10 < 10 || i10 > 13);
    }

    @RequiresNonNull({"trackOutput"})
    public final void o() {
        if (!this.f23566o) {
            this.f23566o = true;
            boolean z10 = this.f23554c;
            this.f23564m.a(new q1.b().e0(z10 ? "audio/amr-wb" : "audio/3gpp").W(f23551u).H(1).f0(z10 ? 16000 : 8000).E());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    public final void p(long j10, int i10) {
        int i11;
        if (!this.f23558g) {
            int i12 = this.f23553b;
            if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f23560i) == -1 || i11 == this.f23556e)) {
                g.b bVar = new g.b(-9223372036854775807L);
                this.f23565n = bVar;
                this.f23563l.a(bVar);
                this.f23558g = true;
            } else if (this.f23561j >= 20 || i10 == -1) {
                g h10 = h(j10, (i12 & 2) != 0);
                this.f23565n = h10;
                this.f23563l.a(h10);
                this.f23558g = true;
            }
        }
    }

    public final int r(t3.g gVar) {
        gVar.m();
        gVar.q(this.f23552a, 0, 1);
        byte b10 = this.f23552a[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append((int) b10);
        throw k2.a(sb2.toString(), null);
    }

    public final boolean s(t3.g gVar) {
        byte[] bArr = f23549s;
        if (q(gVar, bArr)) {
            this.f23554c = false;
            gVar.n(bArr.length);
            return true;
        }
        byte[] bArr2 = f23550t;
        if (!q(gVar, bArr2)) {
            return false;
        }
        this.f23554c = true;
        gVar.n(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    public final int t(t3.g gVar) {
        if (this.f23557f == 0) {
            try {
                int r10 = r(gVar);
                this.f23556e = r10;
                this.f23557f = r10;
                if (this.f23560i == -1) {
                    this.f23559h = gVar.r();
                    this.f23560i = this.f23556e;
                }
                if (this.f23560i == this.f23556e) {
                    this.f23561j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int b10 = this.f23564m.b(gVar, this.f23557f, true);
        if (b10 == -1) {
            return -1;
        }
        int i10 = this.f23557f - b10;
        this.f23557f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f23564m.f(this.f23562k + this.f23555d, 1, this.f23556e, 0, null);
        this.f23555d += 20000;
        return 0;
    }

    public b(int i10) {
        this.f23553b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f23552a = new byte[1];
        this.f23560i = -1;
    }
}
