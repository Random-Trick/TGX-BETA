package p187n4;

import org.thunderdog.challegram.Log;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0118b0;
import p006a5.AbstractC0150i0;
import p006a5.AbstractC0154k;
import p006a5.C0175w;
import p020b5.C1186a;
import p174m3.AbstractC6604g3;
import p174m3.C6660o1;
import p187n4.AbstractC7166b0;
import p187n4.AbstractC7230t;
import p187n4.C7178f0;
import p187n4.C7187g0;
import p230q3.AbstractC8158b0;
import p230q3.AbstractC8223y;
import p230q3.C8199l;
import p270t3.AbstractC8965l;
import p270t3.C8955d;

public final class C7187g0 extends AbstractC7163a implements C7178f0.AbstractC7180b {
    public final C6660o1 f22862g;
    public final C6660o1.C6671h f22863h;
    public final AbstractC0154k.AbstractC0155a f22864i;
    public final AbstractC7166b0.AbstractC7167a f22865j;
    public final AbstractC8223y f22866k;
    public final AbstractC0118b0 f22867l;
    public final int f22868m;
    public boolean f22869n;
    public long f22870o;
    public boolean f22871p;
    public boolean f22872q;
    public AbstractC0150i0 f22873r;

    public class C7188a extends AbstractC7196j {
        public C7188a(C7187g0 g0Var, AbstractC6604g3 g3Var) {
            super(g3Var);
        }

        @Override
        public AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
            super.mo17301k(i, bVar, z);
            bVar.f20635O = true;
            return bVar;
        }

        @Override
        public AbstractC6604g3.C6608d mo17298u(int i, AbstractC6604g3.C6608d dVar, long j) {
            super.mo17298u(i, dVar, j);
            dVar.f20656U = true;
            return dVar;
        }
    }

    public static final class C7189b implements AbstractC7164a0 {
        public final AbstractC0154k.AbstractC0155a f22874a;
        public AbstractC7166b0.AbstractC7167a f22875b;
        public AbstractC8158b0 f22876c;
        public AbstractC0118b0 f22877d;
        public int f22878e;
        public String f22879f;
        public Object f22880g;

        public C7189b(AbstractC0154k.AbstractC0155a aVar) {
            this(aVar, new C8955d());
        }

        public static AbstractC7166b0 m17422c(AbstractC8965l lVar) {
            return new C7168c(lVar);
        }

        public C7187g0 m17423b(C6660o1 o1Var) {
            C1186a.m38188e(o1Var.f20816b);
            C6660o1.C6671h hVar = o1Var.f20816b;
            boolean z = true;
            boolean z2 = hVar.f20882i == null && this.f22880g != null;
            if (hVar.f20879f != null || this.f22879f == null) {
                z = false;
            }
            if (z2 && z) {
                o1Var = o1Var.m19641b().m19635d(this.f22880g).m19637b(this.f22879f).m19638a();
            } else if (z2) {
                o1Var = o1Var.m19641b().m19635d(this.f22880g).m19638a();
            } else if (z) {
                o1Var = o1Var.m19641b().m19637b(this.f22879f).m19638a();
            }
            C6660o1 o1Var2 = o1Var;
            return new C7187g0(o1Var2, this.f22874a, this.f22875b, this.f22876c.mo13220a(o1Var2), this.f22877d, this.f22878e, null);
        }

        public C7189b(AbstractC0154k.AbstractC0155a aVar, final AbstractC8965l lVar) {
            this(aVar, new AbstractC7166b0.AbstractC7167a() {
                @Override
                public final AbstractC7166b0 mo17421a() {
                    AbstractC7166b0 c;
                    c = C7187g0.C7189b.m17422c(AbstractC8965l.this);
                    return c;
                }
            });
        }

        public C7189b(AbstractC0154k.AbstractC0155a aVar, AbstractC7166b0.AbstractC7167a aVar2) {
            this.f22874a = aVar;
            this.f22875b = aVar2;
            this.f22876c = new C8199l();
            this.f22877d = new C0175w();
            this.f22878e = Log.TAG_NDK;
        }
    }

    public C7187g0(C6660o1 o1Var, AbstractC0154k.AbstractC0155a aVar, AbstractC7166b0.AbstractC7167a aVar2, AbstractC8223y yVar, AbstractC0118b0 b0Var, int i, C7188a aVar3) {
        this(o1Var, aVar, aVar2, yVar, b0Var, i);
    }

    @Override
    public AbstractC7223q mo17260c(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        AbstractC0154k a = this.f22864i.mo4407a();
        AbstractC0150i0 i0Var = this.f22873r;
        if (i0Var != null) {
            a.mo17399g(i0Var);
        }
        return new C7178f0(this.f22863h.f20874a, a, this.f22865j.mo17421a(), this.f22866k, m17510q(aVar), this.f22867l, m17508s(aVar), this, bVar, this.f22863h.f20879f, this.f22868m);
    }

    @Override
    public void mo17259d(AbstractC7223q qVar) {
        ((C7178f0) qVar).m17460c0();
    }

    @Override
    public void mo17426f(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f22870o;
        }
        if (this.f22869n || this.f22870o != j || this.f22871p != z || this.f22872q != z2) {
            this.f22870o = j;
            this.f22871p = z;
            this.f22872q = z2;
            this.f22869n = false;
            m17425z();
        }
    }

    @Override
    public C6660o1 mo17257g() {
        return this.f22862g;
    }

    @Override
    public void mo17253k() {
    }

    @Override
    public void mo17308w(AbstractC0150i0 i0Var) {
        this.f22873r = i0Var;
        this.f22866k.mo13162b();
        m17425z();
    }

    @Override
    public void mo17307y() {
        this.f22866k.mo13163a();
    }

    public final void m17425z() {
        AbstractC6604g3 o0Var = new C7220o0(this.f22870o, this.f22871p, false, this.f22872q, null, this.f22862g);
        if (this.f22869n) {
            o0Var = new C7188a(this, o0Var);
        }
        m17506x(o0Var);
    }

    public C7187g0(C6660o1 o1Var, AbstractC0154k.AbstractC0155a aVar, AbstractC7166b0.AbstractC7167a aVar2, AbstractC8223y yVar, AbstractC0118b0 b0Var, int i) {
        this.f22863h = (C6660o1.C6671h) C1186a.m38188e(o1Var.f20816b);
        this.f22862g = o1Var;
        this.f22864i = aVar;
        this.f22865j = aVar2;
        this.f22866k = yVar;
        this.f22867l = b0Var;
        this.f22868m = i;
        this.f22869n = true;
        this.f22870o = -9223372036854775807L;
    }
}
