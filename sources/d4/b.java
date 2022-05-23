package d4;

import android.util.Pair;
import c5.b0;
import c5.l0;
import c5.s;
import d.j;
import m3.k2;
import m3.q1;
import o3.o0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.q;
import t3.t;

public final class b implements f {
    public static final l f6155h = d4.a.f6154b;
    public h f6156a;
    public t f6157b;
    public AbstractC0080b f6160e;
    public int f6158c = 0;
    public long f6159d = -1;
    public int f6161f = -1;
    public long f6162g = -1;

    public static final class a implements AbstractC0080b {
        public static final int[] f6163m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] f6164n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, j.J0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final h f6165a;
        public final t f6166b;
        public final d4.c f6167c;
        public final int f6168d;
        public final byte[] f6169e;
        public final b0 f6170f;
        public final int f6171g;
        public final q1 f6172h;
        public int f6173i;
        public long f6174j;
        public int f6175k;
        public long f6176l;

        public a(h hVar, t tVar, d4.c cVar) {
            this.f6165a = hVar;
            this.f6166b = tVar;
            this.f6167c = cVar;
            int max = Math.max(1, cVar.f6187c / 10);
            this.f6171g = max;
            b0 b0Var = new b0(cVar.f6191g);
            b0Var.v();
            int v10 = b0Var.v();
            this.f6168d = v10;
            int i10 = cVar.f6186b;
            int i11 = (((cVar.f6189e - (i10 * 4)) * 8) / (cVar.f6190f * i10)) + 1;
            if (v10 == i11) {
                int l10 = l0.l(max, v10);
                this.f6169e = new byte[cVar.f6189e * l10];
                this.f6170f = new b0(l10 * h(v10, i10));
                int i12 = ((cVar.f6187c * cVar.f6189e) * 8) / v10;
                this.f6172h = new q1.b().e0("audio/raw").G(i12).Z(i12).W(h(max, i10)).H(cVar.f6186b).f0(cVar.f6187c).Y(2).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i11);
            sb2.append("; got: ");
            sb2.append(v10);
            throw k2.a(sb2.toString(), null);
        }

        public static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        @Override
        public void a(long j10) {
            this.f6173i = 0;
            this.f6174j = j10;
            this.f6175k = 0;
            this.f6176l = 0L;
        }

        @Override
        public boolean b(t3.g r7, long r8) {
            throw new UnsupportedOperationException("Method not decompiled: d4.b.a.b(t3.g, long):boolean");
        }

        @Override
        public void c(int i10, long j10) {
            this.f6165a.a(new e(this.f6167c, this.f6168d, i10, j10));
            this.f6166b.a(this.f6172h);
        }

        public final void d(byte[] bArr, int i10, b0 b0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f6167c.f6186b; i12++) {
                    e(bArr, i11, i12, b0Var.d());
                }
            }
            int g10 = g(this.f6168d * i10);
            b0Var.P(0);
            b0Var.O(g10);
        }

        public final void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            d4.c cVar = this.f6167c;
            int i12 = cVar.f6189e;
            int i13 = cVar.f6186b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f6164n[min];
            int i19 = ((i10 * this.f6168d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = l0.p(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f6163m[i22];
                int[] iArr = f6164n;
                min = l0.p(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        public final int f(int i10) {
            return i10 / (this.f6167c.f6186b * 2);
        }

        public final int g(int i10) {
            return h(i10, this.f6167c.f6186b);
        }

        public final void i(int i10) {
            long z02 = this.f6174j + l0.z0(this.f6176l, 1000000L, this.f6167c.f6187c);
            int g10 = g(i10);
            this.f6166b.f(z02, 1, g10, this.f6175k - g10, null);
            this.f6176l += i10;
            this.f6175k -= g10;
        }
    }

    public interface AbstractC0080b {
        void a(long j10);

        boolean b(g gVar, long j10);

        void c(int i10, long j10);
    }

    public static final class c implements AbstractC0080b {
        public final h f6177a;
        public final t f6178b;
        public final d4.c f6179c;
        public final q1 f6180d;
        public final int f6181e;
        public long f6182f;
        public int f6183g;
        public long f6184h;

        public c(h hVar, t tVar, d4.c cVar, String str, int i10) {
            this.f6177a = hVar;
            this.f6178b = tVar;
            this.f6179c = cVar;
            int i11 = (cVar.f6186b * cVar.f6190f) / 8;
            int i12 = cVar.f6189e;
            if (i12 == i11) {
                int i13 = cVar.f6187c;
                int i14 = i13 * i11 * 8;
                int max = Math.max(i11, (i13 * i11) / 10);
                this.f6181e = max;
                this.f6180d = new q1.b().e0(str).G(i14).Z(i14).W(max).H(cVar.f6186b).f0(cVar.f6187c).Y(i10).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i11);
            sb2.append("; got: ");
            sb2.append(i12);
            throw k2.a(sb2.toString(), null);
        }

        @Override
        public void a(long j10) {
            this.f6182f = j10;
            this.f6183g = 0;
            this.f6184h = 0L;
        }

        @Override
        public boolean b(g gVar, long j10) {
            int i10;
            d4.c cVar;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f6183g) >= (i12 = this.f6181e)) {
                    break;
                }
                int b10 = this.f6178b.b(gVar, (int) Math.min(i12 - i11, j11), true);
                if (b10 == -1) {
                    j11 = 0;
                } else {
                    this.f6183g += b10;
                    j11 -= b10;
                }
            }
            int i13 = this.f6179c.f6189e;
            int i14 = this.f6183g / i13;
            if (i14 > 0) {
                int i15 = i14 * i13;
                int i16 = this.f6183g - i15;
                this.f6178b.f(this.f6182f + l0.z0(this.f6184h, 1000000L, cVar.f6187c), 1, i15, i16, null);
                this.f6184h += i14;
                this.f6183g = i16;
            }
            return i10 <= 0;
        }

        @Override
        public void c(int i10, long j10) {
            this.f6177a.a(new e(this.f6179c, 1, i10, j10));
            this.f6178b.a(this.f6180d);
        }
    }

    public static f[] g() {
        return new f[]{new b()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f6158c = j10 == 0 ? 0 : 4;
        AbstractC0080b bVar = this.f6160e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void d() {
        c5.a.h(this.f6157b);
        l0.j(this.f6156a);
    }

    @Override
    public int e(g gVar, q qVar) {
        d();
        int i10 = this.f6158c;
        if (i10 == 0) {
            h(gVar);
            return 0;
        } else if (i10 == 1) {
            k(gVar);
            return 0;
        } else if (i10 == 2) {
            i(gVar);
            return 0;
        } else if (i10 == 3) {
            m(gVar);
            return 0;
        } else if (i10 == 4) {
            return l(gVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void f(h hVar) {
        this.f6156a = hVar;
        this.f6157b = hVar.q(0, 1);
        hVar.k();
    }

    public final void h(g gVar) {
        c5.a.f(gVar.r() == 0);
        int i10 = this.f6161f;
        if (i10 != -1) {
            gVar.n(i10);
            this.f6158c = 4;
        } else if (d.a(gVar)) {
            gVar.n((int) (gVar.f() - gVar.r()));
            this.f6158c = 1;
        } else {
            throw k2.a("Unsupported or unrecognized wav file type.", null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    public final void i(g gVar) {
        d4.c b10 = d.b(gVar);
        int i10 = b10.f6185a;
        if (i10 == 17) {
            this.f6160e = new a(this.f6156a, this.f6157b, b10);
        } else if (i10 == 6) {
            this.f6160e = new c(this.f6156a, this.f6157b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f6160e = new c(this.f6156a, this.f6157b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = o0.a(i10, b10.f6190f);
            if (a10 != 0) {
                this.f6160e = new c(this.f6156a, this.f6157b, b10, "audio/raw", a10);
            } else {
                int i11 = b10.f6185a;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Unsupported WAV format type: ");
                sb2.append(i11);
                throw k2.c(sb2.toString());
            }
        }
        this.f6158c = 3;
    }

    @Override
    public boolean j(g gVar) {
        return d.a(gVar);
    }

    public final void k(g gVar) {
        this.f6159d = d.c(gVar);
        this.f6158c = 2;
    }

    public final int l(g gVar) {
        c5.a.f(this.f6162g != -1);
        return ((AbstractC0080b) c5.a.e(this.f6160e)).b(gVar, this.f6162g - gVar.r()) ? -1 : 0;
    }

    public final void m(g gVar) {
        Pair<Long, Long> e10 = d.e(gVar);
        this.f6161f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f6159d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f6162g = this.f6161f + longValue;
        long a10 = gVar.a();
        if (a10 != -1) {
            long j11 = this.f6162g;
            if (j11 > a10) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("Data exceeds input length: ");
                sb2.append(j11);
                sb2.append(", ");
                sb2.append(a10);
                s.i("WavExtractor", sb2.toString());
                this.f6162g = a10;
            }
        }
        ((AbstractC0080b) c5.a.e(this.f6160e)).c(this.f6161f, this.f6162g);
        this.f6158c = 4;
    }
}
