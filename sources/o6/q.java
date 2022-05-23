package o6;

import android.os.Bundle;
import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.i0;
import w6.p;

public final class q extends b {
    public final u M;
    public final p f19247b;
    public final String f19248c;

    public q(u uVar, p pVar, p pVar2, String str) {
        super(pVar);
        this.M = uVar;
        this.f19247b = pVar2;
        this.f19248c = str;
    }

    @Override
    public final void a() {
        a aVar;
        String str;
        Bundle i10;
        try {
            str = this.M.f19257b;
            i10 = u.i();
            ((i0) this.M.f19256a.e()).N(str, i10, new s(this.M, this.f19247b));
        } catch (RemoteException e10) {
            aVar = u.f19254e;
            aVar.c(e10, "completeUpdate(%s)", this.f19248c);
            this.f19247b.d(new RuntimeException(e10));
        }
    }
}
