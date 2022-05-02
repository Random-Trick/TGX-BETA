package p187n4;

import p020b5.C1186a;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8965l;
import p270t3.C8971q;
import p355z3.C11241f;

public final class C7168c implements AbstractC7166b0 {
    public final AbstractC8965l f22753a;
    public AbstractC8958f f22754b;
    public AbstractC8959g f22755c;

    public C7168c(AbstractC8965l lVar) {
        this.f22753a = lVar;
    }

    @Override
    public void mo17505a() {
        AbstractC8958f fVar = this.f22754b;
        if (fVar != null) {
            fVar.mo1153a();
            this.f22754b = null;
        }
        this.f22755c = null;
    }

    @Override
    public void mo17504b(long j, long j2) {
        ((AbstractC8958f) C1186a.m38188e(this.f22754b)).mo1152b(j, j2);
    }

    @Override
    public int mo17503c(C8971q qVar) {
        return ((AbstractC8958f) C1186a.m38188e(this.f22754b)).mo1149e((AbstractC8959g) C1186a.m38188e(this.f22755c), qVar);
    }

    @Override
    public void mo17502d(p006a5.AbstractC0147h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p270t3.AbstractC8960h r15) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7168c.mo17502d(a5.h, android.net.Uri, java.util.Map, long, long, t3.h):void");
    }

    @Override
    public long mo17501e() {
        AbstractC8959g gVar = this.f22755c;
        if (gVar != null) {
            return gVar.mo6043r();
        }
        return -1L;
    }

    @Override
    public void mo17500f() {
        AbstractC8958f fVar = this.f22754b;
        if (fVar instanceof C11241f) {
            ((C11241f) fVar).m1143k();
        }
    }
}
