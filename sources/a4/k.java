package a4;

import a4.a;
import android.util.Pair;
import c5.b0;
import c5.l0;
import c5.x;
import com.google.android.exoplayer2.extractor.g;
import f4.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import l4.b;
import m3.k2;
import m3.q1;
import o3.c;
import t3.f;
import t3.h;
import t3.l;
import t3.o;
import t3.q;
import t3.r;
import t3.t;
import t3.u;

public final class k implements f, g {
    public static final l f316y = i.f314b;
    public final int f317a;
    public final b0 f318b;
    public final b0 f319c;
    public final b0 f320d;
    public final b0 f321e;
    public final ArrayDeque<a.C0011a> f322f;
    public final m f323g;
    public final List<a.b> f324h;
    public int f325i;
    public int f326j;
    public long f327k;
    public int f328l;
    public b0 f329m;
    public int f330n;
    public int f331o;
    public int f332p;
    public int f333q;
    public h f334r;
    public a[] f335s;
    public long[][] f336t;
    public int f337u;
    public long f338v;
    public int f339w;
    public b f340x;

    public static final class a {
        public final o f341a;
        public final r f342b;
        public final t f343c;
        public final u f344d;
        public int f345e;

        public a(o oVar, r rVar, t tVar) {
            this.f341a = oVar;
            this.f342b = rVar;
            this.f343c = tVar;
            this.f344d = "audio/true-hd".equals(oVar.f363f.U) ? new u() : null;
        }
    }

    public k() {
        this(0);
    }

    public static boolean E(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    public static boolean F(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static int m(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] n(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f342b.f393b];
            jArr2[i10] = aVarArr[i10].f342b.f397f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += aVarArr[i12].f342b.f395d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f342b.f397f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static int p(r rVar, long j10) {
        int a10 = rVar.a(j10);
        return a10 == -1 ? rVar.b(j10) : a10;
    }

    public static o r(o oVar) {
        return oVar;
    }

    public static f[] s() {
        return new f[]{new k()};
    }

    public static long t(r rVar, long j10, long j11) {
        int p10 = p(rVar, j10);
        return p10 == -1 ? j11 : Math.min(rVar.f394c[p10], j11);
    }

    public static int x(b0 b0Var) {
        b0Var.P(8);
        int m10 = m(b0Var.n());
        if (m10 != 0) {
            return m10;
        }
        b0Var.Q(4);
        while (b0Var.a() > 0) {
            int m11 = m(b0Var.n());
            if (m11 != 0) {
                return m11;
            }
        }
        return 0;
    }

    public final boolean A(t3.g gVar) {
        a.C0011a peek;
        if (this.f328l == 0) {
            if (!gVar.c(this.f321e.d(), 0, 8, true)) {
                w();
                return false;
            }
            this.f328l = 8;
            this.f321e.P(0);
            this.f327k = this.f321e.F();
            this.f326j = this.f321e.n();
        }
        long j10 = this.f327k;
        if (j10 == 1) {
            gVar.readFully(this.f321e.d(), 8, 8);
            this.f328l += 8;
            this.f327k = this.f321e.I();
        } else if (j10 == 0) {
            long a10 = gVar.a();
            if (a10 == -1 && (peek = this.f322f.peek()) != null) {
                a10 = peek.f231b;
            }
            if (a10 != -1) {
                this.f327k = (a10 - gVar.r()) + this.f328l;
            }
        }
        if (this.f327k >= this.f328l) {
            if (E(this.f326j)) {
                long r10 = gVar.r();
                long j11 = this.f327k;
                int i10 = this.f328l;
                long j12 = (r10 + j11) - i10;
                if (j11 != i10 && this.f326j == 1835365473) {
                    u(gVar);
                }
                this.f322f.push(new a.C0011a(this.f326j, j12));
                if (this.f327k == this.f328l) {
                    v(j12);
                } else {
                    o();
                }
            } else if (F(this.f326j)) {
                c5.a.f(this.f328l == 8);
                c5.a.f(this.f327k <= 2147483647L);
                b0 b0Var = new b0((int) this.f327k);
                System.arraycopy(this.f321e.d(), 0, b0Var.d(), 0, 8);
                this.f329m = b0Var;
                this.f325i = 1;
            } else {
                z(gVar.r() - this.f328l);
                this.f329m = null;
                this.f325i = 1;
            }
            return true;
        }
        throw k2.c("Atom size less than header length (unsupported).");
    }

    public final boolean B(t3.g gVar, q qVar) {
        boolean z10;
        long j10 = this.f327k - this.f328l;
        long r10 = gVar.r() + j10;
        b0 b0Var = this.f329m;
        if (b0Var != null) {
            gVar.readFully(b0Var.d(), this.f328l, (int) j10);
            if (this.f326j == 1718909296) {
                this.f339w = x(b0Var);
            } else if (!this.f322f.isEmpty()) {
                this.f322f.peek().e(new a.b(this.f326j, b0Var));
            }
        } else if (j10 < 262144) {
            gVar.n((int) j10);
        } else {
            qVar.f22899a = gVar.r() + j10;
            z10 = true;
            v(r10);
            return !z10 && this.f325i != 2;
        }
        z10 = false;
        v(r10);
        if (!z10) {
        }
    }

    public final int C(t3.g gVar, q qVar) {
        int i10;
        q qVar2;
        long r10 = gVar.r();
        if (this.f330n == -1) {
            int q10 = q(r10);
            this.f330n = q10;
            if (q10 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) l0.j(this.f335s))[this.f330n];
        t tVar = aVar.f343c;
        int i11 = aVar.f345e;
        r rVar = aVar.f342b;
        long j10 = rVar.f394c[i11];
        int i12 = rVar.f395d[i11];
        u uVar = aVar.f344d;
        long j11 = (j10 - r10) + this.f331o;
        if (j11 < 0) {
            i10 = 1;
            qVar2 = qVar;
        } else if (j11 >= 262144) {
            qVar2 = qVar;
            i10 = 1;
        } else {
            if (aVar.f341a.f364g == 1) {
                j11 += 8;
                i12 -= 8;
            }
            gVar.n((int) j11);
            o oVar = aVar.f341a;
            if (oVar.f367j == 0) {
                if ("audio/ac4".equals(oVar.f363f.U)) {
                    if (this.f332p == 0) {
                        c.a(i12, this.f320d);
                        tVar.d(this.f320d, 7);
                        this.f332p += 7;
                    }
                    i12 += 7;
                } else if (uVar != null) {
                    uVar.d(gVar);
                }
                while (true) {
                    int i13 = this.f332p;
                    if (i13 >= i12) {
                        break;
                    }
                    int b10 = tVar.b(gVar, i12 - i13, false);
                    this.f331o += b10;
                    this.f332p += b10;
                    this.f333q -= b10;
                }
            } else {
                byte[] d10 = this.f319c.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i14 = aVar.f341a.f367j;
                int i15 = 4 - i14;
                while (this.f332p < i12) {
                    int i16 = this.f333q;
                    if (i16 == 0) {
                        gVar.readFully(d10, i15, i14);
                        this.f331o += i14;
                        this.f319c.P(0);
                        int n10 = this.f319c.n();
                        if (n10 >= 0) {
                            this.f333q = n10;
                            this.f318b.P(0);
                            tVar.d(this.f318b, 4);
                            this.f332p += 4;
                            i12 += i15;
                        } else {
                            throw k2.a("Invalid NAL length", null);
                        }
                    } else {
                        int b11 = tVar.b(gVar, i16, false);
                        this.f331o += b11;
                        this.f332p += b11;
                        this.f333q -= b11;
                    }
                }
            }
            int i17 = i12;
            r rVar2 = aVar.f342b;
            long j12 = rVar2.f397f[i11];
            int i18 = rVar2.f398g[i11];
            if (uVar != null) {
                uVar.c(tVar, j12, i18, i17, 0, null);
                if (i11 + 1 == aVar.f342b.f393b) {
                    uVar.a(tVar, null);
                }
            } else {
                tVar.f(j12, i18, i17, 0, null);
            }
            aVar.f345e++;
            this.f330n = -1;
            this.f331o = 0;
            this.f332p = 0;
            this.f333q = 0;
            return 0;
        }
        qVar2.f22899a = j10;
        return i10;
    }

    public final int D(t3.g gVar, q qVar) {
        int c10 = this.f323g.c(gVar, qVar, this.f324h);
        if (c10 == 1 && qVar.f22899a == 0) {
            o();
        }
        return c10;
    }

    public final void G(a aVar, long j10) {
        r rVar = aVar.f342b;
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            a10 = rVar.b(j10);
        }
        aVar.f345e = a10;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f322f.clear();
        this.f328l = 0;
        this.f330n = -1;
        this.f331o = 0;
        this.f332p = 0;
        this.f333q = 0;
        if (j10 != 0) {
            a[] aVarArr = this.f335s;
            if (aVarArr != null) {
                for (a aVar : aVarArr) {
                    G(aVar, j11);
                    u uVar = aVar.f344d;
                    if (uVar != null) {
                        uVar.b();
                    }
                }
            }
        } else if (this.f325i != 3) {
            o();
        } else {
            this.f323g.g();
            this.f324h.clear();
        }
    }

    @Override
    public long d() {
        return this.f338v;
    }

    @Override
    public int e(t3.g gVar, q qVar) {
        while (true) {
            int i10 = this.f325i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return C(gVar, qVar);
                    }
                    if (i10 == 3) {
                        return D(gVar, qVar);
                    }
                    throw new IllegalStateException();
                } else if (B(gVar, qVar)) {
                    return 1;
                }
            } else if (!A(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void f(h hVar) {
        this.f334r = hVar;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public g.a i(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        if (((a[]) c5.a.e(this.f335s)).length == 0) {
            return new g.a(r.f22900c);
        }
        int i10 = this.f337u;
        if (i10 != -1) {
            r rVar = this.f335s[i10].f342b;
            int p10 = p(rVar, j10);
            if (p10 == -1) {
                return new g.a(r.f22900c);
            }
            long j15 = rVar.f397f[p10];
            j11 = rVar.f394c[p10];
            if (j15 >= j10 || p10 >= rVar.f393b - 1 || (b10 = rVar.b(j10)) == -1 || b10 == p10) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = rVar.f397f[b10];
                j14 = rVar.f394c[b10];
            }
            j12 = j14;
            j10 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f335s;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f337u) {
                r rVar2 = aVarArr[i11].f342b;
                long t10 = t(rVar2, j10, j11);
                if (j13 != -9223372036854775807L) {
                    j12 = t(rVar2, j13, j12);
                }
                j11 = t10;
            }
            i11++;
        }
        r rVar3 = new r(j10, j11);
        if (j13 == -9223372036854775807L) {
            return new g.a(rVar3);
        }
        return new g.a(rVar3, new r(j13, j12));
    }

    @Override
    public boolean j(t3.g gVar) {
        return n.d(gVar, (this.f317a & 2) != 0);
    }

    public final void o() {
        this.f325i = 0;
        this.f328l = 0;
    }

    public final int q(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) l0.j(this.f335s)).length; i12++) {
            a aVar = this.f335s[i12];
            int i13 = aVar.f345e;
            r rVar = aVar.f342b;
            if (i13 != rVar.f393b) {
                long j14 = rVar.f394c[i13];
                long j15 = ((long[][]) l0.j(this.f336t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    public final void u(t3.g gVar) {
        this.f320d.L(8);
        gVar.q(this.f320d.d(), 0, 8);
        b.e(this.f320d);
        gVar.n(this.f320d.e());
        gVar.m();
    }

    public final void v(long j10) {
        while (!this.f322f.isEmpty() && this.f322f.peek().f231b == j10) {
            a.C0011a pop = this.f322f.pop();
            if (pop.f230a == 1836019574) {
                y(pop);
                this.f322f.clear();
                this.f325i = 2;
            } else if (!this.f322f.isEmpty()) {
                this.f322f.peek().d(pop);
            }
        }
        if (this.f325i != 2) {
            o();
        }
    }

    public final void w() {
        if (this.f339w == 2 && (this.f317a & 2) != 0) {
            h hVar = (h) c5.a.e(this.f334r);
            hVar.q(0, 4).a(new q1.b().X(this.f340x == null ? null : new f4.a(this.f340x)).E());
            hVar.k();
            hVar.a(new g.b(-9223372036854775807L));
        }
    }

    public final void y(a.C0011a aVar) {
        f4.a aVar2;
        f4.a aVar3;
        int i10;
        List<r> list;
        ArrayList arrayList;
        int i11;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f339w == 1;
        o oVar = new o();
        a.b g10 = aVar.g(1969517665);
        if (g10 != null) {
            Pair<f4.a, f4.a> B = b.B(g10);
            f4.a aVar4 = (f4.a) B.first;
            aVar3 = (f4.a) B.second;
            if (aVar4 != null) {
                oVar.c(aVar4);
            }
            aVar2 = aVar4;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        a.C0011a f10 = aVar.f(1835365473);
        f4.a n10 = f10 != null ? b.n(f10) : null;
        List<r> A = b.A(aVar, oVar, -9223372036854775807L, null, (this.f317a & 1) != 0, z10, j.f315a);
        h hVar = (h) c5.a.e(this.f334r);
        int size = A.size();
        int i13 = 0;
        int i14 = -1;
        long j10 = -9223372036854775807L;
        while (i13 < size) {
            r rVar = A.get(i13);
            if (rVar.f393b == 0) {
                list = A;
                i10 = size;
                arrayList = arrayList2;
            } else {
                o oVar2 = rVar.f392a;
                int i15 = i14;
                arrayList = arrayList2;
                long j11 = oVar2.f362e;
                if (j11 == -9223372036854775807L) {
                    j11 = rVar.f399h;
                }
                long max = Math.max(j10, j11);
                list = A;
                i10 = size;
                a aVar5 = new a(oVar2, rVar, hVar.q(i13, oVar2.f359b));
                if ("audio/true-hd".equals(oVar2.f363f.U)) {
                    i11 = rVar.f396e * 16;
                } else {
                    i11 = rVar.f396e + 30;
                }
                q1.b b10 = oVar2.f363f.b();
                b10.W(i11);
                if (oVar2.f359b == 2 && j11 > 0 && (i12 = rVar.f393b) > 1) {
                    b10.P(i12 / (((float) j11) / 1000000.0f));
                }
                h.k(oVar2.f359b, oVar, b10);
                int i16 = oVar2.f359b;
                f4.a[] aVarArr = new f4.a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f324h.isEmpty() ? null : new f4.a(this.f324h);
                h.l(i16, aVar2, n10, b10, aVarArr);
                aVar5.f343c.a(b10.E());
                if (oVar2.f359b == 2 && i15 == -1) {
                    i14 = arrayList.size();
                    arrayList.add(aVar5);
                    j10 = max;
                }
                i14 = i15;
                arrayList.add(aVar5);
                j10 = max;
            }
            i13++;
            arrayList2 = arrayList;
            A = list;
            size = i10;
        }
        this.f337u = i14;
        this.f338v = j10;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.f335s = aVarArr2;
        this.f336t = n(aVarArr2);
        hVar.k();
        hVar.a(this);
    }

    public final void z(long j10) {
        if (this.f326j == 1836086884) {
            int i10 = this.f328l;
            this.f340x = new b(0L, j10, -9223372036854775807L, j10 + i10, this.f327k - i10);
        }
    }

    public k(int i10) {
        this.f317a = i10;
        this.f325i = (i10 & 4) != 0 ? 3 : 0;
        this.f323g = new m();
        this.f324h = new ArrayList();
        this.f321e = new b0(16);
        this.f322f = new ArrayDeque<>();
        this.f318b = new b0(x.f4901a);
        this.f319c = new b0(4);
        this.f320d = new b0();
        this.f330n = -1;
    }
}
