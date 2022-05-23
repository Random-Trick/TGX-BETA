package p6;

import android.os.Bundle;
import android.os.RemoteException;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class i extends b {
    public final t M;
    public final int f20648b;
    public final p f20649c;

    public i(t tVar, p pVar, int i10, p pVar2) {
        super(pVar);
        this.M = tVar;
        this.f20648b = i10;
        this.f20649c = pVar2;
    }

    @Override
    public final void a() {
        a aVar;
        m mVar;
        String str;
        Bundle h10;
        Bundle g10;
        try {
            mVar = this.M.f20800d;
            str = this.M.f20797a;
            h10 = t.h(this.f20648b);
            g10 = t.g();
            ((n0) mVar.e()).A1(str, h10, g10, new s(this.M, this.f20649c));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.c(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
