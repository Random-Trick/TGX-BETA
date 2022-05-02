package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7712k extends AbstractRunnableC8648b {
    public final C9865p f24725b;
    public final C7757t f24726c;

    public C7712k(C7757t tVar, C9865p pVar, C9865p pVar2) {
        super(pVar);
        this.f24726c = tVar;
        this.f24725b = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        try {
            mVar = this.f24726c.f24846e;
            str = this.f24726c.f24842a;
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11790e()).mo11770j1(str, g, new BinderC7737p(this.f24726c, this.f24725b));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11816c(e, "keepAlive", new Object[0]);
        }
    }
}
