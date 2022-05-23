package p6;

import android.os.Bundle;
import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class g extends b {
    public final String M;
    public final int N;
    public final p O;
    public final t P;
    public final int f20607b;
    public final String f20608c;

    public g(t tVar, p pVar, int i10, String str, String str2, int i11, p pVar2) {
        super(pVar);
        this.P = tVar;
        this.f20607b = i10;
        this.f20608c = str;
        this.M = str2;
        this.N = i11;
        this.O = pVar2;
    }

    @Override
    public final void a() {
        a aVar;
        m mVar;
        String str;
        Bundle g10;
        try {
            mVar = this.P.f20800d;
            str = this.P.f20797a;
            Bundle l10 = t.l(this.f20607b, this.f20608c, this.M, this.N);
            g10 = t.g();
            ((n0) mVar.e()).a0(str, l10, g10, new q(this.P, this.O));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.c(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
