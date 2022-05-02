package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7712k extends AbstractRunnableC8648b {
    public final C9865p f24728b;
    public final C7757t f24729c;

    public C7712k(C7757t tVar, C9865p pVar, C9865p pVar2) {
        super(pVar);
        this.f24729c = tVar;
        this.f24728b = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        try {
            mVar = this.f24729c.f24849e;
            str = this.f24729c.f24845a;
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11789e()).mo11769j1(str, g, new BinderC7737p(this.f24729c, this.f24728b));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11815c(e, "keepAlive", new Object[0]);
        }
    }
}
