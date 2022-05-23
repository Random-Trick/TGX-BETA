package g6;

import a6.t;
import l5.i;
import n6.m;

public final class n extends s {
    public final i f12135b;
    public final b f12136c;

    public n(b bVar, i iVar) {
        this.f12136c = bVar;
        this.f12135b = iVar;
    }

    @Override
    public final void a(t tVar, m<Boolean> mVar) {
        t tVar2 = tVar;
        m<Boolean> mVar2 = mVar;
        if (b()) {
            o oVar = new o(this.f12136c, mVar2);
            try {
                i.a<d> b10 = this.f12135b.b();
                if (b10 != null) {
                    tVar2.r0(b10, oVar);
                }
            } catch (RuntimeException e10) {
                mVar2.d(e10);
            }
        }
    }
}
