package p187n4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0150i0;
import p020b5.C1216l0;
import p174m3.AbstractC6604g3;
import p174m3.C6660o1;
import p187n4.AbstractC7230t;
import p200o4.C7652c;

public final class C7217o extends AbstractC7184g<Void> {
    public final AbstractC7230t f22978j;
    public final boolean f22979k;
    public final AbstractC6604g3.C6608d f22980l;
    public final AbstractC6604g3.C6606b f22981m;
    public C7218a f22982n;
    public C7212n f22983o;
    public boolean f22984p;
    public boolean f22985q;
    public boolean f22986r;

    public static final class C7218a extends AbstractC7196j {
        public static final Object f22987O = new Object();
        public final Object f22988M;
        public final Object f22989N;

        public C7218a(AbstractC6604g3 g3Var, Object obj, Object obj2) {
            super(g3Var);
            this.f22988M = obj;
            this.f22989N = obj2;
        }

        public static C7218a m17305B(C6660o1 o1Var) {
            return new C7218a(new C7219b(o1Var), AbstractC6604g3.C6608d.f20644a0, f22987O);
        }

        public static C7218a m17304C(AbstractC6604g3 g3Var, Object obj, Object obj2) {
            return new C7218a(g3Var, obj, obj2);
        }

        public C7218a m17306A(AbstractC6604g3 g3Var) {
            return new C7218a(g3Var, this.f22988M, this.f22989N);
        }

        @Override
        public int mo17302f(Object obj) {
            Object obj2;
            AbstractC6604g3 g3Var = this.f22903c;
            if (f22987O.equals(obj) && (obj2 = this.f22989N) != null) {
                obj = obj2;
            }
            return g3Var.mo17302f(obj);
        }

        @Override
        public AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
            this.f22903c.mo17301k(i, bVar, z);
            if (C1216l0.m37982c(bVar.f20638b, this.f22989N) && z) {
                bVar.f20638b = f22987O;
            }
            return bVar;
        }

        @Override
        public Object mo17299s(int i) {
            Object s = this.f22903c.mo17299s(i);
            return C1216l0.m37982c(s, this.f22989N) ? f22987O : s;
        }

        @Override
        public AbstractC6604g3.C6608d mo17298u(int i, AbstractC6604g3.C6608d dVar, long j) {
            this.f22903c.mo17298u(i, dVar, j);
            if (C1216l0.m37982c(dVar.f20662a, this.f22988M)) {
                dVar.f20662a = AbstractC6604g3.C6608d.f20644a0;
            }
            return dVar;
        }
    }

    public static final class C7219b extends AbstractC6604g3 {
        public final C6660o1 f22990c;

        public C7219b(C6660o1 o1Var) {
            this.f22990c = o1Var;
        }

        @Override
        public int mo17302f(Object obj) {
            return obj == C7218a.f22987O ? 0 : -1;
        }

        @Override
        public AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
            Object obj = null;
            Integer num = z ? 0 : null;
            if (z) {
                obj = C7218a.f22987O;
            }
            bVar.m19798s(num, obj, 0, -9223372036854775807L, 0L, C7652c.f24524P, true);
            return bVar;
        }

        @Override
        public int mo17300m() {
            return 1;
        }

        @Override
        public Object mo17299s(int i) {
            return C7218a.f22987O;
        }

        @Override
        public AbstractC6604g3.C6608d mo17298u(int i, AbstractC6604g3.C6608d dVar, long j) {
            dVar.m19788j(AbstractC6604g3.C6608d.f20644a0, this.f22990c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f20656U = true;
            return dVar;
        }

        @Override
        public int mo17297v() {
            return 1;
        }
    }

    public C7217o(AbstractC7230t tVar, boolean z) {
        this.f22978j = tVar;
        this.f22979k = z && tVar.mo17251m();
        this.f22980l = new AbstractC6604g3.C6608d();
        this.f22981m = new AbstractC6604g3.C6606b();
        AbstractC6604g3 o = tVar.mo17249o();
        if (o != null) {
            this.f22982n = C7218a.m17304C(o, null, null);
            this.f22986r = true;
            return;
        }
        this.f22982n = C7218a.m17305B(tVar.mo17257g());
    }

    public C7212n mo17260c(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        C7212n nVar = new C7212n(aVar, bVar, j);
        nVar.m17329w(this.f22978j);
        if (this.f22985q) {
            nVar.m17337b(aVar.m17248c(m17313I(aVar.f23017a)));
        } else {
            this.f22983o = nVar;
            if (!this.f22984p) {
                this.f22984p = true;
                m17432F(null, this.f22978j);
            }
        }
        return nVar;
    }

    public final Object m17314H(Object obj) {
        return (this.f22982n.f22989N == null || !this.f22982n.f22989N.equals(obj)) ? obj : C7218a.f22987O;
    }

    public final Object m17313I(Object obj) {
        return (this.f22982n.f22989N == null || !obj.equals(C7218a.f22987O)) ? obj : this.f22982n.f22989N;
    }

    public AbstractC7230t.C7231a mo17317A(Void r1, AbstractC7230t.C7231a aVar) {
        return aVar.m17248c(m17314H(aVar.f23017a));
    }

    public AbstractC6604g3 m17311K() {
        return this.f22982n;
    }

    public void mo17316E(java.lang.Void r13, p187n4.AbstractC7230t r14, p174m3.AbstractC6604g3 r15) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7217o.mo17316E(java.lang.Void, n4.t, m3.g3):void");
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void m17309M(long j) {
        C7212n nVar = this.f22983o;
        int f = this.f22982n.mo17302f(nVar.f22971a.f23017a);
        if (f != -1) {
            long j2 = this.f22982n.m19826j(f, this.f22981m).f20633M;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0L, j2 - 1);
            }
            nVar.m17331r(j);
        }
    }

    @Override
    public void mo17259d(AbstractC7223q qVar) {
        ((C7212n) qVar).m17330v();
        if (qVar == this.f22983o) {
            this.f22983o = null;
        }
    }

    @Override
    public C6660o1 mo17257g() {
        return this.f22978j.mo17257g();
    }

    @Override
    public void mo17253k() {
    }

    @Override
    public void mo17308w(AbstractC0150i0 i0Var) {
        super.mo17308w(i0Var);
        if (!this.f22979k) {
            this.f22984p = true;
            m17432F(null, this.f22978j);
        }
    }

    @Override
    public void mo17307y() {
        this.f22985q = false;
        this.f22984p = false;
        super.mo17307y();
    }
}
