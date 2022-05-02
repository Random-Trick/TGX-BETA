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
    public boolean f22910A;
    public C6600g1 f22911B;
    public C6600g1 f22912C;
    public int f22913D;
    public boolean f22914E;
    public boolean f22915F;
    public long f22916G;
    public boolean f22917H;
    public final C7194i0 f22918a;
    public final AbstractC8223y f22921d;
    public final AbstractC8219w.C8220a f22922e;
    public final Looper f22923f;
    public AbstractC7204d f22924g;
    public C6600g1 f22925h;
    public AbstractC8208o f22926i;
    public int f22934q;
    public int f22935r;
    public int f22936s;
    public int f22937t;
    public boolean f22941x;
    public final C7202b f22919b = new C7202b();
    public int f22927j = 1000;
    public int[] f22928k = new int[1000];
    public long[] f22929l = new long[1000];
    public long[] f22932o = new long[1000];
    public int[] f22931n = new int[1000];
    public int[] f22930m = new int[1000];
    public AbstractC8974t.C8975a[] f22933p = new AbstractC8974t.C8975a[1000];
    public final C7222p0<C7203c> f22920c = new C7222p0<>(C7197j0.f22904a);
    public long f22938u = Long.MIN_VALUE;
    public long f22939v = Long.MIN_VALUE;
    public long f22940w = Long.MIN_VALUE;
    public boolean f22943z = true;
    public boolean f22942y = true;

    public static final class C7202b {
        public int f22944a;
        public long f22945b;
        public AbstractC8974t.C8975a f22946c;
    }

    public static final class C7203c {
        public final C6600g1 f22947a;
        public final AbstractC8223y.AbstractC8225b f22948b;

        public C7203c(C6600g1 g1Var, AbstractC8223y.AbstractC8225b bVar) {
            this.f22947a = g1Var;
            this.f22948b = bVar;
        }
    }

    public interface AbstractC7204d {
        void mo17354n(C6600g1 g1Var);
    }

    public C7200k0(AbstractC0117b bVar, Looper looper, AbstractC8223y yVar, AbstractC8219w.C8220a aVar) {
        this.f22923f = looper;
        this.f22921d = yVar;
        this.f22922e = aVar;
        this.f22918a = new C7194i0(bVar);
    }

    public static void m17391E(C7203c cVar) {
        cVar.f22948b.mo13159a();
    }

    public static C7200k0 m17370k(AbstractC0117b bVar, Looper looper, AbstractC8223y yVar, AbstractC8219w.C8220a aVar) {
        return new C7200k0(bVar, (Looper) C1186a.m38185e(looper), (AbstractC8223y) C1186a.m38185e(yVar), (AbstractC8219w.C8220a) C1186a.m38185e(aVar));
    }

    public final int m17395A() {
        return this.f22935r + this.f22934q;
    }

    public final boolean m17394B() {
        return this.f22937t != this.f22934q;
    }

    public final synchronized boolean m17393C() {
        return this.f22941x;
    }

    public synchronized boolean m17392D(boolean z) {
        C6600g1 g1Var;
        boolean z2 = true;
        if (!m17394B()) {
            if (!z && !this.f22941x && ((g1Var = this.f22912C) == null || g1Var == this.f22925h)) {
                z2 = false;
            }
            return z2;
        } else if (this.f22920c.m17292e(m17358w()).f22947a != this.f22925h) {
            return true;
        } else {
            return m17390F(m17357x(this.f22937t));
        }
    }

    public final boolean m17390F(int i) {
        AbstractC8208o oVar = this.f22926i;
        return oVar == null || oVar.mo13199i() == 4 || ((this.f22931n[i] & Log.TAG_TDLIB_OPTIONS) == 0 && this.f22926i.mo13205c());
    }

    public void m17389G() {
        AbstractC8208o oVar = this.f22926i;
        if (oVar != null && oVar.mo13199i() == 1) {
            throw ((AbstractC8208o.C8209a) C1186a.m38185e(this.f22926i.mo13201g()));
        }
    }

    public final void m17388H(C6600g1 g1Var, C6612h1 h1Var) {
        C6600g1 g1Var2 = this.f22925h;
        boolean z = g1Var2 == null;
        C8201m mVar = z ? null : g1Var2.f20578X;
        this.f22925h = g1Var;
        C8201m mVar2 = g1Var.f20578X;
        AbstractC8223y yVar = this.f22921d;
        h1Var.f20668b = yVar != null ? g1Var.m19900c(yVar.mo13162c(g1Var)) : g1Var;
        h1Var.f20667a = this.f22926i;
        if (this.f22921d != null) {
            if (z || !C1216l0.m37982c(mVar, mVar2)) {
                AbstractC8208o oVar = this.f22926i;
                AbstractC8208o d = this.f22921d.mo13161d((Looper) C1186a.m38185e(this.f22923f), this.f22922e, g1Var);
                this.f22926i = d;
                h1Var.f20667a = d;
                if (oVar != null) {
                    oVar.mo13207a(this.f22922e);
                }
            }
        }
    }

    public final synchronized int m17387I(C6612h1 h1Var, C8026g gVar, boolean z, boolean z2, C7202b bVar) {
        gVar.f26125M = false;
        if (!m17394B()) {
            if (!z2 && !this.f22941x) {
                C6600g1 g1Var = this.f22912C;
                if (g1Var == null || (!z && g1Var == this.f22925h)) {
                    return -3;
                }
                m17388H((C6600g1) C1186a.m38185e(g1Var), h1Var);
                return -5;
            }
            gVar.setFlags(4);
            return -4;
        }
        C6600g1 g1Var2 = this.f22920c.m17292e(m17358w()).f22947a;
        if (!z && g1Var2 == this.f22925h) {
            int x = m17357x(this.f22937t);
            if (!m17390F(x)) {
                gVar.f26125M = true;
                return -3;
            }
            gVar.setFlags(this.f22931n[x]);
            long j = this.f22932o[x];
            gVar.f26126N = j;
            if (j < this.f22938u) {
                gVar.addFlag(Integer.MIN_VALUE);
            }
            bVar.f22944a = this.f22930m[x];
            bVar.f22945b = this.f22929l[x];
            bVar.f22946c = this.f22933p[x];
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
        int I = m17387I(h1Var, gVar, (i & 2) != 0, z, this.f22919b);
        if (I == -4 && !gVar.isEndOfStream()) {
            if ((i & 1) != 0) {
                z2 = true;
            }
            if ((i & 4) == 0) {
                if (z2) {
                    this.f22918a.m17416e(gVar, this.f22919b);
                } else {
                    this.f22918a.m17409l(gVar, this.f22919b);
                }
            }
            if (!z2) {
                this.f22937t++;
            }
        }
        return I;
    }

    public void m17384L() {
        m17381O(true);
        m17383M();
    }

    public final void m17383M() {
        AbstractC8208o oVar = this.f22926i;
        if (oVar != null) {
            oVar.mo13207a(this.f22922e);
            this.f22926i = null;
            this.f22925h = null;
        }
    }

    public final void m17382N() {
        m17381O(false);
    }

    public void m17381O(boolean z) {
        this.f22918a.m17408m();
        this.f22934q = 0;
        this.f22935r = 0;
        this.f22936s = 0;
        this.f22937t = 0;
        this.f22942y = true;
        this.f22938u = Long.MIN_VALUE;
        this.f22939v = Long.MIN_VALUE;
        this.f22940w = Long.MIN_VALUE;
        this.f22941x = false;
        this.f22920c.m17295b();
        if (z) {
            this.f22911B = null;
            this.f22912C = null;
            this.f22943z = true;
        }
    }

    public final synchronized void m17380P() {
        this.f22937t = 0;
        this.f22918a.m17407n();
    }

    public final synchronized boolean m17379Q(long j, boolean z) {
        m17380P();
        int x = m17357x(this.f22937t);
        if (m17394B() && j >= this.f22932o[x] && (j <= this.f22940w || z)) {
            int r = m17363r(x, this.f22934q - this.f22937t, j, true);
            if (r == -1) {
                return false;
            }
            this.f22938u = j;
            this.f22937t += r;
            return true;
        }
        return false;
    }

    public final void m17378R(long j) {
        this.f22938u = j;
    }

    public final synchronized boolean m17377S(C6600g1 g1Var) {
        this.f22943z = false;
        if (C1216l0.m37982c(g1Var, this.f22912C)) {
            return false;
        }
        if (this.f22920c.m17290g() || !this.f22920c.m17291f().f22947a.equals(g1Var)) {
            this.f22912C = g1Var;
        } else {
            this.f22912C = this.f22920c.m17291f().f22947a;
        }
        C6600g1 g1Var2 = this.f22912C;
        this.f22914E = C1234w.m37870a(g1Var2.f20575U, g1Var2.f20572R);
        this.f22915F = false;
        return true;
    }

    public final void m17376T(AbstractC7204d dVar) {
        this.f22924g = dVar;
    }

    public final synchronized void m17375U(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f22937t + i <= this.f22934q) {
                    z = true;
                    C1186a.m38189a(z);
                    this.f22937t += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C1186a.m38189a(z);
        this.f22937t += i;
    }

    @Override
    public final void mo10798a(C6600g1 g1Var) {
        C6600g1 s = m17362s(g1Var);
        this.f22910A = false;
        this.f22911B = g1Var;
        boolean S = m17377S(s);
        AbstractC7204d dVar = this.f22924g;
        if (dVar != null && S) {
            dVar.mo17354n(s);
        }
    }

    @Override
    public final void mo10797b(C1189b0 b0Var, int i, int i2) {
        this.f22918a.m17405p(b0Var, i);
    }

    @Override
    public void mo10796c(C1189b0 b0Var, int i) {
        C8973s.m10799b(this, b0Var, i);
    }

    @Override
    public int mo10795d(AbstractC0147h hVar, int i, boolean z) {
        return C8973s.m10800a(this, hVar, i, z);
    }

    @Override
    public void mo10794e(long r12, int r14, int r15, int r16, p270t3.AbstractC8974t.C8975a r17) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7200k0.mo10794e(long, int, int, int, t3.t$a):void");
    }

    @Override
    public final int mo10793f(AbstractC0147h hVar, int i, boolean z, int i2) {
        return this.f22918a.m17406o(hVar, i, z);
    }

    public final synchronized boolean m17373h(long j) {
        boolean z = true;
        if (this.f22934q == 0) {
            if (j <= this.f22939v) {
                z = false;
            }
            return z;
        } else if (m17360u() >= j) {
            return false;
        } else {
            m17364q(this.f22935r + m17371j(j));
            return true;
        }
    }

    public final synchronized void m17372i(long j, int i, long j2, int i2, AbstractC8974t.C8975a aVar) {
        AbstractC8223y.AbstractC8225b bVar;
        int i3 = this.f22934q;
        if (i3 > 0) {
            int x = m17357x(i3 - 1);
            C1186a.m38189a(this.f22929l[x] + ((long) this.f22930m[x]) <= j2);
        }
        this.f22941x = (536870912 & i) != 0;
        this.f22940w = Math.max(this.f22940w, j);
        int x2 = m17357x(this.f22934q);
        this.f22932o[x2] = j;
        this.f22929l[x2] = j2;
        this.f22930m[x2] = i2;
        this.f22931n[x2] = i;
        this.f22933p[x2] = aVar;
        this.f22928k[x2] = this.f22913D;
        if (this.f22920c.m17290g() || !this.f22920c.m17291f().f22947a.equals(this.f22912C)) {
            AbstractC8223y yVar = this.f22921d;
            if (yVar != null) {
                bVar = yVar.mo13160e((Looper) C1186a.m38185e(this.f22923f), this.f22922e, this.f22912C);
            } else {
                bVar = AbstractC8223y.AbstractC8225b.f26593a;
            }
            this.f22920c.m17296a(m17395A(), new C7203c((C6600g1) C1186a.m38185e(this.f22912C), bVar));
        }
        int i4 = this.f22934q + 1;
        this.f22934q = i4;
        int i5 = this.f22927j;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            AbstractC8974t.C8975a[] aVarArr = new AbstractC8974t.C8975a[i6];
            int i7 = this.f22936s;
            int i8 = i5 - i7;
            System.arraycopy(this.f22929l, i7, jArr, 0, i8);
            System.arraycopy(this.f22932o, this.f22936s, jArr2, 0, i8);
            System.arraycopy(this.f22931n, this.f22936s, iArr2, 0, i8);
            System.arraycopy(this.f22930m, this.f22936s, iArr3, 0, i8);
            System.arraycopy(this.f22933p, this.f22936s, aVarArr, 0, i8);
            System.arraycopy(this.f22928k, this.f22936s, iArr, 0, i8);
            int i9 = this.f22936s;
            System.arraycopy(this.f22929l, 0, jArr, i8, i9);
            System.arraycopy(this.f22932o, 0, jArr2, i8, i9);
            System.arraycopy(this.f22931n, 0, iArr2, i8, i9);
            System.arraycopy(this.f22930m, 0, iArr3, i8, i9);
            System.arraycopy(this.f22933p, 0, aVarArr, i8, i9);
            System.arraycopy(this.f22928k, 0, iArr, i8, i9);
            this.f22929l = jArr;
            this.f22932o = jArr2;
            this.f22931n = iArr2;
            this.f22930m = iArr3;
            this.f22933p = aVarArr;
            this.f22928k = iArr;
            this.f22936s = 0;
            this.f22927j = i6;
        }
    }

    public final int m17371j(long j) {
        int i = this.f22934q;
        int x = m17357x(i - 1);
        while (i > this.f22937t && this.f22932o[x] >= j) {
            i--;
            x--;
            if (x == -1) {
                x = this.f22927j - 1;
            }
        }
        return i;
    }

    public final synchronized long m17369l(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f22934q;
        if (i2 != 0) {
            long[] jArr = this.f22932o;
            int i3 = this.f22936s;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f22937t) != i2) {
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
        int i = this.f22934q;
        if (i == 0) {
            return -1L;
        }
        return m17367n(i);
    }

    public final long m17367n(int i) {
        int i2;
        this.f22939v = Math.max(this.f22939v, m17359v(i));
        this.f22934q -= i;
        int i3 = this.f22935r + i;
        this.f22935r = i3;
        int i4 = this.f22936s + i;
        this.f22936s = i4;
        int i5 = this.f22927j;
        if (i4 >= i5) {
            this.f22936s = i4 - i5;
        }
        int i6 = this.f22937t - i;
        this.f22937t = i6;
        if (i6 < 0) {
            this.f22937t = 0;
        }
        this.f22920c.m17293d(i3);
        if (this.f22934q != 0) {
            return this.f22929l[this.f22936s];
        }
        int i7 = this.f22936s;
        if (i7 == 0) {
            i7 = this.f22927j;
        }
        return this.f22929l[i7 - 1] + this.f22930m[i2];
    }

    public final void m17366o(long j, boolean z, boolean z2) {
        this.f22918a.m17419b(m17369l(j, z, z2));
    }

    public final void m17365p() {
        this.f22918a.m17419b(m17368m());
    }

    public final long m17364q(int i) {
        int A = m17395A() - i;
        boolean z = false;
        C1186a.m38189a(A >= 0 && A <= this.f22934q - this.f22937t);
        int i2 = this.f22934q - A;
        this.f22934q = i2;
        this.f22940w = Math.max(this.f22939v, m17359v(i2));
        if (A == 0 && this.f22941x) {
            z = true;
        }
        this.f22941x = z;
        this.f22920c.m17294c(i);
        int i3 = this.f22934q;
        if (i3 == 0) {
            return 0L;
        }
        int x = m17357x(i3 - 1);
        return this.f22929l[x] + this.f22930m[x];
    }

    public final int m17363r(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr = this.f22932o;
            if (jArr[i] > j) {
                return i3;
            }
            if (!z || (this.f22931n[i] & 1) != 0) {
                if (jArr[i] == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f22927j) {
                i = 0;
            }
        }
        return i3;
    }

    public C6600g1 m17362s(C6600g1 g1Var) {
        return (this.f22916G == 0 || g1Var.f20579Y == Long.MAX_VALUE) ? g1Var : g1Var.m19901b().m19850i0(g1Var.f20579Y + this.f22916G).m19889E();
    }

    public final synchronized long m17361t() {
        return this.f22940w;
    }

    public final synchronized long m17360u() {
        return Math.max(this.f22939v, m17359v(this.f22937t));
    }

    public final long m17359v(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int x = m17357x(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f22932o[x]);
            if ((this.f22931n[x] & 1) != 0) {
                break;
            }
            x--;
            if (x == -1) {
                x = this.f22927j - 1;
            }
        }
        return j;
    }

    public final int m17358w() {
        return this.f22935r + this.f22937t;
    }

    public final int m17357x(int i) {
        int i2 = this.f22936s + i;
        int i3 = this.f22927j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int m17356y(long j, boolean z) {
        int x = m17357x(this.f22937t);
        if (m17394B() && j >= this.f22932o[x]) {
            if (j <= this.f22940w || !z) {
                int r = m17363r(x, this.f22934q - this.f22937t, j, true);
                if (r == -1) {
                    return 0;
                }
                return r;
            }
            return this.f22934q - this.f22937t;
        }
        return 0;
    }

    public final synchronized C6600g1 m17355z() {
        return this.f22943z ? null : this.f22912C;
    }
}
