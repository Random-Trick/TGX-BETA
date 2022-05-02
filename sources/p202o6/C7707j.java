package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7707j extends AbstractRunnableC8648b {
    public final String f24708M;
    public final int f24709N;
    public final C9865p f24710O;
    public final C7757t f24711P;
    public final int f24712b;
    public final String f24713c;

    public C7707j(C7757t tVar, C9865p pVar, int i, String str, String str2, int i2, C9865p pVar2) {
        super(pVar);
        this.f24711P = tVar;
        this.f24712b = i;
        this.f24713c = str;
        this.f24708M = str2;
        this.f24709N = i2;
        this.f24710O = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        try {
            mVar = this.f24711P.f24848d;
            str = this.f24711P.f24845a;
            Bundle l = C7757t.m15130l(this.f24712b, this.f24713c, this.f24708M, this.f24709N);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11789e()).mo11770Y0(str, l, g, new BinderC7727n(this.f24711P, this.f24710O));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11816b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f24713c, this.f24708M, Integer.valueOf(this.f24709N), Integer.valueOf(this.f24712b));
            this.f24710O.m6732d(new RuntimeException(e));
        }
    }
}
