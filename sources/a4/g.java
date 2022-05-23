package a4;

import a4.a;
import android.util.Pair;
import android.util.SparseArray;
import c5.b0;
import c5.i0;
import c5.l0;
import c5.s;
import c5.x;
import com.google.android.exoplayer2.extractor.g;
import h4.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m3.k2;
import m3.q1;
import org.thunderdog.challegram.Log;
import q3.m;
import t3.f;
import t3.h;
import t3.l;
import t3.o;
import t3.q;
import t3.t;

public class g implements f {
    public static final l I = e.f270b;
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final q1 K = new q1.b().e0("application/x-emsg").E();
    public int A;
    public int B;
    public int C;
    public boolean D;
    public h E;
    public t[] F;
    public t[] G;
    public boolean H;
    public final int f272a;
    public final o f273b;
    public final List<q1> f274c;
    public final SparseArray<b> f275d;
    public final b0 f276e;
    public final b0 f277f;
    public final b0 f278g;
    public final byte[] f279h;
    public final b0 f280i;
    public final i0 f281j;
    public final c f282k;
    public final b0 f283l;
    public final ArrayDeque<a.C0011a> f284m;
    public final ArrayDeque<a> f285n;
    public final t f286o;
    public int f287p;
    public int f288q;
    public long f289r;
    public int f290s;
    public b0 f291t;
    public long f292u;
    public int f293v;
    public long f294w;
    public long f295x;
    public long f296y;
    public b f297z;

    public static final class a {
        public final long f298a;
        public final boolean f299b;
        public final int f300c;

        public a(long j10, boolean z10, int i10) {
            this.f298a = j10;
            this.f299b = z10;
            this.f300c = i10;
        }
    }

    public static final class b {
        public final t f301a;
        public r f304d;
        public c f305e;
        public int f306f;
        public int f307g;
        public int f308h;
        public int f309i;
        public boolean f312l;
        public final q f302b = new q();
        public final b0 f303c = new b0();
        public final b0 f310j = new b0(1);
        public final b0 f311k = new b0();

        public b(t tVar, r rVar, c cVar) {
            this.f301a = tVar;
            this.f304d = rVar;
            this.f305e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (!this.f312l) {
                i10 = this.f304d.f398g[this.f306f];
            } else {
                i10 = this.f302b.f384k[this.f306f] ? 1 : 0;
            }
            return g() != null ? i10 | Log.TAG_TDLIB_OPTIONS : i10;
        }

        public long d() {
            if (!this.f312l) {
                return this.f304d.f394c[this.f306f];
            }
            return this.f302b.f380g[this.f308h];
        }

        public long e() {
            if (!this.f312l) {
                return this.f304d.f397f[this.f306f];
            }
            return this.f302b.c(this.f306f);
        }

        public int f() {
            if (!this.f312l) {
                return this.f304d.f395d[this.f306f];
            }
            return this.f302b.f382i[this.f306f];
        }

        public p g() {
            if (!this.f312l) {
                return null;
            }
            int i10 = ((c) l0.j(this.f302b.f374a)).f260a;
            p pVar = this.f302b.f387n;
            if (pVar == null) {
                pVar = this.f304d.f392a.a(i10);
            }
            if (pVar == null || !pVar.f369a) {
                return null;
            }
            return pVar;
        }

        public boolean h() {
            this.f306f++;
            if (!this.f312l) {
                return false;
            }
            int i10 = this.f307g + 1;
            this.f307g = i10;
            int[] iArr = this.f302b.f381h;
            int i11 = this.f308h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f308h = i11 + 1;
            this.f307g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            b0 b0Var;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f372d;
            if (i12 != 0) {
                b0Var = this.f302b.f388o;
            } else {
                byte[] bArr = (byte[]) l0.j(g10.f373e);
                this.f311k.N(bArr, bArr.length);
                b0 b0Var2 = this.f311k;
                i12 = bArr.length;
                b0Var = b0Var2;
            }
            boolean g11 = this.f302b.g(this.f306f);
            boolean z10 = g11 || i11 != 0;
            this.f310j.d()[0] = (byte) ((z10 ? Log.TAG_YOUTUBE : 0) | i12);
            this.f310j.P(0);
            this.f301a.e(this.f310j, 1, 1);
            this.f301a.e(b0Var, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!g11) {
                this.f303c.L(8);
                byte[] d10 = this.f303c.d();
                d10[0] = 0;
                d10[1] = 1;
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                d10[4] = (byte) ((i10 >> 24) & 255);
                d10[5] = (byte) ((i10 >> 16) & 255);
                d10[6] = (byte) ((i10 >> 8) & 255);
                d10[7] = (byte) (i10 & 255);
                this.f301a.e(this.f303c, 8, 1);
                return i12 + 1 + 8;
            }
            b0 b0Var3 = this.f302b.f388o;
            int J = b0Var3.J();
            b0Var3.Q(-2);
            int i13 = (J * 6) + 2;
            if (i11 != 0) {
                this.f303c.L(i13);
                byte[] d11 = this.f303c.d();
                b0Var3.j(d11, 0, i13);
                int i14 = (((d11[2] & 255) << 8) | (d11[3] & 255)) + i11;
                d11[2] = (byte) ((i14 >> 8) & 255);
                d11[3] = (byte) (i14 & 255);
                b0Var3 = this.f303c;
            }
            this.f301a.e(b0Var3, i13, 1);
            return i12 + 1 + i13;
        }

        public void j(r rVar, c cVar) {
            this.f304d = rVar;
            this.f305e = cVar;
            this.f301a.a(rVar.f392a.f363f);
            k();
        }

        public void k() {
            this.f302b.f();
            this.f306f = 0;
            this.f308h = 0;
            this.f307g = 0;
            this.f309i = 0;
            this.f312l = false;
        }

        public void l(long j10) {
            int i10 = this.f306f;
            while (true) {
                q qVar = this.f302b;
                if (i10 < qVar.f379f && qVar.c(i10) < j10) {
                    if (this.f302b.f384k[i10]) {
                        this.f309i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            p g10 = g();
            if (g10 != null) {
                b0 b0Var = this.f302b.f388o;
                int i10 = g10.f372d;
                if (i10 != 0) {
                    b0Var.Q(i10);
                }
                if (this.f302b.g(this.f306f)) {
                    b0Var.Q(b0Var.J() * 6);
                }
            }
        }

        public void n(m mVar) {
            p a10 = this.f304d.f392a.a(((c) l0.j(this.f302b.f374a)).f260a);
            this.f301a.a(this.f304d.f392a.f363f.b().M(mVar.b(a10 != null ? a10.f370b : null)).E());
        }
    }

    public g() {
        this(0);
    }

    public static void A(b0 b0Var, q qVar) {
        z(b0Var, 0, qVar);
    }

    public static Pair<Long, com.google.android.exoplayer2.extractor.b> B(b0 b0Var, long j10) {
        long j11;
        long j12;
        b0Var.P(8);
        int c10 = a4.a.c(b0Var.n());
        b0Var.Q(4);
        long F = b0Var.F();
        if (c10 == 0) {
            j12 = b0Var.F();
            j11 = b0Var.F();
        } else {
            j12 = b0Var.I();
            j11 = b0Var.I();
        }
        long j13 = j10 + j11;
        long j14 = j12;
        long z02 = l0.z0(j14, 1000000L, F);
        b0Var.Q(2);
        int J2 = b0Var.J();
        int[] iArr = new int[J2];
        long[] jArr = new long[J2];
        long[] jArr2 = new long[J2];
        long[] jArr3 = new long[J2];
        long j15 = j14;
        long j16 = z02;
        int i10 = 0;
        while (i10 < J2) {
            int n10 = b0Var.n();
            if ((n10 & Integer.MIN_VALUE) == 0) {
                long F2 = b0Var.F();
                iArr[i10] = n10 & Integer.MAX_VALUE;
                jArr[i10] = j13;
                jArr3[i10] = j16;
                long j17 = j15 + F2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                J2 = J2;
                int[] iArr2 = iArr;
                jArr = jArr;
                long z03 = l0.z0(j17, 1000000L, F);
                jArr4[i10] = z03 - jArr5[i10];
                b0Var.Q(4);
                j13 += iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                j15 = j17;
                j16 = z03;
            } else {
                throw k2.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(z02), new com.google.android.exoplayer2.extractor.b(iArr, jArr, jArr2, jArr3));
    }

    public static long C(b0 b0Var) {
        b0Var.P(8);
        return a4.a.c(b0Var.n()) == 1 ? b0Var.I() : b0Var.F();
    }

    public static b D(b0 b0Var, SparseArray<b> sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        b0Var.P(8);
        int b10 = a4.a.b(b0Var.n());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(b0Var.n());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long I2 = b0Var.I();
            q qVar = valueAt.f302b;
            qVar.f376c = I2;
            qVar.f377d = I2;
        }
        c cVar = valueAt.f305e;
        if ((b10 & 2) != 0) {
            i10 = b0Var.n() - 1;
        } else {
            i10 = cVar.f260a;
        }
        if ((b10 & 8) != 0) {
            i11 = b0Var.n();
        } else {
            i11 = cVar.f261b;
        }
        if ((b10 & 16) != 0) {
            i12 = b0Var.n();
        } else {
            i12 = cVar.f262c;
        }
        if ((b10 & 32) != 0) {
            i13 = b0Var.n();
        } else {
            i13 = cVar.f263d;
        }
        valueAt.f302b.f374a = new c(i10, i11, i12, i13);
        return valueAt;
    }

    public static void E(a.C0011a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b D = D(((a.b) c5.a.e(aVar.g(1952868452))).f234b, sparseArray, z10);
        if (D != null) {
            q qVar = D.f302b;
            long j10 = qVar.f390q;
            boolean z11 = qVar.f391r;
            D.k();
            D.f312l = true;
            a.b g10 = aVar.g(1952867444);
            if (g10 == null || (i10 & 2) != 0) {
                qVar.f390q = j10;
                qVar.f391r = z11;
            } else {
                qVar.f390q = C(g10.f234b);
                qVar.f391r = true;
            }
            H(aVar, D, i10);
            p a10 = D.f304d.f392a.a(((c) c5.a.e(qVar.f374a)).f260a);
            a.b g11 = aVar.g(1935763834);
            if (g11 != null) {
                x((p) c5.a.e(a10), g11.f234b, qVar);
            }
            a.b g12 = aVar.g(1935763823);
            if (g12 != null) {
                w(g12.f234b, qVar);
            }
            a.b g13 = aVar.g(1936027235);
            if (g13 != null) {
                A(g13.f234b, qVar);
            }
            y(aVar, a10 != null ? a10.f370b : null, qVar);
            int size = aVar.f232c.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f232c.get(i11);
                if (bVar.f230a == 1970628964) {
                    I(bVar.f234b, qVar, bArr);
                }
            }
        }
    }

    public static Pair<Integer, c> F(b0 b0Var) {
        b0Var.P(12);
        return Pair.create(Integer.valueOf(b0Var.n()), new c(b0Var.n() - 1, b0Var.n(), b0Var.n(), b0Var.n()));
    }

    public static int G(a4.g.b r34, int r35, int r36, c5.b0 r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: a4.g.G(a4.g$b, int, int, c5.b0, int):int");
    }

    public static void H(a.C0011a aVar, b bVar, int i10) {
        List<a.b> list = aVar.f232c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f230a == 1953658222) {
                b0 b0Var = bVar2.f234b;
                b0Var.P(12);
                int H = b0Var.H();
                if (H > 0) {
                    i12 += H;
                    i11++;
                }
            }
        }
        bVar.f308h = 0;
        bVar.f307g = 0;
        bVar.f306f = 0;
        bVar.f302b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f230a == 1953658222) {
                i14++;
                i15 = G(bVar, i14, i10, bVar3.f234b, i15);
            }
        }
    }

    public static void I(b0 b0Var, q qVar, byte[] bArr) {
        b0Var.P(8);
        b0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(b0Var, 16, qVar);
        }
    }

    public static boolean O(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean P(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw k2.a(sb2.toString(), null);
    }

    public static m i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f230a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f234b.d();
                UUID f10 = l.f(d10);
                if (f10 == null) {
                    s.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new m(arrayList);
    }

    public static b k(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f312l || valueAt.f306f != valueAt.f304d.f393b) && (!valueAt.f312l || valueAt.f308h != valueAt.f302b.f378e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    public static f[] m() {
        return new f[]{new g()};
    }

    public static long u(b0 b0Var) {
        b0Var.P(8);
        return a4.a.c(b0Var.n()) == 0 ? b0Var.F() : b0Var.I();
    }

    public static void v(a.C0011a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f233d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0011a aVar2 = aVar.f233d.get(i11);
            if (aVar2.f230a == 1953653094) {
                E(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void w(b0 b0Var, q qVar) {
        b0Var.P(8);
        int n10 = b0Var.n();
        if ((a4.a.b(n10) & 1) == 1) {
            b0Var.Q(8);
        }
        int H = b0Var.H();
        if (H == 1) {
            qVar.f377d += a4.a.c(n10) == 0 ? b0Var.F() : b0Var.I();
            return;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Unexpected saio entry count: ");
        sb2.append(H);
        throw k2.a(sb2.toString(), null);
    }

    public static void x(p pVar, b0 b0Var, q qVar) {
        int i10;
        int i11 = pVar.f372d;
        b0Var.P(8);
        boolean z10 = true;
        if ((a4.a.b(b0Var.n()) & 1) == 1) {
            b0Var.Q(8);
        }
        int D = b0Var.D();
        int H = b0Var.H();
        int i12 = qVar.f379f;
        if (H <= i12) {
            if (D == 0) {
                boolean[] zArr = qVar.f386m;
                i10 = 0;
                for (int i13 = 0; i13 < H; i13++) {
                    int D2 = b0Var.D();
                    i10 += D2;
                    zArr[i13] = D2 > i11;
                }
            } else {
                if (D <= i11) {
                    z10 = false;
                }
                i10 = (D * H) + 0;
                Arrays.fill(qVar.f386m, 0, H, z10);
            }
            Arrays.fill(qVar.f386m, H, qVar.f379f, false);
            if (i10 > 0) {
                qVar.d(i10);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(78);
        sb2.append("Saiz sample count ");
        sb2.append(H);
        sb2.append(" is greater than fragment sample count");
        sb2.append(i12);
        throw k2.a(sb2.toString(), null);
    }

    public static void y(a.C0011a aVar, String str, q qVar) {
        byte[] bArr = null;
        b0 b0Var = null;
        b0 b0Var2 = null;
        for (int i10 = 0; i10 < aVar.f232c.size(); i10++) {
            a.b bVar = aVar.f232c.get(i10);
            b0 b0Var3 = bVar.f234b;
            int i11 = bVar.f230a;
            if (i11 == 1935828848) {
                b0Var3.P(12);
                if (b0Var3.n() == 1936025959) {
                    b0Var = b0Var3;
                }
            } else if (i11 == 1936158820) {
                b0Var3.P(12);
                if (b0Var3.n() == 1936025959) {
                    b0Var2 = b0Var3;
                }
            }
        }
        if (!(b0Var == null || b0Var2 == null)) {
            b0Var.P(8);
            int c10 = a4.a.c(b0Var.n());
            b0Var.Q(4);
            if (c10 == 1) {
                b0Var.Q(4);
            }
            if (b0Var.n() == 1) {
                b0Var2.P(8);
                int c11 = a4.a.c(b0Var2.n());
                b0Var2.Q(4);
                if (c11 == 1) {
                    if (b0Var2.F() == 0) {
                        throw k2.c("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c11 >= 2) {
                    b0Var2.Q(4);
                }
                if (b0Var2.F() == 1) {
                    b0Var2.Q(1);
                    int D = b0Var2.D();
                    int i12 = (D & 240) >> 4;
                    int i13 = D & 15;
                    boolean z10 = b0Var2.D() == 1;
                    if (z10) {
                        int D2 = b0Var2.D();
                        byte[] bArr2 = new byte[16];
                        b0Var2.j(bArr2, 0, 16);
                        if (D2 == 0) {
                            int D3 = b0Var2.D();
                            bArr = new byte[D3];
                            b0Var2.j(bArr, 0, D3);
                        }
                        qVar.f385l = true;
                        qVar.f387n = new p(z10, str, D2, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw k2.c("Entry count in sgpd != 1 (unsupported).");
            }
            throw k2.c("Entry count in sbgp != 1 (unsupported).");
        }
    }

    public static void z(b0 b0Var, int i10, q qVar) {
        b0Var.P(i10 + 8);
        int b10 = a4.a.b(b0Var.n());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int H = b0Var.H();
            if (H == 0) {
                Arrays.fill(qVar.f386m, 0, qVar.f379f, false);
                return;
            }
            int i11 = qVar.f379f;
            if (H == i11) {
                Arrays.fill(qVar.f386m, 0, H, z10);
                qVar.d(b0Var.a());
                qVar.a(b0Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(H);
            sb2.append(" is different from fragment sample count");
            sb2.append(i11);
            throw k2.a(sb2.toString(), null);
        }
        throw k2.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void J(long j10) {
        while (!this.f284m.isEmpty() && this.f284m.peek().f231b == j10) {
            o(this.f284m.pop());
        }
        g();
    }

    public final boolean K(t3.g gVar) {
        if (this.f290s == 0) {
            if (!gVar.c(this.f283l.d(), 0, 8, true)) {
                return false;
            }
            this.f290s = 8;
            this.f283l.P(0);
            this.f289r = this.f283l.F();
            this.f288q = this.f283l.n();
        }
        long j10 = this.f289r;
        if (j10 == 1) {
            gVar.readFully(this.f283l.d(), 8, 8);
            this.f290s += 8;
            this.f289r = this.f283l.I();
        } else if (j10 == 0) {
            long a10 = gVar.a();
            if (a10 == -1 && !this.f284m.isEmpty()) {
                a10 = this.f284m.peek().f231b;
            }
            if (a10 != -1) {
                this.f289r = (a10 - gVar.r()) + this.f290s;
            }
        }
        if (this.f289r >= this.f290s) {
            long r10 = gVar.r() - this.f290s;
            int i10 = this.f288q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.a(new g.b(this.f295x, r10));
                this.H = true;
            }
            if (this.f288q == 1836019558) {
                int size = this.f275d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q qVar = this.f275d.valueAt(i11).f302b;
                    qVar.f375b = r10;
                    qVar.f377d = r10;
                    qVar.f376c = r10;
                }
            }
            int i12 = this.f288q;
            if (i12 == 1835295092) {
                this.f297z = null;
                this.f292u = r10 + this.f289r;
                this.f287p = 2;
                return true;
            }
            if (O(i12)) {
                long r11 = (gVar.r() + this.f289r) - 8;
                this.f284m.push(new a.C0011a(this.f288q, r11));
                if (this.f289r == this.f290s) {
                    J(r11);
                } else {
                    g();
                }
            } else if (P(this.f288q)) {
                if (this.f290s == 8) {
                    long j11 = this.f289r;
                    if (j11 <= 2147483647L) {
                        b0 b0Var = new b0((int) j11);
                        System.arraycopy(this.f283l.d(), 0, b0Var.d(), 0, 8);
                        this.f291t = b0Var;
                        this.f287p = 1;
                    } else {
                        throw k2.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw k2.c("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f289r <= 2147483647L) {
                this.f291t = null;
                this.f287p = 1;
            } else {
                throw k2.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw k2.c("Atom size less than header length (unsupported).");
    }

    public final void L(t3.g gVar) {
        int i10 = ((int) this.f289r) - this.f290s;
        b0 b0Var = this.f291t;
        if (b0Var != null) {
            gVar.readFully(b0Var.d(), 8, i10);
            q(new a.b(this.f288q, b0Var), gVar.r());
        } else {
            gVar.n(i10);
        }
        J(gVar.r());
    }

    public final void M(t3.g gVar) {
        int size = this.f275d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f275d.valueAt(i10).f302b;
            if (qVar.f389p) {
                long j11 = qVar.f377d;
                if (j11 < j10) {
                    bVar = this.f275d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f287p = 3;
            return;
        }
        int r10 = (int) (j10 - gVar.r());
        if (r10 >= 0) {
            gVar.n(r10);
            bVar.f302b.b(gVar);
            return;
        }
        throw k2.a("Offset to encryption data was negative.", null);
    }

    public final boolean N(t3.g gVar) {
        int i10;
        b bVar = this.f297z;
        Throwable th = null;
        if (bVar == null) {
            bVar = k(this.f275d);
            if (bVar == null) {
                int r10 = (int) (this.f292u - gVar.r());
                if (r10 >= 0) {
                    gVar.n(r10);
                    g();
                    return false;
                }
                throw k2.a("Offset to end of mdat was negative.", null);
            }
            int d10 = (int) (bVar.d() - gVar.r());
            if (d10 < 0) {
                s.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            gVar.n(d10);
            this.f297z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f287p == 3) {
            int f10 = bVar.f();
            this.A = f10;
            if (bVar.f306f < bVar.f309i) {
                gVar.n(f10);
                bVar.m();
                if (!bVar.h()) {
                    this.f297z = null;
                }
                this.f287p = 3;
                return true;
            }
            if (bVar.f304d.f392a.f364g == 1) {
                this.A = f10 - 8;
                gVar.n(8);
            }
            if ("audio/ac4".equals(bVar.f304d.f392a.f363f.U)) {
                this.B = bVar.i(this.A, 7);
                o3.c.a(this.A, this.f280i);
                bVar.f301a.d(this.f280i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.f287p = 4;
            this.C = 0;
        }
        o oVar = bVar.f304d.f392a;
        t tVar = bVar.f301a;
        long e10 = bVar.e();
        i0 i0Var = this.f281j;
        if (i0Var != null) {
            e10 = i0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f367j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += tVar.b(gVar, i14 - i13, false);
            }
        } else {
            byte[] d11 = this.f277f.d();
            d11[0] = 0;
            d11[1] = 0;
            d11[2] = 0;
            int i15 = oVar.f367j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    gVar.readFully(d11, i17, i16);
                    this.f277f.P(0);
                    int n10 = this.f277f.n();
                    if (n10 >= i12) {
                        this.C = n10 - 1;
                        this.f276e.P(0);
                        tVar.d(this.f276e, i11);
                        tVar.d(this.f277f, i12);
                        this.D = this.G.length > 0 && x.g(oVar.f363f.U, d11[i11]);
                        this.B += 5;
                        this.A += i17;
                    } else {
                        throw k2.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f278g.L(i18);
                        gVar.readFully(this.f278g.d(), 0, this.C);
                        tVar.d(this.f278g, this.C);
                        i10 = this.C;
                        int q10 = x.q(this.f278g.d(), this.f278g.f());
                        this.f278g.P("video/hevc".equals(oVar.f363f.U) ? 1 : 0);
                        this.f278g.O(q10);
                        t3.b.a(j10, this.f278g, this.G);
                    } else {
                        i10 = tVar.b(gVar, i18, false);
                    }
                    this.B += i10;
                    this.C -= i10;
                    th = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c10 = bVar.c();
        p g10 = bVar.g();
        tVar.f(j10, c10, this.A, 0, g10 != null ? g10.f371c : null);
        t(j10);
        if (!bVar.h()) {
            this.f297z = null;
        }
        this.f287p = 3;
        return true;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        int size = this.f275d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f275d.valueAt(i10).k();
        }
        this.f285n.clear();
        this.f293v = 0;
        this.f294w = j11;
        this.f284m.clear();
        g();
    }

    @Override
    public int e(t3.g gVar, q qVar) {
        while (true) {
            int i10 = this.f287p;
            if (i10 != 0) {
                if (i10 == 1) {
                    L(gVar);
                } else if (i10 == 2) {
                    M(gVar);
                } else if (N(gVar)) {
                    return 0;
                }
            } else if (!K(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void f(h hVar) {
        this.E = hVar;
        g();
        l();
        o oVar = this.f273b;
        if (oVar != null) {
            this.f275d.put(0, new b(hVar.q(0, oVar.f359b), new r(this.f273b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.k();
        }
    }

    public final void g() {
        this.f287p = 0;
        this.f290s = 0;
    }

    public final c h(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) c5.a.e(sparseArray.get(i10));
    }

    @Override
    public boolean j(t3.g gVar) {
        return n.b(gVar);
    }

    public final void l() {
        int i10;
        t[] tVarArr = new t[2];
        this.F = tVarArr;
        t tVar = this.f286o;
        if (tVar != null) {
            tVarArr[0] = tVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = 100;
        if ((this.f272a & 4) != 0) {
            i10++;
            tVarArr[i10] = this.E.q(100, 5);
            i11 = 101;
        }
        t[] tVarArr2 = (t[]) l0.v0(this.F, i10);
        this.F = tVarArr2;
        for (t tVar2 : tVarArr2) {
            tVar2.a(K);
        }
        this.G = new t[this.f274c.size()];
        for (int i12 = 0; i12 < this.G.length; i12++) {
            i11++;
            t q10 = this.E.q(i11, 3);
            q10.a(this.f274c.get(i12));
            this.G[i12] = q10;
        }
    }

    public o n(o oVar) {
        return oVar;
    }

    public final void o(a.C0011a aVar) {
        int i10 = aVar.f230a;
        if (i10 == 1836019574) {
            s(aVar);
        } else if (i10 == 1836019558) {
            r(aVar);
        } else if (!this.f284m.isEmpty()) {
            this.f284m.peek().d(aVar);
        }
    }

    public final void p(b0 b0Var) {
        long j10;
        long j11;
        String str;
        String str2;
        long j12;
        long j13;
        t[] tVarArr;
        if (this.F.length != 0) {
            b0Var.P(8);
            int c10 = a4.a.c(b0Var.n());
            if (c10 == 0) {
                str2 = (String) c5.a.e(b0Var.x());
                str = (String) c5.a.e(b0Var.x());
                long F = b0Var.F();
                j13 = l0.z0(b0Var.F(), 1000000L, F);
                long j14 = this.f296y;
                long j15 = j14 != -9223372036854775807L ? j14 + j13 : -9223372036854775807L;
                j11 = l0.z0(b0Var.F(), 1000L, F);
                j10 = b0Var.F();
                j12 = j15;
            } else if (c10 != 1) {
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Skipping unsupported emsg version: ");
                sb2.append(c10);
                s.i("FragmentedMp4Extractor", sb2.toString());
                return;
            } else {
                long F2 = b0Var.F();
                j12 = l0.z0(b0Var.I(), 1000000L, F2);
                j11 = l0.z0(b0Var.F(), 1000L, F2);
                long F3 = b0Var.F();
                str2 = (String) c5.a.e(b0Var.x());
                str = (String) c5.a.e(b0Var.x());
                j10 = F3;
                j13 = -9223372036854775807L;
            }
            byte[] bArr = new byte[b0Var.a()];
            b0Var.j(bArr, 0, b0Var.a());
            b0 b0Var2 = new b0(this.f282k.a(new h4.a(str2, str, j11, j10, bArr)));
            int a10 = b0Var2.a();
            for (t tVar : this.F) {
                b0Var2.P(0);
                tVar.d(b0Var2, a10);
            }
            if (j12 == -9223372036854775807L) {
                this.f285n.addLast(new a(j13, true, a10));
                this.f293v += a10;
            } else if (!this.f285n.isEmpty()) {
                this.f285n.addLast(new a(j12, false, a10));
                this.f293v += a10;
            } else {
                i0 i0Var = this.f281j;
                if (i0Var != null) {
                    j12 = i0Var.a(j12);
                }
                for (t tVar2 : this.F) {
                    tVar2.f(j12, 1, a10, 0, null);
                }
            }
        }
    }

    public final void q(a.b bVar, long j10) {
        if (!this.f284m.isEmpty()) {
            this.f284m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f230a;
        if (i10 == 1936286840) {
            Pair<Long, com.google.android.exoplayer2.extractor.b> B = B(bVar.f234b, j10);
            this.f296y = ((Long) B.first).longValue();
            this.E.a((com.google.android.exoplayer2.extractor.g) B.second);
            this.H = true;
        } else if (i10 == 1701671783) {
            p(bVar.f234b);
        }
    }

    public final void r(a.C0011a aVar) {
        v(aVar, this.f275d, this.f273b != null, this.f272a, this.f279h);
        m i10 = i(aVar.f232c);
        if (i10 != null) {
            int size = this.f275d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f275d.valueAt(i11).n(i10);
            }
        }
        if (this.f294w != -9223372036854775807L) {
            int size2 = this.f275d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f275d.valueAt(i12).l(this.f294w);
            }
            this.f294w = -9223372036854775807L;
        }
    }

    public final void s(a.C0011a aVar) {
        boolean z10 = true;
        int i10 = 0;
        c5.a.g(this.f273b == null, "Unexpected moov box.");
        m i11 = i(aVar.f232c);
        a.C0011a aVar2 = (a.C0011a) c5.a.e(aVar.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        long j10 = -9223372036854775807L;
        int size = aVar2.f232c.size();
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = aVar2.f232c.get(i12);
            int i13 = bVar.f230a;
            if (i13 == 1953654136) {
                Pair<Integer, c> F = F(bVar.f234b);
                sparseArray.put(((Integer) F.first).intValue(), (c) F.second);
            } else if (i13 == 1835362404) {
                j10 = u(bVar.f234b);
            }
        }
        List<r> A = a4.b.A(aVar, new o(), j10, i11, (this.f272a & 16) != 0, false, new z6.f() {
            @Override
            public final Object apply(Object obj) {
                return g.this.n((o) obj);
            }
        });
        int size2 = A.size();
        if (this.f275d.size() == 0) {
            while (i10 < size2) {
                r rVar = A.get(i10);
                o oVar = rVar.f392a;
                this.f275d.put(oVar.f358a, new b(this.E.q(i10, oVar.f359b), rVar, h(sparseArray, oVar.f358a)));
                this.f295x = Math.max(this.f295x, oVar.f362e);
                i10++;
            }
            this.E.k();
            return;
        }
        if (this.f275d.size() != size2) {
            z10 = false;
        }
        c5.a.f(z10);
        while (i10 < size2) {
            r rVar2 = A.get(i10);
            o oVar2 = rVar2.f392a;
            this.f275d.get(oVar2.f358a).j(rVar2, h(sparseArray, oVar2.f358a));
            i10++;
        }
    }

    public final void t(long j10) {
        while (!this.f285n.isEmpty()) {
            a removeFirst = this.f285n.removeFirst();
            this.f293v -= removeFirst.f300c;
            long j11 = removeFirst.f298a;
            if (removeFirst.f299b) {
                j11 += j10;
            }
            i0 i0Var = this.f281j;
            if (i0Var != null) {
                j11 = i0Var.a(j11);
            }
            for (t tVar : this.F) {
                tVar.f(j11, 1, removeFirst.f300c, this.f293v, null);
            }
        }
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, i0 i0Var) {
        this(i10, i0Var, null, Collections.emptyList());
    }

    public g(int i10, i0 i0Var, o oVar, List<q1> list) {
        this(i10, i0Var, oVar, list, null);
    }

    public g(int i10, i0 i0Var, o oVar, List<q1> list, t tVar) {
        this.f272a = i10;
        this.f281j = i0Var;
        this.f273b = oVar;
        this.f274c = Collections.unmodifiableList(list);
        this.f286o = tVar;
        this.f282k = new c();
        this.f283l = new b0(16);
        this.f276e = new b0(x.f4901a);
        this.f277f = new b0(5);
        this.f278g = new b0();
        byte[] bArr = new byte[16];
        this.f279h = bArr;
        this.f280i = new b0(bArr);
        this.f284m = new ArrayDeque<>();
        this.f285n = new ArrayDeque<>();
        this.f275d = new SparseArray<>();
        this.f295x = -9223372036854775807L;
        this.f294w = -9223372036854775807L;
        this.f296y = -9223372036854775807L;
        this.E = h.L;
        this.F = new t[0];
        this.G = new t[0];
    }
}
