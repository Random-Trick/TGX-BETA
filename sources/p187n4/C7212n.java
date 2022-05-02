package p187n4;

import java.io.IOException;
import p006a5.AbstractC0117b;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6717x2;
import p187n4.AbstractC7223q;
import p187n4.AbstractC7230t;
import p356z4.AbstractC11265j;

public final class C7212n implements AbstractC7223q, AbstractC7223q.AbstractC7224a {
    public AbstractC7230t f22965M;
    public AbstractC7223q f22966N;
    public AbstractC7223q.AbstractC7224a f22967O;
    public AbstractC7213a f22968P;
    public boolean f22969Q;
    public long f22970R = -9223372036854775807L;
    public final AbstractC7230t.C7231a f22971a;
    public final long f22972b;
    public final AbstractC0117b f22973c;

    public interface AbstractC7213a {
        void m17328a(AbstractC7230t.C7231a aVar);

        void m17327b(AbstractC7230t.C7231a aVar, IOException iOException);
    }

    public C7212n(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        this.f22971a = aVar;
        this.f22973c = bVar;
        this.f22972b = j;
    }

    @Override
    public void mo17276a(AbstractC7223q qVar) {
        ((AbstractC7223q.AbstractC7224a) C1216l0.m37968j(this.f22967O)).mo17276a(this);
        AbstractC7213a aVar = this.f22968P;
        if (aVar != null) {
            aVar.m17328a(this.f22971a);
        }
    }

    public void m17337b(AbstractC7230t.C7231a aVar) {
        long m = m17333m(this.f22972b);
        AbstractC7223q c = ((AbstractC7230t) C1186a.m38185e(this.f22965M)).mo17260c(aVar, this.f22973c, m);
        this.f22966N = c;
        if (this.f22967O != null) {
            c.mo17287e(this, m);
        }
    }

    @Override
    public long mo17289c() {
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17289c();
    }

    @Override
    public long mo17288d(long j, C6717x2 x2Var) {
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17288d(j, x2Var);
    }

    @Override
    public void mo17287e(AbstractC7223q.AbstractC7224a aVar, long j) {
        this.f22967O = aVar;
        AbstractC7223q qVar = this.f22966N;
        if (qVar != null) {
            qVar.mo17287e(this, m17333m(this.f22972b));
        }
    }

    @Override
    public void mo17286f() {
        try {
            AbstractC7223q qVar = this.f22966N;
            if (qVar != null) {
                qVar.mo17286f();
            } else {
                AbstractC7230t tVar = this.f22965M;
                if (tVar != null) {
                    tVar.mo17253k();
                }
            }
        } catch (IOException e) {
            AbstractC7213a aVar = this.f22968P;
            if (aVar == null) {
                throw e;
            } else if (!this.f22969Q) {
                this.f22969Q = true;
                aVar.m17327b(this.f22971a, e);
            }
        }
    }

    @Override
    public long mo17285g(long j) {
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17285g(j);
    }

    @Override
    public boolean mo17284h(long j) {
        AbstractC7223q qVar = this.f22966N;
        return qVar != null && qVar.mo17284h(j);
    }

    public long m17335j() {
        return this.f22970R;
    }

    @Override
    public boolean mo17283k() {
        AbstractC7223q qVar = this.f22966N;
        return qVar != null && qVar.mo17283k();
    }

    public long m17334l() {
        return this.f22972b;
    }

    public final long m17333m(long j) {
        long j2 = this.f22970R;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public void mo17336i(AbstractC7223q qVar) {
        ((AbstractC7223q.AbstractC7224a) C1216l0.m37968j(this.f22967O)).mo17336i(this);
    }

    @Override
    public long mo17282o(AbstractC11265j[] jVarArr, boolean[] zArr, AbstractC7206l0[] l0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f22970R;
        if (j3 == -9223372036854775807L || j != this.f22972b) {
            j2 = j;
        } else {
            this.f22970R = -9223372036854775807L;
            j2 = j3;
        }
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17282o(jVarArr, zArr, l0VarArr, zArr2, j2);
    }

    @Override
    public long mo17281p() {
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17281p();
    }

    @Override
    public C7233t0 mo17280q() {
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17280q();
    }

    public void m17331r(long j) {
        this.f22970R = j;
    }

    @Override
    public long mo17279s() {
        return ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17279s();
    }

    @Override
    public void mo17278t(long j, boolean z) {
        ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17278t(j, z);
    }

    @Override
    public void mo17277u(long j) {
        ((AbstractC7223q) C1216l0.m37968j(this.f22966N)).mo17277u(j);
    }

    public void m17330v() {
        if (this.f22966N != null) {
            ((AbstractC7230t) C1186a.m38185e(this.f22965M)).mo17259d(this.f22966N);
        }
    }

    public void m17329w(AbstractC7230t tVar) {
        C1186a.m38184f(this.f22965M == null);
        this.f22965M = tVar;
    }
}
