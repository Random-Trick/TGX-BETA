package p283u3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import com.google.android.exoplayer2.extractor.C3465c;
import java.io.EOFException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6556a2;
import p174m3.C6600g1;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8971q;

public final class C9438b implements AbstractC8958f {
    public static final int[] f30574r;
    public static final int f30577u;
    public final byte[] f30578a;
    public final int f30579b;
    public boolean f30580c;
    public long f30581d;
    public int f30582e;
    public int f30583f;
    public boolean f30584g;
    public long f30585h;
    public int f30586i;
    public int f30587j;
    public long f30588k;
    public AbstractC8960h f30589l;
    public AbstractC8974t f30590m;
    public AbstractC3470g f30591n;
    public boolean f30592o;
    public static final AbstractC8965l f30572p = C9437a.f30571b;
    public static final int[] f30573q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] f30575s = C1216l0.m37980e0("#!AMR\n");
    public static final byte[] f30576t = C1216l0.m37980e0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f30574r = iArr;
        f30577u = iArr[8];
    }

    public C9438b() {
        this(0);
    }

    public static int m8666g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    public static AbstractC8958f[] m8660n() {
        return new AbstractC8958f[]{new C9438b()};
    }

    public static boolean m8657q(AbstractC8959g gVar, byte[] bArr) {
        gVar.mo10808m();
        byte[] bArr2 = new byte[bArr.length];
        gVar.mo10805q(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f30581d = 0L;
        this.f30582e = 0;
        this.f30583f = 0;
        if (j != 0) {
            AbstractC3470g gVar = this.f30591n;
            if (gVar instanceof C3465c) {
                this.f30588k = ((C3465c) gVar).m30465b(j);
                return;
            }
        }
        this.f30588k = 0L;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void m8667d() {
        C1186a.m38185h(this.f30590m);
        C1216l0.m37971j(this.f30589l);
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        m8667d();
        if (gVar.mo6043r() != 0 || m8655s(gVar)) {
            m8659o();
            int t = m8654t(gVar);
            m8658p(gVar.mo6046a(), t);
            return t;
        }
        throw C6556a2.m20113a("Could not find AMR header.", null);
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f30589l = hVar;
        this.f30590m = hVar.mo6039r(0, 1);
        hVar.mo6040m();
    }

    public final AbstractC3470g m8665h(long j, boolean z) {
        return new C3465c(j, this.f30585h, m8666g(this.f30586i, 20000L), this.f30586i, z);
    }

    public final int m8664i(int i) {
        if (m8662l(i)) {
            return this.f30580c ? f30574r[i] : f30573q[i];
        }
        String str = this.f30580c ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i);
        throw C6556a2.m20113a(sb2.toString(), null);
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        return m8655s(gVar);
    }

    public final boolean m8663k(int i) {
        return !this.f30580c && (i < 12 || i > 14);
    }

    public final boolean m8662l(int i) {
        return i >= 0 && i <= 15 && (m8661m(i) || m8663k(i));
    }

    public final boolean m8661m(int i) {
        return this.f30580c && (i < 10 || i > 13);
    }

    @RequiresNonNull({"trackOutput"})
    public final void m8659o() {
        if (!this.f30592o) {
            this.f30592o = true;
            boolean z = this.f30580c;
            this.f30590m.mo10797a(new C6600g1.C6602b().m19859e0(z ? "audio/amr-wb" : "audio/3gpp").m19872W(f30577u).m19887H(1).m19857f0(z ? 16000 : 8000).m19890E());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    public final void m8658p(long j, int i) {
        int i2;
        if (!this.f30584g) {
            int i3 = this.f30579b;
            if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f30586i) == -1 || i2 == this.f30582e)) {
                AbstractC3470g.C3472b bVar = new AbstractC3470g.C3472b(-9223372036854775807L);
                this.f30591n = bVar;
                this.f30589l.mo6042a(bVar);
                this.f30584g = true;
            } else if (this.f30587j >= 20 || i == -1) {
                AbstractC3470g h = m8665h(j, (i3 & 2) != 0);
                this.f30591n = h;
                this.f30589l.mo6042a(h);
                this.f30584g = true;
            }
        }
    }

    public final int m8656r(AbstractC8959g gVar) {
        gVar.mo10808m();
        gVar.mo10805q(this.f30578a, 0, 1);
        byte b = this.f30578a[0];
        if ((b & 131) <= 0) {
            return m8664i((b >> 3) & 15);
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append((int) b);
        throw C6556a2.m20113a(sb2.toString(), null);
    }

    public final boolean m8655s(AbstractC8959g gVar) {
        byte[] bArr = f30575s;
        if (m8657q(gVar, bArr)) {
            this.f30580c = false;
            gVar.mo10807n(bArr.length);
            return true;
        }
        byte[] bArr2 = f30576t;
        if (!m8657q(gVar, bArr2)) {
            return false;
        }
        this.f30580c = true;
        gVar.mo10807n(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    public final int m8654t(AbstractC8959g gVar) {
        if (this.f30583f == 0) {
            try {
                int r = m8656r(gVar);
                this.f30582e = r;
                this.f30583f = r;
                if (this.f30586i == -1) {
                    this.f30585h = gVar.mo6043r();
                    this.f30586i = this.f30582e;
                }
                if (this.f30586i == this.f30582e) {
                    this.f30587j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int d = this.f30590m.mo10794d(gVar, this.f30583f, true);
        if (d == -1) {
            return -1;
        }
        int i = this.f30583f - d;
        this.f30583f = i;
        if (i > 0) {
            return 0;
        }
        this.f30590m.mo10793e(this.f30588k + this.f30581d, 1, this.f30582e, 0, null);
        this.f30581d += 20000;
        return 0;
    }

    public C9438b(int i) {
        this.f30579b = (i & 2) != 0 ? i | 1 : i;
        this.f30578a = new byte[1];
        this.f30586i = -1;
    }
}
