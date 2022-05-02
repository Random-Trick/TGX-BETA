package p174m3;

import p006a5.AbstractC0117b;
import p020b5.C1186a;
import p020b5.C1230s;
import p187n4.AbstractC7206l0;
import p187n4.AbstractC7223q;
import p187n4.AbstractC7230t;
import p187n4.C7170d;
import p187n4.C7193i;
import p187n4.C7233t0;
import p356z4.AbstractC11265j;
import p356z4.AbstractC11280t;
import p356z4.C11282u;

public final class C6700t1 {
    public final AbstractC7223q f21018a;
    public final Object f21019b;
    public final AbstractC7206l0[] f21020c;
    public boolean f21021d;
    public boolean f21022e;
    public C6704u1 f21023f;
    public boolean f21024g;
    public final boolean[] f21025h;
    public final AbstractC6705u2[] f21026i;
    public final AbstractC11280t f21027j;
    public final C6728z1 f21028k;
    public C6700t1 f21029l;
    public C7233t0 f21030m = C7233t0.f23027M;
    public C11282u f21031n;
    public long f21032o;

    public C6700t1(AbstractC6705u2[] u2VarArr, long j, AbstractC11280t tVar, AbstractC0117b bVar, C6728z1 z1Var, C6704u1 u1Var, C11282u uVar) {
        this.f21026i = u2VarArr;
        this.f21032o = j;
        this.f21027j = tVar;
        this.f21028k = z1Var;
        AbstractC7230t.C7231a aVar = u1Var.f21035a;
        this.f21019b = aVar.f23017a;
        this.f21023f = u1Var;
        this.f21031n = uVar;
        this.f21020c = new AbstractC7206l0[u2VarArr.length];
        this.f21025h = new boolean[u2VarArr.length];
        this.f21018a = m19459e(aVar, z1Var, bVar, u1Var.f21036b, u1Var.f21038d);
    }

    public static AbstractC7223q m19459e(AbstractC7230t.C7231a aVar, C6728z1 z1Var, AbstractC0117b bVar, long j, long j2) {
        AbstractC7223q h = z1Var.m19202h(aVar, bVar, j);
        return j2 != -9223372036854775807L ? new C7170d(h, true, 0L, j2) : h;
    }

    public static void m19443u(C6728z1 z1Var, AbstractC7223q qVar) {
        try {
            if (qVar instanceof C7170d) {
                z1Var.m19184z(((C7170d) qVar).f22758a);
            } else {
                z1Var.m19184z(qVar);
            }
        } catch (RuntimeException e) {
            C1230s.m37886d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void m19464A() {
        AbstractC7223q qVar = this.f21018a;
        if (qVar instanceof C7170d) {
            long j = this.f21023f.f21038d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C7170d) qVar).m17494r(0L, j);
        }
    }

    public long m19463a(C11282u uVar, long j, boolean z) {
        return m19462b(uVar, j, z, new boolean[this.f21026i.length]);
    }

    public long m19462b(C11282u uVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= uVar.f36192a) {
                break;
            }
            boolean[] zArr2 = this.f21025h;
            if (z || !uVar.m957b(this.f21031n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m19457g(this.f21020c);
        m19458f();
        this.f21031n = uVar;
        m19456h();
        long o = this.f21018a.mo17282o(uVar.f36194c, this.f21025h, this.f21020c, zArr, j);
        m19461c(this.f21020c);
        this.f21022e = false;
        int i2 = 0;
        while (true) {
            AbstractC7206l0[] l0VarArr = this.f21020c;
            if (i2 >= l0VarArr.length) {
                return o;
            }
            if (l0VarArr[i2] != null) {
                C1186a.m38184f(uVar.m956c(i2));
                if (this.f21026i[i2].mo19431k() != -2) {
                    this.f21022e = true;
                }
            } else {
                C1186a.m38184f(uVar.f36194c[i2] == null);
            }
            i2++;
        }
    }

    public final void m19461c(AbstractC7206l0[] l0VarArr) {
        int i = 0;
        while (true) {
            AbstractC6705u2[] u2VarArr = this.f21026i;
            if (i < u2VarArr.length) {
                if (u2VarArr[i].mo19431k() == -2 && this.f21031n.m956c(i)) {
                    l0VarArr[i] = new C7193i();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void m19460d(long j) {
        C1186a.m38184f(m19446r());
        this.f21018a.mo17284h(m19439y(j));
    }

    public final void m19458f() {
        if (m19446r()) {
            int i = 0;
            while (true) {
                C11282u uVar = this.f21031n;
                if (i < uVar.f36192a) {
                    boolean c = uVar.m956c(i);
                    AbstractC11265j jVar = this.f21031n.f36194c[i];
                    if (c && jVar != null) {
                        jVar.mo1026h();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void m19457g(AbstractC7206l0[] l0VarArr) {
        int i = 0;
        while (true) {
            AbstractC6705u2[] u2VarArr = this.f21026i;
            if (i < u2VarArr.length) {
                if (u2VarArr[i].mo19431k() == -2) {
                    l0VarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void m19456h() {
        if (m19446r()) {
            int i = 0;
            while (true) {
                C11282u uVar = this.f21031n;
                if (i < uVar.f36192a) {
                    boolean c = uVar.m956c(i);
                    AbstractC11265j jVar = this.f21031n.f36194c[i];
                    if (c && jVar != null) {
                        jVar.mo1028e();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public long m19455i() {
        if (!this.f21021d) {
            return this.f21023f.f21036b;
        }
        long s = this.f21022e ? this.f21018a.mo17279s() : Long.MIN_VALUE;
        return s == Long.MIN_VALUE ? this.f21023f.f21039e : s;
    }

    public C6700t1 m19454j() {
        return this.f21029l;
    }

    public long m19453k() {
        if (!this.f21021d) {
            return 0L;
        }
        return this.f21018a.mo17289c();
    }

    public long m19452l() {
        return this.f21032o;
    }

    public long m19451m() {
        return this.f21023f.f21036b + this.f21032o;
    }

    public C7233t0 m19450n() {
        return this.f21030m;
    }

    public C11282u m19449o() {
        return this.f21031n;
    }

    public void m19448p(float f, AbstractC6604g3 g3Var) {
        this.f21021d = true;
        this.f21030m = this.f21018a.mo17280q();
        C11282u v = m19442v(f, g3Var);
        C6704u1 u1Var = this.f21023f;
        long j = u1Var.f21036b;
        long j2 = u1Var.f21039e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a = m19463a(v, j, false);
        long j3 = this.f21032o;
        C6704u1 u1Var2 = this.f21023f;
        this.f21032o = j3 + (u1Var2.f21036b - a);
        this.f21023f = u1Var2.m19432b(a);
    }

    public boolean m19447q() {
        return this.f21021d && (!this.f21022e || this.f21018a.mo17279s() == Long.MIN_VALUE);
    }

    public final boolean m19446r() {
        return this.f21029l == null;
    }

    public void m19445s(long j) {
        C1186a.m38184f(m19446r());
        if (this.f21021d) {
            this.f21018a.mo17277u(m19439y(j));
        }
    }

    public void m19444t() {
        m19458f();
        m19443u(this.f21028k, this.f21018a);
    }

    public C11282u m19442v(float f, AbstractC6604g3 g3Var) {
        AbstractC11265j[] jVarArr;
        C11282u e = this.f21027j.mo959e(this.f21026i, m19450n(), this.f21023f.f21035a, g3Var);
        for (AbstractC11265j jVar : e.f36194c) {
            if (jVar != null) {
                jVar.mo1025i(f);
            }
        }
        return e;
    }

    public void m19441w(C6700t1 t1Var) {
        if (t1Var != this.f21029l) {
            m19458f();
            this.f21029l = t1Var;
            m19456h();
        }
    }

    public void m19440x(long j) {
        this.f21032o = j;
    }

    public long m19439y(long j) {
        return j - m19452l();
    }

    public long m19438z(long j) {
        return j + m19452l();
    }
}
