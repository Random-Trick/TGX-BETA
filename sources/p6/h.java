package p6;

import android.os.Bundle;
import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class h extends b {
    public final p M;
    public final int N;
    public final t O;
    public final int f20622b;
    public final String f20623c;

    public h(t tVar, p pVar, int i10, String str, p pVar2, int i11) {
        super(pVar);
        this.O = tVar;
        this.f20622b = i10;
        this.f20623c = str;
        this.M = pVar2;
        this.N = i11;
    }

    @Override
    public final void a() {
        a aVar;
        m mVar;
        String str;
        Bundle y10;
        Bundle g10;
        try {
            mVar = this.O.f20800d;
            str = this.O.f20797a;
            y10 = t.y(this.f20622b, this.f20623c);
            g10 = t.g();
            ((n0) mVar.e()).k1(str, y10, g10, new r(this.O, this.M, this.f20622b, this.f20623c, this.N));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.c(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
