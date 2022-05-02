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
    public AbstractC7230t f22968M;
    public AbstractC7223q f22969N;
    public AbstractC7223q.AbstractC7224a f22970O;
    public AbstractC7213a f22971P;
    public boolean f22972Q;
    public long f22973R = -9223372036854775807L;
    public final AbstractC7230t.C7231a f22974a;
    public final long f22975b;
    public final AbstractC0117b f22976c;

    public interface AbstractC7213a {
        void m17328a(AbstractC7230t.C7231a aVar);

        void m17327b(AbstractC7230t.C7231a aVar, IOException iOException);
    }

    public C7212n(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        this.f22974a = aVar;
        this.f22976c = bVar;
        this.f22975b = j;
    }

    @Override
    public void mo17276a(AbstractC7223q qVar) {
        ((AbstractC7223q.AbstractC7224a) C1216l0.m37971j(this.f22970O)).mo17276a(this);
        AbstractC7213a aVar = this.f22971P;
        if (aVar != null) {
            aVar.m17328a(this.f22974a);
        }
    }

    public void m17337b(AbstractC7230t.C7231a aVar) {
        long m = m17333m(this.f22975b);
        AbstractC7223q c = ((AbstractC7230t) C1186a.m38188e(this.f22968M)).mo17260c(aVar, this.f22976c, m);
        this.f22969N = c;
        if (this.f22970O != null) {
            c.mo17287e(this, m);
        }
    }

    @Override
    public long mo17289c() {
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17289c();
    }

    @Override
    public long mo17288d(long j, C6717x2 x2Var) {
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17288d(j, x2Var);
    }

    @Override
    public void mo17287e(AbstractC7223q.AbstractC7224a aVar, long j) {
        this.f22970O = aVar;
        AbstractC7223q qVar = this.f22969N;
        if (qVar != null) {
            qVar.mo17287e(this, m17333m(this.f22975b));
        }
    }

    @Override
    public void mo17286f() {
        try {
            AbstractC7223q qVar = this.f22969N;
            if (qVar != null) {
                qVar.mo17286f();
            } else {
                AbstractC7230t tVar = this.f22968M;
                if (tVar != null) {
                    tVar.mo17253k();
                }
            }
        } catch (IOException e) {
            AbstractC7213a aVar = this.f22971P;
            if (aVar == null) {
                throw e;
            } else if (!this.f22972Q) {
                this.f22972Q = true;
                aVar.m17327b(this.f22974a, e);
            }
        }
    }

    @Override
    public long mo17285g(long j) {
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17285g(j);
    }

    @Override
    public boolean mo17284h(long j) {
        AbstractC7223q qVar = this.f22969N;
        return qVar != null && qVar.mo17284h(j);
    }

    public long m17335j() {
        return this.f22973R;
    }

    @Override
    public boolean mo17283k() {
        AbstractC7223q qVar = this.f22969N;
        return qVar != null && qVar.mo17283k();
    }

    public long m17334l() {
        return this.f22975b;
    }

    public final long m17333m(long j) {
        long j2 = this.f22973R;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public void mo17336i(AbstractC7223q qVar) {
        ((AbstractC7223q.AbstractC7224a) C1216l0.m37971j(this.f22970O)).mo17336i(this);
    }

    @Override
    public long mo17282o(AbstractC11265j[] jVarArr, boolean[] zArr, AbstractC7206l0[] l0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f22973R;
        if (j3 == -9223372036854775807L || j != this.f22975b) {
            j2 = j;
        } else {
            this.f22973R = -9223372036854775807L;
            j2 = j3;
        }
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17282o(jVarArr, zArr, l0VarArr, zArr2, j2);
    }

    @Override
    public long mo17281p() {
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17281p();
    }

    @Override
    public C7233t0 mo17280q() {
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17280q();
    }

    public void m17331r(long j) {
        this.f22973R = j;
    }

    @Override
    public long mo17279s() {
        return ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17279s();
    }

    @Override
    public void mo17278t(long j, boolean z) {
        ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17278t(j, z);
    }

    @Override
    public void mo17277u(long j) {
        ((AbstractC7223q) C1216l0.m37971j(this.f22969N)).mo17277u(j);
    }

    public void m17330v() {
        if (this.f22969N != null) {
            ((AbstractC7230t) C1186a.m38188e(this.f22968M)).mo17259d(this.f22969N);
        }
    }

    public void m17329w(AbstractC7230t tVar) {
        C1186a.m38187f(this.f22968M == null);
        this.f22968M = tVar;
    }
}
