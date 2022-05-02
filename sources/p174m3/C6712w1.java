package p174m3;

import android.os.Handler;
import android.util.Pair;
import p006a5.AbstractC0117b;
import p020b5.C1186a;
import p174m3.AbstractC6604g3;
import p186n3.C7122h1;
import p187n4.AbstractC7223q;
import p187n4.AbstractC7230t;
import p356z4.AbstractC11280t;
import p356z4.C11282u;
import p358z6.AbstractC11396q;

public final class C6712w1 {
    public final AbstractC6604g3.C6606b f21053a = new AbstractC6604g3.C6606b();
    public final AbstractC6604g3.C6608d f21054b = new AbstractC6604g3.C6608d();
    public final C7122h1 f21055c;
    public final Handler f21056d;
    public long f21057e;
    public int f21058f;
    public boolean f21059g;
    public C6700t1 f21060h;
    public C6700t1 f21061i;
    public C6700t1 f21062j;
    public int f21063k;
    public Object f21064l;
    public long f21065m;

    public C6712w1(C7122h1 h1Var, Handler handler) {
        this.f21055c = h1Var;
        this.f21056d = handler;
    }

    public static AbstractC7230t.C7231a m19428B(AbstractC6604g3 g3Var, Object obj, long j, long j2, AbstractC6604g3.C6606b bVar) {
        g3Var.mo19825l(obj, bVar);
        int g = bVar.m19810g(j);
        if (g == -1) {
            return new AbstractC7230t.C7231a(obj, j2, bVar.m19811f(j));
        }
        return new AbstractC7230t.C7231a(obj, g, bVar.m19805l(g), j2);
    }

    public void m19399w(AbstractC11396q.C11397a aVar, AbstractC7230t.C7231a aVar2) {
        this.f21055c.m17695M2(aVar.m756e(), aVar2);
    }

    public AbstractC7230t.C7231a m19429A(AbstractC6604g3 g3Var, Object obj, long j) {
        return m19428B(g3Var, obj, j, m19427C(g3Var, obj), this.f21053a);
    }

    public final long m19427C(AbstractC6604g3 g3Var, Object obj) {
        int f;
        int i = g3Var.mo19825l(obj, this.f21053a).f20639c;
        Object obj2 = this.f21064l;
        if (!(obj2 == null || (f = g3Var.mo17302f(obj2)) == -1 || g3Var.m19826j(f, this.f21053a).f20639c != i)) {
            return this.f21065m;
        }
        for (C6700t1 t1Var = this.f21060h; t1Var != null; t1Var = t1Var.m19454j()) {
            if (t1Var.f21019b.equals(obj)) {
                return t1Var.f21023f.f21035a.f23020d;
            }
        }
        for (C6700t1 t1Var2 = this.f21060h; t1Var2 != null; t1Var2 = t1Var2.m19454j()) {
            int f2 = g3Var.mo17302f(t1Var2.f21019b);
            if (f2 != -1 && g3Var.m19826j(f2, this.f21053a).f20639c == i) {
                return t1Var2.f21023f.f21035a.f23020d;
            }
        }
        long j = this.f21057e;
        this.f21057e = 1 + j;
        if (this.f21060h == null) {
            this.f21064l = obj;
            this.f21065m = j;
        }
        return j;
    }

    public boolean m19426D() {
        C6700t1 t1Var = this.f21062j;
        return t1Var == null || (!t1Var.f21023f.f21043i && t1Var.m19447q() && this.f21062j.f21023f.f21039e != -9223372036854775807L && this.f21063k < 100);
    }

    public final boolean m19425E(AbstractC6604g3 g3Var) {
        C6700t1 t1Var = this.f21060h;
        if (t1Var == null) {
            return true;
        }
        int f = g3Var.mo17302f(t1Var.f21019b);
        while (true) {
            f = g3Var.m19827h(f, this.f21053a, this.f21054b, this.f21058f, this.f21059g);
            while (t1Var.m19454j() != null && !t1Var.f21023f.f21041g) {
                t1Var = t1Var.m19454j();
            }
            C6700t1 j = t1Var.m19454j();
            if (f == -1 || j == null || g3Var.mo17302f(j.f21019b) != f) {
                break;
            }
            t1Var = j;
        }
        boolean z = m19396z(t1Var);
        t1Var.f21023f = m19404r(g3Var, t1Var.f21023f);
        return !z;
    }

    public boolean m19424F(AbstractC6604g3 g3Var, long j, long j2) {
        C6704u1 u1Var;
        C6700t1 t1Var = this.f21060h;
        C6700t1 t1Var2 = null;
        while (t1Var != null) {
            C6704u1 u1Var2 = t1Var.f21023f;
            if (t1Var2 == null) {
                u1Var = m19404r(g3Var, u1Var2);
            } else {
                C6704u1 i = m19413i(g3Var, t1Var2, j);
                if (i == null) {
                    return !m19396z(t1Var2);
                }
                if (!m19417e(u1Var2, i)) {
                    return !m19396z(t1Var2);
                }
                u1Var = i;
            }
            t1Var.f21023f = u1Var.m19433a(u1Var2.f21037c);
            if (!m19418d(u1Var2.f21039e, u1Var.f21039e)) {
                t1Var.m19464A();
                long j3 = u1Var.f21039e;
                return !m19396z(t1Var) && !(t1Var == this.f21061i && !t1Var.f21023f.f21040f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : t1Var.m19438z(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : t1Var.m19438z(j3)) ? 0 : -1)) >= 0));
            }
            t1Var2 = t1Var;
            t1Var = t1Var.m19454j();
        }
        return true;
    }

    public boolean m19423G(AbstractC6604g3 g3Var, int i) {
        this.f21058f = i;
        return m19425E(g3Var);
    }

    public boolean m19422H(AbstractC6604g3 g3Var, boolean z) {
        this.f21059g = z;
        return m19425E(g3Var);
    }

    public C6700t1 m19420b() {
        C6700t1 t1Var = this.f21060h;
        if (t1Var == null) {
            return null;
        }
        if (t1Var == this.f21061i) {
            this.f21061i = t1Var.m19454j();
        }
        this.f21060h.m19444t();
        int i = this.f21063k - 1;
        this.f21063k = i;
        if (i == 0) {
            this.f21062j = null;
            C6700t1 t1Var2 = this.f21060h;
            this.f21064l = t1Var2.f21019b;
            this.f21065m = t1Var2.f21023f.f21035a.f23020d;
        }
        this.f21060h = this.f21060h.m19454j();
        m19398x();
        return this.f21060h;
    }

    public C6700t1 m19419c() {
        C6700t1 t1Var = this.f21061i;
        C1186a.m38184f((t1Var == null || t1Var.m19454j() == null) ? false : true);
        this.f21061i = this.f21061i.m19454j();
        m19398x();
        return this.f21061i;
    }

    public final boolean m19418d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public final boolean m19417e(C6704u1 u1Var, C6704u1 u1Var2) {
        return u1Var.f21036b == u1Var2.f21036b && u1Var.f21035a.equals(u1Var2.f21035a);
    }

    public void m19416f() {
        if (this.f21063k != 0) {
            C6700t1 t1Var = (C6700t1) C1186a.m38182h(this.f21060h);
            this.f21064l = t1Var.f21019b;
            this.f21065m = t1Var.f21023f.f21035a.f23020d;
            while (t1Var != null) {
                t1Var.m19444t();
                t1Var = t1Var.m19454j();
            }
            this.f21060h = null;
            this.f21062j = null;
            this.f21061i = null;
            this.f21063k = 0;
            m19398x();
        }
    }

    public C6700t1 m19415g(AbstractC6705u2[] u2VarArr, AbstractC11280t tVar, AbstractC0117b bVar, C6728z1 z1Var, C6704u1 u1Var, C11282u uVar) {
        C6700t1 t1Var = this.f21062j;
        C6700t1 t1Var2 = new C6700t1(u2VarArr, t1Var == null ? 1000000000000L : (t1Var.m19452l() + this.f21062j.f21023f.f21039e) - u1Var.f21036b, tVar, bVar, z1Var, u1Var, uVar);
        C6700t1 t1Var3 = this.f21062j;
        if (t1Var3 != null) {
            t1Var3.m19441w(t1Var2);
        } else {
            this.f21060h = t1Var2;
            this.f21061i = t1Var2;
        }
        this.f21064l = null;
        this.f21062j = t1Var2;
        this.f21063k++;
        m19398x();
        return t1Var2;
    }

    public final C6704u1 m19414h(C6596f2 f2Var) {
        return m19411k(f2Var.f20543a, f2Var.f20544b, f2Var.f20545c, f2Var.f20561s);
    }

    public final C6704u1 m19413i(AbstractC6604g3 g3Var, C6700t1 t1Var, long j) {
        long j2;
        C6704u1 u1Var = t1Var.f21023f;
        long l = (t1Var.m19452l() + u1Var.f21039e) - j;
        if (u1Var.f21041g) {
            long j3 = 0;
            int h = g3Var.m19827h(g3Var.mo17302f(u1Var.f21035a.f23017a), this.f21053a, this.f21054b, this.f21058f, this.f21059g);
            if (h == -1) {
                return null;
            }
            int i = g3Var.mo17301k(h, this.f21053a, true).f20639c;
            Object obj = this.f21053a.f20638b;
            long j4 = u1Var.f21035a.f23020d;
            if (g3Var.m19820t(i, this.f21054b).f20659X == h) {
                Pair<Object, Long> o = g3Var.m19823o(this.f21054b, this.f21053a, i, -9223372036854775807L, Math.max(0L, l));
                if (o == null) {
                    return null;
                }
                obj = o.first;
                j2 = ((Long) o.second).longValue();
                C6700t1 j5 = t1Var.m19454j();
                if (j5 == null || !j5.f21019b.equals(obj)) {
                    j4 = this.f21057e;
                    this.f21057e = 1 + j4;
                } else {
                    j4 = j5.f21023f.f21035a.f23020d;
                }
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m19411k(g3Var, m19428B(g3Var, obj, j2, j4, this.f21053a), j3, j2);
        }
        AbstractC7230t.C7231a aVar = u1Var.f21035a;
        g3Var.mo19825l(aVar.f23017a, this.f21053a);
        if (aVar.m17274b()) {
            int i2 = aVar.f23018b;
            int d = this.f21053a.m19813d(i2);
            if (d == -1) {
                return null;
            }
            int m = this.f21053a.m19804m(i2, aVar.f23019c);
            if (m < d) {
                return m19410l(g3Var, aVar.f23017a, i2, m, u1Var.f21037c, aVar.f23020d);
            }
            long j6 = u1Var.f21037c;
            if (j6 == -9223372036854775807L) {
                AbstractC6604g3.C6608d dVar = this.f21054b;
                AbstractC6604g3.C6606b bVar = this.f21053a;
                Pair<Object, Long> o2 = g3Var.m19823o(dVar, bVar, bVar.f20639c, -9223372036854775807L, Math.max(0L, l));
                if (o2 == null) {
                    return null;
                }
                j6 = ((Long) o2.second).longValue();
            }
            return m19409m(g3Var, aVar.f23017a, Math.max(m19408n(g3Var, aVar.f23017a, aVar.f23018b), j6), u1Var.f21037c, aVar.f23020d);
        }
        int l2 = this.f21053a.m19805l(aVar.f23021e);
        if (l2 != this.f21053a.m19813d(aVar.f23021e)) {
            return m19410l(g3Var, aVar.f23017a, aVar.f23021e, l2, u1Var.f21039e, aVar.f23020d);
        }
        return m19409m(g3Var, aVar.f23017a, m19408n(g3Var, aVar.f23017a, aVar.f23021e), u1Var.f21039e, aVar.f23020d);
    }

    public C6700t1 m19412j() {
        return this.f21062j;
    }

    public final C6704u1 m19411k(AbstractC6604g3 g3Var, AbstractC7230t.C7231a aVar, long j, long j2) {
        g3Var.mo19825l(aVar.f23017a, this.f21053a);
        return aVar.m17274b() ? m19410l(g3Var, aVar.f23017a, aVar.f23018b, aVar.f23019c, j, aVar.f23020d) : m19409m(g3Var, aVar.f23017a, j2, j, aVar.f23020d);
    }

    public final C6704u1 m19410l(AbstractC6604g3 g3Var, Object obj, int i, int i2, long j, long j2) {
        AbstractC7230t.C7231a aVar = new AbstractC7230t.C7231a(obj, i, i2, j2);
        long e = g3Var.mo19825l(aVar.f23017a, this.f21053a).m19812e(aVar.f23018b, aVar.f23019c);
        long i3 = i2 == this.f21053a.m19805l(i) ? this.f21053a.m19808i() : 0L;
        return new C6704u1(aVar, (e == -9223372036854775807L || i3 < e) ? i3 : Math.max(0L, e - 1), j, -9223372036854775807L, e, this.f21053a.m19801p(aVar.f23018b), false, false, false);
    }

    public final C6704u1 m19409m(AbstractC6604g3 g3Var, Object obj, long j, long j2, long j3) {
        long j4 = j;
        g3Var.mo19825l(obj, this.f21053a);
        int f = this.f21053a.m19811f(j4);
        AbstractC7230t.C7231a aVar = new AbstractC7230t.C7231a(obj, j3, f);
        boolean s = m19403s(aVar);
        boolean u = m19401u(g3Var, aVar);
        boolean t = m19402t(g3Var, aVar, s);
        boolean z = f != -1 && this.f21053a.m19801p(f);
        long h = f != -1 ? this.f21053a.m19809h(f) : -9223372036854775807L;
        long j5 = (h == -9223372036854775807L || h == Long.MIN_VALUE) ? this.f21053a.f20633M : h;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        return new C6704u1(aVar, j4, j2, h, j5, z, s, u, t);
    }

    public final long m19408n(AbstractC6604g3 g3Var, Object obj, int i) {
        g3Var.mo19825l(obj, this.f21053a);
        long h = this.f21053a.m19809h(i);
        if (h == Long.MIN_VALUE) {
            return this.f21053a.f20633M;
        }
        return h + this.f21053a.m19807j(i);
    }

    public C6704u1 m19407o(long j, C6596f2 f2Var) {
        C6700t1 t1Var = this.f21062j;
        if (t1Var == null) {
            return m19414h(f2Var);
        }
        return m19413i(f2Var.f20543a, t1Var, j);
    }

    public C6700t1 m19406p() {
        return this.f21060h;
    }

    public C6700t1 m19405q() {
        return this.f21061i;
    }

    public p174m3.C6704u1 m19404r(p174m3.AbstractC6604g3 r19, p174m3.C6704u1 r20) {
        throw new UnsupportedOperationException("Method not decompiled: p174m3.C6712w1.m19404r(m3.g3, m3.u1):m3.u1");
    }

    public final boolean m19403s(AbstractC7230t.C7231a aVar) {
        return !aVar.m17274b() && aVar.f23021e == -1;
    }

    public final boolean m19402t(AbstractC6604g3 g3Var, AbstractC7230t.C7231a aVar, boolean z) {
        int f = g3Var.mo17302f(aVar.f23017a);
        return !g3Var.m19820t(g3Var.m19826j(f, this.f21053a).f20639c, this.f21054b).f20653R && g3Var.m19818x(f, this.f21053a, this.f21054b, this.f21058f, this.f21059g) && z;
    }

    public final boolean m19401u(AbstractC6604g3 g3Var, AbstractC7230t.C7231a aVar) {
        if (!m19403s(aVar)) {
            return false;
        }
        return g3Var.m19820t(g3Var.mo19825l(aVar.f23017a, this.f21053a).f20639c, this.f21054b).f20660Y == g3Var.mo17302f(aVar.f23017a);
    }

    public boolean m19400v(AbstractC7223q qVar) {
        C6700t1 t1Var = this.f21062j;
        return t1Var != null && t1Var.f21018a == qVar;
    }

    public final void m19398x() {
        if (this.f21055c != null) {
            final AbstractC11396q.C11397a x = AbstractC11396q.m760x();
            for (C6700t1 t1Var = this.f21060h; t1Var != null; t1Var = t1Var.m19454j()) {
                x.m757d(t1Var.f21023f.f21035a);
            }
            C6700t1 t1Var2 = this.f21061i;
            final AbstractC7230t.C7231a aVar = t1Var2 == null ? null : t1Var2.f21023f.f21035a;
            this.f21056d.post(new Runnable() {
                @Override
                public final void run() {
                    C6712w1.this.m19399w(x, aVar);
                }
            });
        }
    }

    public void m19397y(long j) {
        C6700t1 t1Var = this.f21062j;
        if (t1Var != null) {
            t1Var.m19445s(j);
        }
    }

    public boolean m19396z(C6700t1 t1Var) {
        boolean z = false;
        C1186a.m38184f(t1Var != null);
        if (t1Var.equals(this.f21062j)) {
            return false;
        }
        this.f21062j = t1Var;
        while (t1Var.m19454j() != null) {
            t1Var = t1Var.m19454j();
            if (t1Var == this.f21061i) {
                this.f21061i = this.f21060h;
                z = true;
            }
            t1Var.m19444t();
            this.f21063k--;
        }
        this.f21062j.m19441w(null);
        m19398x();
        return z;
    }
}
