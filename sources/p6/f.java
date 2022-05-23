package p6;

import android.os.RemoteException;
import java.util.Map;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class f extends b {
    public final t M;
    public final Map f20596b;
    public final p f20597c;

    public f(t tVar, p pVar, Map map, p pVar2) {
        super(pVar);
        this.M = tVar;
        this.f20596b = map;
        this.f20597c = pVar2;
    }

    @Override
    public final void a() {
        a aVar;
        m mVar;
        String str;
        try {
            mVar = this.M.f20800d;
            str = this.M.f20797a;
            ((n0) mVar.e()).k0(str, t.o(this.f20596b), new o(this.M, this.f20597c));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.c(e10, "syncPacks", new Object[0]);
            this.f20597c.d(new RuntimeException(e10));
        }
    }
}
