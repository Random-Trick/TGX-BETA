package p044d4;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p039d.C3563j;
import p174m3.C6556a2;
import p174m3.C6600g1;
import p199o3.C7629n0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8971q;

public final class C3593b implements AbstractC8958f {
    public static final AbstractC8965l f12234h = C3592a.f12233b;
    public AbstractC8960h f12235a;
    public AbstractC8974t f12236b;
    public AbstractC3595b f12239e;
    public int f12237c = 0;
    public long f12238d = -1;
    public int f12240f = -1;
    public long f12241g = -1;

    public static final class C3594a implements AbstractC3595b {
        public static final int[] f12242m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] f12243n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, C3563j.f11947J0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final AbstractC8960h f12244a;
        public final AbstractC8974t f12245b;
        public final C3597c f12246c;
        public final int f12247d;
        public final byte[] f12248e;
        public final C1189b0 f12249f;
        public final int f12250g;
        public final C6600g1 f12251h;
        public int f12252i;
        public long f12253j;
        public int f12254k;
        public long f12255l;

        public C3594a(AbstractC8960h hVar, AbstractC8974t tVar, C3597c cVar) {
            this.f12244a = hVar;
            this.f12245b = tVar;
            this.f12246c = cVar;
            int max = Math.max(1, cVar.f12266c / 10);
            this.f12250g = max;
            C1189b0 b0Var = new C1189b0(cVar.f12270g);
            b0Var.m38121v();
            int v = b0Var.m38121v();
            this.f12247d = v;
            int i = cVar.f12265b;
            int i2 = (((cVar.f12268e - (i * 4)) * 8) / (cVar.f12269f * i)) + 1;
            if (v == i2) {
                int l = C1216l0.m37964l(max, v);
                this.f12248e = new byte[cVar.f12268e * l];
                this.f12249f = new C1189b0(l * m29902h(v, i));
                int i3 = ((cVar.f12266c * cVar.f12268e) * 8) / v;
                this.f12251h = new C6600g1.C6602b().m19858e0("audio/raw").m19887G(i3).m19868Z(i3).m19871W(m29902h(max, i)).m19886H(cVar.f12265b).m19856f0(cVar.f12266c).m19869Y(2).m19889E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i2);
            sb2.append("; got: ");
            sb2.append(v);
            throw C6556a2.m20112a(sb2.toString(), null);
        }

        public static int m29902h(int i, int i2) {
            return i * 2 * i2;
        }

        @Override
        public void mo29900a(long j) {
            this.f12252i = 0;
            this.f12253j = j;
            this.f12254k = 0;
            this.f12255l = 0L;
        }

        @Override
        public boolean mo29899b(p270t3.AbstractC8959g r7, long r8) {
            throw new UnsupportedOperationException("Method not decompiled: p044d4.C3593b.C3594a.mo29899b(t3.g, long):boolean");
        }

        @Override
        public void mo29898c(int i, long j) {
            this.f12244a.mo6042a(new C3600e(this.f12246c, this.f12247d, i, j));
            this.f12245b.mo10798a(this.f12251h);
        }

        public final void m29906d(byte[] bArr, int i, C1189b0 b0Var) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f12246c.f12265b; i3++) {
                    m29905e(bArr, i2, i3, b0Var.m38139d());
                }
            }
            int g = m29903g(this.f12247d * i);
            b0Var.m38144P(0);
            b0Var.m38145O(g);
        }

        public final void m29905e(byte[] bArr, int i, int i2, byte[] bArr2) {
            C3597c cVar = this.f12246c;
            int i3 = cVar.f12268e;
            int i4 = cVar.f12265b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = f12243n[min];
            int i10 = ((i * this.f12247d * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                int i12 = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)] & 255;
                int i13 = i11 % 2 == 0 ? i12 & 15 : i12 >> 4;
                int i14 = ((((i13 & 7) * 2) + 1) * i9) >> 3;
                if ((i13 & 8) != 0) {
                    i14 = -i14;
                }
                i8 = C1216l0.m37956p(i8 + i14, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i15 = min + f12242m[i13];
                int[] iArr = f12243n;
                min = C1216l0.m37956p(i15, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        public final int m29904f(int i) {
            return i / (this.f12246c.f12265b * 2);
        }

        public final int m29903g(int i) {
            return m29902h(i, this.f12246c.f12265b);
        }

        public final void m29901i(int i) {
            long y0 = this.f12253j + C1216l0.m37937y0(this.f12255l, 1000000L, this.f12246c.f12266c);
            int g = m29903g(i);
            this.f12245b.mo10794e(y0, 1, g, this.f12254k - g, null);
            this.f12255l += i;
            this.f12254k -= g;
        }
    }

    public interface AbstractC3595b {
        void mo29900a(long j);

        boolean mo29899b(AbstractC8959g gVar, long j);

        void mo29898c(int i, long j);
    }

    public static final class C3596c implements AbstractC3595b {
        public final AbstractC8960h f12256a;
        public final AbstractC8974t f12257b;
        public final C3597c f12258c;
        public final C6600g1 f12259d;
        public final int f12260e;
        public long f12261f;
        public int f12262g;
        public long f12263h;

        public C3596c(AbstractC8960h hVar, AbstractC8974t tVar, C3597c cVar, String str, int i) {
            this.f12256a = hVar;
            this.f12257b = tVar;
            this.f12258c = cVar;
            int i2 = (cVar.f12265b * cVar.f12269f) / 8;
            int i3 = cVar.f12268e;
            if (i3 == i2) {
                int i4 = cVar.f12266c;
                int i5 = i4 * i2 * 8;
                int max = Math.max(i2, (i4 * i2) / 10);
                this.f12260e = max;
                this.f12259d = new C6600g1.C6602b().m19858e0(str).m19887G(i5).m19868Z(i5).m19871W(max).m19886H(cVar.f12265b).m19856f0(cVar.f12266c).m19869Y(i).m19889E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i2);
            sb2.append("; got: ");
            sb2.append(i3);
            throw C6556a2.m20112a(sb2.toString(), null);
        }

        @Override
        public void mo29900a(long j) {
            this.f12261f = j;
            this.f12262g = 0;
            this.f12263h = 0L;
        }

        @Override
        public boolean mo29899b(AbstractC8959g gVar, long j) {
            int i;
            C3597c cVar;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i <= 0 || (i2 = this.f12262g) >= (i3 = this.f12260e)) {
                    break;
                }
                int d = this.f12257b.mo10795d(gVar, (int) Math.min(i3 - i2, j2), true);
                if (d == -1) {
                    j2 = 0;
                } else {
                    this.f12262g += d;
                    j2 -= d;
                }
            }
            int i4 = this.f12258c.f12268e;
            int i5 = this.f12262g / i4;
            if (i5 > 0) {
                int i6 = i5 * i4;
                int i7 = this.f12262g - i6;
                this.f12257b.mo10794e(this.f12261f + C1216l0.m37937y0(this.f12263h, 1000000L, cVar.f12266c), 1, i6, i7, null);
                this.f12263h += i5;
                this.f12262g = i7;
            }
            return i <= 0;
        }

        @Override
        public void mo29898c(int i, long j) {
            this.f12256a.mo6042a(new C3600e(this.f12258c, 1, i, j));
            this.f12257b.mo10798a(this.f12259d);
        }
    }

    public static AbstractC8958f[] m29912g() {
        return new AbstractC8958f[]{new C3593b()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f12237c = j == 0 ? 0 : 4;
        AbstractC3595b bVar = this.f12239e;
        if (bVar != null) {
            bVar.mo29900a(j2);
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void m29913d() {
        C1186a.m38182h(this.f12236b);
        C1216l0.m37968j(this.f12235a);
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        m29913d();
        int i = this.f12237c;
        if (i == 0) {
            m29911h(gVar);
            return 0;
        } else if (i == 1) {
            m29909k(gVar);
            return 0;
        } else if (i == 2) {
            m29910i(gVar);
            return 0;
        } else if (i == 3) {
            m29907m(gVar);
            return 0;
        } else if (i == 4) {
            return m29908l(gVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f12235a = hVar;
        this.f12236b = hVar.mo6039r(0, 1);
        hVar.mo6040m();
    }

    public final void m29911h(AbstractC8959g gVar) {
        C1186a.m38184f(gVar.mo6043r() == 0);
        int i = this.f12240f;
        if (i != -1) {
            gVar.mo10808n(i);
            this.f12237c = 4;
        } else if (C3598d.m29897a(gVar)) {
            gVar.mo10808n((int) (gVar.mo6045f() - gVar.mo6043r()));
            this.f12237c = 1;
        } else {
            throw C6556a2.m20112a("Unsupported or unrecognized wav file type.", null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    public final void m29910i(AbstractC8959g gVar) {
        C3597c b = C3598d.m29896b(gVar);
        int i = b.f12264a;
        if (i == 17) {
            this.f12239e = new C3594a(this.f12235a, this.f12236b, b);
        } else if (i == 6) {
            this.f12239e = new C3596c(this.f12235a, this.f12236b, b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f12239e = new C3596c(this.f12235a, this.f12236b, b, "audio/g711-mlaw", -1);
        } else {
            int a = C7629n0.m15426a(i, b.f12269f);
            if (a != 0) {
                this.f12239e = new C3596c(this.f12235a, this.f12236b, b, "audio/raw", a);
            } else {
                int i2 = b.f12264a;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Unsupported WAV format type: ");
                sb2.append(i2);
                throw C6556a2.m20110c(sb2.toString());
            }
        }
        this.f12237c = 3;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        return C3598d.m29897a(gVar);
    }

    public final void m29909k(AbstractC8959g gVar) {
        this.f12238d = C3598d.m29895c(gVar);
        this.f12237c = 2;
    }

    public final int m29908l(AbstractC8959g gVar) {
        C1186a.m38184f(this.f12241g != -1);
        return ((AbstractC3595b) C1186a.m38185e(this.f12239e)).mo29899b(gVar, this.f12241g - gVar.mo6043r()) ? -1 : 0;
    }

    public final void m29907m(AbstractC8959g gVar) {
        Pair<Long, Long> e = C3598d.m29893e(gVar);
        this.f12240f = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.f12238d;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.f12241g = this.f12240f + longValue;
        long a = gVar.mo6046a();
        if (a != -1) {
            long j2 = this.f12241g;
            if (j2 > a) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("Data exceeds input length: ");
                sb2.append(j2);
                sb2.append(", ");
                sb2.append(a);
                C1230s.m37881i("WavExtractor", sb2.toString());
                this.f12241g = a;
            }
        }
        ((AbstractC3595b) C1186a.m38185e(this.f12239e)).mo29898c(this.f12240f, this.f12241g);
        this.f12237c = 4;
    }
}
