package p6;

import android.os.Bundle;
import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class j extends b {
    public final String M;
    public final int N;
    public final p O;
    public final t P;
    public final int f20670b;
    public final String f20671c;

    public j(t tVar, p pVar, int i10, String str, String str2, int i11, p pVar2) {
        super(pVar);
        this.P = tVar;
        this.f20670b = i10;
        this.f20671c = str;
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
            Bundle l10 = t.l(this.f20670b, this.f20671c, this.M, this.N);
            g10 = t.g();
            ((n0) mVar.e()).o0(str, l10, g10, new n(this.P, this.O));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f20671c, this.M, Integer.valueOf(this.N), Integer.valueOf(this.f20670b));
            this.O.d(new RuntimeException(e10));
        }
    }
}
