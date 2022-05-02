package p187n4;

import android.os.Looper;
import org.thunderdog.challegram.Log;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0147h;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1234w;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p216p3.C8026g;
import p230q3.AbstractC8208o;
import p230q3.AbstractC8219w;
import p230q3.AbstractC8223y;
import p230q3.C8201m;
import p270t3.AbstractC8974t;
import p270t3.C8973s;

public class C7200k0 implements AbstractC8974t {
    public boolean f22913A;
    public C6600g1 f22914B;
    public C6600g1 f22915C;
    public int f22916D;
    public boolean f22917E;
    public boolean f22918F;
    public long f22919G;
    public boolean f22920H;
    public final C7194i0 f22921a;
    public final AbstractC8223y f22924d;
    public final AbstractC8219w.C8220a f22925e;
    public final Looper f22926f;
    public AbstractC7204d f22927g;
    public C6600g1 f22928h;
    public AbstractC8208o f22929i;
    public int f22937q;
    public int f22938r;
    public int f22939s;
    public int f22940t;
    public boolean f22944x;
    public final C7202b f22922b = new C7202b();
    public int f22930j = 1000;
    public int[] f22931k = new int[1000];
    public long[] f22932l = new long[1000];
    public long[] f22935o = new long[1000];
    public int[] f22934n = new int[1000];
    public int[] f22933m = new int[1000];
    public AbstractC8974t.C8975a[] f22936p = new AbstractC8974t.C8975a[1000];
    public final C7222p0<C7203c> f22923c = new C7222p0<>(C7197j0.f22907a);
    public long f22941u = Long.MIN_VALUE;
    public long f22942v = Long.MIN_VALUE;
    public long f22943w = Long.MIN_VALUE;
    public boolean f22946z = true;
    public boolean f22945y = true;

    public static final class C7202b {
        public int f22947a;
        public long f22948b;
        public AbstractC8974t.C8975a f22949c;
    }

    public static final class C7203c {
        public final C6600g1 f22950a;
        public final AbstractC8223y.AbstractC8225b f22951b;

        public C7203c(C6600g1 g1Var, AbstractC8223y.AbstractC8225b bVar) {
            this.f22950a = g1Var;
            this.f22951b = bVar;
        }
    }

    public interface AbstractC7204d {
        void mo17354n(C6600g1 g1Var);
    }

    public C7200k0(AbstractC0117b bVar, Looper looper, AbstractC8223y yVar, AbstractC8219w.C8220a aVar) {
        this.f22926f = looper;
        this.f22924d = yVar;
        this.f22925e = aVar;
        this.f22921a = new C7194i0(bVar);
    }

    public static void m17391E(C7203c cVar) {
        cVar.f22951b.mo13158a();
    }

    public static C7200k0 m17370k(AbstractC0117b bVar, Looper looper, AbstractC8223y yVar, AbstractC8219w.C8220a aVar) {
        return new C7200k0(bVar, (Looper) C1186a.m38188e(looper), (AbstractC8223y) C1186a.m38188e(yVar), (AbstractC8219w.C8220a) C1186a.m38188e(aVar));
    }

    public final int m17395A() {
        return this.f22938r + this.f22937q;
    }

    public final boolean m17394B() {
        return this.f22940t != this.f22937q;
    }

    public final synchronized boolean m17393C() {
        return this.f22944x;
    }

    public synchronized boolean m17392D(boolean z) {
        C6600g1 g1Var;
        boolean z2 = true;
        if (!m17394B()) {
            if (!z && !this.f22944x && ((g1Var = this.f22915C) == null || g1Var == this.f22928h)) {
                z2 = false;
            }
            return z2;
        } else if (this.f22923c.m17292e(m17358w()).f22950a != this.f22928h) {
            return true;
        } else {
            return m17390F(m17357x(this.f22940t));
        }
    }

    public final boolean m17390F(int i) {
        AbstractC8208o oVar = this.f22929i;
        return oVar == null || oVar.mo13198i() == 4 || ((this.f22934n[i] & Log.TAG_TDLIB_OPTIONS) == 0 && this.f22929i.mo13204c());
    }

    public void m17389G() {
        AbstractC8208o oVar = this.f22929i;
        if (oVar != null && oVar.mo13198i() == 1) {
            throw ((AbstractC8208o.C8209a) C1186a.m38188e(this.f22929i.mo13200g()));
        }
    }

    public final void m17388H(C6600g1 g1Var, C6612h1 h1Var) {
        C6600g1 g1Var2 = this.f22928h;
        boolean z = g1Var2 == null;
        C8201m mVar = z ? null : g1Var2.f20578X;
        this.f22928h = g1Var;
        C8201m mVar2 = g1Var.f20578X;
        AbstractC8223y yVar = this.f22924d;
        h1Var.f20668b = yVar != null ? g1Var.m19901c(yVar.mo13161c(g1Var)) : g1Var;
        h1Var.f20667a = this.f22929i;
        if (this.f22924d != null) {
            if (z || !C1216l0.m37985c(mVar, mVar2)) {
                AbstractC8208o oVar = this.f22929i;
                AbstractC8208o d = this.f22924d.mo13160d((Looper) C1186a.m38188e(this.f22926f), this.f22925e, g1Var);
                this.f22929i = d;
                h1Var.f20667a = d;
                if (oVar != null) {
                    oVar.mo13206a(this.f22925e);
                }
            }
        }
    }

    public final synchronized int m17387I(C6612h1 h1Var, C8026g gVar, boolean z, boolean z2, C7202b bVar) {
        gVar.f26128M = false;
        if (!m17394B()) {
            if (!z2 && !this.f22944x) {
                C6600g1 g1Var = this.f22915C;
                if (g1Var == null || (!z && g1Var == this.f22928h)) {
                    return -3;
                }
                m17388H((C6600g1) C1186a.m38188e(g1Var), h1Var);
                return -5;
            }
            gVar.setFlags(4);
            return -4;
        }
        C6600g1 g1Var2 = this.f22923c.m17292e(m17358w()).f22950a;
        if (!z && g1Var2 == this.f22928h) {
            int x = m17357x(this.f22940t);
            if (!m17390F(x)) {
                gVar.f26128M = true;
                return -3;
            }
            gVar.setFlags(this.f22934n[x]);
            long j = this.f22935o[x];
            gVar.f26129N = j;
            if (j < this.f22941u) {
                gVar.addFlag(Integer.MIN_VALUE);
            }
            bVar.f22947a = this.f22933m[x];
            bVar.f22948b = this.f22932l[x];
            bVar.f22949c = this.f22936p[x];
            return -4;
        }
        m17388H(g1Var2, h1Var);
        return -5;
    }

    public void m17386J() {
        m17365p();
        m17383M();
    }

    public int m17385K(C6612h1 h1Var, C8026g gVar, int i, boolean z) {
        boolean z2 = false;
        int I = m17387I(h1Var, gVar, (i & 2) != 0, z, this.f22922b);
        if (I == -4 && !gVar.isEndOfStream()) {
            if ((i & 1) != 0) {
                z2 = true;
            }
            if ((i & 4) == 0) {
                if (z2) {
                    this.f22921a.m17416e(gVar, this.f22922b);
                } else {
                    this.f22921a.m17409l(gVar, this.f22922b);
                }
            }
            if (!z2) {
                this.f22940t++;
            }
        }
        return I;
    }

    public void m17384L() {
        m17381O(true);
        m17383M();
    }

    public final void m17383M() {
        AbstractC8208o oVar = this.f22929i;
        if (oVar != null) {
            oVar.mo13206a(this.f22925e);
            this.f22929i = null;
            this.f22928h = null;
        }
    }

    public final void m17382N() {
        m17381O(false);
    }

    public void m17381O(boolean z) {
        this.f22921a.m17408m();
        this.f22937q = 0;
        this.f22938r = 0;
        this.f22939s = 0;
        this.f22940t = 0;
        this.f22945y = true;
        this.f22941u = Long.MIN_VALUE;
        this.f22942v = Long.MIN_VALUE;
        this.f22943w = Long.MIN_VALUE;
        this.f22944x = false;
        this.f22923c.m17295b();
        if (z) {
            this.f22914B = null;
            this.f22915C = null;
            this.f22946z = true;
        }
    }

    public final synchronized void m17380P() {
        this.f22940t = 0;
        this.f22921a.m17407n();
    }

    public final synchronized boolean m17379Q(long j, boolean z) {
        m17380P();
        int x = m17357x(this.f22940t);
        if (m17394B() && j >= this.f22935o[x] && (j <= this.f22943w || z)) {
            int r = m17363r(x, this.f22937q - this.f22940t, j, true);
            if (r == -1) {
                return false;
            }
            this.f22941u = j;
            this.f22940t += r;
            return true;
        }
        return false;
    }

    public final void m17378R(long j) {
        this.f22941u = j;
    }

    public final synchronized boolean m17377S(C6600g1 g1Var) {
        this.f22946z = false;
        if (C1216l0.m37985c(g1Var, this.f22915C)) {
            return false;
        }
        if (this.f22923c.m17290g() || !this.f22923c.m17291f().f22950a.equals(g1Var)) {
            this.f22915C = g1Var;
        } else {
            this.f22915C = this.f22923c.m17291f().f22950a;
        }
        C6600g1 g1Var2 = this.f22915C;
        this.f22917E = C1234w.m37873a(g1Var2.f20575U, g1Var2.f20572R);
        this.f22918F = false;
        return true;
    }

    public final void m17376T(AbstractC7204d dVar) {
        this.f22927g = dVar;
    }

    public final synchronized void m17375U(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f22940t + i <= this.f22937q) {
                    z = true;
                    C1186a.m38192a(z);
                    this.f22940t += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C1186a.m38192a(z);
        this.f22940t += i;
    }

    @Override
    public final void mo10797a(C6600g1 g1Var) {
        C6600g1 s = m17362s(g1Var);
        this.f22913A = false;
        this.f22914B = g1Var;
        boolean S = m17377S(s);
        AbstractC7204d dVar = this.f22927g;
        if (dVar != null && S) {
            dVar.mo17354n(s);
        }
    }

    @Override
    public final void mo10796b(C1189b0 b0Var, int i, int i2) {
        this.f22921a.m17405p(b0Var, i);
    }

    @Override
    public void mo10795c(C1189b0 b0Var, int i) {
        C8973s.m10798b(this, b0Var, i);
    }

    @Override
    public int mo10794d(AbstractC0147h hVar, int i, boolean z) {
        return C8973s.m10799a(this, hVar, i, z);
    }

    @Override
    public void mo10793e(long r12, int r14, int r15, int r16, p270t3.AbstractC8974t.C8975a r17) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7200k0.mo10793e(long, int, int, int, t3.t$a):void");
    }

    @Override
    public final int mo10792f(AbstractC0147h hVar, int i, boolean z, int i2) {
        return this.f22921a.m17406o(hVar, i, z);
    }

    public final synchronized boolean m17373h(long j) {
        boolean z = true;
        if (this.f22937q == 0) {
            if (j <= this.f22942v) {
                z = false;
            }
            return z;
        } else if (m17360u() >= j) {
            return false;
        } else {
            m17364q(this.f22938r + m17371j(j));
            return true;
        }
    }

    public final synchronized void m17372i(long j, int i, long j2, int i2, AbstractC8974t.C8975a aVar) {
        AbstractC8223y.AbstractC8225b bVar;
        int i3 = this.f22937q;
        if (i3 > 0) {
            int x = m17357x(i3 - 1);
            C1186a.m38192a(this.f22932l[x] + ((long) this.f22933m[x]) <= j2);
        }
        this.f22944x = (536870912 & i) != 0;
        this.f22943w = Math.max(this.f22943w, j);
        int x2 = m17357x(this.f22937q);
        this.f22935o[x2] = j;
        this.f22932l[x2] = j2;
        this.f22933m[x2] = i2;
        this.f22934n[x2] = i;
        this.f22936p[x2] = aVar;
        this.f22931k[x2] = this.f22916D;
        if (this.f22923c.m17290g() || !this.f22923c.m17291f().f22950a.equals(this.f22915C)) {
            AbstractC8223y yVar = this.f22924d;
            if (yVar != null) {
                bVar = yVar.mo13159e((Looper) C1186a.m38188e(this.f22926f), this.f22925e, this.f22915C);
            } else {
                bVar = AbstractC8223y.AbstractC8225b.f26596a;
            }
            this.f22923c.m17296a(m17395A(), new C7203c((C6600g1) C1186a.m38188e(this.f22915C), bVar));
        }
        int i4 = this.f22937q + 1;
        this.f22937q = i4;
        int i5 = this.f22930j;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            AbstractC8974t.C8975a[] aVarArr = new AbstractC8974t.C8975a[i6];
            int i7 = this.f22939s;
            int i8 = i5 - i7;
            System.arraycopy(this.f22932l, i7, jArr, 0, i8);
            System.arraycopy(this.f22935o, this.f22939s, jArr2, 0, i8);
            System.arraycopy(this.f22934n, this.f22939s, iArr2, 0, i8);
            System.arraycopy(this.f22933m, this.f22939s, iArr3, 0, i8);
            System.arraycopy(this.f22936p, this.f22939s, aVarArr, 0, i8);
            System.arraycopy(this.f22931k, this.f22939s, iArr, 0, i8);
            int i9 = this.f22939s;
            System.arraycopy(this.f22932l, 0, jArr, i8, i9);
            System.arraycopy(this.f22935o, 0, jArr2, i8, i9);
            System.arraycopy(this.f22934n, 0, iArr2, i8, i9);
            System.arraycopy(this.f22933m, 0, iArr3, i8, i9);
            System.arraycopy(this.f22936p, 0, aVarArr, i8, i9);
            System.arraycopy(this.f22931k, 0, iArr, i8, i9);
            this.f22932l = jArr;
            this.f22935o = jArr2;
            this.f22934n = iArr2;
            this.f22933m = iArr3;
            this.f22936p = aVarArr;
            this.f22931k = iArr;
            this.f22939s = 0;
            this.f22930j = i6;
        }
    }

    public final int m17371j(long j) {
        int i = this.f22937q;
        int x = m17357x(i - 1);
        while (i > this.f22940t && this.f22935o[x] >= j) {
            i--;
            x--;
            if (x == -1) {
                x = this.f22930j - 1;
            }
        }
        return i;
    }

    public final synchronized long m17369l(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f22937q;
        if (i2 != 0) {
            long[] jArr = this.f22935o;
            int i3 = this.f22939s;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f22940t) != i2) {
                    i2 = i + 1;
                }
                int r = m17363r(i3, i2, j, z);
                if (r == -1) {
                    return -1L;
                }
                return m17367n(r);
            }
        }
        return -1L;
    }

    public final synchronized long m17368m() {
        int i = this.f22937q;
        if (i == 0) {
            return -1L;
        }
        return m17367n(i);
    }

    public final long m17367n(int i) {
        int i2;
        this.f22942v = Math.max(this.f22942v, m17359v(i));
        this.f22937q -= i;
        int i3 = this.f22938r + i;
        this.f22938r = i3;
        int i4 = this.f22939s + i;
        this.f22939s = i4;
        int i5 = this.f22930j;
        if (i4 >= i5) {
            this.f22939s = i4 - i5;
        }
        int i6 = this.f22940t - i;
        this.f22940t = i6;
        if (i6 < 0) {
            this.f22940t = 0;
        }
        this.f22923c.m17293d(i3);
        if (this.f22937q != 0) {
            return this.f22932l[this.f22939s];
        }
        int i7 = this.f22939s;
        if (i7 == 0) {
            i7 = this.f22930j;
        }
        return this.f22932l[i7 - 1] + this.f22933m[i2];
    }

    public final void m17366o(long j, boolean z, boolean z2) {
        this.f22921a.m17419b(m17369l(j, z, z2));
    }

    public final void m17365p() {
        this.f22921a.m17419b(m17368m());
    }

    public final long m17364q(int i) {
        int A = m17395A() - i;
        boolean z = false;
        C1186a.m38192a(A >= 0 && A <= this.f22937q - this.f22940t);
        int i2 = this.f22937q - A;
        this.f22937q = i2;
        this.f22943w = Math.max(this.f22942v, m17359v(i2));
        if (A == 0 && this.f22944x) {
            z = true;
        }
        this.f22944x = z;
        this.f22923c.m17294c(i);
        int i3 = this.f22937q;
        if (i3 == 0) {
            return 0L;
        }
        int x = m17357x(i3 - 1);
        return this.f22932l[x] + this.f22933m[x];
    }

    public final int m17363r(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr = this.f22935o;
            if (jArr[i] > j) {
                return i3;
            }
            if (!z || (this.f22934n[i] & 1) != 0) {
                if (jArr[i] == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f22930j) {
                i = 0;
            }
        }
        return i3;
    }

    public C6600g1 m17362s(C6600g1 g1Var) {
        return (this.f22919G == 0 || g1Var.f20579Y == Long.MAX_VALUE) ? g1Var : g1Var.m19902b().m19851i0(g1Var.f20579Y + this.f22919G).m19890E();
    }

    public final synchronized long m17361t() {
        return this.f22943w;
    }

    public final synchronized long m17360u() {
        return Math.max(this.f22942v, m17359v(this.f22940t));
    }

    public final long m17359v(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int x = m17357x(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f22935o[x]);
            if ((this.f22934n[x] & 1) != 0) {
                break;
            }
            x--;
            if (x == -1) {
                x = this.f22930j - 1;
            }
        }
        return j;
    }

    public final int m17358w() {
        return this.f22938r + this.f22940t;
    }

    public final int m17357x(int i) {
        int i2 = this.f22939s + i;
        int i3 = this.f22930j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int m17356y(long j, boolean z) {
        int x = m17357x(this.f22940t);
        if (m17394B() && j >= this.f22935o[x]) {
            if (j <= this.f22943w || !z) {
                int r = m17363r(x, this.f22937q - this.f22940t, j, true);
                if (r == -1) {
                    return 0;
                }
                return r;
            }
            return this.f22937q - this.f22940t;
        }
        return 0;
    }

    public final synchronized C6600g1 m17355z() {
        return this.f22946z ? null : this.f22915C;
    }
}
