package p187n4;

import java.util.HashMap;
import java.util.Map;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0150i0;
import p020b5.C1186a;
import p174m3.AbstractC6553a;
import p174m3.AbstractC6604g3;
import p174m3.C6660o1;
import p187n4.AbstractC7214n0;
import p187n4.AbstractC7230t;

@Deprecated
public final class C7207m extends AbstractC7184g<Void> {
    public final C7217o f22960j;
    public final int f22961k;
    public final Map<AbstractC7230t.C7231a, AbstractC7230t.C7231a> f22962l;
    public final Map<AbstractC7223q, AbstractC7230t.C7231a> f22963m;

    public static final class C7208a extends AbstractC7196j {
        public C7208a(AbstractC6604g3 g3Var) {
            super(g3Var);
        }

        @Override
        public int mo17346i(int i, int i2, boolean z) {
            int i3 = this.f22906c.mo17346i(i, i2, z);
            return i3 == -1 ? mo17401e(z) : i3;
        }

        @Override
        public int mo17345r(int i, int i2, boolean z) {
            int r = this.f22906c.mo17345r(i, i2, z);
            return r == -1 ? mo17400g(z) : r;
        }
    }

    public static final class C7209b extends AbstractC6553a {
        public final AbstractC6604g3 f22964O;
        public final int f22965P;
        public final int f22966Q;
        public final int f22967R;

        public C7209b(AbstractC6604g3 g3Var, int i) {
            super(false, new AbstractC7214n0.C7216b(i));
            boolean z = false;
            this.f22964O = g3Var;
            int m = g3Var.mo17300m();
            this.f22965P = m;
            this.f22966Q = g3Var.mo17297v();
            this.f22967R = i;
            if (m > 0) {
                C1186a.m38186g(i <= Integer.MAX_VALUE / m ? true : z, "LoopingMediaSource contains too many periods");
            }
        }

        @Override
        public int mo17344A(int i) {
            return i / this.f22965P;
        }

        @Override
        public int mo17343B(int i) {
            return i / this.f22966Q;
        }

        @Override
        public Object mo17342E(int i) {
            return Integer.valueOf(i);
        }

        @Override
        public int mo17341G(int i) {
            return i * this.f22965P;
        }

        @Override
        public int mo17340H(int i) {
            return i * this.f22966Q;
        }

        @Override
        public AbstractC6604g3 mo17339K(int i) {
            return this.f22964O;
        }

        @Override
        public int mo17300m() {
            return this.f22965P * this.f22967R;
        }

        @Override
        public int mo17297v() {
            return this.f22966Q * this.f22967R;
        }

        @Override
        public int mo17338z(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }
    }

    public C7207m(AbstractC7230t tVar) {
        this(tVar, Integer.MAX_VALUE);
    }

    public AbstractC7230t.C7231a mo17317A(Void r2, AbstractC7230t.C7231a aVar) {
        return this.f22961k != Integer.MAX_VALUE ? this.f22962l.get(aVar) : aVar;
    }

    public void mo17316E(Void r1, AbstractC7230t tVar, AbstractC6604g3 g3Var) {
        AbstractC6604g3 g3Var2;
        if (this.f22961k != Integer.MAX_VALUE) {
            g3Var2 = new C7209b(g3Var, this.f22961k);
        } else {
            g3Var2 = new C7208a(g3Var);
        }
        m17506x(g3Var2);
    }

    @Override
    public AbstractC7223q mo17260c(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        if (this.f22961k == Integer.MAX_VALUE) {
            return this.f22960j.mo17260c(aVar, bVar, j);
        }
        AbstractC7230t.C7231a c = aVar.m17248c(AbstractC6553a.m20118C(aVar.f23020a));
        this.f22962l.put(c, aVar);
        C7212n G = this.f22960j.mo17260c(c, bVar, j);
        this.f22963m.put(G, c);
        return G;
    }

    @Override
    public void mo17259d(AbstractC7223q qVar) {
        this.f22960j.mo17259d(qVar);
        AbstractC7230t.C7231a remove = this.f22963m.remove(qVar);
        if (remove != null) {
            this.f22962l.remove(remove);
        }
    }

    @Override
    public C6660o1 mo17257g() {
        return this.f22960j.mo17257g();
    }

    @Override
    public boolean mo17251m() {
        return false;
    }

    @Override
    public AbstractC6604g3 mo17249o() {
        if (this.f22961k != Integer.MAX_VALUE) {
            return new C7209b(this.f22960j.m17311K(), this.f22961k);
        }
        return new C7208a(this.f22960j.m17311K());
    }

    @Override
    public void mo17308w(AbstractC0150i0 i0Var) {
        super.mo17308w(i0Var);
        m17432F(null, this.f22960j);
    }

    public C7207m(AbstractC7230t tVar, int i) {
        C1186a.m38192a(i > 0);
        this.f22960j = new C7217o(tVar, false);
        this.f22961k = i;
        this.f22962l = new HashMap();
        this.f22963m = new HashMap();
    }
}
