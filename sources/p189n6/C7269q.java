package p189n6;

import android.os.Bundle;
import android.os.RemoteException;
import p262s6.AbstractC8663i0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p300v6.C9865p;

public final class C7269q extends AbstractRunnableC8648b {
    public final C7273u f23111M;
    public final C9865p f23112b;
    public final String f23113c;

    public C7269q(C7273u uVar, C9865p pVar, C9865p pVar2, String str) {
        super(pVar);
        this.f23111M = uVar;
        this.f23112b = pVar2;
        this.f23113c = str;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        String str;
        Bundle i;
        try {
            str = this.f23111M.f23122b;
            i = C7273u.m17170i();
            ((AbstractC8663i0) this.f23111M.f23121a.m11789e()).mo11797c1(str, i, new BinderC7271s(this.f23111M, this.f23112b));
        } catch (RemoteException e) {
            aVar = C7273u.f23119e;
            aVar.m11815c(e, "completeUpdate(%s)", this.f23113c);
            this.f23112b.m6732d(new RuntimeException(e));
        }
    }
}
