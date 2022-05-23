package p6;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import t6.a;
import t6.b;
import t6.m;
import t6.n0;
import w6.p;

public final class e extends b {
    public final t M;
    public final List f20584b;
    public final p f20585c;

    public e(t tVar, p pVar, List list, p pVar2) {
        super(pVar);
        this.M = tVar;
        this.f20584b = list;
        this.f20585c = pVar2;
    }

    @Override
    public final void a() {
        a aVar;
        m mVar;
        String str;
        Bundle g10;
        ArrayList u10 = t.u(this.f20584b);
        try {
            mVar = this.M.f20800d;
            str = this.M.f20797a;
            g10 = t.g();
            ((n0) mVar.e()).x(str, u10, g10, new m(this.M, this.f20585c));
        } catch (RemoteException e10) {
            aVar = t.f20795g;
            aVar.c(e10, "cancelDownloads(%s)", this.f20584b);
        }
    }
}
