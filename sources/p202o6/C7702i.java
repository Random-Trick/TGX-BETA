package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7702i extends AbstractRunnableC8648b {
    public final C7757t f24685M;
    public final int f24686b;
    public final C9865p f24687c;

    public C7702i(C7757t tVar, C9865p pVar, int i, C9865p pVar2) {
        super(pVar);
        this.f24685M = tVar;
        this.f24686b = i;
        this.f24687c = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle h;
        Bundle g;
        try {
            mVar = this.f24685M.f24848d;
            str = this.f24685M.f24845a;
            h = C7757t.m15134h(this.f24686b);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11789e()).mo11771N(str, h, g, new BinderC7752s(this.f24685M, this.f24687c));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11815c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
