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
    public final C6660o1 f22859g;
    public final C6660o1.C6671h f22860h;
    public final AbstractC0154k.AbstractC0155a f22861i;
    public final AbstractC7166b0.AbstractC7167a f22862j;
    public final AbstractC8223y f22863k;
    public final AbstractC0118b0 f22864l;
    public final int f22865m;
    public boolean f22866n;
    public long f22867o;
    public boolean f22868p;
    public boolean f22869q;
    public AbstractC0150i0 f22870r;

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
        public final AbstractC0154k.AbstractC0155a f22871a;
        public AbstractC7166b0.AbstractC7167a f22872b;
        public AbstractC8158b0 f22873c;
        public AbstractC0118b0 f22874d;
        public int f22875e;
        public String f22876f;
        public Object f22877g;

        public C7189b(AbstractC0154k.AbstractC0155a aVar) {
            this(aVar, new C8955d());
        }

        public static AbstractC7166b0 m17422c(AbstractC8965l lVar) {
            return new C7168c(lVar);
        }

        public C7187g0 m17423b(C6660o1 o1Var) {
            C1186a.m38185e(o1Var.f20816b);
            C6660o1.C6671h hVar = o1Var.f20816b;
            boolean z = true;
            boolean z2 = hVar.f20882i == null && this.f22877g != null;
            if (hVar.f20879f != null || this.f22876f == null) {
                z = false;
            }
            if (z2 && z) {
                o1Var = o1Var.m19640b().m19634d(this.f22877g).m19636b(this.f22876f).m19637a();
            } else if (z2) {
                o1Var = o1Var.m19640b().m19634d(this.f22877g).m19637a();
            } else if (z) {
                o1Var = o1Var.m19640b().m19636b(this.f22876f).m19637a();
            }
            C6660o1 o1Var2 = o1Var;
            return new C7187g0(o1Var2, this.f22871a, this.f22872b, this.f22873c.mo13221a(o1Var2), this.f22874d, this.f22875e, null);
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
            this.f22871a = aVar;
            this.f22872b = aVar2;
            this.f22873c = new C8199l();
            this.f22874d = new C0175w();
            this.f22875e = Log.TAG_NDK;
        }
    }

    public C7187g0(C6660o1 o1Var, AbstractC0154k.AbstractC0155a aVar, AbstractC7166b0.AbstractC7167a aVar2, AbstractC8223y yVar, AbstractC0118b0 b0Var, int i, C7188a aVar3) {
        this(o1Var, aVar, aVar2, yVar, b0Var, i);
    }

    @Override
    public AbstractC7223q mo17260c(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        AbstractC0154k a = this.f22861i.mo4407a();
        AbstractC0150i0 i0Var = this.f22870r;
        if (i0Var != null) {
            a.mo17399g(i0Var);
        }
        return new C7178f0(this.f22860h.f20874a, a, this.f22862j.mo17421a(), this.f22863k, m17510q(aVar), this.f22864l, m17508s(aVar), this, bVar, this.f22860h.f20879f, this.f22865m);
    }

    @Override
    public void mo17259d(AbstractC7223q qVar) {
        ((C7178f0) qVar).m17460c0();
    }

    @Override
    public void mo17426f(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f22867o;
        }
        if (this.f22866n || this.f22867o != j || this.f22868p != z || this.f22869q != z2) {
            this.f22867o = j;
            this.f22868p = z;
            this.f22869q = z2;
            this.f22866n = false;
            m17425z();
        }
    }

    @Override
    public C6660o1 mo17257g() {
        return this.f22859g;
    }

    @Override
    public void mo17253k() {
    }

    @Override
    public void mo17308w(AbstractC0150i0 i0Var) {
        this.f22870r = i0Var;
        this.f22863k.mo13163b();
        m17425z();
    }

    @Override
    public void mo17307y() {
        this.f22863k.mo13164a();
    }

    public final void m17425z() {
        AbstractC6604g3 o0Var = new C7220o0(this.f22867o, this.f22868p, false, this.f22869q, null, this.f22859g);
        if (this.f22866n) {
            o0Var = new C7188a(this, o0Var);
        }
        m17506x(o0Var);
    }

    public C7187g0(C6660o1 o1Var, AbstractC0154k.AbstractC0155a aVar, AbstractC7166b0.AbstractC7167a aVar2, AbstractC8223y yVar, AbstractC0118b0 b0Var, int i) {
        this.f22860h = (C6660o1.C6671h) C1186a.m38185e(o1Var.f20816b);
        this.f22859g = o1Var;
        this.f22861i = aVar;
        this.f22862j = aVar2;
        this.f22863k = yVar;
        this.f22864l = b0Var;
        this.f22865m = i;
        this.f22866n = true;
        this.f22867o = -9223372036854775807L;
    }
}
