package p6;

import android.os.Bundle;
import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class k extends b {
    public final p f20682b;
    public final t f20683c;

    public k(t tVar, p pVar, p pVar2) {
        super(pVar);
        this.f20683c = tVar;
        this.f20682b = pVar2;
    }

    @Override
    public final void a() {
        a aVar;
        m mVar;
        String str;
        Bundle g10;
        try {
            mVar = this.f20683c.f20801e;
            str = this.f20683c.f20797a;
            g10 = t.g();
            ((n0) mVar.e()).V(str, g10, new p(this.f20683c, this.f20682b));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.c(e10, "keepAlive", new Object[0]);
        }
    }
}
