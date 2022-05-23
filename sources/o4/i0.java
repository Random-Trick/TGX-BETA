package o4;

import b5.h;
import c5.b0;
import c5.l0;
import m3.q1;
import m3.r1;
import org.thunderdog.challegram.Log;
import p3.g;
import q3.m;
import q3.o;
import q3.w;
import q3.y;
import t3.s;
import t3.t;

public class i0 implements t {
    public q1 A;
    public q1 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final g0 f19089a;
    public final y f19092d;
    public final w.a f19093e;
    public d f19094f;
    public q1 f19095g;
    public o f19096h;
    public int f19104p;
    public int f19105q;
    public int f19106r;
    public int f19107s;
    public boolean f19111w;
    public boolean f19114z;
    public final b f19090b = new b();
    public int f19097i = 1000;
    public int[] f19098j = new int[1000];
    public long[] f19099k = new long[1000];
    public long[] f19102n = new long[1000];
    public int[] f19101m = new int[1000];
    public int[] f19100l = new int[1000];
    public t.a[] f19103o = new t.a[1000];
    public final n0<c> f19091c = new n0<>(h0.f19087a);
    public long f19108t = Long.MIN_VALUE;
    public long f19109u = Long.MIN_VALUE;
    public long f19110v = Long.MIN_VALUE;
    public boolean f19113y = true;
    public boolean f19112x = true;

    public static final class b {
        public int f19115a;
        public long f19116b;
        public t.a f19117c;
    }

    public static final class c {
        public final q1 f19118a;
        public final y.b f19119b;

        public c(q1 q1Var, y.b bVar) {
            this.f19118a = q1Var;
            this.f19119b = bVar;
        }
    }

    public interface d {
        void m(q1 q1Var);
    }

    public i0(b5.b bVar, y yVar, w.a aVar) {
        this.f19092d = yVar;
        this.f19093e = aVar;
        this.f19089a = new g0(bVar);
    }

    public static void E(c cVar) {
        cVar.f19119b.a();
    }

    public static i0 k(b5.b bVar, y yVar, w.a aVar) {
        return new i0(bVar, (y) c5.a.e(yVar), (w.a) c5.a.e(aVar));
    }

    public final int A() {
        return this.f19105q + this.f19104p;
    }

    public final boolean B() {
        return this.f19107s != this.f19104p;
    }

    public final synchronized boolean C() {
        return this.f19111w;
    }

    public synchronized boolean D(boolean z10) {
        q1 q1Var;
        boolean z11 = true;
        if (!B()) {
            if (!z10 && !this.f19111w && ((q1Var = this.B) == null || q1Var == this.f19095g)) {
                z11 = false;
            }
            return z11;
        } else if (this.f19091c.e(w()).f19118a != this.f19095g) {
            return true;
        } else {
            return F(x(this.f19107s));
        }
    }

    public final boolean F(int i10) {
        o oVar = this.f19096h;
        return oVar == null || oVar.i() == 4 || ((this.f19101m[i10] & Log.TAG_TDLIB_OPTIONS) == 0 && this.f19096h.c());
    }

    public void G() {
        o oVar = this.f19096h;
        if (oVar != null && oVar.i() == 1) {
            throw ((o.a) c5.a.e(this.f19096h.g()));
        }
    }

    public final void H(q1 q1Var, r1 r1Var) {
        q1 q1Var2 = this.f19095g;
        boolean z10 = q1Var2 == null;
        m mVar = z10 ? null : q1Var2.X;
        this.f19095g = q1Var;
        m mVar2 = q1Var.X;
        y yVar = this.f19092d;
        r1Var.f16947b = yVar != null ? q1Var.c(yVar.d(q1Var)) : q1Var;
        r1Var.f16946a = this.f19096h;
        if (this.f19092d != null) {
            if (z10 || !l0.c(mVar, mVar2)) {
                o oVar = this.f19096h;
                o e10 = this.f19092d.e(this.f19093e, q1Var);
                this.f19096h = e10;
                r1Var.f16946a = e10;
                if (oVar != null) {
                    oVar.a(this.f19093e);
                }
            }
        }
    }

    public final synchronized int I(r1 r1Var, g gVar, boolean z10, boolean z11, b bVar) {
        gVar.M = false;
        if (!B()) {
            if (!z11 && !this.f19111w) {
                q1 q1Var = this.B;
                if (q1Var == null || (!z10 && q1Var == this.f19095g)) {
                    return -3;
                }
                H((q1) c5.a.e(q1Var), r1Var);
                return -5;
            }
            gVar.setFlags(4);
            return -4;
        }
        q1 q1Var2 = this.f19091c.e(w()).f19118a;
        if (!z10 && q1Var2 == this.f19095g) {
            int x10 = x(this.f19107s);
            if (!F(x10)) {
                gVar.M = true;
                return -3;
            }
            gVar.setFlags(this.f19101m[x10]);
            long j10 = this.f19102n[x10];
            gVar.N = j10;
            if (j10 < this.f19108t) {
                gVar.addFlag(Integer.MIN_VALUE);
            }
            bVar.f19115a = this.f19100l[x10];
            bVar.f19116b = this.f19099k[x10];
            bVar.f19117c = this.f19103o[x10];
            return -4;
        }
        H(q1Var2, r1Var);
        return -5;
    }

    public void J() {
        p();
        M();
    }

    public int K(r1 r1Var, g gVar, int i10, boolean z10) {
        boolean z11 = false;
        int I = I(r1Var, gVar, (i10 & 2) != 0, z10, this.f19090b);
        if (I == -4 && !gVar.isEndOfStream()) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f19089a.e(gVar, this.f19090b);
                } else {
                    this.f19089a.l(gVar, this.f19090b);
                }
            }
            if (!z11) {
                this.f19107s++;
            }
        }
        return I;
    }

    public void L() {
        O(true);
        M();
    }

    public final void M() {
        o oVar = this.f19096h;
        if (oVar != null) {
            oVar.a(this.f19093e);
            this.f19096h = null;
            this.f19095g = null;
        }
    }

    public final void N() {
        O(false);
    }

    public void O(boolean z10) {
        this.f19089a.m();
        this.f19104p = 0;
        this.f19105q = 0;
        this.f19106r = 0;
        this.f19107s = 0;
        this.f19112x = true;
        this.f19108t = Long.MIN_VALUE;
        this.f19109u = Long.MIN_VALUE;
        this.f19110v = Long.MIN_VALUE;
        this.f19111w = false;
        this.f19091c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f19113y = true;
        }
    }

    public final synchronized void P() {
        this.f19107s = 0;
        this.f19089a.n();
    }

    public final synchronized boolean Q(long j10, boolean z10) {
        P();
        int x10 = x(this.f19107s);
        if (B() && j10 >= this.f19102n[x10] && (j10 <= this.f19110v || z10)) {
            int r10 = r(x10, this.f19104p - this.f19107s, j10, true);
            if (r10 == -1) {
                return false;
            }
            this.f19108t = j10;
            this.f19107s += r10;
            return true;
        }
        return false;
    }

    public final void R(long j10) {
        this.f19108t = j10;
    }

    public final synchronized boolean S(q1 q1Var) {
        this.f19113y = false;
        if (l0.c(q1Var, this.B)) {
            return false;
        }
        if (this.f19091c.g() || !this.f19091c.f().f19118a.equals(q1Var)) {
            this.B = q1Var;
        } else {
            this.B = this.f19091c.f().f19118a;
        }
        q1 q1Var2 = this.B;
        this.D = c5.w.a(q1Var2.U, q1Var2.R);
        this.E = false;
        return true;
    }

    public final void T(d dVar) {
        this.f19094f = dVar;
    }

    public final synchronized void U(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f19107s + i10 <= this.f19104p) {
                    z10 = true;
                    c5.a.a(z10);
                    this.f19107s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        c5.a.a(z10);
        this.f19107s += i10;
    }

    @Override
    public final void a(q1 q1Var) {
        q1 s10 = s(q1Var);
        this.f19114z = false;
        this.A = q1Var;
        boolean S = S(s10);
        d dVar = this.f19094f;
        if (dVar != null && S) {
            dVar.m(s10);
        }
    }

    @Override
    public int b(h hVar, int i10, boolean z10) {
        return s.a(this, hVar, i10, z10);
    }

    @Override
    public final int c(h hVar, int i10, boolean z10, int i11) {
        return this.f19089a.o(hVar, i10, z10);
    }

    @Override
    public void d(b0 b0Var, int i10) {
        s.b(this, b0Var, i10);
    }

    @Override
    public final void e(b0 b0Var, int i10, int i11) {
        this.f19089a.p(b0Var, i10);
    }

    @Override
    public void f(long r12, int r14, int r15, int r16, t3.t.a r17) {
        throw new UnsupportedOperationException("Method not decompiled: o4.i0.f(long, int, int, int, t3.t$a):void");
    }

    public final synchronized boolean h(long j10) {
        boolean z10 = true;
        if (this.f19104p == 0) {
            if (j10 <= this.f19109u) {
                z10 = false;
            }
            return z10;
        } else if (u() >= j10) {
            return false;
        } else {
            q(this.f19105q + j(j10));
            return true;
        }
    }

    public final synchronized void i(long j10, int i10, long j11, int i11, t.a aVar) {
        y.b bVar;
        int i12 = this.f19104p;
        if (i12 > 0) {
            int x10 = x(i12 - 1);
            c5.a.a(this.f19099k[x10] + ((long) this.f19100l[x10]) <= j11);
        }
        this.f19111w = (536870912 & i10) != 0;
        this.f19110v = Math.max(this.f19110v, j10);
        int x11 = x(this.f19104p);
        this.f19102n[x11] = j10;
        this.f19099k[x11] = j11;
        this.f19100l[x11] = i11;
        this.f19101m[x11] = i10;
        this.f19103o[x11] = aVar;
        this.f19098j[x11] = this.C;
        if (this.f19091c.g() || !this.f19091c.f().f19118a.equals(this.B)) {
            y yVar = this.f19092d;
            if (yVar != null) {
                bVar = yVar.f(this.f19093e, this.B);
            } else {
                bVar = y.b.f21374a;
            }
            this.f19091c.a(A(), new c((q1) c5.a.e(this.B), bVar));
        }
        int i13 = this.f19104p + 1;
        this.f19104p = i13;
        int i14 = this.f19097i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            t.a[] aVarArr = new t.a[i15];
            int i16 = this.f19106r;
            int i17 = i14 - i16;
            System.arraycopy(this.f19099k, i16, jArr, 0, i17);
            System.arraycopy(this.f19102n, this.f19106r, jArr2, 0, i17);
            System.arraycopy(this.f19101m, this.f19106r, iArr2, 0, i17);
            System.arraycopy(this.f19100l, this.f19106r, iArr3, 0, i17);
            System.arraycopy(this.f19103o, this.f19106r, aVarArr, 0, i17);
            System.arraycopy(this.f19098j, this.f19106r, iArr, 0, i17);
            int i18 = this.f19106r;
            System.arraycopy(this.f19099k, 0, jArr, i17, i18);
            System.arraycopy(this.f19102n, 0, jArr2, i17, i18);
            System.arraycopy(this.f19101m, 0, iArr2, i17, i18);
            System.arraycopy(this.f19100l, 0, iArr3, i17, i18);
            System.arraycopy(this.f19103o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f19098j, 0, iArr, i17, i18);
            this.f19099k = jArr;
            this.f19102n = jArr2;
            this.f19101m = iArr2;
            this.f19100l = iArr3;
            this.f19103o = aVarArr;
            this.f19098j = iArr;
            this.f19106r = 0;
            this.f19097i = i15;
        }
    }

    public final int j(long j10) {
        int i10 = this.f19104p;
        int x10 = x(i10 - 1);
        while (i10 > this.f19107s && this.f19102n[x10] >= j10) {
            i10--;
            x10--;
            if (x10 == -1) {
                x10 = this.f19097i - 1;
            }
        }
        return i10;
    }

    public final synchronized long l(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f19104p;
        if (i11 != 0) {
            long[] jArr = this.f19102n;
            int i12 = this.f19106r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f19107s) != i11) {
                    i11 = i10 + 1;
                }
                int r10 = r(i12, i11, j10, z10);
                if (r10 == -1) {
                    return -1L;
                }
                return n(r10);
            }
        }
        return -1L;
    }

    public final synchronized long m() {
        int i10 = this.f19104p;
        if (i10 == 0) {
            return -1L;
        }
        return n(i10);
    }

    public final long n(int i10) {
        int i11;
        this.f19109u = Math.max(this.f19109u, v(i10));
        this.f19104p -= i10;
        int i12 = this.f19105q + i10;
        this.f19105q = i12;
        int i13 = this.f19106r + i10;
        this.f19106r = i13;
        int i14 = this.f19097i;
        if (i13 >= i14) {
            this.f19106r = i13 - i14;
        }
        int i15 = this.f19107s - i10;
        this.f19107s = i15;
        if (i15 < 0) {
            this.f19107s = 0;
        }
        this.f19091c.d(i12);
        if (this.f19104p != 0) {
            return this.f19099k[this.f19106r];
        }
        int i16 = this.f19106r;
        if (i16 == 0) {
            i16 = this.f19097i;
        }
        return this.f19099k[i16 - 1] + this.f19100l[i11];
    }

    public final void o(long j10, boolean z10, boolean z11) {
        this.f19089a.b(l(j10, z10, z11));
    }

    public final void p() {
        this.f19089a.b(m());
    }

    public final long q(int i10) {
        int A = A() - i10;
        boolean z10 = false;
        c5.a.a(A >= 0 && A <= this.f19104p - this.f19107s);
        int i11 = this.f19104p - A;
        this.f19104p = i11;
        this.f19110v = Math.max(this.f19109u, v(i11));
        if (A == 0 && this.f19111w) {
            z10 = true;
        }
        this.f19111w = z10;
        this.f19091c.c(i10);
        int i12 = this.f19104p;
        if (i12 == 0) {
            return 0L;
        }
        int x10 = x(i12 - 1);
        return this.f19099k[x10] + this.f19100l[x10];
    }

    public final int r(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f19102n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f19101m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f19097i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public q1 s(q1 q1Var) {
        return (this.F == 0 || q1Var.Y == Long.MAX_VALUE) ? q1Var : q1Var.b().i0(q1Var.Y + this.F).E();
    }

    public final synchronized long t() {
        return this.f19110v;
    }

    public final synchronized long u() {
        return Math.max(this.f19109u, v(this.f19107s));
    }

    public final long v(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int x10 = x(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f19102n[x10]);
            if ((this.f19101m[x10] & 1) != 0) {
                break;
            }
            x10--;
            if (x10 == -1) {
                x10 = this.f19097i - 1;
            }
        }
        return j10;
    }

    public final int w() {
        return this.f19105q + this.f19107s;
    }

    public final int x(int i10) {
        int i11 = this.f19106r + i10;
        int i12 = this.f19097i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int y(long j10, boolean z10) {
        int x10 = x(this.f19107s);
        if (B() && j10 >= this.f19102n[x10]) {
            if (j10 <= this.f19110v || !z10) {
                int r10 = r(x10, this.f19104p - this.f19107s, j10, true);
                if (r10 == -1) {
                    return 0;
                }
                return r10;
            }
            return this.f19104p - this.f19107s;
        }
        return 0;
    }

    public final synchronized q1 z() {
        return this.f19113y ? null : this.B;
    }
}
