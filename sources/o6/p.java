package o6;

import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.i0;

public final class p extends b {
    public final u M;
    public final String f19245b;
    public final w6.p f19246c;

    public p(u uVar, w6.p pVar, String str, w6.p pVar2) {
        super(pVar);
        this.M = uVar;
        this.f19245b = str;
        this.f19246c = pVar2;
    }

    @Override
    public final void a() {
        a aVar;
        String str;
        try {
            u uVar = this.M;
            str = uVar.f19257b;
            ((i0) this.M.f19256a.e()).v(str, u.b(uVar, this.f19245b), new t(this.M, this.f19246c, this.f19245b));
        } catch (RemoteException e10) {
            aVar = u.f19254e;
            aVar.c(e10, "requestUpdateInfo(%s)", this.f19245b);
            this.f19246c.d(new RuntimeException(e10));
        }
    }
}
