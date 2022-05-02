package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7697h extends AbstractRunnableC8648b {
    public final C9865p f24653M;
    public final int f24654N;
    public final C7757t f24655O;
    public final int f24656b;
    public final String f24657c;

    public C7697h(C7757t tVar, C9865p pVar, int i, String str, C9865p pVar2, int i2) {
        super(pVar);
        this.f24655O = tVar;
        this.f24656b = i;
        this.f24657c = str;
        this.f24653M = pVar2;
        this.f24654N = i2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle y;
        Bundle g;
        try {
            mVar = this.f24655O.f24845d;
            str = this.f24655O.f24842a;
            y = C7757t.m15117y(this.f24656b, this.f24657c);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11790e()).mo11768u(str, y, g, new BinderC7747r(this.f24655O, this.f24653M, this.f24656b, this.f24657c, this.f24654N));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11816c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
