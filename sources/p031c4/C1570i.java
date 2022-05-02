package p031c4;

import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p199o3.C7576a;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;
import p270t3.C8957e;

public final class C1570i implements AbstractC1581m {
    public static final byte[] f5626v = {73, 68, 51};
    public final boolean f5627a;
    public final C1187a0 f5628b;
    public final C1189b0 f5629c;
    public final String f5630d;
    public String f5631e;
    public AbstractC8974t f5632f;
    public AbstractC8974t f5633g;
    public int f5634h;
    public int f5635i;
    public int f5636j;
    public boolean f5637k;
    public boolean f5638l;
    public int f5639m;
    public int f5640n;
    public int f5641o;
    public boolean f5642p;
    public long f5643q;
    public int f5644r;
    public long f5645s;
    public AbstractC8974t f5646t;
    public long f5647u;

    public C1570i(boolean z) {
        this(z, null);
    }

    public static boolean m36417m(int i) {
        return (i & 65526) == 65520;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    public final void m36424a() {
        C1186a.m38185e(this.f5632f);
        C1216l0.m37968j(this.f5646t);
        C1216l0.m37968j(this.f5633g);
    }

    @Override
    public void mo36333b(C1189b0 b0Var) {
        m36424a();
        while (b0Var.m38142a() > 0) {
            int i = this.f5634h;
            if (i == 0) {
                m36420j(b0Var);
            } else if (i == 1) {
                m36423g(b0Var);
            } else if (i != 2) {
                if (i == 3) {
                    if (m36421i(b0Var, this.f5628b.f4469a, this.f5637k ? 7 : 5)) {
                        m36416n();
                    }
                } else if (i == 4) {
                    m36414p(b0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (m36421i(b0Var, this.f5629c.m38139d(), 10)) {
                m36415o();
            }
        }
    }

    @Override
    public void mo36332c() {
        this.f5645s = -9223372036854775807L;
        m36413q();
    }

    @Override
    public void mo36331d() {
    }

    @Override
    public void mo36330e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36406a();
        this.f5631e = dVar.m36405b();
        AbstractC8974t r = hVar.mo6039r(dVar.m36404c(), 1);
        this.f5632f = r;
        this.f5646t = r;
        if (this.f5627a) {
            dVar.m36406a();
            AbstractC8974t r2 = hVar.mo6039r(dVar.m36404c(), 5);
            this.f5633g = r2;
            r2.mo10798a(new C6600g1.C6602b().m19875S(dVar.m36405b()).m19858e0("application/id3").m19889E());
            return;
        }
        this.f5633g = new C8957e();
    }

    @Override
    public void mo36329f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5645s = j;
        }
    }

    public final void m36423g(C1189b0 b0Var) {
        if (b0Var.m38142a() != 0) {
            this.f5628b.f4469a[0] = b0Var.m38139d()[b0Var.m38138e()];
            this.f5628b.m38165p(2);
            int h = this.f5628b.m38173h(4);
            int i = this.f5640n;
            if (i == -1 || h == i) {
                if (!this.f5638l) {
                    this.f5638l = true;
                    this.f5639m = this.f5641o;
                    this.f5640n = h;
                }
                m36410t();
                return;
            }
            m36413q();
        }
    }

    public final boolean m36422h(C1189b0 b0Var, int i) {
        b0Var.m38144P(i + 1);
        if (!m36407w(b0Var, this.f5628b.f4469a, 1)) {
            return false;
        }
        this.f5628b.m38165p(4);
        int h = this.f5628b.m38173h(1);
        int i2 = this.f5639m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.f5640n != -1) {
            if (!m36407w(b0Var, this.f5628b.f4469a, 1)) {
                return true;
            }
            this.f5628b.m38165p(2);
            if (this.f5628b.m38173h(4) != this.f5640n) {
                return false;
            }
            b0Var.m38144P(i + 2);
        }
        if (!m36407w(b0Var, this.f5628b.f4469a, 4)) {
            return true;
        }
        this.f5628b.m38165p(14);
        int h2 = this.f5628b.m38173h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] d = b0Var.m38139d();
        int f = b0Var.m38137f();
        int i3 = i + h2;
        if (i3 >= f) {
            return true;
        }
        if (d[i3] == -1) {
            int i4 = i3 + 1;
            if (i4 == f) {
                return true;
            }
            return m36418l((byte) -1, d[i4]) && ((d[i4] & 8) >> 3) == h;
        } else if (d[i3] != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == f) {
                return true;
            }
            if (d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            return i6 == f || d[i6] == 51;
        }
    }

    public final boolean m36421i(C1189b0 b0Var, byte[] bArr, int i) {
        int min = Math.min(b0Var.m38142a(), i - this.f5635i);
        b0Var.m38133j(bArr, this.f5635i, min);
        int i2 = this.f5635i + min;
        this.f5635i = i2;
        return i2 == i;
    }

    public final void m36420j(C1189b0 b0Var) {
        byte[] d = b0Var.m38139d();
        int e = b0Var.m38138e();
        int f = b0Var.m38137f();
        while (e < f) {
            int i = e + 1;
            int i2 = d[e] & 255;
            if (this.f5636j != 512 || !m36418l((byte) -1, (byte) i2) || (!this.f5638l && !m36422h(b0Var, i - 2))) {
                int i3 = this.f5636j;
                int i4 = i2 | i3;
                if (i4 == 329) {
                    this.f5636j = 768;
                } else if (i4 == 511) {
                    this.f5636j = Log.TAG_GIF_LOADER;
                } else if (i4 == 836) {
                    this.f5636j = Log.TAG_CAMERA;
                } else if (i4 == 1075) {
                    m36409u();
                    b0Var.m38144P(i);
                    return;
                } else if (i3 != 256) {
                    this.f5636j = Log.TAG_CRASH;
                    i--;
                }
                e = i;
            } else {
                this.f5641o = (i2 & 8) >> 3;
                boolean z = true;
                if ((i2 & 1) != 0) {
                    z = false;
                }
                this.f5637k = z;
                if (!this.f5638l) {
                    m36412r();
                } else {
                    m36410t();
                }
                b0Var.m38144P(i);
                return;
            }
        }
        b0Var.m38144P(e);
    }

    public long m36419k() {
        return this.f5643q;
    }

    public final boolean m36418l(byte b, byte b2) {
        return m36417m(((b & 255) << 8) | (b2 & 255));
    }

    @RequiresNonNull({"output"})
    public final void m36416n() {
        this.f5628b.m38165p(0);
        if (!this.f5642p) {
            int h = this.f5628b.m38173h(2) + 1;
            if (h != 2) {
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("Detected audio object type: ");
                sb2.append(h);
                sb2.append(", but assuming AAC LC.");
                C1230s.m37881i("AdtsReader", sb2.toString());
                h = 2;
            }
            this.f5628b.m38163r(5);
            byte[] a = C7576a.m15653a(h, this.f5640n, this.f5628b.m38173h(3));
            C7576a.C7578b e = C7576a.m15649e(a);
            C6600g1 E = new C6600g1.C6602b().m19875S(this.f5631e).m19858e0("audio/mp4a-latm").m19885I(e.f24200c).m19886H(e.f24199b).m19856f0(e.f24198a).m19874T(Collections.singletonList(a)).m19872V(this.f5630d).m19889E();
            this.f5643q = 1024000000 / E.f20592i0;
            this.f5632f.mo10798a(E);
            this.f5642p = true;
        } else {
            this.f5628b.m38163r(10);
        }
        this.f5628b.m38163r(4);
        int h2 = (this.f5628b.m38173h(13) - 2) - 5;
        if (this.f5637k) {
            h2 -= 2;
        }
        m36408v(this.f5632f, this.f5643q, 0, h2);
    }

    @RequiresNonNull({"id3Output"})
    public final void m36415o() {
        this.f5633g.mo10796c(this.f5629c, 10);
        this.f5629c.m38144P(6);
        m36408v(this.f5633g, 0L, 10, this.f5629c.m38157C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    public final void m36414p(C1189b0 b0Var) {
        int min = Math.min(b0Var.m38142a(), this.f5644r - this.f5635i);
        this.f5646t.mo10796c(b0Var, min);
        int i = this.f5635i + min;
        this.f5635i = i;
        int i2 = this.f5644r;
        if (i == i2) {
            long j = this.f5645s;
            if (j != -9223372036854775807L) {
                this.f5646t.mo10794e(j, 1, i2, 0, null);
                this.f5645s += this.f5647u;
            }
            m36411s();
        }
    }

    public final void m36413q() {
        this.f5638l = false;
        m36411s();
    }

    public final void m36412r() {
        this.f5634h = 1;
        this.f5635i = 0;
    }

    public final void m36411s() {
        this.f5634h = 0;
        this.f5635i = 0;
        this.f5636j = Log.TAG_CRASH;
    }

    public final void m36410t() {
        this.f5634h = 3;
        this.f5635i = 0;
    }

    public final void m36409u() {
        this.f5634h = 2;
        this.f5635i = f5626v.length;
        this.f5644r = 0;
        this.f5629c.m38144P(0);
    }

    public final void m36408v(AbstractC8974t tVar, long j, int i, int i2) {
        this.f5634h = 4;
        this.f5635i = i;
        this.f5646t = tVar;
        this.f5647u = j;
        this.f5644r = i2;
    }

    public final boolean m36407w(C1189b0 b0Var, byte[] bArr, int i) {
        if (b0Var.m38142a() < i) {
            return false;
        }
        b0Var.m38133j(bArr, 0, i);
        return true;
    }

    public C1570i(boolean z, String str) {
        this.f5628b = new C1187a0(new byte[7]);
        this.f5629c = new C1189b0(Arrays.copyOf(f5626v, 10));
        m36411s();
        this.f5639m = -1;
        this.f5640n = -1;
        this.f5643q = -9223372036854775807L;
        this.f5645s = -9223372036854775807L;
        this.f5627a = z;
        this.f5630d = str;
    }
}
