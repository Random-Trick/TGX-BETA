package p031c4;

import java.util.Collections;
import java.util.List;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1580l implements AbstractC1581m {
    public final List<AbstractC1571i0.C1572a> f5675a;
    public final AbstractC8974t[] f5676b;
    public boolean f5677c;
    public int f5678d;
    public int f5679e;
    public long f5680f = -9223372036854775807L;

    public C1580l(List<AbstractC1571i0.C1572a> list) {
        this.f5675a = list;
        this.f5676b = new AbstractC8974t[list.size()];
    }

    public final boolean m36387a(C1189b0 b0Var, int i) {
        if (b0Var.m38142a() == 0) {
            return false;
        }
        if (b0Var.m38156D() != i) {
            this.f5677c = false;
        }
        this.f5678d--;
        return this.f5677c;
    }

    @Override
    public void mo36333b(C1189b0 b0Var) {
        AbstractC8974t[] tVarArr;
        if (!this.f5677c) {
            return;
        }
        if (this.f5678d != 2 || m36387a(b0Var, 32)) {
            if (this.f5678d != 1 || m36387a(b0Var, 0)) {
                int e = b0Var.m38138e();
                int a = b0Var.m38142a();
                for (AbstractC8974t tVar : this.f5676b) {
                    b0Var.m38144P(e);
                    tVar.mo10796c(b0Var, a);
                }
                this.f5679e += a;
            }
        }
    }

    @Override
    public void mo36332c() {
        this.f5677c = false;
        this.f5680f = -9223372036854775807L;
    }

    @Override
    public void mo36331d() {
        if (this.f5677c) {
            if (this.f5680f != -9223372036854775807L) {
                for (AbstractC8974t tVar : this.f5676b) {
                    tVar.mo10794e(this.f5680f, 1, this.f5679e, 0, null);
                }
            }
            this.f5677c = false;
        }
    }

    @Override
    public void mo36330e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        for (int i = 0; i < this.f5676b.length; i++) {
            AbstractC1571i0.C1572a aVar = this.f5675a.get(i);
            dVar.m36406a();
            AbstractC8974t r = hVar.mo6039r(dVar.m36404c(), 3);
            r.mo10798a(new C6600g1.C6602b().m19875S(dVar.m36405b()).m19858e0("application/dvbsubs").m19874T(Collections.singletonList(aVar.f5650c)).m19872V(aVar.f5648a).m19889E());
            this.f5676b[i] = r;
        }
    }

    @Override
    public void mo36329f(long j, int i) {
        if ((i & 4) != 0) {
            this.f5677c = true;
            if (j != -9223372036854775807L) {
                this.f5680f = j;
            }
            this.f5679e = 0;
            this.f5678d = 2;
        }
    }
}
