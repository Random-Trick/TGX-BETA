package p031c4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import com.google.android.exoplayer2.extractor.C3465c;
import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6556a2;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C1566h implements AbstractC8958f {
    public static final AbstractC8965l f5586m = C1564g.f5584b;
    public final int f5587a;
    public final C1570i f5588b;
    public final C1189b0 f5589c;
    public final C1189b0 f5590d;
    public final C1187a0 f5591e;
    public AbstractC8960h f5592f;
    public long f5593g;
    public long f5594h;
    public int f5595i;
    public boolean f5596j;
    public boolean f5597k;
    public boolean f5598l;

    public C1566h() {
        this(0);
    }

    public static int m36452g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    public static AbstractC8958f[] m36450i() {
        return new AbstractC8958f[]{new C1566h()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f5597k = false;
        this.f5588b.mo36332c();
        this.f5593g = j2;
    }

    public final void m36453d(AbstractC8959g gVar) {
        int h;
        if (!this.f5596j) {
            this.f5595i = -1;
            gVar.mo10809m();
            long j = 0;
            if (gVar.mo6043r() == 0) {
                m36448l(gVar);
            }
            int i = 0;
            int i2 = 0;
            do {
                try {
                    if (!gVar.mo10813e(this.f5590d.m38139d(), 0, 2, true)) {
                        break;
                    }
                    this.f5590d.m38144P(0);
                    if (!C1570i.m36417m(this.f5590d.m38150J())) {
                        break;
                    } else if (!gVar.mo10813e(this.f5590d.m38139d(), 0, 4, true)) {
                        break;
                    } else {
                        this.f5591e.m38165p(14);
                        h = this.f5591e.m38173h(13);
                        if (h > 6) {
                            j += h;
                            i2++;
                            if (i2 == 1000) {
                                break;
                            }
                        } else {
                            this.f5596j = true;
                            throw C6556a2.m20112a("Malformed ADTS stream", null);
                        }
                    }
                } catch (EOFException unused) {
                }
            } while (gVar.mo10807o(h - 6, true));
            i = i2;
            gVar.mo10809m();
            if (i > 0) {
                this.f5595i = (int) (j / i);
            } else {
                this.f5595i = -1;
            }
            this.f5596j = true;
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        C1186a.m38182h(this.f5592f);
        long a = gVar.mo6046a();
        int i = this.f5587a;
        if (((i & 2) == 0 && ((i & 1) == 0 || a == -1)) ? false : true) {
            m36453d(gVar);
        }
        int b = gVar.mo4414b(this.f5589c.m38139d(), 0, Log.TAG_VOICE);
        boolean z = b == -1;
        m36449k(a, z);
        if (z) {
            return -1;
        }
        this.f5589c.m38144P(0);
        this.f5589c.m38145O(b);
        if (!this.f5597k) {
            this.f5588b.mo36329f(this.f5593g, 4);
            this.f5597k = true;
        }
        this.f5588b.mo36333b(this.f5589c);
        return 0;
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f5592f = hVar;
        this.f5588b.mo36330e(hVar, new AbstractC1571i0.C1575d(0, 1));
        hVar.mo6040m();
    }

    public final AbstractC3470g m36451h(long j, boolean z) {
        return new C3465c(j, this.f5594h, m36452g(this.f5595i, this.f5588b.m36419k()), this.f5595i, z);
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        int l = m36448l(gVar);
        int i = l;
        int i2 = 0;
        int i3 = 0;
        do {
            gVar.mo10806q(this.f5590d.m38139d(), 0, 2);
            this.f5590d.m38144P(0);
            if (!C1570i.m36417m(this.f5590d.m38150J())) {
                i++;
                gVar.mo10809m();
                gVar.mo10812h(i);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                gVar.mo10806q(this.f5590d.m38139d(), 0, 4);
                this.f5591e.m38165p(14);
                int h = this.f5591e.m38173h(13);
                if (h <= 6) {
                    i++;
                    gVar.mo10809m();
                    gVar.mo10812h(i);
                } else {
                    gVar.mo10812h(h - 6);
                    i3 += h;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i - l < 8192);
        return false;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void m36449k(long j, boolean z) {
        if (!this.f5598l) {
            boolean z2 = false;
            boolean z3 = (this.f5587a & 1) != 0 && this.f5595i > 0;
            if (!z3 || this.f5588b.m36419k() != -9223372036854775807L || z) {
                if (!z3 || this.f5588b.m36419k() == -9223372036854775807L) {
                    this.f5592f.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
                } else {
                    AbstractC8960h hVar = this.f5592f;
                    if ((this.f5587a & 2) != 0) {
                        z2 = true;
                    }
                    hVar.mo6042a(m36451h(j, z2));
                }
                this.f5598l = true;
            }
        }
    }

    public final int m36448l(AbstractC8959g gVar) {
        int i = 0;
        while (true) {
            gVar.mo10806q(this.f5590d.m38139d(), 0, 10);
            this.f5590d.m38144P(0);
            if (this.f5590d.m38153G() != 4801587) {
                break;
            }
            this.f5590d.m38143Q(3);
            int C = this.f5590d.m38157C();
            i += C + 10;
            gVar.mo10812h(C);
        }
        gVar.mo10809m();
        gVar.mo10812h(i);
        if (this.f5594h == -1) {
            this.f5594h = i;
        }
        return i;
    }

    public C1566h(int i) {
        this.f5587a = (i & 2) != 0 ? i | 1 : i;
        this.f5588b = new C1570i(true);
        this.f5589c = new C1189b0((int) Log.TAG_VOICE);
        this.f5595i = -1;
        this.f5594h = -1L;
        C1189b0 b0Var = new C1189b0(10);
        this.f5590d = b0Var;
        this.f5591e = new C1187a0(b0Var.m38139d());
    }
}
