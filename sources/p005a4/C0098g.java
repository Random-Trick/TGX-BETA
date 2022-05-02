package p005a4;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import com.google.android.exoplayer2.extractor.C3464b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.thunderdog.challegram.Log;
import p005a4.AbstractC0082a;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1237x;
import p101h4.C4951a;
import p101h4.C4954c;
import p174m3.C6556a2;
import p174m3.C6600g1;
import p199o3.C7596c;
import p230q3.C8201m;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8953b;
import p270t3.C8969o;
import p270t3.C8971q;
import p343y6.AbstractC10430f;

public class C0098g implements AbstractC8958f {
    public static final AbstractC8965l f321I = C0096e.f319b;
    public static final byte[] f322J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C6600g1 f323K = new C6600g1.C6602b().m19859e0("application/x-emsg").m19890E();
    public int f324A;
    public int f325B;
    public int f326C;
    public boolean f327D;
    public AbstractC8960h f328E;
    public AbstractC8974t[] f329F;
    public AbstractC8974t[] f330G;
    public boolean f331H;
    public final int f332a;
    public final C0111o f333b;
    public final List<C6600g1> f334c;
    public final SparseArray<C0100b> f335d;
    public final C1189b0 f336e;
    public final C1189b0 f337f;
    public final C1189b0 f338g;
    public final byte[] f339h;
    public final C1189b0 f340i;
    public final C1205i0 f341j;
    public final C4954c f342k;
    public final C1189b0 f343l;
    public final ArrayDeque<AbstractC0082a.C0083a> f344m;
    public final ArrayDeque<C0099a> f345n;
    public final AbstractC8974t f346o;
    public int f347p;
    public int f348q;
    public long f349r;
    public int f350s;
    public C1189b0 f351t;
    public long f352u;
    public int f353v;
    public long f354w;
    public long f355x;
    public long f356y;
    public C0100b f357z;

    public static final class C0099a {
        public final long f358a;
        public final int f359b;

        public C0099a(long j, int i) {
            this.f358a = j;
            this.f359b = i;
        }
    }

    public static final class C0100b {
        public final AbstractC8974t f360a;
        public C0114r f363d;
        public C0092c f364e;
        public int f365f;
        public int f366g;
        public int f367h;
        public int f368i;
        public boolean f371l;
        public final C0113q f361b = new C0113q();
        public final C1189b0 f362c = new C1189b0();
        public final C1189b0 f369j = new C1189b0(1);
        public final C1189b0 f370k = new C1189b0();

        public C0100b(AbstractC8974t tVar, C0114r rVar, C0092c cVar) {
            this.f360a = tVar;
            this.f363d = rVar;
            this.f364e = cVar;
            m42331j(rVar, cVar);
        }

        public int m42338c() {
            int i;
            if (!this.f371l) {
                i = this.f363d.f457g[this.f365f];
            } else {
                i = this.f361b.f443k[this.f365f] ? 1 : 0;
            }
            return m42334g() != null ? i | Log.TAG_TDLIB_OPTIONS : i;
        }

        public long m42337d() {
            if (!this.f371l) {
                return this.f363d.f453c[this.f365f];
            }
            return this.f361b.f439g[this.f367h];
        }

        public long m42336e() {
            if (!this.f371l) {
                return this.f363d.f456f[this.f365f];
            }
            return this.f361b.m42266c(this.f365f);
        }

        public int m42335f() {
            if (!this.f371l) {
                return this.f363d.f454d[this.f365f];
            }
            return this.f361b.f441i[this.f365f];
        }

        public C0112p m42334g() {
            if (!this.f371l) {
                return null;
            }
            int i = ((C0092c) C1216l0.m37971j(this.f361b.f433a)).f309a;
            C0112p pVar = this.f361b.f446n;
            if (pVar == null) {
                pVar = this.f363d.f451a.m42270a(i);
            }
            if (pVar == null || !pVar.f428a) {
                return null;
            }
            return pVar;
        }

        public boolean m42333h() {
            this.f365f++;
            if (!this.f371l) {
                return false;
            }
            int i = this.f366g + 1;
            this.f366g = i;
            int[] iArr = this.f361b.f440h;
            int i2 = this.f367h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f367h = i2 + 1;
            this.f366g = 0;
            return false;
        }

        public int m42332i(int i, int i2) {
            C1189b0 b0Var;
            C0112p g = m42334g();
            if (g == null) {
                return 0;
            }
            int i3 = g.f431d;
            if (i3 != 0) {
                b0Var = this.f361b.f447o;
            } else {
                byte[] bArr = (byte[]) C1216l0.m37971j(g.f432e);
                this.f370k.m38149N(bArr, bArr.length);
                C1189b0 b0Var2 = this.f370k;
                i3 = bArr.length;
                b0Var = b0Var2;
            }
            boolean g2 = this.f361b.m42262g(this.f365f);
            boolean z = g2 || i2 != 0;
            this.f369j.m38142d()[0] = (byte) ((z ? Log.TAG_YOUTUBE : 0) | i3);
            this.f369j.m38147P(0);
            this.f360a.mo10796b(this.f369j, 1, 1);
            this.f360a.mo10796b(b0Var, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!g2) {
                this.f362c.m38151L(8);
                byte[] d = this.f362c.m38142d();
                d[0] = 0;
                d[1] = 1;
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                d[4] = (byte) ((i >> 24) & 255);
                d[5] = (byte) ((i >> 16) & 255);
                d[6] = (byte) ((i >> 8) & 255);
                d[7] = (byte) (i & 255);
                this.f360a.mo10796b(this.f362c, 8, 1);
                return i3 + 1 + 8;
            }
            C1189b0 b0Var3 = this.f361b.f447o;
            int J = b0Var3.m38153J();
            b0Var3.m38146Q(-2);
            int i4 = (J * 6) + 2;
            if (i2 != 0) {
                this.f362c.m38151L(i4);
                byte[] d2 = this.f362c.m38142d();
                b0Var3.m38136j(d2, 0, i4);
                int i5 = (((d2[2] & 255) << 8) | (d2[3] & 255)) + i2;
                d2[2] = (byte) ((i5 >> 8) & 255);
                d2[3] = (byte) (i5 & 255);
                b0Var3 = this.f362c;
            }
            this.f360a.mo10796b(b0Var3, i4, 1);
            return i3 + 1 + i4;
        }

        public void m42331j(C0114r rVar, C0092c cVar) {
            this.f363d = rVar;
            this.f364e = cVar;
            this.f360a.mo10797a(rVar.f451a.f422f);
            m42330k();
        }

        public void m42330k() {
            this.f361b.m42263f();
            this.f365f = 0;
            this.f367h = 0;
            this.f366g = 0;
            this.f368i = 0;
            this.f371l = false;
        }

        public void m42329l(long j) {
            int i = this.f365f;
            while (true) {
                C0113q qVar = this.f361b;
                if (i < qVar.f438f && qVar.m42266c(i) < j) {
                    if (this.f361b.f443k[i]) {
                        this.f368i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        public void m42328m() {
            C0112p g = m42334g();
            if (g != null) {
                C1189b0 b0Var = this.f361b.f447o;
                int i = g.f431d;
                if (i != 0) {
                    b0Var.m38146Q(i);
                }
                if (this.f361b.m42262g(this.f365f)) {
                    b0Var.m38146Q(b0Var.m38153J() * 6);
                }
            }
        }

        public void m42327n(C8201m mVar) {
            C0112p a = this.f363d.f451a.m42270a(((C0092c) C1216l0.m37971j(this.f361b.f433a)).f309a);
            this.f360a.mo10797a(this.f363d.f451a.f422f.m19902b().m19882M(mVar.m13217b(a != null ? a.f429b : null)).m19890E());
        }
    }

    public C0098g() {
        this(0);
    }

    public static void m42377A(C1189b0 b0Var, C0113q qVar) {
        m42341z(b0Var, 0, qVar);
    }

    public static Pair<Long, C3464b> m42376B(C1189b0 b0Var, long j) {
        long j2;
        long j3;
        b0Var.m38147P(8);
        int c = AbstractC0082a.m42420c(b0Var.m38132n());
        b0Var.m38146Q(4);
        long F = b0Var.m38157F();
        if (c == 0) {
            j3 = b0Var.m38157F();
            j2 = b0Var.m38157F();
        } else {
            j3 = b0Var.m38154I();
            j2 = b0Var.m38154I();
        }
        long j4 = j + j2;
        long j5 = j3;
        long y0 = C1216l0.m37940y0(j5, 1000000L, F);
        b0Var.m38146Q(2);
        int J = b0Var.m38153J();
        int[] iArr = new int[J];
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        long[] jArr3 = new long[J];
        long j6 = j5;
        long j7 = y0;
        int i = 0;
        while (i < J) {
            int n = b0Var.m38132n();
            if ((n & Integer.MIN_VALUE) == 0) {
                long F2 = b0Var.m38157F();
                iArr[i] = n & Integer.MAX_VALUE;
                jArr[i] = j4;
                jArr3[i] = j7;
                long j8 = j6 + F2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                J = J;
                int[] iArr2 = iArr;
                jArr = jArr;
                long y02 = C1216l0.m37940y0(j8, 1000000L, F);
                jArr4[i] = y02 - jArr5[i];
                b0Var.m38146Q(4);
                j4 += iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                j6 = j8;
                j7 = y02;
            } else {
                throw C6556a2.m20113a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(y0), new C3464b(iArr, jArr, jArr2, jArr3));
    }

    public static long m42375C(C1189b0 b0Var) {
        b0Var.m38147P(8);
        return AbstractC0082a.m42420c(b0Var.m38132n()) == 1 ? b0Var.m38154I() : b0Var.m38157F();
    }

    public static C0100b m42374D(C1189b0 b0Var, SparseArray<C0100b> sparseArray, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        b0Var.m38147P(8);
        int b = AbstractC0082a.m42421b(b0Var.m38132n());
        C0100b valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(b0Var.m38132n());
        if (valueAt == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long I = b0Var.m38154I();
            C0113q qVar = valueAt.f361b;
            qVar.f435c = I;
            qVar.f436d = I;
        }
        C0092c cVar = valueAt.f364e;
        if ((b & 2) != 0) {
            i = b0Var.m38132n() - 1;
        } else {
            i = cVar.f309a;
        }
        if ((b & 8) != 0) {
            i2 = b0Var.m38132n();
        } else {
            i2 = cVar.f310b;
        }
        if ((b & 16) != 0) {
            i3 = b0Var.m38132n();
        } else {
            i3 = cVar.f311c;
        }
        if ((b & 32) != 0) {
            i4 = b0Var.m38132n();
        } else {
            i4 = cVar.f312d;
        }
        valueAt.f361b.f433a = new C0092c(i, i2, i3, i4);
        return valueAt;
    }

    public static void m42373E(AbstractC0082a.C0083a aVar, SparseArray<C0100b> sparseArray, boolean z, int i, byte[] bArr) {
        C0100b D = m42374D(((AbstractC0082a.C0084b) C1186a.m38188e(aVar.m42416g(1952868452))).f283b, sparseArray, z);
        if (D != null) {
            C0113q qVar = D.f361b;
            long j = qVar.f449q;
            boolean z2 = qVar.f450r;
            D.m42330k();
            D.f371l = true;
            AbstractC0082a.C0084b g = aVar.m42416g(1952867444);
            if (g == null || (i & 2) != 0) {
                qVar.f449q = j;
                qVar.f450r = z2;
            } else {
                qVar.f449q = m42375C(g.f283b);
                qVar.f450r = true;
            }
            m42370H(aVar, D, i);
            C0112p a = D.f363d.f451a.m42270a(((C0092c) C1186a.m38188e(qVar.f433a)).f309a);
            AbstractC0082a.C0084b g2 = aVar.m42416g(1935763834);
            if (g2 != null) {
                m42343x((C0112p) C1186a.m38188e(a), g2.f283b, qVar);
            }
            AbstractC0082a.C0084b g3 = aVar.m42416g(1935763823);
            if (g3 != null) {
                m42344w(g3.f283b, qVar);
            }
            AbstractC0082a.C0084b g4 = aVar.m42416g(1936027235);
            if (g4 != null) {
                m42377A(g4.f283b, qVar);
            }
            m42342y(aVar, a != null ? a.f429b : null, qVar);
            int size = aVar.f281c.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0082a.C0084b bVar = aVar.f281c.get(i2);
                if (bVar.f279a == 1970628964) {
                    m42369I(bVar.f283b, qVar, bArr);
                }
            }
        }
    }

    public static Pair<Integer, C0092c> m42372F(C1189b0 b0Var) {
        b0Var.m38147P(12);
        return Pair.create(Integer.valueOf(b0Var.m38132n()), new C0092c(b0Var.m38132n() - 1, b0Var.m38132n(), b0Var.m38132n(), b0Var.m38132n()));
    }

    public static int m42371G(p005a4.C0098g.C0100b r34, int r35, int r36, p020b5.C1189b0 r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0098g.m42371G(a4.g$b, int, int, b5.b0, int):int");
    }

    public static void m42370H(AbstractC0082a.C0083a aVar, C0100b bVar, int i) {
        List<AbstractC0082a.C0084b> list = aVar.f281c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0082a.C0084b bVar2 = list.get(i4);
            if (bVar2.f279a == 1953658222) {
                C1189b0 b0Var = bVar2.f283b;
                b0Var.m38147P(12);
                int H = b0Var.m38155H();
                if (H > 0) {
                    i3 += H;
                    i2++;
                }
            }
        }
        bVar.f367h = 0;
        bVar.f366g = 0;
        bVar.f365f = 0;
        bVar.f361b.m42264e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0082a.C0084b bVar3 = list.get(i7);
            if (bVar3.f279a == 1953658222) {
                i5++;
                i6 = m42371G(bVar, i5, i, bVar3.f283b, i6);
            }
        }
    }

    public static void m42369I(C1189b0 b0Var, C0113q qVar, byte[] bArr) {
        b0Var.m38147P(8);
        b0Var.m38136j(bArr, 0, 16);
        if (Arrays.equals(bArr, f322J)) {
            m42341z(b0Var, 16, qVar);
        }
    }

    public static boolean m42363O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    public static boolean m42362P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    public static int m42360d(int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected negative value: ");
        sb2.append(i);
        throw C6556a2.m20113a(sb2.toString(), null);
    }

    public static C8201m m42357i(List<AbstractC0082a.C0084b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC0082a.C0084b bVar = list.get(i);
            if (bVar.f279a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d = bVar.f283b.m38142d();
                UUID f = C0106l.m42286f(d);
                if (f == null) {
                    C1230s.m37884i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C8201m.C8203b(f, "video/mp4", d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C8201m(arrayList);
    }

    public static C0100b m42356k(SparseArray<C0100b> sparseArray) {
        int size = sparseArray.size();
        C0100b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C0100b valueAt = sparseArray.valueAt(i);
            if ((valueAt.f371l || valueAt.f365f != valueAt.f363d.f452b) && (!valueAt.f371l || valueAt.f367h != valueAt.f361b.f437e)) {
                long d = valueAt.m42337d();
                if (d < j) {
                    bVar = valueAt;
                    j = d;
                }
            }
        }
        return bVar;
    }

    public static AbstractC8958f[] m42354m() {
        return new AbstractC8958f[]{new C0098g()};
    }

    public static long m42346u(C1189b0 b0Var) {
        b0Var.m38147P(8);
        return AbstractC0082a.m42420c(b0Var.m38132n()) == 0 ? b0Var.m38157F() : b0Var.m38154I();
    }

    public static void m42345v(AbstractC0082a.C0083a aVar, SparseArray<C0100b> sparseArray, boolean z, int i, byte[] bArr) {
        int size = aVar.f282d.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0082a.C0083a aVar2 = aVar.f282d.get(i2);
            if (aVar2.f279a == 1953653094) {
                m42373E(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    public static void m42344w(C1189b0 b0Var, C0113q qVar) {
        b0Var.m38147P(8);
        int n = b0Var.m38132n();
        if ((AbstractC0082a.m42421b(n) & 1) == 1) {
            b0Var.m38146Q(8);
        }
        int H = b0Var.m38155H();
        if (H == 1) {
            qVar.f436d += AbstractC0082a.m42420c(n) == 0 ? b0Var.m38157F() : b0Var.m38154I();
            return;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Unexpected saio entry count: ");
        sb2.append(H);
        throw C6556a2.m20113a(sb2.toString(), null);
    }

    public static void m42343x(C0112p pVar, C1189b0 b0Var, C0113q qVar) {
        int i;
        int i2 = pVar.f431d;
        b0Var.m38147P(8);
        boolean z = true;
        if ((AbstractC0082a.m42421b(b0Var.m38132n()) & 1) == 1) {
            b0Var.m38146Q(8);
        }
        int D = b0Var.m38159D();
        int H = b0Var.m38155H();
        int i3 = qVar.f438f;
        if (H <= i3) {
            if (D == 0) {
                boolean[] zArr = qVar.f445m;
                i = 0;
                for (int i4 = 0; i4 < H; i4++) {
                    int D2 = b0Var.m38159D();
                    i += D2;
                    zArr[i4] = D2 > i2;
                }
            } else {
                if (D <= i2) {
                    z = false;
                }
                i = (D * H) + 0;
                Arrays.fill(qVar.f445m, 0, H, z);
            }
            Arrays.fill(qVar.f445m, H, qVar.f438f, false);
            if (i > 0) {
                qVar.m42265d(i);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(78);
        sb2.append("Saiz sample count ");
        sb2.append(H);
        sb2.append(" is greater than fragment sample count");
        sb2.append(i3);
        throw C6556a2.m20113a(sb2.toString(), null);
    }

    public static void m42342y(AbstractC0082a.C0083a aVar, String str, C0113q qVar) {
        byte[] bArr = null;
        C1189b0 b0Var = null;
        C1189b0 b0Var2 = null;
        for (int i = 0; i < aVar.f281c.size(); i++) {
            AbstractC0082a.C0084b bVar = aVar.f281c.get(i);
            C1189b0 b0Var3 = bVar.f283b;
            int i2 = bVar.f279a;
            if (i2 == 1935828848) {
                b0Var3.m38147P(12);
                if (b0Var3.m38132n() == 1936025959) {
                    b0Var = b0Var3;
                }
            } else if (i2 == 1936158820) {
                b0Var3.m38147P(12);
                if (b0Var3.m38132n() == 1936025959) {
                    b0Var2 = b0Var3;
                }
            }
        }
        if (!(b0Var == null || b0Var2 == null)) {
            b0Var.m38147P(8);
            int c = AbstractC0082a.m42420c(b0Var.m38132n());
            b0Var.m38146Q(4);
            if (c == 1) {
                b0Var.m38146Q(4);
            }
            if (b0Var.m38132n() == 1) {
                b0Var2.m38147P(8);
                int c2 = AbstractC0082a.m42420c(b0Var2.m38132n());
                b0Var2.m38146Q(4);
                if (c2 == 1) {
                    if (b0Var2.m38157F() == 0) {
                        throw C6556a2.m20111c("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c2 >= 2) {
                    b0Var2.m38146Q(4);
                }
                if (b0Var2.m38157F() == 1) {
                    b0Var2.m38146Q(1);
                    int D = b0Var2.m38159D();
                    int i3 = (D & 240) >> 4;
                    int i4 = D & 15;
                    boolean z = b0Var2.m38159D() == 1;
                    if (z) {
                        int D2 = b0Var2.m38159D();
                        byte[] bArr2 = new byte[16];
                        b0Var2.m38136j(bArr2, 0, 16);
                        if (D2 == 0) {
                            int D3 = b0Var2.m38159D();
                            bArr = new byte[D3];
                            b0Var2.m38136j(bArr, 0, D3);
                        }
                        qVar.f444l = true;
                        qVar.f446n = new C0112p(z, str, D2, bArr2, i3, i4, bArr);
                        return;
                    }
                    return;
                }
                throw C6556a2.m20111c("Entry count in sgpd != 1 (unsupported).");
            }
            throw C6556a2.m20111c("Entry count in sbgp != 1 (unsupported).");
        }
    }

    public static void m42341z(C1189b0 b0Var, int i, C0113q qVar) {
        b0Var.m38147P(i + 8);
        int b = AbstractC0082a.m42421b(b0Var.m38132n());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int H = b0Var.m38155H();
            if (H == 0) {
                Arrays.fill(qVar.f445m, 0, qVar.f438f, false);
                return;
            }
            int i2 = qVar.f438f;
            if (H == i2) {
                Arrays.fill(qVar.f445m, 0, H, z);
                qVar.m42265d(b0Var.m38145a());
                qVar.m42268a(b0Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(H);
            sb2.append(" is different from fragment sample count");
            sb2.append(i2);
            throw C6556a2.m20113a(sb2.toString(), null);
        }
        throw C6556a2.m20111c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void m42368J(long j) {
        while (!this.f344m.isEmpty() && this.f344m.peek().f280b == j) {
            m42352o(this.f344m.pop());
        }
        m42359g();
    }

    public final boolean m42367K(AbstractC8959g gVar) {
        if (this.f350s == 0) {
            if (!gVar.mo10813d(this.f343l.m38142d(), 0, 8, true)) {
                return false;
            }
            this.f350s = 8;
            this.f343l.m38147P(0);
            this.f349r = this.f343l.m38157F();
            this.f348q = this.f343l.m38132n();
        }
        long j = this.f349r;
        if (j == 1) {
            gVar.readFully(this.f343l.m38142d(), 8, 8);
            this.f350s += 8;
            this.f349r = this.f343l.m38154I();
        } else if (j == 0) {
            long a = gVar.mo6046a();
            if (a == -1 && !this.f344m.isEmpty()) {
                a = this.f344m.peek().f280b;
            }
            if (a != -1) {
                this.f349r = (a - gVar.mo6043r()) + this.f350s;
            }
        }
        if (this.f349r >= this.f350s) {
            long r = gVar.mo6043r() - this.f350s;
            int i = this.f348q;
            if ((i == 1836019558 || i == 1835295092) && !this.f331H) {
                this.f328E.mo6042a(new AbstractC3470g.C3472b(this.f355x, r));
                this.f331H = true;
            }
            if (this.f348q == 1836019558) {
                int size = this.f335d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0113q qVar = this.f335d.valueAt(i2).f361b;
                    qVar.f434b = r;
                    qVar.f436d = r;
                    qVar.f435c = r;
                }
            }
            int i3 = this.f348q;
            if (i3 == 1835295092) {
                this.f357z = null;
                this.f352u = r + this.f349r;
                this.f347p = 2;
                return true;
            }
            if (m42363O(i3)) {
                long r2 = (gVar.mo6043r() + this.f349r) - 8;
                this.f344m.push(new AbstractC0082a.C0083a(this.f348q, r2));
                if (this.f349r == this.f350s) {
                    m42368J(r2);
                } else {
                    m42359g();
                }
            } else if (m42362P(this.f348q)) {
                if (this.f350s == 8) {
                    long j2 = this.f349r;
                    if (j2 <= 2147483647L) {
                        C1189b0 b0Var = new C1189b0((int) j2);
                        System.arraycopy(this.f343l.m38142d(), 0, b0Var.m38142d(), 0, 8);
                        this.f351t = b0Var;
                        this.f347p = 1;
                    } else {
                        throw C6556a2.m20111c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw C6556a2.m20111c("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f349r <= 2147483647L) {
                this.f351t = null;
                this.f347p = 1;
            } else {
                throw C6556a2.m20111c("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw C6556a2.m20111c("Atom size less than header length (unsupported).");
    }

    public final void m42366L(AbstractC8959g gVar) {
        int i = ((int) this.f349r) - this.f350s;
        C1189b0 b0Var = this.f351t;
        if (b0Var != null) {
            gVar.readFully(b0Var.m38142d(), 8, i);
            m42350q(new AbstractC0082a.C0084b(this.f348q, b0Var), gVar.mo6043r());
        } else {
            gVar.mo10807n(i);
        }
        m42368J(gVar.mo6043r());
    }

    public final void m42365M(AbstractC8959g gVar) {
        int size = this.f335d.size();
        long j = Long.MAX_VALUE;
        C0100b bVar = null;
        for (int i = 0; i < size; i++) {
            C0113q qVar = this.f335d.valueAt(i).f361b;
            if (qVar.f448p) {
                long j2 = qVar.f436d;
                if (j2 < j) {
                    bVar = this.f335d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f347p = 3;
            return;
        }
        int r = (int) (j - gVar.mo6043r());
        if (r >= 0) {
            gVar.mo10807n(r);
            bVar.f361b.m42267b(gVar);
            return;
        }
        throw C6556a2.m20113a("Offset to encryption data was negative.", null);
    }

    public final boolean m42364N(AbstractC8959g gVar) {
        int i;
        C0100b bVar = this.f357z;
        Throwable th = null;
        if (bVar == null) {
            bVar = m42356k(this.f335d);
            if (bVar == null) {
                int r = (int) (this.f352u - gVar.mo6043r());
                if (r >= 0) {
                    gVar.mo10807n(r);
                    m42359g();
                    return false;
                }
                throw C6556a2.m20113a("Offset to end of mdat was negative.", null);
            }
            int d = (int) (bVar.m42337d() - gVar.mo6043r());
            if (d < 0) {
                C1230s.m37884i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d = 0;
            }
            gVar.mo10807n(d);
            this.f357z = bVar;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.f347p == 3) {
            int f = bVar.m42335f();
            this.f324A = f;
            if (bVar.f365f < bVar.f368i) {
                gVar.mo10807n(f);
                bVar.m42328m();
                if (!bVar.m42333h()) {
                    this.f357z = null;
                }
                this.f347p = 3;
                return true;
            }
            if (bVar.f363d.f451a.f423g == 1) {
                this.f324A = f - 8;
                gVar.mo10807n(8);
            }
            if ("audio/ac4".equals(bVar.f363d.f451a.f422f.f20575U)) {
                this.f325B = bVar.m42332i(this.f324A, 7);
                C7596c.m15549a(this.f324A, this.f340i);
                bVar.f360a.mo10795c(this.f340i, 7);
                this.f325B += 7;
            } else {
                this.f325B = bVar.m42332i(this.f324A, 0);
            }
            this.f324A += this.f325B;
            this.f347p = 4;
            this.f326C = 0;
        }
        C0111o oVar = bVar.f363d.f451a;
        AbstractC8974t tVar = bVar.f360a;
        long e = bVar.m42336e();
        C1205i0 i0Var = this.f341j;
        if (i0Var != null) {
            e = i0Var.m38056a(e);
        }
        long j = e;
        if (oVar.f426j == 0) {
            while (true) {
                int i4 = this.f325B;
                int i5 = this.f324A;
                if (i4 >= i5) {
                    break;
                }
                this.f325B += tVar.mo10794d(gVar, i5 - i4, false);
            }
        } else {
            byte[] d2 = this.f337f.m38142d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i6 = oVar.f426j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f325B < this.f324A) {
                int i9 = this.f326C;
                if (i9 == 0) {
                    gVar.readFully(d2, i8, i7);
                    this.f337f.m38147P(0);
                    int n = this.f337f.m38132n();
                    if (n >= i3) {
                        this.f326C = n - 1;
                        this.f336e.m38147P(0);
                        tVar.mo10795c(this.f336e, i2);
                        tVar.mo10795c(this.f337f, i3);
                        this.f327D = this.f330G.length > 0 && C1237x.m37852g(oVar.f422f.f20575U, d2[i2]);
                        this.f325B += 5;
                        this.f324A += i8;
                    } else {
                        throw C6556a2.m20113a("Invalid NAL length", th);
                    }
                } else {
                    if (this.f327D) {
                        this.f338g.m38151L(i9);
                        gVar.readFully(this.f338g.m38142d(), 0, this.f326C);
                        tVar.mo10795c(this.f338g, this.f326C);
                        i = this.f326C;
                        int q = C1237x.m37842q(this.f338g.m38142d(), this.f338g.m38140f());
                        this.f338g.m38147P("video/hevc".equals(oVar.f422f.f20575U) ? 1 : 0);
                        this.f338g.m38148O(q);
                        C8953b.m10845a(j, this.f338g, this.f330G);
                    } else {
                        i = tVar.mo10794d(gVar, i9, false);
                    }
                    this.f325B += i;
                    this.f326C -= i;
                    th = null;
                    i2 = 4;
                    i3 = 1;
                }
            }
        }
        int c = bVar.m42338c();
        C0112p g = bVar.m42334g();
        tVar.mo10793e(j, c, this.f324A, 0, g != null ? g.f430c : null);
        m42347t(j);
        if (!bVar.m42333h()) {
            this.f357z = null;
        }
        this.f347p = 3;
        return true;
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        int size = this.f335d.size();
        for (int i = 0; i < size; i++) {
            this.f335d.valueAt(i).m42330k();
        }
        this.f345n.clear();
        this.f353v = 0;
        this.f354w = j2;
        this.f344m.clear();
        m42359g();
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        while (true) {
            int i = this.f347p;
            if (i != 0) {
                if (i == 1) {
                    m42366L(gVar);
                } else if (i == 2) {
                    m42365M(gVar);
                } else if (m42364N(gVar)) {
                    return 0;
                }
            } else if (!m42367K(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f328E = hVar;
        m42359g();
        m42355l();
        C0111o oVar = this.f333b;
        if (oVar != null) {
            this.f335d.put(0, new C0100b(hVar.mo6039r(0, oVar.f418b), new C0114r(this.f333b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C0092c(0, 0, 0, 0)));
            this.f328E.mo6040m();
        }
    }

    public final void m42359g() {
        this.f347p = 0;
        this.f350s = 0;
    }

    public final C0092c m42358h(SparseArray<C0092c> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C0092c) C1186a.m38188e(sparseArray.get(i));
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        return C0110n.m42273b(gVar);
    }

    public final void m42355l() {
        int i;
        AbstractC8974t[] tVarArr = new AbstractC8974t[2];
        this.f329F = tVarArr;
        AbstractC8974t tVar = this.f346o;
        if (tVar != null) {
            tVarArr[0] = tVar;
            i = 1;
        } else {
            i = 0;
        }
        int i2 = 100;
        if ((this.f332a & 4) != 0) {
            i++;
            tVarArr[i] = this.f328E.mo6039r(100, 5);
            i2 = 101;
        }
        AbstractC8974t[] tVarArr2 = (AbstractC8974t[]) C1216l0.m37948u0(this.f329F, i);
        this.f329F = tVarArr2;
        for (AbstractC8974t tVar2 : tVarArr2) {
            tVar2.mo10797a(f323K);
        }
        this.f330G = new AbstractC8974t[this.f334c.size()];
        for (int i3 = 0; i3 < this.f330G.length; i3++) {
            i2++;
            AbstractC8974t r = this.f328E.mo6039r(i2, 3);
            r.mo10797a(this.f334c.get(i3));
            this.f330G[i3] = r;
        }
    }

    public C0111o m42353n(C0111o oVar) {
        return oVar;
    }

    public final void m42352o(AbstractC0082a.C0083a aVar) {
        int i = aVar.f279a;
        if (i == 1836019574) {
            m42348s(aVar);
        } else if (i == 1836019558) {
            m42349r(aVar);
        } else if (!this.f344m.isEmpty()) {
            this.f344m.peek().m42419d(aVar);
        }
    }

    public final void m42351p(C1189b0 b0Var) {
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        AbstractC8974t[] tVarArr;
        if (this.f329F.length != 0) {
            b0Var.m38147P(8);
            int c = AbstractC0082a.m42420c(b0Var.m38132n());
            if (c == 0) {
                str2 = (String) C1186a.m38188e(b0Var.m38122x());
                str = (String) C1186a.m38188e(b0Var.m38122x());
                long F = b0Var.m38157F();
                j4 = C1216l0.m37940y0(b0Var.m38157F(), 1000000L, F);
                long j5 = this.f356y;
                long j6 = j5 != -9223372036854775807L ? j5 + j4 : -9223372036854775807L;
                j2 = C1216l0.m37940y0(b0Var.m38157F(), 1000L, F);
                j = b0Var.m38157F();
                j3 = j6;
            } else if (c != 1) {
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Skipping unsupported emsg version: ");
                sb2.append(c);
                C1230s.m37884i("FragmentedMp4Extractor", sb2.toString());
                return;
            } else {
                long F2 = b0Var.m38157F();
                j3 = C1216l0.m37940y0(b0Var.m38154I(), 1000000L, F2);
                j2 = C1216l0.m37940y0(b0Var.m38157F(), 1000L, F2);
                long F3 = b0Var.m38157F();
                str2 = (String) C1186a.m38188e(b0Var.m38122x());
                str = (String) C1186a.m38188e(b0Var.m38122x());
                j = F3;
                j4 = -9223372036854775807L;
            }
            byte[] bArr = new byte[b0Var.m38145a()];
            b0Var.m38136j(bArr, 0, b0Var.m38145a());
            C1189b0 b0Var2 = new C1189b0(this.f342k.m24388a(new C4951a(str2, str, j2, j, bArr)));
            int a = b0Var2.m38145a();
            for (AbstractC8974t tVar : this.f329F) {
                b0Var2.m38147P(0);
                tVar.mo10795c(b0Var2, a);
            }
            if (j3 == -9223372036854775807L) {
                this.f345n.addLast(new C0099a(j4, a));
                this.f353v += a;
                return;
            }
            C1205i0 i0Var = this.f341j;
            if (i0Var != null) {
                j3 = i0Var.m38056a(j3);
            }
            for (AbstractC8974t tVar2 : this.f329F) {
                tVar2.mo10793e(j3, 1, a, 0, null);
            }
        }
    }

    public final void m42350q(AbstractC0082a.C0084b bVar, long j) {
        if (!this.f344m.isEmpty()) {
            this.f344m.peek().m42418e(bVar);
            return;
        }
        int i = bVar.f279a;
        if (i == 1936286840) {
            Pair<Long, C3464b> B = m42376B(bVar.f283b, j);
            this.f356y = ((Long) B.first).longValue();
            this.f328E.mo6042a((AbstractC3470g) B.second);
            this.f331H = true;
        } else if (i == 1701671783) {
            m42351p(bVar.f283b);
        }
    }

    public final void m42349r(AbstractC0082a.C0083a aVar) {
        m42345v(aVar, this.f335d, this.f333b != null, this.f332a, this.f339h);
        C8201m i = m42357i(aVar.f281c);
        if (i != null) {
            int size = this.f335d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f335d.valueAt(i2).m42327n(i);
            }
        }
        if (this.f354w != -9223372036854775807L) {
            int size2 = this.f335d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f335d.valueAt(i3).m42329l(this.f354w);
            }
            this.f354w = -9223372036854775807L;
        }
    }

    public final void m42348s(AbstractC0082a.C0083a aVar) {
        boolean z = true;
        int i = 0;
        C1186a.m38186g(this.f333b == null, "Unexpected moov box.");
        C8201m i2 = m42357i(aVar.f281c);
        AbstractC0082a.C0083a aVar2 = (AbstractC0082a.C0083a) C1186a.m38188e(aVar.m42417f(1836475768));
        SparseArray<C0092c> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = aVar2.f281c.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0082a.C0084b bVar = aVar2.f281c.get(i3);
            int i4 = bVar.f279a;
            if (i4 == 1953654136) {
                Pair<Integer, C0092c> F = m42372F(bVar.f283b);
                sparseArray.put(((Integer) F.first).intValue(), (C0092c) F.second);
            } else if (i4 == 1835362404) {
                j = m42346u(bVar.f283b);
            }
        }
        List<C0114r> A = C0085b.m42415A(aVar, new C8969o(), j, i2, (this.f332a & 16) != 0, false, new AbstractC10430f() {
            @Override
            public final Object apply(Object obj) {
                return C0098g.this.m42353n((C0111o) obj);
            }
        });
        int size2 = A.size();
        if (this.f335d.size() == 0) {
            while (i < size2) {
                C0114r rVar = A.get(i);
                C0111o oVar = rVar.f451a;
                this.f335d.put(oVar.f417a, new C0100b(this.f328E.mo6039r(i, oVar.f418b), rVar, m42358h(sparseArray, oVar.f417a)));
                this.f355x = Math.max(this.f355x, oVar.f421e);
                i++;
            }
            this.f328E.mo6040m();
            return;
        }
        if (this.f335d.size() != size2) {
            z = false;
        }
        C1186a.m38187f(z);
        while (i < size2) {
            C0114r rVar2 = A.get(i);
            C0111o oVar2 = rVar2.f451a;
            this.f335d.get(oVar2.f417a).m42331j(rVar2, m42358h(sparseArray, oVar2.f417a));
            i++;
        }
    }

    public final void m42347t(long j) {
        while (!this.f345n.isEmpty()) {
            C0099a removeFirst = this.f345n.removeFirst();
            this.f353v -= removeFirst.f359b;
            long j2 = removeFirst.f358a + j;
            C1205i0 i0Var = this.f341j;
            if (i0Var != null) {
                j2 = i0Var.m38056a(j2);
            }
            for (AbstractC8974t tVar : this.f329F) {
                tVar.mo10793e(j2, 1, removeFirst.f359b, this.f353v, null);
            }
        }
    }

    public C0098g(int i) {
        this(i, null);
    }

    public C0098g(int i, C1205i0 i0Var) {
        this(i, i0Var, null, Collections.emptyList());
    }

    public C0098g(int i, C1205i0 i0Var, C0111o oVar, List<C6600g1> list) {
        this(i, i0Var, oVar, list, null);
    }

    public C0098g(int i, C1205i0 i0Var, C0111o oVar, List<C6600g1> list, AbstractC8974t tVar) {
        this.f332a = i;
        this.f341j = i0Var;
        this.f333b = oVar;
        this.f334c = Collections.unmodifiableList(list);
        this.f346o = tVar;
        this.f342k = new C4954c();
        this.f343l = new C1189b0(16);
        this.f336e = new C1189b0(C1237x.f4572a);
        this.f337f = new C1189b0(5);
        this.f338g = new C1189b0();
        byte[] bArr = new byte[16];
        this.f339h = bArr;
        this.f340i = new C1189b0(bArr);
        this.f344m = new ArrayDeque<>();
        this.f345n = new ArrayDeque<>();
        this.f335d = new SparseArray<>();
        this.f355x = -9223372036854775807L;
        this.f354w = -9223372036854775807L;
        this.f356y = -9223372036854775807L;
        this.f328E = AbstractC8960h.f28851L;
        this.f329F = new AbstractC8974t[0];
        this.f330G = new AbstractC8974t[0];
    }
}
