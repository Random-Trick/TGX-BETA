package p189n6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8663i0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p300v6.C9865p;

public final class C7269q extends AbstractRunnableC8648b {
    public final C7273u f23108M;
    public final C9865p f23109b;
    public final String f23110c;

    public C7269q(C7273u uVar, C9865p pVar, C9865p pVar2, String str) {
        super(pVar);
        this.f23108M = uVar;
        this.f23109b = pVar2;
        this.f23110c = str;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        String str;
        Bundle i;
        try {
            str = this.f23108M.f23119b;
            i = C7273u.m17170i();
            ((AbstractC8663i0) this.f23108M.f23118a.m11790e()).mo11798c1(str, i, new BinderC7271s(this.f23108M, this.f23109b));
        } catch (RemoteException e) {
            aVar = C7273u.f23116e;
            aVar.m11816c(e, "completeUpdate(%s)", this.f23110c);
            this.f23109b.m6732d(new RuntimeException(e));
        }
    }
}
