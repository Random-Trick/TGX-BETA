package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7702i extends AbstractRunnableC8648b {
    public final C7757t f24682M;
    public final int f24683b;
    public final C9865p f24684c;

    public C7702i(C7757t tVar, C9865p pVar, int i, C9865p pVar2) {
        super(pVar);
        this.f24682M = tVar;
        this.f24683b = i;
        this.f24684c = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle h;
        Bundle g;
        try {
            mVar = this.f24682M.f24845d;
            str = this.f24682M.f24842a;
            h = C7757t.m15134h(this.f24683b);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11790e()).mo11772N(str, h, g, new BinderC7752s(this.f24682M, this.f24684c));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11816c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
