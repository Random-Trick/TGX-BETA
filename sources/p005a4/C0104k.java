package p005a4;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p005a4.AbstractC0082a;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1237x;
import p073f4.C4260a;
import p162l4.C6310b;
import p174m3.C6556a2;
import p174m3.C6600g1;
import p199o3.C7596c;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8969o;
import p270t3.C8971q;
import p270t3.C8972r;
import p270t3.C8976u;

public final class C0104k implements AbstractC8958f, AbstractC3470g {
    public static final AbstractC8965l f375y = C0102i.f373b;
    public final int f376a;
    public final C1189b0 f377b;
    public final C1189b0 f378c;
    public final C1189b0 f379d;
    public final C1189b0 f380e;
    public final ArrayDeque<AbstractC0082a.C0083a> f381f;
    public final C0108m f382g;
    public final List<C4260a.AbstractC4262b> f383h;
    public int f384i;
    public int f385j;
    public long f386k;
    public int f387l;
    public C1189b0 f388m;
    public int f389n;
    public int f390o;
    public int f391p;
    public int f392q;
    public AbstractC8960h f393r;
    public C0105a[] f394s;
    public long[][] f395t;
    public int f396u;
    public long f397v;
    public int f398w;
    public C6310b f399x;

    public static final class C0105a {
        public final C0111o f400a;
        public final C0114r f401b;
        public final AbstractC8974t f402c;
        public final C8976u f403d;
        public int f404e;

        public C0105a(C0111o oVar, C0114r rVar, AbstractC8974t tVar) {
            this.f400a = oVar;
            this.f401b = rVar;
            this.f402c = tVar;
            this.f403d = "audio/true-hd".equals(oVar.f422f.f20575U) ? new C8976u() : null;
        }
    }

    public C0104k() {
        this(0);
    }

    public static boolean m42310E(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    public static boolean m42309F(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    public static int m42305m(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] m42304n(C0105a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f401b.f452b];
            jArr2[i] = aVarArr[i].f401b.f456f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += aVarArr[i3].f401b.f454d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f401b.f456f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    public static int m42302p(C0114r rVar, long j) {
        int a = rVar.m42261a(j);
        return a == -1 ? rVar.m42260b(j) : a;
    }

    public static C0111o m42300r(C0111o oVar) {
        return oVar;
    }

    public static AbstractC8958f[] m42299s() {
        return new AbstractC8958f[]{new C0104k()};
    }

    public static long m42298t(C0114r rVar, long j, long j2) {
        int p = m42302p(rVar, j);
        return p == -1 ? j2 : Math.min(rVar.f453c[p], j2);
    }

    public static int m42294x(C1189b0 b0Var) {
        b0Var.m38147P(8);
        int m = m42305m(b0Var.m38132n());
        if (m != 0) {
            return m;
        }
        b0Var.m38146Q(4);
        while (b0Var.m38145a() > 0) {
            int m2 = m42305m(b0Var.m38132n());
            if (m2 != 0) {
                return m2;
            }
        }
        return 0;
    }

    public final boolean m42314A(AbstractC8959g gVar) {
        AbstractC0082a.C0083a peek;
        if (this.f387l == 0) {
            if (!gVar.mo10813d(this.f380e.m38142d(), 0, 8, true)) {
                m42295w();
                return false;
            }
            this.f387l = 8;
            this.f380e.m38147P(0);
            this.f386k = this.f380e.m38157F();
            this.f385j = this.f380e.m38132n();
        }
        long j = this.f386k;
        if (j == 1) {
            gVar.readFully(this.f380e.m38142d(), 8, 8);
            this.f387l += 8;
            this.f386k = this.f380e.m38154I();
        } else if (j == 0) {
            long a = gVar.mo6046a();
            if (a == -1 && (peek = this.f381f.peek()) != null) {
                a = peek.f280b;
            }
            if (a != -1) {
                this.f386k = (a - gVar.mo6043r()) + this.f387l;
            }
        }
        if (this.f386k >= this.f387l) {
            if (m42310E(this.f385j)) {
                long r = gVar.mo6043r();
                long j2 = this.f386k;
                int i = this.f387l;
                long j3 = (r + j2) - i;
                if (j2 != i && this.f385j == 1835365473) {
                    m42297u(gVar);
                }
                this.f381f.push(new AbstractC0082a.C0083a(this.f385j, j3));
                if (this.f386k == this.f387l) {
                    m42296v(j3);
                } else {
                    m42303o();
                }
            } else if (m42309F(this.f385j)) {
                C1186a.m38187f(this.f387l == 8);
                C1186a.m38187f(this.f386k <= 2147483647L);
                C1189b0 b0Var = new C1189b0((int) this.f386k);
                System.arraycopy(this.f380e.m38142d(), 0, b0Var.m38142d(), 0, 8);
                this.f388m = b0Var;
                this.f384i = 1;
            } else {
                m42292z(gVar.mo6043r() - this.f387l);
                this.f388m = null;
                this.f384i = 1;
            }
            return true;
        }
        throw C6556a2.m20111c("Atom size less than header length (unsupported).");
    }

    public final boolean m42313B(AbstractC8959g gVar, C8971q qVar) {
        boolean z;
        long j = this.f386k - this.f387l;
        long r = gVar.mo6043r() + j;
        C1189b0 b0Var = this.f388m;
        if (b0Var != null) {
            gVar.readFully(b0Var.m38142d(), this.f387l, (int) j);
            if (this.f385j == 1718909296) {
                this.f398w = m42294x(b0Var);
            } else if (!this.f381f.isEmpty()) {
                this.f381f.peek().m42418e(new AbstractC0082a.C0084b(this.f385j, b0Var));
            }
        } else if (j < 262144) {
            gVar.mo10807n((int) j);
        } else {
            qVar.f28860a = gVar.mo6043r() + j;
            z = true;
            m42296v(r);
            return !z && this.f384i != 2;
        }
        z = false;
        m42296v(r);
        if (!z) {
        }
    }

    public final int m42312C(AbstractC8959g gVar, C8971q qVar) {
        int i;
        C8971q qVar2;
        long r = gVar.mo6043r();
        if (this.f389n == -1) {
            int q = m42301q(r);
            this.f389n = q;
            if (q == -1) {
                return -1;
            }
        }
        C0105a aVar = ((C0105a[]) C1216l0.m37971j(this.f394s))[this.f389n];
        AbstractC8974t tVar = aVar.f402c;
        int i2 = aVar.f404e;
        C0114r rVar = aVar.f401b;
        long j = rVar.f453c[i2];
        int i3 = rVar.f454d[i2];
        C8976u uVar = aVar.f403d;
        long j2 = (j - r) + this.f390o;
        if (j2 < 0) {
            i = 1;
            qVar2 = qVar;
        } else if (j2 >= 262144) {
            qVar2 = qVar;
            i = 1;
        } else {
            if (aVar.f400a.f423g == 1) {
                j2 += 8;
                i3 -= 8;
            }
            gVar.mo10807n((int) j2);
            C0111o oVar = aVar.f400a;
            if (oVar.f426j == 0) {
                if ("audio/ac4".equals(oVar.f422f.f20575U)) {
                    if (this.f391p == 0) {
                        C7596c.m15549a(i3, this.f379d);
                        tVar.mo10795c(this.f379d, 7);
                        this.f391p += 7;
                    }
                    i3 += 7;
                } else if (uVar != null) {
                    uVar.m10788d(gVar);
                }
                while (true) {
                    int i4 = this.f391p;
                    if (i4 >= i3) {
                        break;
                    }
                    int d = tVar.mo10794d(gVar, i3 - i4, false);
                    this.f390o += d;
                    this.f391p += d;
                    this.f392q -= d;
                }
            } else {
                byte[] d2 = this.f378c.m38142d();
                d2[0] = 0;
                d2[1] = 0;
                d2[2] = 0;
                int i5 = aVar.f400a.f426j;
                int i6 = 4 - i5;
                while (this.f391p < i3) {
                    int i7 = this.f392q;
                    if (i7 == 0) {
                        gVar.readFully(d2, i6, i5);
                        this.f390o += i5;
                        this.f378c.m38147P(0);
                        int n = this.f378c.m38132n();
                        if (n >= 0) {
                            this.f392q = n;
                            this.f377b.m38147P(0);
                            tVar.mo10795c(this.f377b, 4);
                            this.f391p += 4;
                            i3 += i6;
                        } else {
                            throw C6556a2.m20113a("Invalid NAL length", null);
                        }
                    } else {
                        int d3 = tVar.mo10794d(gVar, i7, false);
                        this.f390o += d3;
                        this.f391p += d3;
                        this.f392q -= d3;
                    }
                }
            }
            int i8 = i3;
            C0114r rVar2 = aVar.f401b;
            long j3 = rVar2.f456f[i2];
            int i9 = rVar2.f457g[i2];
            if (uVar != null) {
                uVar.m10789c(tVar, j3, i9, i8, 0, null);
                if (i2 + 1 == aVar.f401b.f452b) {
                    uVar.m10791a(tVar, null);
                }
            } else {
                tVar.mo10793e(j3, i9, i8, 0, null);
            }
            aVar.f404e++;
            this.f389n = -1;
            this.f390o = 0;
            this.f391p = 0;
            this.f392q = 0;
            return 0;
        }
        qVar2.f28860a = j;
        return i;
    }

    public final int m42311D(AbstractC8959g gVar, C8971q qVar) {
        int c = this.f382g.m42279c(gVar, qVar, this.f383h);
        if (c == 1 && qVar.f28860a == 0) {
            m42303o();
        }
        return c;
    }

    public final void m42308G(C0105a aVar, long j) {
        C0114r rVar = aVar.f401b;
        int a = rVar.m42261a(j);
        if (a == -1) {
            a = rVar.m42260b(j);
        }
        aVar.f404e = a;
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f381f.clear();
        this.f387l = 0;
        this.f389n = -1;
        this.f390o = 0;
        this.f391p = 0;
        this.f392q = 0;
        if (j != 0) {
            C0105a[] aVarArr = this.f394s;
            if (aVarArr != null) {
                for (C0105a aVar : aVarArr) {
                    m42308G(aVar, j2);
                    C8976u uVar = aVar.f403d;
                    if (uVar != null) {
                        uVar.m10790b();
                    }
                }
            }
        } else if (this.f384i != 3) {
            m42303o();
        } else {
            this.f382g.m42275g();
            this.f383h.clear();
        }
    }

    @Override
    public long mo1126d() {
        return this.f397v;
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        while (true) {
            int i = this.f384i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m42312C(gVar, qVar);
                    }
                    if (i == 3) {
                        return m42311D(gVar, qVar);
                    }
                    throw new IllegalStateException();
                } else if (m42313B(gVar, qVar)) {
                    return 1;
                }
            } else if (!m42314A(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f393r = hVar;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((C0105a[]) C1186a.m38188e(this.f394s)).length == 0) {
            return new AbstractC3470g.C3471a(C8972r.f28861c);
        }
        int i = this.f396u;
        if (i != -1) {
            C0114r rVar = this.f394s[i].f401b;
            int p = m42302p(rVar, j);
            if (p == -1) {
                return new AbstractC3470g.C3471a(C8972r.f28861c);
            }
            long j6 = rVar.f456f[p];
            j2 = rVar.f453c[p];
            if (j6 >= j || p >= rVar.f452b - 1 || (b = rVar.m42260b(j)) == -1 || b == p) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = rVar.f456f[b];
                j5 = rVar.f453c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C0105a[] aVarArr = this.f394s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.f396u) {
                C0114r rVar2 = aVarArr[i2].f401b;
                long t = m42298t(rVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m42298t(rVar2, j4, j3);
                }
                j2 = t;
            }
            i2++;
        }
        C8972r rVar3 = new C8972r(j, j2);
        if (j4 == -9223372036854775807L) {
            return new AbstractC3470g.C3471a(rVar3);
        }
        return new AbstractC3470g.C3471a(rVar3, new C8972r(j4, j3));
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        return C0110n.m42271d(gVar, (this.f376a & 2) != 0);
    }

    public final void m42303o() {
        this.f384i = 0;
        this.f387l = 0;
    }

    public final int m42301q(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((C0105a[]) C1216l0.m37971j(this.f394s)).length; i3++) {
            C0105a aVar = this.f394s[i3];
            int i4 = aVar.f404e;
            C0114r rVar = aVar.f401b;
            if (i4 != rVar.f452b) {
                long j5 = rVar.f453c[i4];
                long j6 = ((long[][]) C1216l0.m37971j(this.f395t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    public final void m42297u(AbstractC8959g gVar) {
        this.f379d.m38151L(8);
        gVar.mo10805q(this.f379d.m38142d(), 0, 8);
        C0085b.m42407e(this.f379d);
        gVar.mo10807n(this.f379d.m38141e());
        gVar.mo10808m();
    }

    public final void m42296v(long j) {
        while (!this.f381f.isEmpty() && this.f381f.peek().f280b == j) {
            AbstractC0082a.C0083a pop = this.f381f.pop();
            if (pop.f279a == 1836019574) {
                m42293y(pop);
                this.f381f.clear();
                this.f384i = 2;
            } else if (!this.f381f.isEmpty()) {
                this.f381f.peek().m42419d(pop);
            }
        }
        if (this.f384i != 2) {
            m42303o();
        }
    }

    public final void m42295w() {
        if (this.f398w == 2 && (this.f376a & 2) != 0) {
            AbstractC8960h hVar = (AbstractC8960h) C1186a.m38188e(this.f393r);
            hVar.mo6039r(0, 4).mo10797a(new C6600g1.C6602b().m19871X(this.f399x == null ? null : new C4260a(this.f399x)).m19890E());
            hVar.mo6040m();
            hVar.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
        }
    }

    public final void m42293y(AbstractC0082a.C0083a aVar) {
        C4260a aVar2;
        C4260a aVar3;
        int i;
        List<C0114r> list;
        ArrayList arrayList;
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f398w == 1;
        C8969o oVar = new C8969o();
        AbstractC0082a.C0084b g = aVar.m42416g(1969517665);
        if (g != null) {
            Pair<C4260a, C4260a> B = C0085b.m42414B(g);
            C4260a aVar4 = (C4260a) B.first;
            aVar3 = (C4260a) B.second;
            if (aVar4 != null) {
                oVar.m10802c(aVar4);
            }
            aVar2 = aVar4;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        AbstractC0082a.C0083a f = aVar.m42417f(1835365473);
        C4260a n = f != null ? C0085b.m42398n(f) : null;
        List<C0114r> A = C0085b.m42415A(aVar, oVar, -9223372036854775807L, null, (this.f376a & 1) != 0, z, C0103j.f374a);
        AbstractC8960h hVar = (AbstractC8960h) C1186a.m38188e(this.f393r);
        int size = A.size();
        int i4 = 0;
        int i5 = -1;
        long j = -9223372036854775807L;
        while (i4 < size) {
            C0114r rVar = A.get(i4);
            if (rVar.f452b == 0) {
                list = A;
                i = size;
                arrayList = arrayList2;
            } else {
                C0111o oVar2 = rVar.f451a;
                int i6 = i5;
                arrayList = arrayList2;
                long j2 = oVar2.f421e;
                if (j2 == -9223372036854775807L) {
                    j2 = rVar.f458h;
                }
                long max = Math.max(j, j2);
                list = A;
                i = size;
                C0105a aVar5 = new C0105a(oVar2, rVar, hVar.mo6039r(i4, oVar2.f418b));
                if ("audio/true-hd".equals(oVar2.f422f.f20575U)) {
                    i2 = rVar.f455e * 16;
                } else {
                    i2 = rVar.f455e + 30;
                }
                C6600g1.C6602b b = oVar2.f422f.m19902b();
                b.m19872W(i2);
                if (oVar2.f418b == 2 && j2 > 0 && (i3 = rVar.f452b) > 1) {
                    b.m19879P(i3 / (((float) j2) / 1000000.0f));
                }
                C0101h.m42316k(oVar2.f418b, oVar, b);
                int i7 = oVar2.f418b;
                C4260a[] aVarArr = new C4260a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f383h.isEmpty() ? null : new C4260a(this.f383h);
                C0101h.m42315l(i7, aVar2, n, b, aVarArr);
                aVar5.f402c.mo10797a(b.m19890E());
                if (oVar2.f418b == 2 && i6 == -1) {
                    i5 = arrayList.size();
                    arrayList.add(aVar5);
                    j = max;
                }
                i5 = i6;
                arrayList.add(aVar5);
                j = max;
            }
            i4++;
            arrayList2 = arrayList;
            A = list;
            size = i;
        }
        this.f396u = i5;
        this.f397v = j;
        C0105a[] aVarArr2 = (C0105a[]) arrayList2.toArray(new C0105a[0]);
        this.f394s = aVarArr2;
        this.f395t = m42304n(aVarArr2);
        hVar.mo6040m();
        hVar.mo6042a(this);
    }

    public final void m42292z(long j) {
        if (this.f385j == 1836086884) {
            int i = this.f387l;
            this.f399x = new C6310b(0L, j, -9223372036854775807L, j + i, this.f386k - i);
        }
    }

    public C0104k(int i) {
        this.f376a = i;
        this.f384i = (i & 4) != 0 ? 3 : 0;
        this.f382g = new C0108m();
        this.f383h = new ArrayList();
        this.f380e = new C1189b0(16);
        this.f381f = new ArrayDeque<>();
        this.f377b = new C1189b0(C1237x.f4572a);
        this.f378c = new C1189b0(4);
        this.f379d = new C1189b0();
        this.f389n = -1;
    }
}
