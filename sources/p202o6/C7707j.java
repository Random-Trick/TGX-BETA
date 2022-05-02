package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7707j extends AbstractRunnableC8648b {
    public final String f24705M;
    public final int f24706N;
    public final C9865p f24707O;
    public final C7757t f24708P;
    public final int f24709b;
    public final String f24710c;

    public C7707j(C7757t tVar, C9865p pVar, int i, String str, String str2, int i2, C9865p pVar2) {
        super(pVar);
        this.f24708P = tVar;
        this.f24709b = i;
        this.f24710c = str;
        this.f24705M = str2;
        this.f24706N = i2;
        this.f24707O = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        try {
            mVar = this.f24708P.f24845d;
            str = this.f24708P.f24842a;
            Bundle l = C7757t.m15130l(this.f24709b, this.f24710c, this.f24705M, this.f24706N);
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11790e()).mo11771Y0(str, l, g, new BinderC7727n(this.f24708P, this.f24707O));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11817b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f24710c, this.f24705M, Integer.valueOf(this.f24706N), Integer.valueOf(this.f24709b));
            this.f24707O.m6732d(new RuntimeException(e));
        }
    }
}
