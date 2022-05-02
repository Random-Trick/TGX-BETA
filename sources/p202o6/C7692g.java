package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7692g extends AbstractRunnableC8648b {
    public final String f24637M;
    public final int f24638N;
    public final C9865p f24639O;
    public final C7757t f24640P;
    public final int f24641b;
    public final String f24642c;

    public C7692g(C7757t tVar, C9865p pVar, int i, String str, String str2, int i2, C9865p pVar2) {
        super(pVar);
        this.f24640P = tVar;
        this.f24641b = i;
        this.f24642c = str;
        this.f24637M = str2;
        this.f24638N = i2;
        this.f24639O = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        try {
            mVar = this.f24640P.f24848d;
            str = this.f24640P.f24845a;
            Bundle l = C7757t.m15130l(this.f24641b, this.f24642c, this.f24637M, this.f24638N);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11789e()).mo11768q1(str, l, g, new BinderC7742q(this.f24640P, this.f24639O));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11815c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
