package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7697h extends AbstractRunnableC8648b {
    public final C9865p f24656M;
    public final int f24657N;
    public final C7757t f24658O;
    public final int f24659b;
    public final String f24660c;

    public C7697h(C7757t tVar, C9865p pVar, int i, String str, C9865p pVar2, int i2) {
        super(pVar);
        this.f24658O = tVar;
        this.f24659b = i;
        this.f24660c = str;
        this.f24656M = pVar2;
        this.f24657N = i2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle y;
        Bundle g;
        try {
            mVar = this.f24658O.f24848d;
            str = this.f24658O.f24845a;
            y = C7757t.m15117y(this.f24659b, this.f24660c);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11789e()).mo11767u(str, y, g, new BinderC7747r(this.f24658O, this.f24656M, this.f24659b, this.f24660c, this.f24657N));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11815c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
