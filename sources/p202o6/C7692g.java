package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7692g extends AbstractRunnableC8648b {
    public final String f24634M;
    public final int f24635N;
    public final C9865p f24636O;
    public final C7757t f24637P;
    public final int f24638b;
    public final String f24639c;

    public C7692g(C7757t tVar, C9865p pVar, int i, String str, String str2, int i2, C9865p pVar2) {
        super(pVar);
        this.f24637P = tVar;
        this.f24638b = i;
        this.f24639c = str;
        this.f24634M = str2;
        this.f24635N = i2;
        this.f24636O = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        try {
            mVar = this.f24637P.f24845d;
            str = this.f24637P.f24842a;
            Bundle l = C7757t.m15130l(this.f24638b, this.f24639c, this.f24634M, this.f24635N);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11790e()).mo11769q1(str, l, g, new BinderC7742q(this.f24637P, this.f24636O));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11816c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
