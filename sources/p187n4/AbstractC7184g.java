package p187n4;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import p006a5.AbstractC0150i0;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.AbstractC6604g3;
import p187n4.AbstractC7230t;
import p187n4.AbstractC7240z;
import p230q3.AbstractC8219w;
import p230q3.C8211p;

public abstract class AbstractC7184g<T> extends AbstractC7163a {
    public final HashMap<T, C7186b<T>> f22852g = new HashMap<>();
    public Handler f22853h;
    public AbstractC0150i0 f22854i;

    public final class C7185a implements AbstractC7240z, AbstractC8219w {
        public final T f22856a;
        public AbstractC7240z.C7241a f22857b;
        public AbstractC8219w.C8220a f22858c;

        public C7185a(T t) {
            this.f22857b = AbstractC7184g.this.m17508s(null);
            this.f22858c = AbstractC7184g.this.m17510q(null);
            this.f22856a = t;
        }

        @Override
        public void mo13194D(int i, AbstractC7230t.C7231a aVar) {
            if (m17428a(i, aVar)) {
                this.f22858c.m13175m();
            }
        }

        @Override
        public void mo13193F(int i, AbstractC7230t.C7231a aVar) {
            if (m17428a(i, aVar)) {
                this.f22858c.m13178j();
            }
        }

        @Override
        public void mo17241G(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar) {
            if (m17428a(i, aVar)) {
                this.f22857b.m17221p(lVar, m17427b(pVar));
            }
        }

        @Override
        public void mo13192O(int i, AbstractC7230t.C7231a aVar, Exception exc) {
            if (m17428a(i, aVar)) {
                this.f22858c.m13176l(exc);
            }
        }

        @Override
        public void mo13191P(int i, AbstractC7230t.C7231a aVar, int i2) {
            if (m17428a(i, aVar)) {
                this.f22858c.m13177k(i2);
            }
        }

        @Override
        public void mo13190T(int i, AbstractC7230t.C7231a aVar) {
            if (m17428a(i, aVar)) {
                this.f22858c.m13179i();
            }
        }

        @Override
        public void mo17240U(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar) {
            if (m17428a(i, aVar)) {
                this.f22857b.m17215v(lVar, m17427b(pVar));
            }
        }

        @Override
        public void mo13189X(int i, AbstractC7230t.C7231a aVar) {
            if (m17428a(i, aVar)) {
                this.f22858c.m13180h();
            }
        }

        public final boolean m17428a(int i, AbstractC7230t.C7231a aVar) {
            AbstractC7230t.C7231a aVar2;
            if (aVar != null) {
                aVar2 = AbstractC7184g.this.mo17317A(this.f22856a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int C = AbstractC7184g.this.m17434C(this.f22856a, i);
            AbstractC7240z.C7241a aVar3 = this.f22857b;
            if (aVar3.f23057a != C || !C1216l0.m37985c(aVar3.f23058b, aVar2)) {
                this.f22857b = AbstractC7184g.this.m17509r(C, aVar2, 0L);
            }
            AbstractC8219w.C8220a aVar4 = this.f22858c;
            if (aVar4.f26589a == C && C1216l0.m37985c(aVar4.f26590b, aVar2)) {
                return true;
            }
            this.f22858c = AbstractC7184g.this.m17511p(C, aVar2);
            return true;
        }

        public final C7221p m17427b(C7221p pVar) {
            long B = AbstractC7184g.this.m17435B(this.f22856a, pVar.f23014f);
            long B2 = AbstractC7184g.this.m17435B(this.f22856a, pVar.f23015g);
            return (B == pVar.f23014f && B2 == pVar.f23015g) ? pVar : new C7221p(pVar.f23009a, pVar.f23010b, pVar.f23011c, pVar.f23012d, pVar.f23013e, B, B2);
        }

        @Override
        public void mo17239d0(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar) {
            if (m17428a(i, aVar)) {
                this.f22857b.m17219r(lVar, m17427b(pVar));
            }
        }

        @Override
        public void mo17238i(int i, AbstractC7230t.C7231a aVar, C7221p pVar) {
            if (m17428a(i, aVar)) {
                this.f22857b.m17228i(m17427b(pVar));
            }
        }

        @Override
        public void mo13188v(int i, AbstractC7230t.C7231a aVar) {
            C8211p.m13197a(this, i, aVar);
        }

        @Override
        public void mo17237y(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar, IOException iOException, boolean z) {
            if (m17428a(i, aVar)) {
                this.f22857b.m17217t(lVar, m17427b(pVar), iOException, z);
            }
        }
    }

    public static final class C7186b<T> {
        public final AbstractC7230t f22859a;
        public final AbstractC7230t.AbstractC7232b f22860b;
        public final AbstractC7184g<T>.C7185a f22861c;

        public C7186b(AbstractC7230t tVar, AbstractC7230t.AbstractC7232b bVar, AbstractC7184g<T>.C7185a aVar) {
            this.f22859a = tVar;
            this.f22860b = bVar;
            this.f22861c = aVar;
        }
    }

    public AbstractC7230t.C7231a mo17317A(T t, AbstractC7230t.C7231a aVar) {
        return aVar;
    }

    public long m17435B(T t, long j) {
        return j;
    }

    public int m17434C(T t, int i) {
        return i;
    }

    public abstract void m17433D(T t, AbstractC7230t tVar, AbstractC6604g3 g3Var);

    public final void m17432F(final T t, AbstractC7230t tVar) {
        C1186a.m38192a(!this.f22852g.containsKey(t));
        AbstractC7230t.AbstractC7232b fVar = new AbstractC7230t.AbstractC7232b() {
            @Override
            public final void mo17247a(AbstractC7230t tVar2, AbstractC6604g3 g3Var) {
                AbstractC7184g.this.m17433D(t, tVar2, g3Var);
            }
        };
        C7185a aVar = new C7185a(t);
        this.f22852g.put(t, new C7186b<>(tVar, fVar, aVar));
        tVar.mo17252l((Handler) C1186a.m38188e(this.f22853h), aVar);
        tVar.mo17258e((Handler) C1186a.m38188e(this.f22853h), aVar);
        tVar.mo17262a(fVar, this.f22854i);
        if (!m17507v()) {
            tVar.mo17250n(fVar);
        }
    }

    @Override
    public void mo17253k() {
        for (C7186b<T> bVar : this.f22852g.values()) {
            bVar.f22859a.mo17253k();
        }
    }

    @Override
    public void mo17431t() {
        for (C7186b<T> bVar : this.f22852g.values()) {
            bVar.f22859a.mo17250n(bVar.f22860b);
        }
    }

    @Override
    public void mo17430u() {
        for (C7186b<T> bVar : this.f22852g.values()) {
            bVar.f22859a.mo17254j(bVar.f22860b);
        }
    }

    @Override
    public void mo17308w(AbstractC0150i0 i0Var) {
        this.f22854i = i0Var;
        this.f22853h = C1216l0.m37949u();
    }

    @Override
    public void mo17307y() {
        for (C7186b<T> bVar : this.f22852g.values()) {
            bVar.f22859a.mo17255i(bVar.f22860b);
            bVar.f22859a.mo17261b(bVar.f22861c);
            bVar.f22859a.mo17256h(bVar.f22861c);
        }
        this.f22852g.clear();
    }
}
